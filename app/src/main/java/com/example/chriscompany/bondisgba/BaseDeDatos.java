package com.example.chriscompany.bondisgba;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by chris on 23/01/17.
 */
public class BaseDeDatos extends SQLiteOpenHelper {

    private static final int VERSION_BASEDATOS = 1;

    // Nombre de nuestro archivo de base de datos
    private static final String NOMBRE_BASEDATOS = "BD_bondis.db";

    // Sentencia SQL para la creación de una tabla
    private static final String TABLA_BONDIS = "CREATE TABLE Tb_bondis" +
            "(_id INT PRIMARY KEY autoincrement, nombre TEXT, ramal TEXT, tipo TEXT, frecuencia TEXT)";


    // CONSTRUCTOR de la clase
    public BaseDeDatos(Context context) {
        super(context, NOMBRE_BASEDATOS, null, VERSION_BASEDATOS);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLA_BONDIS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLA_BONDIS);
        onCreate(db);
    }

    public void insertar(String nombre, String tipo, String ramal, String frecuencia) {
        SQLiteDatabase db = getWritableDatabase();
        if(db != null){
            ContentValues valores = new ContentValues();
            valores.put("nombre", nombre);
            valores.put("tipo", tipo);
            valores.put("ramal", ramal);
            valores.put("frecuencia", frecuencia);
            db.insert("Tb_bondis", null, valores);
            db.close();
        }
    }
}
