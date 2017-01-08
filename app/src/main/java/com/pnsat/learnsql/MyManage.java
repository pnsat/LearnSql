package com.pnsat.learnsql;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by ubc15 on 1/8/2017.
 */

public class MyManage {

    //Explicit
    private Context context;
    private MyOpenHelper myOpenHelper;
    private SQLiteDatabase sqLiteDatabase;

    private static final String user_table = "userTABLE";
    private static final String column_id = "_id";
    private static final String column_user = "User";
    private static final String column_name = "Name";
    private static final String column_pass = "Password";


    public MyManage(Context context) {
        this.context = context;

        myOpenHelper = new MyOpenHelper(context);
        sqLiteDatabase = myOpenHelper.getWritableDatabase();

    } //constructor

    public long addNewValue(String strName, String strUser, String strPassword) {


        ContentValues contentValues = new ContentValues();
        contentValues.put(column_name, strName);
        contentValues.put(column_user, strUser);
        contentValues.put(column_pass, strPassword);

        return sqLiteDatabase.insert(user_table, null, contentValues);

    }


} // Main Class
