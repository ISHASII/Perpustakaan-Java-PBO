package Kode;

import Koneksi.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class MenuDashboard extends javax.swing.JPanel {
    
    private Connection conn;

    public MenuDashboard() {
        initComponents();
        conn = Koneksi.getConnection();
        loadData();
        setTableModelPeminjaman();
        getDataPeminjaman((DefaultTableModel)tabledata.getModel());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpn_cardanggota = new property.PanelCustom();
        lb_anggota = new javax.swing.JLabel();
        lb_iconaggt = new javax.swing.JLabel();
        lb_jumlahanggota = new javax.swing.JLabel();
        jpn_cardanggota1 = new property.PanelCustom();
        lb_anggota1 = new javax.swing.JLabel();
        lb_iconaggt1 = new javax.swing.JLabel();
        lb_jumlahbuku = new javax.swing.JLabel();
        jpn_cardanggota2 = new property.PanelCustom();
        lb_anggota2 = new javax.swing.JLabel();
        lb_iconaggt2 = new javax.swing.JLabel();
        lb_jumlahpengembalian = new javax.swing.JLabel();
        jpn_cardanggota3 = new property.PanelCustom();
        lb_anggota3 = new javax.swing.JLabel();
        lb_iconaggt3 = new javax.swing.JLabel();
        lb_jumlahpeminjaman = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabledata = new property.JtableCustom();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1325, 887));
        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1325, 887));

        jpn_cardanggota.setBackground(new java.awt.Color(153, 0, 0));
        jpn_cardanggota.setRoundBottomLeft(30);
        jpn_cardanggota.setRoundBottomRight(30);
        jpn_cardanggota.setRoundTopLeft(30);
        jpn_cardanggota.setRoundTopRight(30);

        lb_anggota.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lb_anggota.setForeground(new java.awt.Color(255, 255, 255));
        lb_anggota.setText("ANGGOTA");

        lb_iconaggt.setFont(new java.awt.Font("Segoe UI Semibold", 1, 48)); // NOI18N
        lb_iconaggt.setForeground(new java.awt.Color(255, 255, 255));
        lb_iconaggt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-friends-60.png"))); // NOI18N

        lb_jumlahanggota.setFont(new java.awt.Font("Segoe UI Semibold", 1, 48)); // NOI18N
        lb_jumlahanggota.setForeground(new java.awt.Color(255, 255, 255));
        lb_jumlahanggota.setText("999");

        javax.swing.GroupLayout jpn_cardanggotaLayout = new javax.swing.GroupLayout(jpn_cardanggota);
        jpn_cardanggota.setLayout(jpn_cardanggotaLayout);
        jpn_cardanggotaLayout.setHorizontalGroup(
            jpn_cardanggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_cardanggotaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lb_anggota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(lb_iconaggt)
                .addGap(22, 22, 22))
            .addGroup(jpn_cardanggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpn_cardanggotaLayout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(lb_jumlahanggota)
                    .addContainerGap(100, Short.MAX_VALUE)))
        );
        jpn_cardanggotaLayout.setVerticalGroup(
            jpn_cardanggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_cardanggotaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpn_cardanggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_iconaggt)
                    .addComponent(lb_anggota))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(jpn_cardanggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_cardanggotaLayout.createSequentialGroup()
                    .addContainerGap(39, Short.MAX_VALUE)
                    .addComponent(lb_jumlahanggota)
                    .addContainerGap()))
        );

        jpn_cardanggota1.setBackground(new java.awt.Color(153, 0, 0));
        jpn_cardanggota1.setPreferredSize(new java.awt.Dimension(216, 109));
        jpn_cardanggota1.setRoundBottomLeft(30);
        jpn_cardanggota1.setRoundBottomRight(30);
        jpn_cardanggota1.setRoundTopLeft(30);
        jpn_cardanggota1.setRoundTopRight(30);

        lb_anggota1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lb_anggota1.setForeground(new java.awt.Color(255, 255, 255));
        lb_anggota1.setText("BUKU");

        lb_iconaggt1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 48)); // NOI18N
        lb_iconaggt1.setForeground(new java.awt.Color(255, 255, 255));
        lb_iconaggt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-book-60.png"))); // NOI18N

        lb_jumlahbuku.setFont(new java.awt.Font("Segoe UI Semibold", 1, 48)); // NOI18N
        lb_jumlahbuku.setForeground(new java.awt.Color(255, 255, 255));
        lb_jumlahbuku.setText("999");

        javax.swing.GroupLayout jpn_cardanggota1Layout = new javax.swing.GroupLayout(jpn_cardanggota1);
        jpn_cardanggota1.setLayout(jpn_cardanggota1Layout);
        jpn_cardanggota1Layout.setHorizontalGroup(
            jpn_cardanggota1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_cardanggota1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lb_anggota1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(lb_iconaggt1)
                .addGap(22, 22, 22))
            .addGroup(jpn_cardanggota1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpn_cardanggota1Layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(lb_jumlahbuku)
                    .addContainerGap(100, Short.MAX_VALUE)))
        );
        jpn_cardanggota1Layout.setVerticalGroup(
            jpn_cardanggota1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_cardanggota1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpn_cardanggota1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_iconaggt1)
                    .addComponent(lb_anggota1))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(jpn_cardanggota1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_cardanggota1Layout.createSequentialGroup()
                    .addContainerGap(39, Short.MAX_VALUE)
                    .addComponent(lb_jumlahbuku)
                    .addContainerGap()))
        );

        jpn_cardanggota2.setBackground(new java.awt.Color(153, 0, 0));
        jpn_cardanggota2.setPreferredSize(new java.awt.Dimension(216, 109));
        jpn_cardanggota2.setRoundBottomLeft(30);
        jpn_cardanggota2.setRoundBottomRight(30);
        jpn_cardanggota2.setRoundTopLeft(30);
        jpn_cardanggota2.setRoundTopRight(30);

        lb_anggota2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lb_anggota2.setForeground(new java.awt.Color(255, 255, 255));
        lb_anggota2.setText("PENGEMBALIAN");

        lb_iconaggt2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 48)); // NOI18N
        lb_iconaggt2.setForeground(new java.awt.Color(255, 255, 255));
        lb_iconaggt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-return-book-60.png"))); // NOI18N

        lb_jumlahpengembalian.setFont(new java.awt.Font("Segoe UI Semibold", 1, 48)); // NOI18N
        lb_jumlahpengembalian.setForeground(new java.awt.Color(255, 255, 255));
        lb_jumlahpengembalian.setText("999");

        javax.swing.GroupLayout jpn_cardanggota2Layout = new javax.swing.GroupLayout(jpn_cardanggota2);
        jpn_cardanggota2.setLayout(jpn_cardanggota2Layout);
        jpn_cardanggota2Layout.setHorizontalGroup(
            jpn_cardanggota2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_cardanggota2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lb_anggota2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(lb_iconaggt2)
                .addGap(22, 22, 22))
            .addGroup(jpn_cardanggota2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpn_cardanggota2Layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(lb_jumlahpengembalian)
                    .addContainerGap(100, Short.MAX_VALUE)))
        );
        jpn_cardanggota2Layout.setVerticalGroup(
            jpn_cardanggota2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_cardanggota2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpn_cardanggota2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_iconaggt2)
                    .addComponent(lb_anggota2))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(jpn_cardanggota2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_cardanggota2Layout.createSequentialGroup()
                    .addContainerGap(39, Short.MAX_VALUE)
                    .addComponent(lb_jumlahpengembalian)
                    .addContainerGap()))
        );

        jpn_cardanggota3.setBackground(new java.awt.Color(153, 0, 0));
        jpn_cardanggota3.setPreferredSize(new java.awt.Dimension(216, 109));
        jpn_cardanggota3.setRoundBottomLeft(30);
        jpn_cardanggota3.setRoundBottomRight(30);
        jpn_cardanggota3.setRoundTopLeft(30);
        jpn_cardanggota3.setRoundTopRight(30);

        lb_anggota3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lb_anggota3.setForeground(new java.awt.Color(255, 255, 255));
        lb_anggota3.setText("PEMINJAMAN");

        lb_iconaggt3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 48)); // NOI18N
        lb_iconaggt3.setForeground(new java.awt.Color(255, 255, 255));
        lb_iconaggt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-borrow-book-60.png"))); // NOI18N

        lb_jumlahpeminjaman.setFont(new java.awt.Font("Segoe UI Semibold", 1, 48)); // NOI18N
        lb_jumlahpeminjaman.setForeground(new java.awt.Color(255, 255, 255));
        lb_jumlahpeminjaman.setText("999");

        javax.swing.GroupLayout jpn_cardanggota3Layout = new javax.swing.GroupLayout(jpn_cardanggota3);
        jpn_cardanggota3.setLayout(jpn_cardanggota3Layout);
        jpn_cardanggota3Layout.setHorizontalGroup(
            jpn_cardanggota3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_cardanggota3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lb_anggota3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(lb_iconaggt3)
                .addGap(22, 22, 22))
            .addGroup(jpn_cardanggota3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpn_cardanggota3Layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(lb_jumlahpeminjaman)
                    .addContainerGap(163, Short.MAX_VALUE)))
        );
        jpn_cardanggota3Layout.setVerticalGroup(
            jpn_cardanggota3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_cardanggota3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpn_cardanggota3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_iconaggt3)
                    .addComponent(lb_anggota3))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(jpn_cardanggota3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_cardanggota3Layout.createSequentialGroup()
                    .addContainerGap(75, Short.MAX_VALUE)
                    .addComponent(lb_jumlahpeminjaman)
                    .addContainerGap()))
        );

        tabledata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabledata);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("MASTER DATA > DASHBOARD");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 51));
        jLabel2.setText("Riwayat Peminjaman Buku");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-dashboard-30.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jpn_cardanggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(jpn_cardanggota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jpn_cardanggota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(15, 15, 15)
                            .addComponent(jpn_cardanggota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(22, 22, 22))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpn_cardanggota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpn_cardanggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpn_cardanggota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpn_cardanggota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private property.PanelCustom jpn_cardanggota;
    private property.PanelCustom jpn_cardanggota1;
    private property.PanelCustom jpn_cardanggota2;
    private property.PanelCustom jpn_cardanggota3;
    private javax.swing.JLabel lb_anggota;
    private javax.swing.JLabel lb_anggota1;
    private javax.swing.JLabel lb_anggota2;
    private javax.swing.JLabel lb_anggota3;
    private javax.swing.JLabel lb_iconaggt;
    private javax.swing.JLabel lb_iconaggt1;
    private javax.swing.JLabel lb_iconaggt2;
    private javax.swing.JLabel lb_iconaggt3;
    private javax.swing.JLabel lb_jumlahanggota;
    private javax.swing.JLabel lb_jumlahbuku;
    private javax.swing.JLabel lb_jumlahpeminjaman;
    private javax.swing.JLabel lb_jumlahpengembalian;
    private property.JtableCustom tabledata;
    // End of variables declaration//GEN-END:variables

    private int jumlahAnggota(){
        int totalAnggota = 0;
        try{
            String sql = "SELECT COUNT(*) AS total FROM anggota";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            if(rs.next()){
                totalAnggota = rs.getInt ("total");
            }
        }
        
        catch(Exception e){
            e.printStackTrace();
        }
        return totalAnggota;
    }
    
    private int jumlahBuku(){
        int totalBuku = 0;
        try{
            String sql = "SELECT COUNT(*) AS total FROM buku";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            if(rs.next()){
                totalBuku = rs.getInt ("total");
            }
        }
        
        catch(Exception e){
            e.printStackTrace();
        }
        return totalBuku;
    }
    
    private int jumlahPeminjaman(){
        int totalPeminjaman = 0;
        try{
            String sql = "SELECT COUNT(*) AS total FROM detail_peminjaman";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            if(rs.next()){
                totalPeminjaman = rs.getInt ("total");
            }
        }
        
        catch(Exception e){
            e.printStackTrace();
        }
        return totalPeminjaman;
    }
    
    private int jumlahPengembalian(){
        int totalPengembalian = 0;
        try{
            String sql = "SELECT COUNT(*) AS total FROM detail_peminjaman WHERE Statsu_Peminjaman = 'Sudah dikembalikan'";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            if(rs.next()){
                totalPengembalian = rs.getInt ("total");
            }
        }
        
        catch(Exception e){
            e.printStackTrace();
        }
        return totalPengembalian;
    }
    
    private void  setTableModelPeminjaman(){
        DefaultTableModel model = (DefaultTableModel) tabledata.getModel();
        model.addColumn("ID PEMINJAMAN");
        model.addColumn("TANGGAL PINJAM");
        model.addColumn("TANGGAL KEMBALI");
        model.addColumn("NAMA ANGGOTA");
        model.addColumn("ID BUKU");
        model.addColumn("JUDUL");
        model.addColumn("JUMLAH PINJAM");
        model.addColumn("STATUS PEMINJAMAN");
    }
    
    private void getDataPeminjaman(DefaultTableModel model){
        model.setRowCount(0);
        
        try{
            String sql = "SELECT pmd.ID_Peminjaman, pmj.Tanggal_Peminjaman, pmj.Tanggal_Pengembalian, agt.Nama_Anggota, bk.ID_Buku, bk.Judul_Buku, pmd.Jumlah_Pinjam, pmd.Status_Peminjaman\n" +
                        "FROM detail_peminjaman pmd\n" +
                        "INNER JOIN peminjaman pmj ON pmj.ID_Peminjaman = pmd.ID_Peminjaman\n" +
                        "INNER JOIN buku bk ON bk.ID_Buku = pmd.ID_Buku\n" +
                        "INNER JOIN anggota agt ON agt.ID_Anggota = pmj.ID_Anggota "  + 
                        "ORDER BY pmd.ID_Peminjaman DESC";
            
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                String idPeminjaman = rs.getString("ID_Peminjaman");
                String tanggalPeminjaman = rs.getString("Tanggal_Peminjaman");
                String tanggalPengambalian = rs.getString("Tanggal_Pengembalian");
                String namaAnggota = rs.getString("Nama_Anggota");
                String idBuku = rs.getString("ID_Buku");
                String judulBuku = rs.getString("Judul_BuKU");
                String jumlahPinjam = rs.getString("Jumlah_Pinjam");
                String statusPeminjaman = rs.getString("Status_Peminjaman");
                
                Object[] rowData = {idPeminjaman, tanggalPeminjaman, tanggalPengambalian, namaAnggota, idBuku, judulBuku, jumlahPinjam, statusPeminjaman};
                model.addRow(rowData);
            }
        }
        
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    private void loadData() {
        lb_jumlahanggota.setText(String.valueOf(jumlahAnggota()));
        lb_jumlahbuku.setText(String.valueOf(jumlahBuku()));
        lb_jumlahpeminjaman.setText(String.valueOf(jumlahPeminjaman()));
        lb_jumlahpengembalian.setText(String.valueOf(jumlahPeminjaman()));
    }
}
