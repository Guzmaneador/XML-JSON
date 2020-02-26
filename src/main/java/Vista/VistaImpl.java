
package Vista;

import Controlador.Controlador;
import Controlador.ControladorImpl;
import Modelo.Empresas.DepartamentoVO;
import Modelo.Modelo;
import Modelo.ModeloImpl;

/**
 *
 * @author munchi
 */
public class VistaImpl extends javax.swing.JFrame implements Vista {
   Controlador controlador;
   Modelo modelo = new ModeloImpl();
 
    public VistaImpl() {
        initComponents();
    }
    
    @Override
    public void Iniciar(ControladorImpl controlador) {
        this.controlador=controlador;
        this.setVisible(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numeroTF = new javax.swing.JTextField();
        nombreTF = new javax.swing.JTextField();
        ubicacionTF = new javax.swing.JTextField();
        añadirB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        borrarB = new javax.swing.JButton();
        editarB = new javax.swing.JButton();
        buscarB = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        añadirB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anadir.png"))); // NOI18N
        añadirB.setBorderPainted(false);
        añadirB.setContentAreaFilled(false);
        añadirB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        añadirB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirBActionPerformed(evt);
            }
        });

        jLabel1.setText("Numero:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Ubicacion:");

        borrarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.png"))); // NOI18N
        borrarB.setBorderPainted(false);
        borrarB.setContentAreaFilled(false);
        borrarB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        borrarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarBActionPerformed(evt);
            }
        });

        editarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit.png"))); // NOI18N
        editarB.setBorderPainted(false);
        editarB.setContentAreaFilled(false);
        editarB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBActionPerformed(evt);
            }
        });

        buscarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar.png"))); // NOI18N
        buscarB.setBorderPainted(false);
        buscarB.setContentAreaFilled(false);
        buscarB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/html.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/archivo-json (1).png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(borrarB, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(añadirB)
                                .addGap(18, 18, 18)
                                .addComponent(editarB))
                            .addComponent(ubicacionTF, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(nombreTF)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addComponent(jLabel1))
                        .addGap(43, 43, 43)
                        .addComponent(numeroTF)))
                .addGap(18, 18, 18)
                .addComponent(buscarB, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(buscarB, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ubicacionTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(añadirB)
                            .addComponent(borrarB)))
                    .addComponent(editarB))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void añadirBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirBActionPerformed
        controlador.insertarDepartamento(recogerDatos());
    }//GEN-LAST:event_añadirBActionPerformed

    private void borrarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarBActionPerformed
        controlador.borrarDepartamento(numeroTF.getText());
    }//GEN-LAST:event_borrarBActionPerformed

    private void buscarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBActionPerformed
        mostrarDatos(controlador.buscarDepartamento(numeroTF.getText()));
    }//GEN-LAST:event_buscarBActionPerformed

    private void editarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBActionPerformed
        controlador.actualizarDepartamento(recogerDatos());
    }//GEN-LAST:event_editarBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        controlador.obtenerHTML();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        controlador.transoformarEnJSON();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton añadirB;
    private javax.swing.JButton borrarB;
    private javax.swing.JButton buscarB;
    private javax.swing.JButton editarB;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nombreTF;
    private javax.swing.JTextField numeroTF;
    private javax.swing.JTextField ubicacionTF;
    // End of variables declaration//GEN-END:variables

    public DepartamentoVO recogerDatos(){
        DepartamentoVO departamento = new DepartamentoVO();
        departamento.setNumero(numeroTF.getText());
        departamento.setNombre(nombreTF.getText());
        departamento.setUbicacion(ubicacionTF.getText());
        return departamento;
    }
    
    public void mostrarDatos(DepartamentoVO departamento){
        nombreTF.setText(departamento.getNombre());
        ubicacionTF.setText(departamento.getUbicacion());
    }
}
