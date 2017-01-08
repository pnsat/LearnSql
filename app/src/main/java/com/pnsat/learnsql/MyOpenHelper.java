package com.pnsat.learnsql;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ubc15 on 1/8/2017.
 */

public class MyOpenHelper extends SQLiteOpenHelper{

    //Explicit
    private Context context;
    public static final String database_name = "yut.db";
    private static final int database_version = 1;
    private static final String structor_user_table = "create table userTABLE(" +
            "_id integer primary key, " +
            "Name text, " +
            "User text, " +
            "Password text);";


    public MyOpenHelper(Context context) {
        super(context,database_name, null, database_version);
        this.context = context;
    } // constucter

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(structor_user_table);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}  // main Class
