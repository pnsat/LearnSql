package com.pnsat.learnsql;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MyListView extends AppCompatActivity {

    //explicit
    ListView listView; // นี่คือการประกาศอย่างย่อ




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_list_view);

        //bine wiget

        listView = (ListView) findViewById(R.id.livUser);


        createListView();


    } // Main Method

    private void createListView() {

    }


}  // Main Class
