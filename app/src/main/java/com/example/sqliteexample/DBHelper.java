package com.example.sqliteexample;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import java.security.PublicKey;

public class DBHelper extends SQLiteOpenHelper {
    public final static String DATABASE_NAME = "EventBrat";
    public final static String TABLE_NAME = "Events";
    public final static String TITLE_COL = "title";
    public final static String DATE_COL = "date";
    public final static String IMAGE_ID_COL = "imd_id";


    public DBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.i("INFO", "onCreate was called");
        db.execSQL("CREATE TABLE " + DBHelper.TABLE_NAME + "(" +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                DBHelper.TITLE_COL + " TEXT," +
                DBHelper.DATE_COL + " TEXT," +
                DBHelper.IMAGE_ID_COL + " INTEGER" +
                ")");

    }



    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
