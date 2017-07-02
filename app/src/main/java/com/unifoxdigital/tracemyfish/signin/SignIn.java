package com.unifoxdigital.tracemyfish.signin;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.unifoxdigital.tracemyfish.MainActivity;
import com.unifoxdigital.tracemyfish.R;
import com.unifoxdigital.tracemyfish.context.UserSessionManager;
import com.unifoxdigital.tracemyfish.signup.SignUp;

/**
 * Created by unifox Digital on 5/24/2017.
 */

public class SignIn extends AppCompatActivity
{
    private EditText e1,e2;
    private AppCompatButton b1;
    private TextView t1;
   // private String phone,password;

    UserSessionManager session;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singin);

        // User Session Manager
        session = new UserSessionManager(getApplicationContext());


        if (session.isUserLoggedIn()==true)
        {
            Intent i=new Intent(this,MainActivity.class);
            startActivity(i);
        }

        else
        {
            Toast.makeText(getApplicationContext(),"False",Toast.LENGTH_LONG).show();
        }

        e1=(EditText) findViewById (R.id.input_phone);
        e2=(EditText) findViewById (R.id.input_password);

        //phone =e1.getText().toString();
        //password=e2.getText().toString();

        t1= (TextView) findViewById(R.id.link_signup);

        b1=(AppCompatButton) findViewById (R.id.btn_login);
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(e1.getText().toString().trim().length() > 0 && e1.getText().toString().trim().length() > 0){

                    // For testing puspose username, password is checked with static data
                    // username = admin
                    // password = admin

                    if(e1.getText().toString().equals("admin") && e2.getText().toString().equals("1234"))
                    {

                        // Creating user login session
                        // Statically storing number="user phone number"
                        // and password="password"
                        session.createUserLoginSession("01711",
                                "1234");

                        // Starting MainActivity
                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

                        // Add new Flag to start new Activity
                        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(i);

                        finish();

                    }

                    else
                    {

                        // username / password doesn't match&
                        Toast.makeText(getApplicationContext(), "Username/Password is incorrect", Toast.LENGTH_LONG).show();
                    }
                }

                else
                {
                    // user didn't entered username or password
                    Toast.makeText(getApplicationContext(), "Please enter username and password", Toast.LENGTH_LONG).show();
                }

            }
        });


        t1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent n=new Intent(SignIn.this, SignUp.class);
                startActivity(n);
            }
        });
    }
}
