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
import java.sql.Statement;
import java.util.ArrayList;
import utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto4.util.JDBCUtilities;

/**
 *
 * @author Usuario
 */
public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException{
     ArrayList<Requerimiento_2> resultado = new ArrayList<Requerimiento_2>();
     Connection cx = JDBCUtilities.getConnection();
    try{
        String consulta = "select c.ID_Proyecto, c.Proveedor, c.Pagado, mc.ID_MaterialConstruccion, mc.Nombre_Material"+
             " from compra c "+ "inner join MaterialConstruccion mc on c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion "+
            "where c.Proveedor = 'Homecenter' and c.Pagado = 'No' order by c.ID_Proyecto;";
        PreparedStatement statement = cx.prepareStatement(consulta);
        ResultSet resultSet = statement.executeQuery();
        while(resultSet.next()){
            Requerimiento_2 requerimiento = new Requerimiento_2();
            requerimiento.setID_proyecto(resultSet.getInt("ID_Proyecto"));
            requerimiento.setProveedor(resultSet.getString("Proveedor"));
            requerimiento.setPagado(resultSet.getString("Pagado"));
            requerimiento.setID_material_construccion(resultSet.getInt("ID_MaterialConstruccion"));
            requerimiento.setNombre_material(resultSet.getString("Nombre_Material"));
            resultado.add(requerimiento);
        }
        resultSet.close();
        statement.close();
    }catch (SQLException e){
        System.err.println("Error consultando Materiales no pagados al proveedor Homecenter: "+e);        
    }
    return resultado;  
    }
}
