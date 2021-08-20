/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto4.modelo.vo;

/**
 *
 * @author Usuario
 */
public class Requerimiento_3 {
    private int ID_lider; 
    private String nombre;
    private String primer_apellido;
    private String segundo_apellido;
    
    public Requerimiento_3(){
    }

    public Requerimiento_3(int ID_lider, String nombre, String primer_apellido, String segundo_apellido) {
        this.ID_lider = ID_lider;
        this.nombre = nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
    }

    public int getID_lider() {
        return ID_lider;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setID_lider(int ID_lider) {
        this.ID_lider = ID_lider;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }
    
    
}
