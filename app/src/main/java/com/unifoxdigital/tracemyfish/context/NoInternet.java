package com.unifoxdigital.tracemyfish.context;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.unifoxdigital.tracemyfish.R;
import com.unifoxdigital.tracemyfish.signin.SignIn;

/**
 * Created by unifox Digital on 6/12/2017.
 */

public class NoInternet extends AppCompatActivity
{
    private ImageView i1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_internet);

        i1=(ImageView) findViewById (R.id.no_net_img);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(getApplicationContext(),"Test",Toast.LENGTH_LONG).show();
                Intent n=new Intent(NoInternet.this, SignIn.class);
                startActivity(n);
            }
        });
    }
}
