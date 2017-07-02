package com.unifoxdigital.tracemyfish.context;

/**
 * Created by unifox Digital on 5/31/2017.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.unifoxdigital.tracemyfish.aqua.buy.BuyMyFish;
import com.unifoxdigital.tracemyfish.aqua.trace.TraceMyFish;
import com.unifoxdigital.tracemyfish.aqua.trace.TrackMyFish;

public class PagerAqua extends FragmentStatePagerAdapter
{

    //integer to count number of tabs
    int tabCount;

    //Constructor to the class
    public PagerAqua(FragmentManager fm, int tabCount)
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
                TraceMyFish tab1 = new TraceMyFish();
                return tab1;
            case 1:
                BuyMyFish tab2 = new BuyMyFish();
                return tab2;
            case 2:
                TrackMyFish tab3 = new TrackMyFish();
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