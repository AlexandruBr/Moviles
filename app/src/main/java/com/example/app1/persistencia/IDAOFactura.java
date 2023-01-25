package com.example.app1.persistencia;

import com.example.app1.AppConfig;
import com.example.app1.modelo.ModelFactura;

public abstract class IDAOFactura {
    public abstract ModelFactura getById(int codigo);
    public static IDAOFactura getInstance() {
        if(AppConfig.Modo == "MEMORY") {
            return new DAOMemoryFactura();
        }
        if(AppConfig.Modo == "SQLite") {
            //return new DAOSQLiteFactura();
        }

        if (AppConfig.Modo == "FIREBASE") {
            //return new DAOFireBaseFactura();
        }
        return null;
    }
}
