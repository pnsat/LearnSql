package com.pnsat.learnsql;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
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
        SQLiteDatabase sqLiteDatabase = openOrCreateDatabase(MyOpenHelper.database_name,
                MODE_PRIVATE, null);
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM userTABLE", null);
        cursor.moveToFirst();
        String[] nameStrings = new String[cursor.getCount()];
        for (int i=0;i<nameStrings.length;i++) {
            nameStrings[i] = cursor.getString(1);
            cursor.moveToNext();

        }
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(MyListView.this,
                android.R.layout.simple_list_item_1, nameStrings);
        listView.setAdapter(stringArrayAdapter);
    }


}  // Main Class
