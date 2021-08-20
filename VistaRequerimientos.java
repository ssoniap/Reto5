/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto4.vista;

import java.sql.SQLException;
import java.util.ArrayList;
import utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto4.modelo.vo.Requerimiento_3;
import utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto4.util.ControladorRequerimientos;


/**
 *
 * @author Usuario
 */
public class VistaRequerimientos {
    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1() throws SQLException{
        ArrayList<Requerimiento_1> numLideresCiudad = controlador.consultarRequerimiento1();

        //Encabezado del resultado
        System.out.println("Nro_Lideres Ciudad_Residencia");
        try {
            for(Requerimiento_1 requerimiento : numLideresCiudad){
                System.out.println(requerimiento.getNro_lideres()+ "  " +
                                   requerimiento.getCiudad_residencia());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento2()throws SQLException{
        ArrayList<Requerimiento_2> materialesNoPagados = controlador.consultarRequerimiento2();

        //Encabezado del resultado
        System.out.println("ID_Proyecto Proveedor Pagado  ID_MaterialConstruccion  Nombre_Material");
        try {
            for(Requerimiento_2 requerimiento : materialesNoPagados){
                System.out.println(requerimiento.getID_proyecto()+ "  " +
                                   requerimiento.getProveedor()+ "  " +
                                   requerimiento.getPagado()+ "  " +
                                   requerimiento.getID_material_construccion()+ "  " +
                                   requerimiento.getNombre_material());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento3()throws SQLException{
        ArrayList<Requerimiento_3> lideresDebenDinero = controlador.consultarRequerimiento3();

        //Encabezado del resultado
        System.out.println("ID_Lider Nombre Primer_Apellido Segundo_Apellido");
        try {
            for(Requerimiento_3 requerimiento : lideresDebenDinero){
                System.out.println(requerimiento.getID_lider()+ "  " +
                                   requerimiento.getNombre()+ "  " +
                                   requerimiento.getPrimer_apellido()+ "  " +
                                   requerimiento.getSegundo_apellido());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
        
}
