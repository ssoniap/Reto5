/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto4.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class JDBCUtilities {
    private static final String BD = "ProyectosConstruccion.db";
    
    public static Connection getConnection(){
        String url = "jdbc:sqlite:" + BD;
        try{ 
            return DriverManager.getConnection(url);
        } catch (SQLException e){
            return null;
        }
    }
}
