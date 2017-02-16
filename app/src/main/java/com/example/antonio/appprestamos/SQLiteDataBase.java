package com.example.antonio.appprestamos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Antonio on 14/02/2017.
 */

public class SQLiteDataBase extends SQLiteOpenHelper {

    String tabla = "CREATE TABLE Personas(Id INTEGER PRIMARY KEY AUTOINCREMENT, Nombre TEXT, Apellido Text, Usuario Text, Password Text, Correo Text, Telefono Integer)";

    public SQLiteDataBase(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(tabla);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
