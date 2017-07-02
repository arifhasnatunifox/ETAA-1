package com.unifoxdigital.tracemyfish.aqua.buy;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.unifoxdigital.tracemyfish.R;

/**
 * Created by unifox Digital on 5/31/2017.
 */

public class BuyMyFish extends Fragment
{
    private AppCompatImageView img1,img2,img3,img4,img5,img6;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState)
    {
        View rootView= inflater.inflate(R.layout.activity_aqua_buy_main_layout,container,false);

        img1=(AppCompatImageView) rootView.findViewById (R.id.img1);
        img2=(AppCompatImageView) rootView.findViewById (R.id.img2);
        img3=(AppCompatImageView) rootView.findViewById (R.id.img3);

        img4=(AppCompatImageView) rootView.findViewById (R.id.img1_ex);
        img5=(AppCompatImageView) rootView.findViewById (R.id.img2_ex);
        img6=(AppCompatImageView) rootView.findViewById (R.id.img3_ex);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Image1",Toast.LENGTH_SHORT).show();
                Intent n=new Intent(getActivity(),SingleBuyFish.class);
                startActivity(n);
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Image2",Toast.LENGTH_SHORT).show();
                Intent n=new Intent(getActivity(),SingleBuyFish.class);
                startActivity(n);
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Image3",Toast.LENGTH_SHORT).show();
                Intent n=new Intent(getActivity(),SingleBuyFish.class);
                startActivity(n);
            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Image4",Toast.LENGTH_SHORT).show();
                Intent n=new Intent(getActivity(),SingleBuyFish.class);
                startActivity(n);
            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Image5",Toast.LENGTH_SHORT).show();
                Intent n=new Intent(getActivity(),SingleBuyFish.class);
                startActivity(n);
            }
        });

        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Image6",Toast.LENGTH_SHORT).show();
                Intent n=new Intent(getActivity(),SingleBuyFish.class);
                startActivity(n);
            }
        });
        return rootView;
    }
}
