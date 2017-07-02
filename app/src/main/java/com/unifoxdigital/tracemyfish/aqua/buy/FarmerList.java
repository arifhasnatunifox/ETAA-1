package com.unifoxdigital.tracemyfish.aqua.buy;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

import com.unifoxdigital.tracemyfish.R;
import com.unifoxdigital.tracemyfish.context.CustomList;

/**
 * Created by unifox Digital on 6/4/2017.
 */

public class FarmerList extends AppCompatActivity
{
    private ListView list;
    //String to view
    String[] web={
            "Mukul Islam",
            "Mangal Mistry",
            "Md. Afsar Uddin Morol",
            "Md. Kamal Uddin",
            "Md. Sahinur Rahman",
            "Ramesh Chandra",
            "Md. Kamal Uddin"
    };

    //Image to View

    Integer[] imageId={
            R.drawable.arrow_icon,
            R.drawable.arrow_icon,
            R.drawable.arrow_icon,
            R.drawable.arrow_icon,
            R.drawable.arrow_icon,
            R.drawable.arrow_icon,
            R.drawable.arrow_icon,
    };


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.farmer_list);

        CustomList adapter=new CustomList(FarmerList.this,web,imageId);
        list=(ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                if(position==0)
                {
                    Intent n=new Intent(FarmerList.this,FarmerDetails.class);
                    startActivity(n);
                }

                if(position==1)
                {
                    Toast.makeText(getApplicationContext(),"You Select Mangal Mistry",Toast.LENGTH_SHORT).show();
                }

                if (position==2)
                {
                    Toast.makeText(getApplicationContext(),"You Select Md. Afsar Uddin Morol", Toast.LENGTH_SHORT).show();
                }

                if (position==3)
                {
                    Toast.makeText(getApplicationContext(),"You Select Mf. Kamal Uddin", Toast.LENGTH_SHORT).show();
                }

                if (position==4)
                {
                    Toast.makeText(getApplicationContext(),"You Select Md. Sahinur Rahman",Toast.LENGTH_SHORT).show();
                }

                if (position==5)
                {
                    Toast.makeText(getApplicationContext(),"You Select Ramesh Chandra",Toast.LENGTH_SHORT).show();
                }

                if (position==6)
                {
                    Toast.makeText(getApplicationContext(),"You Select Md. Kamal Uddin", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
