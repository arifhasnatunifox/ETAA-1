package com.unifoxdigital.tracemyfish.aqua.buy;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.unifoxdigital.tracemyfish.R;

import org.w3c.dom.Text;

/**
 * Created by unifox Digital on 6/4/2017.
 */

public class SingleBuyFish extends AppCompatActivity
{
    private AppCompatButton b1;
    private Context context=this;

    //private TextView i1,i2,i3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aqua_buy_fish_details);

        b1=(AppCompatButton)findViewById (R.id.proceed);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Button Pressed", Toast.LENGTH_SHORT).show();
                final Dialog dialog=new Dialog(context);
                dialog.setContentView(R.layout.aqua_buy_list_simple);
                dialog.setTitle("Buy My Fish");

                TextView i1=(TextView) dialog.findViewById (R.id.i1);
                TextView i2=(TextView) dialog.findViewById (R.id.i2);
                TextView i3=(TextView) dialog.findViewById (R.id.i3);

                i1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       // Toast.makeText(getApplicationContext(),"Farmer Pressed",Toast.LENGTH_SHORT).show();
                        Intent n=new Intent(SingleBuyFish.this, FarmerList.class);
                        startActivity(n);
                    }
                });

                i2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(),"Cluster",Toast.LENGTH_SHORT).show();
                    }
                });

                i3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(),"Processing Plant Pressed",Toast.LENGTH_SHORT).show();
                    }
                });


                dialog.show();
            }
        });
    }
}
