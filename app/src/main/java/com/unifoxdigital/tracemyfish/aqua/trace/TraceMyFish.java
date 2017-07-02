package com.unifoxdigital.tracemyfish.aqua.trace;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.unifoxdigital.tracemyfish.R;

/**
 * Created by unifox Digital on 5/31/2017.
 */

public class TraceMyFish extends Fragment
{
    private EditText e1;
    private AppCompatButton b1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState)
    {
        View rootView=inflater.inflate(R.layout.activity_trace_consignment,container,false);

        e1=(EditText) rootView.findViewById(R.id.cons_no);
        b1=(AppCompatButton) rootView.findViewById(R.id.trace_btn);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.getText().toString().equals("123"))
                {
                    //Toast.makeText(getActivity(),"Hell Ya",Toast.LENGTH_SHORT).show();
                    Intent n=new Intent(getActivity(),TraceSmallInfo.class);
                    startActivity(n);
                }

                else
                {
                    Toast.makeText(getActivity(),"Hell No............",Toast.LENGTH_LONG).show();
                }
            }
        });
        return rootView;
    }
}
