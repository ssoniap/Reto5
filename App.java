/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.p41.reto4;

import java.sql.SQLException;
import utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto4.vista.Menu;
import utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto4.vista.VistaRequerimientos;

/**
 *
 * @author Usuario
 */
public class App {
    public static void main( String[] args ) throws SQLException{       
        
        //Casos de prueba 
        /**
        //Requerimiento 3 - Reto3
        System.out.println("Requerimiento 1");
        VistaRequerimientos.requerimiento1();

        //Requerimiento 4 - Reto3
        System.out.println("\nRequerimiento 2");
        VistaRequerimientos.requerimiento2();

        //Requerimiento 5 - Reto3    
        System.out.println("\nRequerimiento 3");
        VistaRequerimientos.requerimiento3();
        */
        
        Menu m = new Menu();
        m.setVisible(true);
        
    }    
}
