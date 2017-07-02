package com.unifoxdigital.tracemyfish.aqua;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.unifoxdigital.tracemyfish.R;

/**
 * Created by unifox Digital on 5/29/2017.
 */

public class AquaMainActivity extends Fragment
{
    private AppCompatButton b1,b2,b3;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View rootView=inflater.inflate(R.layout.activity_tab_aqua, container, false);

        b1=(AppCompatButton) rootView.findViewById (R.id.trace_aqua);
        b2=(AppCompatButton) rootView.findViewById (R.id.buy_aqua);
        b3=(AppCompatButton) rootView.findViewById (R.id.track_auqa);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent n=new Intent(getActivity(),AquaTabView.class);
                startActivity(n);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(getActivity(),AquaTabView.class);
                startActivity(n);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(getActivity(),AquaTabView.class);
                startActivity(n);

            }
        });

        return rootView;
    }
}
