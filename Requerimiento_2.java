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
public class Requerimiento_2 {
    private int ID_proyecto;
    private String proveedor;
    private String pagado;
    private int ID_material_construccion;
    private String nombre_material;
    
    public Requerimiento_2(){
    }

    public Requerimiento_2(int ID_proyecto, String proveedor, String pagado, int ID_material_construccion, String nombre_material) {
        this.ID_proyecto = ID_proyecto;
        this.proveedor = proveedor;
        this.pagado = pagado;
        this.ID_material_construccion = ID_material_construccion;
        this.nombre_material = nombre_material;
    }

    public int getID_proyecto() {
        return ID_proyecto;
    }

    public String getProveedor() {
        return proveedor;
    }

    public String getPagado() {
        return pagado;
    }

    public int getID_material_construccion() {
        return ID_material_construccion;
    }

    public String getNombre_material() {
        return nombre_material;
    }

    public void setID_proyecto(int ID_proyecto) {
        this.ID_proyecto = ID_proyecto;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public void setPagado(String pagado) {
        this.pagado = pagado;
    }

    public void setID_material_construccion(int ID_material_construccion) {
        this.ID_material_construccion = ID_material_construccion;
    }

    public void setNombre_material(String nombre_material) {
        this.nombre_material = nombre_material;
    }

   
    
    
}


