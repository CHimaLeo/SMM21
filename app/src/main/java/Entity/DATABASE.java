package Entity;

import android.provider.BaseColumns;

public final class DATABASE {
    private DATABASE() { }

    public static final class DATABASECONF {
        public static final String DATABASE_NAME = "SMM21.db";
        public static final int VERSION = 1;
    }

    public static class FechaEntity implements BaseColumns {
        public static final String TABLE_NAME = "Fecha";
        public static final String Column_ID = "ID";
        public static final String Column_Dia = "Dia";
        public static final String Column_Mes = "Mes";
        public static final String Column_Año = "Año";
        public static final String Column_Subtitulo = "Subtitulo";
        public static final String Column_Imagen = "Imagen";
        /*CREATE TABLE "Fecha" (
                "ID"	INTEGER NOT NULL,
                "Dia"	TEXT NOT NULL,
                "Mes"	TEXT NOT NULL,
                "Año"	INTEGER NOT NULL,
                "Subtitulo"	TEXT,
                "Imagen"	TEXT,
        PRIMARY KEY("ID")
    );*/
    }

    public static final class EventoEntity {
        public static final String TABLE_NAME = "Evento";
        public static final String Column_ID = "ID";
        public static final String Column_Titulo = "Titulo";
        public static final String Column_Donante = "Donante";
        public static final String Column_Direccion = "Direccion";
        public static final String Column_Hora = "Hora";
        public static final String Column_Imagen = "Imagen";
        public static final String Column_ID_Fecha = "ID_Fecha";
        public static final String Column_ID_Tipo = "ID_Tipo";
        public static final String Column_ID_Estatus = "ID_Estatus";
        /*
        CREATE TABLE "Evento" (
	"ID"	INTEGER NOT NULL,
	"Titulo"	TEXT,
	"Donante"	TEXT,
	"Direccion"	TEXT,
	"Hora"	TEXT,
	"Imagen"	TEXT,
	"ID_Fecha"	INTEGER NOT NULL,
	"ID_Tipo"	INTEGER NOT NULL,
	"ID_Estatus"	INTEGER NOT NULL,
	PRIMARY KEY("ID")
);*/
    }

    public static final class TipoEntity {
        public static final String TABLE_NAME = "Tipo";
        public static final String Column_ID = "ID";
        public static final String Column_Tipo_Evento = "Tipo_Evento";

        /*
        CREATE TABLE "Tipo" (
	"ID"	INTEGER NOT NULL,
	"Tipo_Evento"	TEXT NOT NULL,
	PRIMARY KEY("ID")
);*/
    }

    public static final class EstatusEntity {
        public static final String TABLE_NAME = "Estatus";
        public static final String Column_ID = "ID";
        public static final String Column_Estatus = "Estatus";

        /*CREATE TABLE "Estatus" (
	"ID"	INTEGER NOT NULL,
	"Estatus"	TEXT NOT NULL,
	PRIMARY KEY("ID")
);*/
    }
}
