package com.unifoxdigital.tracemyfish.aqua.trace;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.unifoxdigital.tracemyfish.R;

/**
 * Created by unifox Digital on 5/31/2017.
 */

public class TrackMyFish extends Fragment
{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState)
    {
        View rootView= inflater.inflate(R.layout.activity_tab_support, container, false);
        return rootView;
    }
}
