/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto4.modelo.vo.Requerimiento_3;
import utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto4.util.JDBCUtilities;

/**
 *
 * @author Usuario
 */
public class Requerimiento_3Dao {
    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException{
        ArrayList<Requerimiento_3> resultado = new ArrayList<Requerimiento_3>();
        Connection cx = JDBCUtilities.getConnection();    
    try{
        String consulta = "select distinct l.ID_Lider, l.Nombre, l.Primer_Apellido, l.Segundo_Apellido"+
                              " from proyecto p "+
                              "inner join lider l on p.ID_Lider = l.ID_Lider";
        PreparedStatement statement = cx.prepareStatement(consulta);
        ResultSet resultSet = statement.executeQuery();
        while(resultSet.next()){
            Requerimiento_3 requerimiento = new Requerimiento_3();
            requerimiento.setID_lider(resultSet.getInt("ID_Lider"));
            requerimiento.setNombre(resultSet.getString("Nombre"));
            requerimiento.setPrimer_apellido(resultSet.getString("Primer_Apellido"));
            requerimiento.setSegundo_apellido(resultSet.getString("Segundo_Apellido"));
            resultado.add(requerimiento);
        }
        resultSet.close();
        statement.close();
    }catch(SQLException e) {
        System.err.println("Error consultando Proyectos que deben dinero por compra de materiales: "+e);
    } 
    return resultado;
    }
}
