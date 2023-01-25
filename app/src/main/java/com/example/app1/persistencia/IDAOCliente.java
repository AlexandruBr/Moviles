package com.example.app1.persistencia;

import com.example.app1.AppConfig;
import com.example.app1.modelo.ModelCliente;

public abstract class IDAOCliente {
    public abstract ModelCliente getById(int codigo);
    public static IDAOCliente getInstance() {
        if(AppConfig.Modo == "MEMORY") {
            return new DAOMemoryCliente();
        }
        if(AppConfig.Modo == "SQLite") {
            //return new DAOSQLiteCliente();
        }

        if (AppConfig.Modo == "FIREBASE") {
            //return new DAOFireBaseCliente();
        }
        return null;
    }
}
