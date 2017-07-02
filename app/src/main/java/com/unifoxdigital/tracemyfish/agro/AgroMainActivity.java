package com.unifoxdigital.tracemyfish.agro;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.unifoxdigital.tracemyfish.R;


/**
 * Created by unifox Digital on 5/29/2017.
 */

public class AgroMainActivity extends Fragment
{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.activity_tab_agro, container, false);
    }
}
