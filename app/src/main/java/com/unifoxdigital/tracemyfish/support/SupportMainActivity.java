package com.unifoxdigital.tracemyfish.support;

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

public class SupportMainActivity extends Fragment
{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_tab_support, container, false);
    }
}
