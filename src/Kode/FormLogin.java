package Kode;

import Koneksi.Koneksi;
import Main.MenuUtama;
import Main.MenuUtama;
import com.formdev.flatlaf.FlatLightLaf;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import static java.util.Objects.hash;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class FormLogin extends javax.swing.JFrame {

    int xx, yy;
    private Connection conn;
  
   
    public FormLogin() {
        initComponents();
        conn = Koneksi.getConnection();
        setBackground(new Color(0, 0, 0, 0));
        setActionButton();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCustom1 = new property.PanelCustom();
        panelCustom2 = new property.PanelCustom();
        lb_gambar = new javax.swing.JLabel();
        lb_unsika = new javax.swing.JLabel();
        lb_perpus = new javax.swing.JLabel();
        lb_exit = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jt_username = new property.JtextfieldCustom();
        lb_selamatdatang = new javax.swing.JLabel();
        lb_password = new javax.swing.JLabel();
        lb_eye = new javax.swing.JLabel();
        lb_hideeye = new javax.swing.JLabel();
        jt_password = new property.JpasswordfieldCustom();
        lb_username = new javax.swing.JLabel();
        btn_login = new rojerusan.RSMaterialButtonRectangle();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCustom1.setBackground(new java.awt.Color(255, 255, 255));
        panelCustom1.setRoundBottomLeft(40);
        panelCustom1.setRoundBottomRight(40);
        panelCustom1.setRoundTopLeft(40);
        panelCustom1.setRoundTopRight(40);
        panelCustom1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCustom2.setBackground(new java.awt.Color(204, 0, 0));
        panelCustom2.setRoundBottomRight(40);
        panelCustom2.setRoundTopRight(40);

        lb_gambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/—Pngtree—round creative library bookshelf_5304269 (1).png"))); // NOI18N

        lb_unsika.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        lb_unsika.setForeground(new java.awt.Color(255, 255, 255));
        lb_unsika.setText("Universitas Singaperbangsa Karawang");

        lb_perpus.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        lb_perpus.setForeground(new java.awt.Color(255, 255, 255));
        lb_perpus.setText("Perpustakaan");

        lb_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-logout-rounded-30.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/unsikalogo.png"))); // NOI18N

        javax.swing.GroupLayout panelCustom2Layout = new javax.swing.GroupLayout(panelCustom2);
        panelCustom2.setLayout(panelCustom2Layout);
        panelCustom2Layout.setHorizontalGroup(
            panelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom2Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(lb_gambar, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom2Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(panelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom2Layout.createSequentialGroup()
                        .addComponent(lb_perpus)
                        .addGap(232, 232, 232))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom2Layout.createSequentialGroup()
                        .addGroup(panelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lb_unsika)
                            .addGroup(panelCustom2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(245, 245, 245)
                                .addComponent(lb_exit)))
                        .addGap(22, 22, 22))))
        );
        panelCustom2Layout.setVerticalGroup(
            panelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(lb_perpus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_unsika, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_gambar, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        panelCustom1.add(panelCustom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, -1, 550));

        jt_username.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jt_username.setLabelText("USERNAME");
        jt_username.setLineColor(new java.awt.Color(204, 0, 51));
        jt_username.setSelectionColor(new java.awt.Color(204, 0, 51));
        panelCustom1.add(jt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 161, 330, -1));

        lb_selamatdatang.setBackground(new java.awt.Color(255, 255, 255));
        lb_selamatdatang.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lb_selamatdatang.setForeground(new java.awt.Color(204, 0, 51));
        lb_selamatdatang.setText("Selamat Datang");
        panelCustom1.add(lb_selamatdatang, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 162, -1));

        lb_password.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        lb_password.setForeground(new java.awt.Color(204, 0, 51));
        panelCustom1.add(lb_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 226, 101, -1));

        lb_eye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-eye-20.png"))); // NOI18N
        panelCustom1.add(lb_eye, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 30, 30));

        lb_hideeye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-hide-20.png"))); // NOI18N
        panelCustom1.add(lb_hideeye, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, -1, 30));

        jt_password.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jt_password.setLabelText("PASSWORD");
        jt_password.setLineColor(new java.awt.Color(204, 0, 51));
        jt_password.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        jt_password.setSelectionColor(new java.awt.Color(204, 0, 51));
        panelCustom1.add(jt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 320, -1));

        lb_username.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        lb_username.setForeground(new java.awt.Color(204, 0, 51));
        panelCustom1.add(lb_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 136, 101, -1));

        btn_login.setBackground(new java.awt.Color(204, 0, 51));
        btn_login.setText("Login");
        btn_login.setFont(new java.awt.Font("Roboto Medium", 1, 10)); // NOI18N
        panelCustom1.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 326, 150, 43));

        getContentPane().add(panelCustom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - yy);
    }//GEN-LAST:event_formMouseDragged

    
    public static void main(String args[]) {
        FlatLightLaf.setup();
        UIManager.put("component.arc", 15);

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btn_login;
    private javax.swing.JLabel jLabel2;
    private property.JpasswordfieldCustom jt_password;
    private property.JtextfieldCustom jt_username;
    private javax.swing.JLabel lb_exit;
    private javax.swing.JLabel lb_eye;
    private javax.swing.JLabel lb_gambar;
    private javax.swing.JLabel lb_hideeye;
    private javax.swing.JLabel lb_password;
    private javax.swing.JLabel lb_perpus;
    private javax.swing.JLabel lb_selamatdatang;
    private javax.swing.JLabel lb_unsika;
    private javax.swing.JLabel lb_username;
    private property.PanelCustom panelCustom1;
    private property.PanelCustom panelCustom2;
    // End of variables declaration//GEN-END:variables

    private void setActionButton() {
        lb_eye.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lb_eye.setVisible(false);
                lb_hideeye.setVisible(true);
                jt_password.setEchoChar((char)0);
            }
        });
        
        lb_hideeye.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    lb_eye.setVisible(true);
                    lb_hideeye.setVisible(false);
                    jt_password.setEchoChar('*');
                }
        });
        
        btn_login.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                prosesLogin();
            }
        });
        
        lb_exit.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                dispose();
                System.exit(0);
            }
        });
        
        jt_password.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e){
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    btn_login.doClick();
                }
            }
        });
        
    }
    
    public String getMd5java(String message){
        String digest = null;
                
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hash = md.digest(message.getBytes("UTF-8"));

            StringBuilder sb = new StringBuilder(2 * hash.length);
            for (byte b : hash) {
                sb.append(String.format("%02x", b & 0xff));
            }
            digest = sb.toString();

        } catch (Exception e) {
            Logger.getLogger(FormLogin.class.getName()).log(Level.SEVERE, null, e);
        }

        return digest;
    }
    
    private boolean validasiInput(){
        boolean valid = false;
        if(jt_username.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Username Tidak Boleh Kosong");
        }
        
        else if(new String(jt_password.getPassword()).trim().isEmpty()){ 
            JOptionPane.showMessageDialog(this, "Password Tidak Boleh Kosong");
        }
        
        else{
            valid = true;
        }
        return valid;
    }
    
    private Map<String, String> checkLogin(String Username, String Password) {
        Map<String, String> result = new HashMap<>();
        try {
            if (conn != null) {
                String sql = "SELECT ID_User, Nama_User, Role FROM user WHERE Username = ? AND Password = ?";
                try (PreparedStatement st = conn.prepareStatement(sql)) {
                    st.setString(1, Username);
                    st.setString(2, Password);

                    try (ResultSet rs = st.executeQuery()) {
                        if (rs.next()) {
                            result.put("ID_User", rs.getString("ID_User"));
                            result.put("Nama_User", rs.getString("Nama_User"));
                            result.put("Role", rs.getString("Role")); 
                            return result;
                        }
                    }
                }
            } else {
                System.out.println("Koneksi ke database tidak tersedia.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    private void prosesLogin(){

        if (validasiInput()) {
            String username = jt_username.getText();
            char[] passwordChars = jt_password.getPassword();
            String password = new String(passwordChars);
            String hashedPassword = getMd5java(password);

            Map<String, String> loginResult = checkLogin(username, hashedPassword);

            if (loginResult != null) {
                String userID = loginResult.get("ID_User");
                String namaUser = loginResult.get("Nama_User");
                String roleUser = loginResult.get("Role");
                
                MenuUtama mn = new MenuUtama (userID, namaUser,roleUser);
                mn.setVisible(true);
                mn.revalidate();
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Username atau Password Salah", 
                        "Pesan", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    
    }
}