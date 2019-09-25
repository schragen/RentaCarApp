package com.example.rentacarapp;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Companies extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] rental={"Alamo","Budget","Enterprise","Hertz","National","Thrifty"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_companies, R.id.travel, rental));

    }

    protected void onListItemClick(ListView l, View v, int position, long id){
        switch(position){
            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://alamo.com")));
                break;
            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://budget.com")));
                break;
            case 2:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://enterprise.com")));
                break;
            case 3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://hertz.com")));
                break;
            case 4:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://nationalcar.com")));
                break;
            case 5:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://thrifty.com")));
                break;
        }
    }
}
