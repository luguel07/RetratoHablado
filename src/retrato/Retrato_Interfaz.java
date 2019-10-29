/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retrato;

import java.awt.Image;
import java.io.IOException;
import javax.swing.ImageIcon;
/**
 *
 * @author eblan
 */
public class Retrato_Interfaz extends javax.swing.JFrame{
ImageIcon cara1,cara2,cara3,cara4,cara5,cejas1,cejas2,cejas3,cejas4,cejas5,ojos1,ojos2,ojos3,ojos4,ojos5;
ImageIcon boca1,boca2,boca3,boca4,boca5,barba1,barba2,barba3,barba4,barba5,propiedades;
/**
     * Creates new form Retrato_Interfaz
     */
    public Retrato_Interfaz() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        salir = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        ayuda = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        caras = new javax.swing.JComboBox<>();
        cabellos = new javax.swing.JComboBox<>();
        cejas = new javax.swing.JComboBox<>();
        ojos = new javax.swing.JComboBox<>();
        bocas = new javax.swing.JComboBox<>();
        barbas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        salir.setBackground(new java.awt.Color(255, 102, 0));
        salir.setText("SALIR");
        salir.setToolTipText("SALIR");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        regresar.setBackground(new java.awt.Color(102, 153, 255));
        regresar.setText("REGRESAR");
        regresar.setToolTipText("REGRESAR AL INICIO");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        ayuda.setBackground(new java.awt.Color(0, 51, 153));
        ayuda.setForeground(new java.awt.Color(255, 255, 255));
        ayuda.setText("?");
        ayuda.setToolTipText("AYUDA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(regresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ayuda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salir)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regresar)
                    .addComponent(salir)
                    .addComponent(ayuda))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        caras.setBackground(new java.awt.Color(138, 114, 255));
        caras.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        caras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CARA 1", "CARA 2", "CARA 3", "CARA 4", "CARA 5" }));
        caras.setToolTipText("CARAS");
        caras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carasActionPerformed(evt);
            }
        });

        cabellos.setBackground(new java.awt.Color(138, 114, 255));
        cabellos.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        cabellos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CABELLO 1", "CABELLO 2", "CABELLO 3", "CABELLO 4", "CABELLO 5" }));
        cabellos.setToolTipText("CABELLOS");

        cejas.setBackground(new java.awt.Color(138, 114, 255));
        cejas.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        cejas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CEJAS 1", "CEJAS 2", "CEJAS 3", "CEJAS 4", "CEJAS 5" }));
        cejas.setToolTipText("CEJAS");

        ojos.setBackground(new java.awt.Color(138, 114, 255));
        ojos.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        ojos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OJOS 1", "OJOS 2", "OJOS 3", "OJOS 4", "OJOS 5" }));
        ojos.setToolTipText("OJOS");

        bocas.setBackground(new java.awt.Color(138, 114, 255));
        bocas.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        bocas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BOCA 1", "BOCA 2", "BOCA 3", "BOCA 4", "BOCA 5" }));
        bocas.setToolTipText("BOCAS");

        barbas.setBackground(new java.awt.Color(138, 114, 255));
        barbas.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        barbas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BARBA 1", "BARBA 2", "BARBA 3", "BARBA 4", "BARBA 5" }));
        barbas.setToolTipText("BARBAS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(caras, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cabellos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cejas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ojos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bocas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(barbas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caras, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cabellos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cejas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ojos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bocas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barbas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(282, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        this.setVisible(false);
        Interfaz interfaz= new Interfaz();
        interfaz.setVisible(true);
       
    }//GEN-LAST:event_regresarActionPerformed

    private void carasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carasActionPerformed
      String mensage = "La cara que eligio es: ";  
      System.out.println(mensage + caras.getSelectedItem());
         /*cara1 = new ImageIcon(getClass().getResource("/imagenes/caras/Cara_1.jpg"));
            propiedades = new ImageIcon(cara1.getImage().getScaledInstance(lienzo.getWidth(), lienzo.getHeight(), Image.SCALE_DEFAULT));
            lienzo.setIcon(ojos1);
            this.repaint();
            String mensage = "La cara que eligio es: ";
            System.out.println(mensage + caras.getSelectedItem());*/
        
    }//GEN-LAST:event_carasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Retrato_Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Retrato_Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Retrato_Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Retrato_Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Retrato_Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ayuda;
    private javax.swing.JComboBox<String> barbas;
    private javax.swing.JComboBox<String> bocas;
    private javax.swing.JComboBox<String> cabellos;
    private javax.swing.JComboBox<String> caras;
    private javax.swing.JComboBox<String> cejas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> ojos;
    private javax.swing.JButton regresar;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables

    
}
