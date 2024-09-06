package Kode;

import Koneksi.Koneksi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
        
public class MenuPergantianPassword extends javax.swing.JPanel {

    private final Connection conn;
    private FormLogin formlogin;
    
    public MenuPergantianPassword() {
        JTextField jtxt_id = new JTextField();
        initComponents();
        
        conn = Koneksi.getConnection();
        formlogin = new FormLogin();
        actionButton();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser1 = new com.raven.datechooser.DateChooser();
        rbg_jenisKelamin = new javax.swing.ButtonGroup();
        jpn_main = new javax.swing.JPanel();
        jpn_add = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_simpan = new rojerusan.RSMaterialButtonRectangle();
        btn_btl = new rojerusan.RSMaterialButtonRectangle();
        jLabel16 = new javax.swing.JLabel();
        jtxt_username = new property.JtextfieldroundedCustom();
        jLabel11 = new javax.swing.JLabel();
        jlb_password = new javax.swing.JLabel();
        jtxt_passwordlama = new property.JpasswordroundedCustom();
        jlb_password1 = new javax.swing.JLabel();
        jtxt_passwordbaru = new property.JpasswordroundedCustom();
        jtxt_passwordkonfirmbaru = new property.JpasswordroundedCustom();
        jlb_password2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1325, 887));
        setLayout(new java.awt.CardLayout());

        jpn_main.setBackground(new java.awt.Color(255, 255, 255));
        jpn_main.setPreferredSize(new java.awt.Dimension(1325, 887));
        jpn_main.setLayout(new java.awt.CardLayout());

        jpn_add.setBackground(new java.awt.Color(255, 255, 255));
        jpn_add.setPreferredSize(new java.awt.Dimension(1325, 887));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 51));
        jLabel7.setText("Pergantian Password");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-dashboard-30.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-staff-30.png"))); // NOI18N

        btn_simpan.setBackground(new java.awt.Color(51, 0, 204));
        btn_simpan.setText("SIMPAN");

        btn_btl.setBackground(new java.awt.Color(204, 204, 0));
        btn_btl.setText("BATAL");

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 0, 51));
        jLabel16.setText("PROFILE > PERGANTIAN PASSWORD");

        jtxt_username.setLineColor(new java.awt.Color(153, 0, 51));
        jtxt_username.setPlaceholder("Masukkan Username");
        jtxt_username.setSelectionColor(new java.awt.Color(153, 0, 51));
        jtxt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_usernameActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 0, 51));
        jLabel11.setText("USERNAME");

        jlb_password.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jlb_password.setForeground(new java.awt.Color(153, 0, 51));
        jlb_password.setText("PASSWORD LAMA");

        jtxt_passwordlama.setLineColor(new java.awt.Color(153, 0, 51));
        jtxt_passwordlama.setPlaceholder("Masukkan Password");
        jtxt_passwordlama.setSelectionColor(new java.awt.Color(153, 0, 51));
        jtxt_passwordlama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_passwordlamaActionPerformed(evt);
            }
        });

        jlb_password1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jlb_password1.setForeground(new java.awt.Color(153, 0, 51));
        jlb_password1.setText("PASSWORD BARU");

        jtxt_passwordbaru.setLineColor(new java.awt.Color(153, 0, 51));
        jtxt_passwordbaru.setPlaceholder("Masukkan Password");
        jtxt_passwordbaru.setSelectionColor(new java.awt.Color(153, 0, 51));
        jtxt_passwordbaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_passwordbaruActionPerformed(evt);
            }
        });

        jtxt_passwordkonfirmbaru.setLineColor(new java.awt.Color(153, 0, 51));
        jtxt_passwordkonfirmbaru.setPlaceholder("Masukkan Password");
        jtxt_passwordkonfirmbaru.setSelectionColor(new java.awt.Color(153, 0, 51));
        jtxt_passwordkonfirmbaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_passwordkonfirmbaruActionPerformed(evt);
            }
        });

        jlb_password2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jlb_password2.setForeground(new java.awt.Color(153, 0, 51));
        jlb_password2.setText("KONFIRMASI PASSWORD BARU");

        javax.swing.GroupLayout jpn_addLayout = new javax.swing.GroupLayout(jpn_add);
        jpn_add.setLayout(jpn_addLayout);
        jpn_addLayout.setHorizontalGroup(
            jpn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_addLayout.createSequentialGroup()
                .addContainerGap(310, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(348, 348, 348))
            .addGroup(jpn_addLayout.createSequentialGroup()
                .addGroup(jpn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpn_addLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jtxt_passwordkonfirmbaru, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpn_addLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jpn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpn_addLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jlb_password2))
                            .addGroup(jpn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtxt_username, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                                .addComponent(jtxt_passwordlama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jpn_addLayout.createSequentialGroup()
                                    .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_btl, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jpn_addLayout.createSequentialGroup()
                                    .addGap(46, 46, 46)
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel7))
                                .addComponent(jtxt_passwordbaru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jpn_addLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jlb_password1)))
                            .addGroup(jpn_addLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jpn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlb_password)
                                    .addComponent(jLabel11))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpn_addLayout.setVerticalGroup(
            jpn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_addLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jpn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jpn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jpn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_btl, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlb_password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxt_passwordlama, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlb_password1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxt_passwordbaru, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlb_password2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxt_passwordkonfirmbaru, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(328, 328, 328))
        );

        jpn_main.add(jpn_add, "card2");

        add(jpn_main, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void jtxt_passwordlamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_passwordlamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_passwordlamaActionPerformed

    private void jtxt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_usernameActionPerformed

    }//GEN-LAST:event_jtxt_usernameActionPerformed

    private void jtxt_passwordbaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_passwordbaruActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_passwordbaruActionPerformed

    private void jtxt_passwordkonfirmbaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_passwordkonfirmbaruActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_passwordkonfirmbaruActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btn_btl;
    private rojerusan.RSMaterialButtonRectangle btn_simpan;
    private com.raven.datechooser.DateChooser dateChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jlb_password;
    private javax.swing.JLabel jlb_password1;
    private javax.swing.JLabel jlb_password2;
    private javax.swing.JPanel jpn_add;
    private javax.swing.JPanel jpn_main;
    private property.JpasswordroundedCustom jtxt_passwordbaru;
    private property.JpasswordroundedCustom jtxt_passwordkonfirmbaru;
    private property.JpasswordroundedCustom jtxt_passwordlama;
    private property.JtextfieldroundedCustom jtxt_username;
    private javax.swing.ButtonGroup rbg_jenisKelamin;
    // End of variables declaration//GEN-END:variables

    private void actionButton() {
        btn_simpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              pergantianPassword();
            }
        });
        
        btn_btl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              resetForm();
            }
        });
    }
    
    private void resetForm(){
        jtxt_username.setText("Username");
        jtxt_passwordlama.setText("Password");
        jtxt_passwordbaru.setText("Password");
        jtxt_passwordkonfirmbaru.setText("Password");
    }
    
    public boolean validateOldPassword(String username, String password){
        String encryptedOldPassword = formlogin.getMd5java(password);

        try{
            String sql = "SELECT * FROM user WHERE Username = ? AND Password = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, encryptedOldPassword);
            ResultSet rs = pstmt.executeQuery();
            return rs.next();
        } catch(SQLException ex){
            ex.printStackTrace();
            return false;
        }
    }

    public boolean changePassword(String username, String oldPassword, String newPassword){
        String encryptedOldPassword = formlogin.getMd5java(oldPassword);
        String encryptedNewPassword = formlogin.getMd5java(newPassword);

        try{
            String sql = "SELECT * FROM user WHERE Username = ? AND Password = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, encryptedOldPassword);
            ResultSet rs = pstmt.executeQuery();

            if(rs.next()){
                sql = "UPDATE user SET Password = ? WHERE Username = ?";
                PreparedStatement pstmtUpdate = conn.prepareStatement(sql);
                pstmtUpdate.setString(1, encryptedNewPassword);
                pstmtUpdate.setString(2, username);
                int result = pstmtUpdate.executeUpdate();
                return result > 0;
            } else {
                return false;
            }

        } catch(SQLException ex){
            ex.printStackTrace();
            return false;
        }
    }
    
    private void pergantianPassword(){
        String username = jtxt_username.getText();
        String passwordLama= jtxt_passwordlama.getText();
        String passwordBaru = jtxt_passwordbaru.getText();
        String konfirmPasswordBaru = jtxt_passwordkonfirmbaru.getText();

        if(!passwordBaru.equals(konfirmPasswordBaru)){
            JOptionPane.showMessageDialog(null, "Konfirmasi Password Baru Tidak Sesuai");
            return;
        }

        if(!this.validateOldPassword(username, passwordLama)){
            JOptionPane.showMessageDialog(null, "Username dan Password Tidak Sesuai");
            return;
        }

        if(this.changePassword(username, passwordLama, konfirmPasswordBaru)){
            JOptionPane.showMessageDialog(null, "Password Berhasil diperbarui");
        } else {
            JOptionPane.showMessageDialog(null, "Password Gagal diubah");
        }

        resetForm();
    }

 }