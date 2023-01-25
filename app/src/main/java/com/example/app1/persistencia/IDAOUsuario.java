package com.example.app1.persistencia;

import com.example.app1.AppConfig;
import com.example.app1.modelo.ModelUsuario;

public abstract class IDAOUsuario {
    public abstract ModelUsuario getById(int codigo);
    public static IDAOUsuario getInstance() {
        if(AppConfig.Modo == "MEMORY") {
            return new DAOMemoryUsuario();
        }
        if(AppConfig.Modo == "SQLite") {
            //return new DAOSQLiteUsuario();
        }

        if (AppConfig.Modo == "FIREBASE") {
            //return new DAOFireBaseUsuario();
        }
        return null;
    }
}
