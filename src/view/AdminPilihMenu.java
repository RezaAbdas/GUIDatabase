/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.Connection;

/**
 *
 * @author ASUS
 */
public class AdminPilihMenu extends javax.swing.JFrame {

    /**
     * Creates new form KaryawanPilihMenu
     */
    public AdminPilihMenu() {
        this.setTitle("Menu Admin");
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

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tombolhitunggaji = new javax.swing.JButton();
        tombolinputdata = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        tombolkembali = new javax.swing.JLabel();
        tombollogout = new javax.swing.JButton();

        jPanel4.setBackground(new java.awt.Color(245, 118, 101));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(232, 250, 224));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(69, 183, 183));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Silahkan Pilih Menu");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        tombolhitunggaji.setBackground(new java.awt.Color(69, 183, 183));
        tombolhitunggaji.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        tombolhitunggaji.setForeground(new java.awt.Color(232, 250, 224));
        tombolhitunggaji.setText("Hitung Gaji");
        tombolhitunggaji.setBorder(null);
        tombolhitunggaji.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        tombolhitunggaji.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tombolhitunggaji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolhitunggajiActionPerformed(evt);
            }
        });

        tombolinputdata.setBackground(new java.awt.Color(69, 183, 183));
        tombolinputdata.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        tombolinputdata.setForeground(new java.awt.Color(232, 250, 224));
        tombolinputdata.setText("Input Data ");
        tombolinputdata.setBorder(null);
        tombolinputdata.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        tombolinputdata.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tombolinputdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolinputdataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tombolinputdata, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombolhitunggaji, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(tombolhitunggaji, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tombolinputdata, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 196, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 350, -1));

        jPanel2.setBackground(new java.awt.Color(69, 183, 183));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Login User Icon.png"))); // NOI18N
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(232, 250, 224));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Selamat datang");

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(232, 250, 224));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("di menu Admin");
        jLabel7.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jLabel7ComponentShown(evt);
            }
        });
        jLabel7.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jLabel7PropertyChange(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(232, 250, 224));

        tombolkembali.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        tombolkembali.setForeground(new java.awt.Color(69, 183, 183));
        tombolkembali.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tombolkembali.setText("<");
        tombolkembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombolkembaliMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tombolkembali, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tombolkembali, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        tombollogout.setBackground(new java.awt.Color(232, 250, 224));
        tombollogout.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        tombollogout.setForeground(new java.awt.Color(69, 183, 183));
        tombollogout.setText("Log Out");
        tombollogout.setBorder(null);
        tombollogout.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        tombollogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombollogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tombollogout, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(tombollogout, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //method tampil nama
  
    
    private void tombolkembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolkembaliMouseClicked
 //untuk kembali ke admin login
        AdminLogin KL = new AdminLogin();
        KL.setVisible(true);
        KL.pack();
        KL.setLocationRelativeTo(null);
        KL.setDefaultCloseOperation(KL.EXIT_ON_CLOSE);
        dispose(); //menutup jendela
    }//GEN-LAST:event_tombolkembaliMouseClicked

    private void jLabel7ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel7ComponentShown
        
    }//GEN-LAST:event_jLabel7ComponentShown

    private void jLabel7PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jLabel7PropertyChange
        
    }//GEN-LAST:event_jLabel7PropertyChange

    private void tombolhitunggajiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolhitunggajiActionPerformed
        AdminHitungGaji KL = new AdminHitungGaji();
        KL.setVisible(true);
        KL.pack();
        KL.setLocationRelativeTo(null);
        KL.setDefaultCloseOperation(KL.EXIT_ON_CLOSE);
        dispose(); //menutup jendela
    }//GEN-LAST:event_tombolhitunggajiActionPerformed

    private void tombolinputdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolinputdataActionPerformed
        AdminCRUD KL = new AdminCRUD();
        KL.setVisible(true);
        KL.pack();
        KL.setLocationRelativeTo(null);
        KL.setDefaultCloseOperation(KL.EXIT_ON_CLOSE);
        dispose(); //menutup jendela
    }//GEN-LAST:event_tombolinputdataActionPerformed

    private void tombollogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombollogoutActionPerformed
        dispose();//menutup jendela
    }//GEN-LAST:event_tombollogoutActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPilihMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPilihMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPilihMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPilihMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPilihMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton tombolhitunggaji;
    private javax.swing.JButton tombolinputdata;
    private javax.swing.JLabel tombolkembali;
    private javax.swing.JButton tombollogout;
    // End of variables declaration//GEN-END:variables
}
