package com.dfl9.apptst.Model;

import android.provider.BaseColumns;

public class EstudianteContract {
    public static abstract class EstudianteEntry implements BaseColumns {
        public static final String TABLE_NAME ="Estudiante";

        public static final String ID = "id";
        public static final String NAME = "name";
    }
}
