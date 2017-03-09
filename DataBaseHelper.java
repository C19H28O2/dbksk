package com.example.adri.sqliteapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Adri on 05/03/2017.
 */

public class DataBaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Patients.db";
    public static final String TABLE_NAME = "Patients";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "NAME";
    public static final String COL_3 = "PHONE_NUMBER";
    public static final String COL_4 = "WEIGHT"; //kg
    public static final String COL_5 = "HEIGHT"; //cm
    public static final String COL_6 = "SP"; //Systolic Pressure.
    public static final String COL_7 = "DP"; //Diastolic Pressure.
    public static final String COL_8 = "CC"; //Clinical Condition.


    public DataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+ TABLE_NAME +" ("+ COL_1 +" INTEGER PRIMARY KEY AUTOINCREMENT,"+ COL_2 +" TEXT,"+ COL_3
                +" INTEGER,"+ COL_4 +" INTEGER,"+ COL_5 +" INTEGER,"+ COL_6 +" INTEGER,"+ COL_7 +" INTEGER,"+ COL_8 +" TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS TABLE_NAME");
        onCreate(db);
    }

    public void addData(String name, String pn, int weight, int height, int sp, int dp, String cc){

    }
}
