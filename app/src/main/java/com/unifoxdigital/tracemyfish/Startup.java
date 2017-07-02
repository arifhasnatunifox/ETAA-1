package com.unifoxdigital.tracemyfish;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.unifoxdigital.tracemyfish.context.CheckInternet;
import com.unifoxdigital.tracemyfish.context.GifImageView;
import com.unifoxdigital.tracemyfish.context.NoInternet;
import com.unifoxdigital.tracemyfish.context.UserSessionManager;
import com.unifoxdigital.tracemyfish.signin.SignIn;

public class Startup extends AppCompatActivity
{
    // User Session Manager Class
    UserSessionManager session;

    private static int SPLASH_TIME_OUT=5000;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // Make this activity, full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_startup);

//        GifImageView gif=(GifImageView) findViewById (R.id.gif);
//        gif.setGifImageResource(R.drawable.startup);

//        final CheckInternet m=new CheckInternet();
//        m.isInternetOn();

        // User Session Manager
        session = new UserSessionManager(getApplicationContext());

//        if (session.isUserLoggedIn()==true)
//        {
//            Intent i=new Intent(this,MainActivity.class);
//            startActivity(i);
//        }



        //Thread Handler for 5 sec.
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {

                if (isInternetOn()==true)
                {
                    if (session.isUserLoggedIn()==true)
                    {
                        Intent i=new Intent(Startup.this,MainActivity.class);
                        startActivity(i);
                    }

                    else
                    {
                        Toast.makeText(getApplicationContext(),"False",Toast.LENGTH_LONG).show();
                        final Intent mainIntent = new Intent(Startup.this, SignIn.class);
                        Startup.this.startActivity(mainIntent);
                    }


                }

                else
                {
                    final Intent mainIntent = new Intent(Startup.this, NoInternet.class);
                    Startup.this.startActivity(mainIntent);
                }

                Startup.this.finish();
            }
        }, SPLASH_TIME_OUT);

    }

    public boolean isInternetOn() {

        // get Connectivity Manager object to check connection
        ConnectivityManager connec = (ConnectivityManager) getSystemService(getBaseContext().CONNECTIVITY_SERVICE);

        // Check for network connections
        if (connec.getNetworkInfo(0).getState() == android.net.NetworkInfo.State.CONNECTED ||
                connec.getNetworkInfo(0).getState() == android.net.NetworkInfo.State.CONNECTING ||
                connec.getNetworkInfo(1).getState() == android.net.NetworkInfo.State.CONNECTING ||
                connec.getNetworkInfo(1).getState() == android.net.NetworkInfo.State.CONNECTED) {

            // if connected with internet

            Toast.makeText(this, " Connected ", Toast.LENGTH_LONG).show();
            return true;

        } else if (
                connec.getNetworkInfo(0).getState() == android.net.NetworkInfo.State.DISCONNECTED ||
                        connec.getNetworkInfo(1).getState() == android.net.NetworkInfo.State.DISCONNECTED) {

            Toast.makeText(this, " Not Connected ", Toast.LENGTH_LONG).show();
            return false;
        }
        return false;
    }


}
