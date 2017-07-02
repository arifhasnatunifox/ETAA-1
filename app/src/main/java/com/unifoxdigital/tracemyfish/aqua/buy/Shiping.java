package com.unifoxdigital.tracemyfish.aqua.buy;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;

import com.unifoxdigital.tracemyfish.R;

/**
 * Created by unifox Digital on 6/4/2017.
 */

public class Shiping extends AppCompatActivity
{
    private AppCompatButton b1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aqua_buy_shipping);

        b1=(AppCompatButton) findViewById(R.id.proceed);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(Shiping.this, Billing.class);
                startActivity(n);
            }
        });
    }
}
