package com.unifoxdigital.tracemyfish.context;

/**
 * Created by unifox Digital on 5/29/2017.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.SupportActivity;

import com.unifoxdigital.tracemyfish.agro.AgroMainActivity;
import com.unifoxdigital.tracemyfish.aqua.AquaMainActivity;
import com.unifoxdigital.tracemyfish.support.SupportMainActivity;

public class PagerMain extends FragmentStatePagerAdapter
{

    //integer to count number of tabs
    int tabCount;

    //Constructor to the class
    public PagerMain(FragmentManager fm, int tabCount)
    {
        super(fm);
        //Initializing tab count
        this.tabCount= tabCount;
    }

    //Overriding method getItem
    @Override
    public Fragment getItem(int position)
    {
        //Returning the current tabs
        switch (position) {
            case 0:
                AquaMainActivity tab1 = new AquaMainActivity();
                return tab1;
            case 1:
                AgroMainActivity tab2 = new AgroMainActivity();
                return tab2;
            case 2:
                SupportMainActivity tab3 = new SupportMainActivity();
                return tab3;
            default:
                return null;
        }
    }

    //Overriden method getCount to get the number of tabs
    @Override
    public int getCount()
    {
        return tabCount;
    }
}
