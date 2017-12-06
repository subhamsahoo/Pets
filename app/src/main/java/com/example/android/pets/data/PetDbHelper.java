package com.example.android.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.android.pets.data.PetContract.PetsEntry;

/**
 * Created by subham on 20-10-2017.
 */

public class PetDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME="shelter.db";

    private static final int DATABASE_VERSION = 1;

    public PetDbHelper(Context context)
    {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String SQL_CREATE_PETS_TABLE = "CREATE TABLE "+PetsEntry.TABLE_NAME+"("
                +PetsEntry._ID+" INTEGER PRIMARY KEY AUTOINCREMENT,"+
                PetsEntry.COLUMN_NAME+" TEXT NOT NULL,"+
                PetsEntry.COLUMN_BREED+" TEXT,"+
                PetsEntry.COLUMN_GENDER+" INTEGER NOT NULL,"+
                PetsEntry.COLUMN_WEIGHT+" INTEGER NOT NULL DEFAULT 0);";

        sqLiteDatabase.execSQL(SQL_CREATE_PETS_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
