package com.example.app1.persistencia;

import com.example.app1.AppConfig;
import com.example.app1.modelo.ModelLineaFactura;

import java.util.ArrayList;

public abstract class IDAOLineaFactura {
    public abstract ArrayList<ModelLineaFactura> getByCodigoFactura(int codigoFactura);
    public static IDAOLineaFactura getInstance(){
        if(AppConfig.Modo == "MEMORY") {
            return new DAOMemoryLineaFactura();
        }
        if(AppConfig.Modo == "SQLite") {
            //return new DAOSQLiteLineaFactura();
        }

        if (AppConfig.Modo == "FIREBASE") {
            //return new DAOFireBaseLineaFactura();
        }
        return null;
    }
}
