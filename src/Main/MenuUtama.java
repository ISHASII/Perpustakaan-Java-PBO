package Main;

import Kode.MenuAnggota;
import Kode.MenuBuku;
import java.awt.Color;
import Kode.MenuDashboard;
import Kode.MenuKategori;
import Kode.MenuPeminjaman;
import Kode.MenuPenerbit;
import Kode.MenuPengembalian;
import Kode.MenuPetugas;
import Kode.MenuProfile;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JPanel;
import javax.swing.Timer;


public class MenuUtama extends javax.swing.JFrame {
    
    int xx, xy;
    
    private String userID;
    private String namaUser;
    private String roleUser;
    private Timer timer;
    
    public MenuUtama(String userID, String namaUser,String roleUser) {
        initComponents();
        this.userID = userID;
        this.roleUser = roleUser;
        lb_profil.setText(namaUser);
        addMenu();
        setDate();
        
    }
    
     public MenuUtama() {
        initComponents();
    }
    
    public String getUserID(){
        return userID;
    }
    
    public String getRoleUser() {
        return roleUser;
    }
    
    public JPanel getPanelUtama(){
        return jpn_utama;
    }
    
    private void addMenu(){
        if(roleUser.equals("Admin")){
            sideMenu.add(new MenuMaster(this));
            sideMenu.add(new MenuTransaksi(this));
            sideMenu.add(new MenuLaporan(this));
        }
        
        else{
            sideMenu.add(new MenuTransaksi(this));
        }
    }
    
    private void setDate() {
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Calendar calendar = Calendar.getInstance();
                Date now = calendar.getTime();
                SimpleDateFormat formatHari = new SimpleDateFormat("EEEE", new Locale("in", "ID"));
                SimpleDateFormat formatTanggal = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

                String hari = formatHari.format(now);
                String tanggal = formatTanggal.format(now);
                
                lb_date.setText(hari+", "+tanggal);
            }
        });
        
        timer.start();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpn_kiri = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sideMenu = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jpn_kanan = new javax.swing.JPanel();
        jpanelgradientCustom2 = new property.JpanelgradientCustom();
        lb_profil = new javax.swing.JLabel();
        lb_date = new javax.swing.JLabel();
        jbtn_profile = new javax.swing.JButton();
        jpn_dasar = new javax.swing.JPanel();
        jpn_utama = new javax.swing.JPanel();

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
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jpn_kiri.setBackground(new java.awt.Color(255, 255, 255));
        jpn_kiri.setPreferredSize(new java.awt.Dimension(300, 800));

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/unsikalogo.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Perpustakaan Unsika");

        jScrollPane1.setBorder(null);

        sideMenu.setBackground(new java.awt.Color(255, 255, 255));
        sideMenu.setLayout(new javax.swing.BoxLayout(sideMenu, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(sideMenu);

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("PERPUSIKA");

        javax.swing.GroupLayout jpn_kiriLayout = new javax.swing.GroupLayout(jpn_kiri);
        jpn_kiri.setLayout(jpn_kiriLayout);
        jpn_kiriLayout.setHorizontalGroup(
            jpn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_kiriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jpn_kiriLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(0, 26, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jpn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_kiriLayout.createSequentialGroup()
                    .addContainerGap(136, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(31, 31, 31)))
        );
        jpn_kiriLayout.setVerticalGroup(
            jpn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_kiriLayout.createSequentialGroup()
                .addGroup(jpn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpn_kiriLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel4))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(jpn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpn_kiriLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel3)
                    .addContainerGap(751, Short.MAX_VALUE)))
        );

        getContentPane().add(jpn_kiri, java.awt.BorderLayout.LINE_START);

        jpn_kanan.setBackground(new java.awt.Color(255, 255, 255));
        jpn_kanan.setLayout(new java.awt.BorderLayout());

        jpanelgradientCustom2.setColorEnd(new java.awt.Color(255, 102, 102));
        jpanelgradientCustom2.setColorStart(new java.awt.Color(153, 0, 0));
        jpanelgradientCustom2.setPreferredSize(new java.awt.Dimension(1366, 70));

        lb_profil.setFont(new java.awt.Font("Myriad Hebrew", 0, 14)); // NOI18N
        lb_profil.setForeground(new java.awt.Color(255, 255, 255));
        lb_profil.setText("Profile Name");

        lb_date.setFont(new java.awt.Font("Myriad Hebrew", 0, 14)); // NOI18N
        lb_date.setForeground(new java.awt.Color(255, 255, 255));
        lb_date.setText("Date");

        jbtn_profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-staff-30.png"))); // NOI18N
        jbtn_profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_profileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelgradientCustom2Layout = new javax.swing.GroupLayout(jpanelgradientCustom2);
        jpanelgradientCustom2.setLayout(jpanelgradientCustom2Layout);
        jpanelgradientCustom2Layout.setHorizontalGroup(
            jpanelgradientCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelgradientCustom2Layout.createSequentialGroup()
                .addContainerGap(371, Short.MAX_VALUE)
                .addComponent(lb_date)
                .addGap(18, 18, 18)
                .addComponent(lb_profil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtn_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(391, 391, 391))
        );
        jpanelgradientCustom2Layout.setVerticalGroup(
            jpanelgradientCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelgradientCustom2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jpanelgradientCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtn_profile)
                    .addGroup(jpanelgradientCustom2Layout.createSequentialGroup()
                        .addGroup(jpanelgradientCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_profil)
                            .addComponent(lb_date))
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );

        jpn_kanan.add(jpanelgradientCustom2, java.awt.BorderLayout.PAGE_START);

        jpn_dasar.setBackground(new java.awt.Color(250, 250, 250));

        jpn_utama.setBackground(new java.awt.Color(255, 255, 255));
        jpn_utama.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jpn_dasarLayout = new javax.swing.GroupLayout(jpn_dasar);
        jpn_dasar.setLayout(jpn_dasarLayout);
        jpn_dasarLayout.setHorizontalGroup(
            jpn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_dasarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, 935, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpn_dasarLayout.setVerticalGroup(
            jpn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_dasarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpn_utama, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jpn_kanan.add(jpn_dasar, java.awt.BorderLayout.CENTER);

        getContentPane().add(jpn_kanan, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void jbtn_profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_profileActionPerformed
        MenuProfile menu = new MenuProfile(this, true, this);
        Point p = jbtn_profile.getLocationOnScreen();
        int x = p.x + jbtn_profile.getWidth() - menu.getWidth();
        int y = p.y + jbtn_profile.getHeight(); 
        menu.setLocation(x,y);
        menu.setVisible(true);
    }//GEN-LAST:event_jbtn_profileActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jpn_utama.removeAll();
        jpn_utama.add(new MenuDashboard());
        jpn_utama.repaint();
        jpn_utama.revalidate();
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String userID = "ID";
                String namaUser = "Nama";
                String roleUser = "Role";
                
                new MenuUtama(userID, namaUser, roleUser).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtn_profile;
    private property.JpanelgradientCustom jpanelgradientCustom2;
    private javax.swing.JPanel jpn_dasar;
    private javax.swing.JPanel jpn_kanan;
    private javax.swing.JPanel jpn_kiri;
    private javax.swing.JPanel jpn_utama;
    private javax.swing.JLabel lb_date;
    private javax.swing.JLabel lb_profil;
    private javax.swing.JPanel sideMenu;
    // End of variables declaration//GEN-END:variables
}