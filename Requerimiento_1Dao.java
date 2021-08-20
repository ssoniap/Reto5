package utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto4.util.JDBCUtilities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Requerimiento_1Dao {
 
    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException{
    ArrayList<Requerimiento_1> resultado= new ArrayList<Requerimiento_1>();
    Connection cx= JDBCUtilities.getConnection();
    try {
        String consulta = "select count(l.ID_Lider) numLideres, "+
                              "l.Ciudad_Residencia"+
                              " from Lider l "+
                              "group by l.Ciudad_Residencia;";
        PreparedStatement statement = cx.prepareStatement(consulta);
        ResultSet resultSet = statement.executeQuery();
        while(resultSet.next()){
            Requerimiento_1 re = new Requerimiento_1();
            re.setNro_lideres(resultSet.getInt("numLideres"));
            re.setCiudad_residencia(resultSet.getString("Ciudad_Residencia"));
            resultado.add(re);
        }
        resultSet.close();
        statement.close();
    } catch(SQLException e){
        System.err.println("Error consultando Número de lideres por ciudad: " + e);        
    }
    return resultado;
    }

    
    
}
