package com.dfl9.apptst.Model;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class EstudianteDBHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Desarrollo.db";

    public EstudianteDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + EstudianteContract.EstudianteEntry.TABLE_NAME + " ("
                + EstudianteContract.EstudianteEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + EstudianteContract.EstudianteEntry.ID + " TEXT NOT NULL,"
                + EstudianteContract.EstudianteEntry.NAME + " TEXT NOT NULL,"
                + "UNIQUE (" + EstudianteContract.EstudianteEntry.ID + "))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
