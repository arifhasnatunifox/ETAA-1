package com.unifoxdigital.tracemyfish.aqua.trace;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;

import com.unifoxdigital.tracemyfish.R;

/**
 * Created by unifox Digital on 6/1/2017.
 */

public class TraceSmallInfo extends AppCompatActivity
{
    private AppCompatButton b1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trace_small_info);

        b1=(AppCompatButton) findViewById (R.id.get_more);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent n=new Intent(TraceSmallInfo.this, TraceDeatails.class);
                startActivity(n);
            }
        });
    }
}
