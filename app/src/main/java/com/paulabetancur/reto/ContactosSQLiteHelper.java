package com.paulabetancur.reto;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



public class ContactosSQLiteHelper extends SQLiteOpenHelper {

    String DATA_BASE_NAME = "Libros";
    int DATA_VERSION = 1;

    String sqlCreate = "CREATE TABLE contactos(" +
            "id INTEGER PRIMARY KEY AUTOINCREMENT," + //0
            "name TEXT," +      //1
            "autor TEXT," +     //2
            "presta TEXT," +    //3
            "phone TEXT)";      //4

    public ContactosSQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(sqlCreate);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS contactos");
        sqLiteDatabase.execSQL(sqlCreate);

    }
}