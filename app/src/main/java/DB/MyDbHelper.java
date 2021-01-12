package DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import Entity.DATABASE;

public class MyDbHelper extends SQLiteOpenHelper {


    public MyDbHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE " + DATABASE.FechaEntity.TABLE_NAME + " (" +
                DATABASE.FechaEntity.Column_ID + " INTEGER PRIMARY KEY," +
                DATABASE.FechaEntity.Column_Dia + " INTEGER," +
                DATABASE.FechaEntity.Column_Mes + "TEXT," +
                DATABASE.FechaEntity.Column_Año + "INTEGER," +
                DATABASE.FechaEntity.Column_Subtitulo + "TEXT," +
                DATABASE.FechaEntity.Column_Imagen + "TEXT);"
        );

        db.execSQL("CREATE TABLE " + DATABASE.EventoEntity.TABLE_NAME + " (" +
                DATABASE.EventoEntity.Column_ID + " INTEGER PRIMARY KEY," +
                DATABASE.EventoEntity.Column_Titulo + " TEXT," +
                DATABASE.EventoEntity.Column_Donante + " TEXT, " +
                DATABASE.EventoEntity.Column_Direccion + " TEXT, " +
                DATABASE.EventoEntity.Column_Hora + " TEXT, " +
                DATABASE.EventoEntity.Column_ID_Fecha + " REFERENCES " + DATABASE.FechaEntity.TABLE_NAME + " ( " + DATABASE.FechaEntity.Column_ID + "), " +
                DATABASE.EventoEntity.Column_ID_Tipo + " REFERENCES " + DATABASE.TipoEntity.TABLE_NAME + " ( " + DATABASE.TipoEntity.Column_ID + "), " +
                DATABASE.EventoEntity.Column_ID_Estatus + " REFERENCES " + DATABASE.EstatusEntity.TABLE_NAME + " ( " + DATABASE.EstatusEntity.Column_ID + "));"
        );

        db.execSQL("CREATE TABLE " + DATABASE.TipoEntity.TABLE_NAME + " (" +
                DATABASE.TipoEntity.Column_ID + " INTEGER PRIMARY KEY," +
                DATABASE.TipoEntity.Column_Tipo_Evento + " TEXT );"
        );

        db.execSQL("CREATE TABLE " + DATABASE.EstatusEntity.TABLE_NAME + " (" +
                DATABASE.EstatusEntity.Column_ID + " INTEGER PRIMARY KEY," +
                DATABASE.EstatusEntity.Column_Estatus + " TEXT );"
        );
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE.FechaEntity.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE.EventoEntity.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE.TipoEntity.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE.EstatusEntity.TABLE_NAME);
        onCreate(db);
    }
}
