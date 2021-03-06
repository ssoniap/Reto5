/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto4.vista;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto4.modelo.vo.Requerimiento_3;
import utp.misiontic2022.c2.utp.misiontic2022.c2.p41.reto4.util.ControladorRequerimientos;

/**
 *
 * @author Usuario
 */
public class Requerimiento_3tabla extends javax.swing.JFrame {
    
    private DefaultTableModel modeloTabla;
    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    /**
     * Creates new form Requerimiento_3
     */
    public Requerimiento_3tabla() {
        initComponents();
        modeloTabla= new DefaultTableModel();
        modeloTabla.addColumn("ID_Líder");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Primer Apellido");
        modeloTabla.addColumn("Segundo Apellido");
        TablaRequerimiento3.setModel(modeloTabla);
    }
    
    /**
     public void informacion(ArrayList<Requerimiento_3> info) {
        String encabezados[] = {"ID_Lider","Nombre","Primer_Apellido","Segundo_Apellido" };
        String matriz[][] = new String[info.size()][encabezados.length];
        for (int i = 0; i < info.size(); i++) {
            matriz[i][0] = info.get(i).getID_lider()+"";
            matriz[i][1] = info.get(i).getNombre();
            matriz[i][2] = info.get(i).getPrimer_apellido();
            matriz[i][3] = info.get(i).getSegundo_apellido();
        }
        TablaRequerimiento3 = new JTable(matriz, encabezados);
        TablaRequerimiento3.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(TablaRequerimiento3);
        TablaRequerimiento3.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    }
*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaRequerimiento3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Requerimiento3");

        TablaRequerimiento3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "col1", "col2", "col3", "col4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaRequerimiento3.setMaximumSize(new java.awt.Dimension(300, 0));
        TablaRequerimiento3.setMinimumSize(new java.awt.Dimension(50, 0));
        TablaRequerimiento3.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TablaRequerimiento3);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Requerimiento 3. Nombre líderes de proyecto con deuda por materiales");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void GenerarT(){
        try {
            ArrayList<Requerimiento_3> lideresDebenDinero = controlador.consultarRequerimiento3();
            for (int i = 0; i < lideresDebenDinero.size(); i++) {
                String datos[]= new String[4];
                datos[0]= "" + lideresDebenDinero.get(i).getID_lider();
                datos[1]= lideresDebenDinero.get(i).getNombre();
                datos[2]= lideresDebenDinero.get(i).getPrimer_apellido();
                datos[3]= lideresDebenDinero.get(i).getSegundo_apellido();                
                modeloTabla.addRow(datos);
                
            } 
        } catch (SQLException ex) {
            Logger.getLogger(Requerimiento_1tabla.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaRequerimiento3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
