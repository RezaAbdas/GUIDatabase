/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class KaryawanAbsensi extends javax.swing.JFrame {

    /**
     * Creates new form KaryawanAbsensi
     */
    public KaryawanAbsensi() {
        this.setTitle("Absensi");
        initComponents();
    }
    
      //untuk mengosongkan form
    private void KosongkanForm() {
        namakaryawan.setText(null);
        nipkaryawan.setText(null);
        lemburkaryawan.setText(null);
    }
    
    
     public void ceknip(){
         try {
            Connection con = Koneksi.configDB(); //buat koneksi
            Statement s = con.createStatement(); //buat statement untuk menampung query sql

            String sql = "SELECT * FROM karyawan where nip= '" + nipkaryawan.getText() + "'"; //query sql untuk mendapatkan nip
            ResultSet r = s.executeQuery(sql); //hasil dari query swl diatas

            if (r.next()) {
                JOptionPane.showMessageDialog(this, "NIP benar");

            } else {
                JOptionPane.showMessageDialog(this, "NIP salah");
                
            }
        } catch (SQLException e) {
            System.out.println("Error" + e.getMessage());
        }
    }
    
     public void ceknama(){
         try {
            Connection con = Koneksi.configDB(); //buat koneksi
            Statement s = con.createStatement(); //buat statement untuk menampung query sql

            String sql = "SELECT * FROM karyawan where nama= '" + namakaryawan.getText() + "'"; //query sql untuk mendapatkan nip
            ResultSet r = s.executeQuery(sql); //hasil dari query swl diatas

            if (r.next()) {
                JOptionPane.showMessageDialog(this, "Nama benar");

            } else {
                JOptionPane.showMessageDialog(this, "Nama salah");
                
            }
        } catch (SQLException e) {
            System.out.println("Error" + e.getMessage());
        }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tombolabsensi = new javax.swing.JButton();
        tombolcetakgaji = new javax.swing.JButton();
        tombollogout = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        namakaryawan = new javax.swing.JTextField();
        nipkaryawan = new javax.swing.JTextField();
        lemburkaryawan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tombolsimpan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 118, 101));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Left User Karyawan.png"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(232, 250, 224));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Karyawan");

        tombolabsensi.setBackground(new java.awt.Color(232, 250, 224));
        tombolabsensi.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        tombolabsensi.setForeground(new java.awt.Color(245, 118, 101));
        tombolabsensi.setText("Absensi");
        tombolabsensi.setBorder(null);
        tombolabsensi.setPreferredSize(new java.awt.Dimension(43, 15));
        tombolabsensi.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        tombolabsensi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolabsensiActionPerformed(evt);
            }
        });

        tombolcetakgaji.setBackground(new java.awt.Color(232, 250, 224));
        tombolcetakgaji.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        tombolcetakgaji.setForeground(new java.awt.Color(245, 118, 101));
        tombolcetakgaji.setText("Cek Gaji");
        tombolcetakgaji.setBorder(null);
        tombolcetakgaji.setPreferredSize(new java.awt.Dimension(43, 15));
        tombolcetakgaji.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        tombolcetakgaji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolcetakgajiActionPerformed(evt);
            }
        });

        tombollogout.setBackground(new java.awt.Color(232, 250, 224));
        tombollogout.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        tombollogout.setForeground(new java.awt.Color(245, 118, 101));
        tombollogout.setText("Log Out");
        tombollogout.setBorder(null);
        tombollogout.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        tombollogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombollogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tombolabsensi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tombollogout, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tombolcetakgaji, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(235, 235, 235))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(tombolabsensi, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tombolcetakgaji, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addComponent(tombollogout, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 500));

        jPanel2.setBackground(new java.awt.Color(232, 250, 224));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/User Icon Absensi Karyawan.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/NIP Absensi Karyawan.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Lembur Absensi Karyawan.png"))); // NOI18N

        namakaryawan.setEditable(false);
        namakaryawan.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        namakaryawan.setForeground(new java.awt.Color(245, 118, 101));
        namakaryawan.setBorder(null);
        namakaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                namakaryawanMouseReleased(evt);
            }
        });

        nipkaryawan.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        nipkaryawan.setForeground(new java.awt.Color(245, 118, 101));
        nipkaryawan.setBorder(null);
        nipkaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                nipkaryawanMouseReleased(evt);
            }
        });

        lemburkaryawan.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lemburkaryawan.setForeground(new java.awt.Color(245, 118, 101));
        lemburkaryawan.setBorder(null);
        lemburkaryawan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lemburkaryawanKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(245, 118, 101));
        jLabel6.setText("Nama");

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(245, 118, 101));
        jLabel7.setText("NIP");

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(245, 118, 101));
        jLabel8.setText("Lembur");

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(245, 118, 101));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Absensi Karyawan");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        tombolsimpan.setBackground(new java.awt.Color(245, 118, 101));
        tombolsimpan.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        tombolsimpan.setForeground(new java.awt.Color(232, 250, 224));
        tombolsimpan.setText("Simpan");
        tombolsimpan.setBorder(null);
        tombolsimpan.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        tombolsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolsimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(lemburkaryawan)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(namakaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7)
                                    .addComponent(nipkaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tombolsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(nipkaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(namakaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(lemburkaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(tombolsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 520, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tombollogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombollogoutActionPerformed
        dispose();
    }//GEN-LAST:event_tombollogoutActionPerformed

    private void tombolcetakgajiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolcetakgajiActionPerformed
        KaryawanCekGaji KL = new KaryawanCekGaji();
        KL.setVisible(true);
        KL.pack();
        KL.setLocationRelativeTo(null);
        KL.setDefaultCloseOperation(KL.EXIT_ON_CLOSE);
        dispose(); //menutup jendela
    }//GEN-LAST:event_tombolcetakgajiActionPerformed

    private void tombolabsensiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolabsensiActionPerformed
        KaryawanAbsensi KL = new KaryawanAbsensi();
        KL.setVisible(true);
        KL.pack();
        KL.setLocationRelativeTo(null);
        KL.setDefaultCloseOperation(KL.EXIT_ON_CLOSE);
        dispose(); //menutup jendela
    }//GEN-LAST:event_tombolabsensiActionPerformed

    private void tombolsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolsimpanActionPerformed
          //menyimpan data yang telah diinput pada form
        try {

            /**
             * membuat variabel sql untuk memasukan data yang telah diinput ke
             * database perintah input data sama seperti di command mysql
             * menggunakan perintah INSERT INTO DATABASES VALUE
             */
            String sql = "INSERT INTO absensi VALUES ('" + namakaryawan.getText() + "','" + nipkaryawan.getText() + "','" + lemburkaryawan.getText() + "')";

            //membuat kondisi jika ada filed form yang belum terisi maka akan ada pesan error
            if (namakaryawan.getText().equals("") || nipkaryawan.getText().equals("") || lemburkaryawan.getText().equals("")) {

                //this untuk pesan error berada di depan form
                JOptionPane.showMessageDialog(this, "Data tidak boleh kosong!");
                return;
            }

            /**
             * *
             * membuat koneksi ke database ini harus dibuat dimasing-masing
             * event koneksi = class java yang berisi konfigurasi koneksi ke
             * database configDB() merupakan fungsi dari kelas konseksi
             */
            java.sql.Connection conn = (Connection) Koneksi.configDB();

            //membuat statement untuk merepresentasikan perintah sql setelah terjadi koneksi ke database
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);

            //untuk mengeksekusi statement
            pstm.execute();

            //pesan jika proses penyimpanan berhasil, this untuk memunculkan kotak dialog berada di atas form
            JOptionPane.showMessageDialog(this, "Absensi Berhasil......");       

            //mengosongkan form untuk memulai input baru
            KosongkanForm();

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());

        }
    }//GEN-LAST:event_tombolsimpanActionPerformed

    private void lemburkaryawanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lemburkaryawanKeyTyped
         //untuk mengatur agar inputan du No Telpon hanya dapat berupa angka saja
        char enter = evt.getKeyChar();
        if (!(Character.isDigit(enter)))
            evt.consume();
    }//GEN-LAST:event_lemburkaryawanKeyTyped

    private void namakaryawanMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_namakaryawanMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_namakaryawanMouseReleased

    private void nipkaryawanMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nipkaryawanMouseReleased
        ceknip();
         try {
            Connection con = Koneksi.configDB(); //buat koneksi
            Statement s = con.createStatement(); //buat statement untuk menampung query sql

            String sql = "SELECT * FROM karyawan where nip= '" + nipkaryawan.getText() + "'"; //query sql untuk mendapatkan id dan password
            ResultSet r = s.executeQuery(sql); //hasil dari query swl diatas

            if (r.next()) {
                namakaryawan.setText(r.getString("nama"));
            } else {
                JOptionPane.showMessageDialog(this, "NIP tidak terdaftar");
                
            }
        } catch (SQLException e) {
            System.out.println("Error" + e.getMessage());
        }
    }//GEN-LAST:event_nipkaryawanMouseReleased

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
            java.util.logging.Logger.getLogger(KaryawanAbsensi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KaryawanAbsensi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KaryawanAbsensi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KaryawanAbsensi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KaryawanAbsensi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lemburkaryawan;
    private javax.swing.JTextField namakaryawan;
    private javax.swing.JTextField nipkaryawan;
    private javax.swing.JButton tombolabsensi;
    private javax.swing.JButton tombolcetakgaji;
    private javax.swing.JButton tombollogout;
    private javax.swing.JButton tombolsimpan;
    // End of variables declaration//GEN-END:variables
}