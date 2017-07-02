package com.unifoxdigital.tracemyfish.aqua.trace;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.unifoxdigital.tracemyfish.R;
import com.unifoxdigital.tracemyfish.context.CustomList;

/**
 * Created by unifox Digital on 6/1/2017.
 */

public class TraceDeatails extends AppCompatActivity
{
    ListView list;

    //private Dialog dialog;
    private Context context=this;
    private TextView header, content1, content2, content3;
    private AppCompatButton b1;

    //String to view
    String[] web={
            "Processing Plant",
            "Collection Center",
            "Cluster Farms",
            "Cluster Farmers",
            "Hatchery",
    };

    //Image to View

    Integer[] imageId={
            R.drawable.arrow_icon,
            R.drawable.arrow_icon,
            R.drawable.arrow_icon,
            R.drawable.arrow_icon,
            R.drawable.arrow_icon
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trace_details);

        CustomList adapter=new CustomList(TraceDeatails.this, web,imageId);
        list=(ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                if (position==0)
                {
                    //Toast.makeText(getApplicationContext(),"Processing Plant",Toast.LENGTH_SHORT).show();
                    final Dialog dialog=new Dialog(context);
                    dialog.setContentView(R.layout.aqua_trace_list_single_details);
                    dialog.setTitle("Origin: Bangladesh");

                    header=(TextView) dialog.findViewById(R.id.header);
                    content1=(TextView) dialog.findViewById(R.id.content1);
                    b1=(AppCompatButton) dialog.findViewById (R.id.close);

                    header.setText("Processing Plant");
                    content1.setText("Salam Sea Foods");
                    b1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                        }
                    });

                    dialog.show();


                }

                if (position==1)
                {
                    //Toast.makeText(getApplicationContext(),"Collection Center",Toast.LENGTH_SHORT).show();
                    final Dialog dialog=new Dialog(context);
                    dialog.setContentView(R.layout.aqua_trace_list_single_details);
                    dialog.setTitle("Origin: Bangladesh");

                    header=(TextView) dialog.findViewById(R.id.header);
                    content1=(TextView) dialog.findViewById(R.id.content1);
                    content2=(TextView) dialog.findViewById(R.id.content2);
                    b1=(AppCompatButton) dialog.findViewById(R.id.close);

                    header.setText("Collection Centers");
                    content1.setText("Collection Center 1");
                    content2.setText("Collection Center 2");

                    b1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                        }
                    });

                    dialog.show();
                }

                if (position==2)
                {
                    //Toast.makeText(getApplicationContext(),"Cluster Farms",Toast.LENGTH_SHORT).show();
                    final Dialog dialog=new Dialog(context);
                    dialog.setContentView(R.layout.aqua_trace_list_single_details);
                    dialog.setTitle("Origin: Bangladesh");

                    header=(TextView) dialog.findViewById(R.id.header);
                    content1=(TextView) dialog.findViewById(R.id.content1);
                    content2=(TextView) dialog.findViewById(R.id.content2);
                    content3=(TextView) dialog.findViewById(R.id.content3);
                    b1=(AppCompatButton) dialog.findViewById(R.id.close);

                    header.setText("Cluster Farms");
                    content1.setText("Cluster Farm A");
                    content2.setText("Cluster Farm B");
                    content3.setText("Cluser Farm C");

                    b1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                        }
                    });

                    dialog.show();
                }

                if (position==3)
                {
                    //Toast.makeText(getApplicationContext(),"Cluster Farmers",Toast.LENGTH_SHORT).show();
                    final Dialog dialog=new Dialog(context);
                    dialog.setContentView(R.layout.aqua_trace_list_single_details);
                    dialog.setTitle("Origin: Bangladesh");

                    header=(TextView) dialog.findViewById(R.id.header);
                    content1=(TextView) dialog.findViewById(R.id.content1);
                    content2=(TextView) dialog.findViewById(R.id.content2);
                    content3=(TextView) dialog.findViewById(R.id.content3);
                    b1=(AppCompatButton) dialog.findViewById(R.id.close);

                    header.setText("Cluster Farmers");
                    content1.setText("Farmer 1");
                    content2.setText("Farmer 2");
                    content3.setText("Farmer 3");

                    b1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                        }
                    });

                    dialog.show();
                }

                if (position==4)
                {
                    //Toast.makeText(getApplicationContext(),"Hatchery", Toast.LENGTH_SHORT).show();
                    final Dialog dialog=new Dialog(context);
                    dialog.setContentView(R.layout.aqua_trace_list_single_details);
                    dialog.setTitle("Origin: Banladesh");

                    header=(TextView) dialog.findViewById(R.id.header);
                    content1=(TextView) dialog.findViewById(R.id.content1);
                    b1=(AppCompatButton) dialog.findViewById(R.id.close);

                    header.setText("Hatcheries");
                    content1.setText("Hatchery A");

                    b1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                        }
                    });

                    dialog.show();

                }
            }
        });


    }
}
