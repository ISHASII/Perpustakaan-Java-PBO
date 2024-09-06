package Kode;

import Koneksi.Koneksi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
        
public class LaporanPeminjaman extends javax.swing.JPanel {
    
    private int halamanSaatIni = 1;
    private int dataPerHalaman = 10;
    private int totalPages;

    private final Connection conn;
    
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private Date tanggalMulai;
    private Date tanggalAkhir;
    
    private String setIDAnggota;
    
    public LaporanPeminjaman() {
        JTextField jtxt_id = new JTextField();
        initComponents();
        
        conn = Koneksi.getConnection();
        setTabelModel();
        paginationAnggota();
        actionButton();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser1 = new com.raven.datechooser.DateChooser();
        dateChooser2 = new com.raven.datechooser.DateChooser();
        jpn_main = new javax.swing.JPanel();
        jpn_view = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_firts = new javax.swing.JButton();
        btn_previous = new javax.swing.JButton();
        jcbx_data = new javax.swing.JComboBox<>();
        btn_next = new javax.swing.JButton();
        btn_last = new javax.swing.JButton();
        jlbl_halaman = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_tampilkan = new rojerusan.RSMaterialButtonRectangle();
        btn_batal = new rojerusan.RSMaterialButtonRectangle();
        txt_cari = new property.JtextfieldroundedCustom();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_data = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jtxt_tanggalmulai = new property.JtextfieldroundedCustom();
        jLabel17 = new javax.swing.JLabel();
        jtxt_tanggalakhir = new property.JtextfieldroundedCustom();
        btn_print = new rojerusan.RSMaterialButtonRectangle();

        dateChooser1.setTextRefernce(jtxt_tanggalmulai);

        dateChooser2.setTextRefernce(jtxt_tanggalakhir);

        setPreferredSize(new java.awt.Dimension(1325, 887));
        setLayout(new java.awt.CardLayout());

        jpn_main.setBackground(new java.awt.Color(255, 255, 255));
        jpn_main.setPreferredSize(new java.awt.Dimension(1325, 887));
        jpn_main.setLayout(new java.awt.CardLayout());

        jpn_view.setBackground(new java.awt.Color(255, 255, 255));
        jpn_view.setPreferredSize(new java.awt.Dimension(1325, 887));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("LAPORAN > PEMINJAMAN");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 51));
        jLabel2.setText("Data Laporan Peminjaman Buku");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-dashboard-30.png"))); // NOI18N

        btn_firts.setText("First Page");

        btn_previous.setText("<");
        btn_previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_previousActionPerformed(evt);
            }
        });

        jcbx_data.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "30", "40", "50", "60", "70", "80", "90", "100" }));

        btn_next.setText(">");

        btn_last.setText("Last Page");

        jlbl_halaman.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jlbl_halaman.setForeground(new java.awt.Color(153, 0, 51));
        jlbl_halaman.setText("Halaman   of Total   Halaman ");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-report-30.png"))); // NOI18N

        btn_tampilkan.setBackground(new java.awt.Color(51, 0, 204));
        btn_tampilkan.setText("TAMPILKAN");

        btn_batal.setBackground(new java.awt.Color(204, 204, 0));
        btn_batal.setText("BATAL");

        txt_cari.setLineColor(new java.awt.Color(153, 0, 51));
        txt_cari.setPlaceholder("Pencariaan");
        txt_cari.setSelectionColor(new java.awt.Color(153, 0, 51));

        tbl_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbl_data);

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 0, 51));
        jLabel15.setText("TANGGAL MULAI");

        jtxt_tanggalmulai.setLineColor(new java.awt.Color(153, 0, 51));
        jtxt_tanggalmulai.setPlaceholder("Masukkan Tanggal bergabung");
        jtxt_tanggalmulai.setSelectionColor(new java.awt.Color(153, 0, 51));
        jtxt_tanggalmulai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_tanggalmulaiActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 0, 51));
        jLabel17.setText("TANGGAL SAMPAI");

        jtxt_tanggalakhir.setLineColor(new java.awt.Color(153, 0, 51));
        jtxt_tanggalakhir.setPlaceholder("Masukkan Tanggal bergabung");
        jtxt_tanggalakhir.setSelectionColor(new java.awt.Color(153, 0, 51));
        jtxt_tanggalakhir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_tanggalakhirActionPerformed(evt);
            }
        });

        btn_print.setBackground(new java.awt.Color(51, 153, 0));
        btn_print.setText("CETAK");
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpn_viewLayout = new javax.swing.GroupLayout(jpn_view);
        jpn_view.setLayout(jpn_viewLayout);
        jpn_viewLayout.setHorizontalGroup(
            jpn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_viewLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 901, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpn_viewLayout.createSequentialGroup()
                        .addGroup(jpn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpn_viewLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel15))
                            .addComponent(jtxt_tanggalmulai, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpn_viewLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel17))
                            .addGroup(jpn_viewLayout.createSequentialGroup()
                                .addComponent(jtxt_tanggalakhir, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_tampilkan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jpn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpn_viewLayout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpn_viewLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_print, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jpn_viewLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(txt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(402, Short.MAX_VALUE))
            .addGroup(jpn_viewLayout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(btn_firts, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpn_viewLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jlbl_halaman))
                    .addGroup(jpn_viewLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_previous, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_last, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbx_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpn_viewLayout.setVerticalGroup(
            jpn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_viewLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jpn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addGroup(jpn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpn_viewLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(47, 47, 47))
                    .addGroup(jpn_viewLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxt_tanggalakhir, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_tampilkan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxt_tanggalmulai, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_print, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlbl_halaman)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_firts, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_previous, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_last, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbx_data))
                .addGap(313, 313, 313))
        );

        jpn_main.add(jpn_view, "card2");

        add(jpn_main, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_previousActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_previousActionPerformed

    private void jtxt_tanggalmulaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_tanggalmulaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_tanggalmulaiActionPerformed

    private void jtxt_tanggalakhirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_tanggalakhirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_tanggalakhirActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_printActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btn_batal;
    private javax.swing.JButton btn_firts;
    private javax.swing.JButton btn_last;
    private javax.swing.JButton btn_next;
    private javax.swing.JButton btn_previous;
    private rojerusan.RSMaterialButtonRectangle btn_print;
    private rojerusan.RSMaterialButtonRectangle btn_tampilkan;
    private com.raven.datechooser.DateChooser dateChooser1;
    private com.raven.datechooser.DateChooser dateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jcbx_data;
    private javax.swing.JLabel jlbl_halaman;
    private javax.swing.JPanel jpn_main;
    private javax.swing.JPanel jpn_view;
    private property.JtextfieldroundedCustom jtxt_tanggalakhir;
    private property.JtextfieldroundedCustom jtxt_tanggalmulai;
    private javax.swing.JTable tbl_data;
    private property.JtextfieldroundedCustom txt_cari;
    // End of variables declaration//GEN-END:variables

    private void loadData(){
        calculateTotalPages();
        int totalData = getTotalData();
        jlbl_halaman.setText(String.valueOf("Halaman" + halamanSaatIni + "dari Total Data" + totalData));
        
        int startIndex = (halamanSaatIni - 1) * dataPerHalaman;
        getData(startIndex, dataPerHalaman, (DefaultTableModel) tbl_data.getModel());
    }
    
    private void showPanel(){
        jpn_main.removeAll();
        jpn_main.add(new LaporanPeminjaman());
        jpn_main.repaint();
        jpn_main.revalidate();
    }
    
    private void setTabelModel(){
        DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
        model.addColumn("ID PEMINJAM");
        model.addColumn("ID ANGGOTA");
        model.addColumn("NAMA ANGGOTA");
        model.addColumn("ID BUKU");
        model.addColumn("PINJAM");
        model.addColumn("KEMBALI");
        model.addColumn("DIKEMBALIKAN");
        model.addColumn("STATUS");
        model.addColumn("DENDA");
    }
    
    private void actionButton(){
        btn_tampilkan.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                loadData();
            }
        });
        
        btn_batal.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                showPanel();
                loadData();
            }
        });
        
        btn_print.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                cetakLaporan();
            }
        });
        
        txt_cari.addKeyListener(new KeyAdapter(){
            @Override
            public void keyReleased(KeyEvent e) {
                searchData();
            }
        });
    }

    private void getData(int startIndex, int entriesPage, DefaultTableModel model) {
        model.setRowCount(0);
        
        String tanggalMulai = jtxt_tanggalmulai.getText();
        String tanggalAkhir = jtxt_tanggalakhir.getText();
        
        try{
            
            this.tanggalMulai = dateFormat.parse(tanggalMulai);
            this.tanggalAkhir = dateFormat.parse(tanggalAkhir);
            
            String sql = "SELECT "
                            + "pmj.ID_Peminjaman, "
                            + "agt.ID_Anggota, "
                            + "agt.Nama_Anggota, "
                            + "bk.ID_Buku, "
                            + "pmj.Tanggal_Peminjaman, "
                            + "pmj.Tanggal_Pengembalian, "
                            + "png.Tanggal_Dikembalikan, "
                            + "dpm.Status_Peminjaman, "
                            + "dpn.Jumlah_Denda "
                    
                        + "FROM pengembalian png "
                    
                        + "INNER JOIN detail_pengembalian dpn ON dpn.ID_Pengembalian = png.ID_Pengembalian "
                        + "INNER JOIN peminjaman pmj ON pmj.ID_Peminjaman = png.ID_Peminjaman "
                        + "INNER JOIN detail_peminjaman dpm ON dpm.ID_Peminjaman = pmj.ID_Peminjaman "
                        + "INNER JOIN anggota agt ON agt.ID_Anggota = pmj.ID_Anggota "
                        + "INNER JOIN buku bk ON bk.ID_Buku = dpn.ID_Buku "
                    
                        + "WHERE pmj.Tanggal_Peminjaman BETWEEN ? AND ? "
                        + "AND dpm.Status_Peminjaman = 'Sudah Dikembalikan' "
                    
                        + "GROUP BY "
                            + "bk.ID_Buku, "
                            + "pmj.ID_Peminjaman, "
                            + "png.ID_Pengembalian, "
                            + "pmj.Tanggal_Peminjaman, "
                            + "png.Tanggal_Dikembalikan "
                    
                        + "ORDER BY png.ID_Pengembalian ASC LIMIT ?, ?";

            
            try(PreparedStatement st = conn.prepareStatement(sql)){
               st.setDate(1, new java.sql.Date(this.tanggalMulai.getTime()));
               st.setDate(2, new java.sql.Date(this.tanggalAkhir.getTime()));
               st.setInt(3, startIndex);
               st.setInt(4, entriesPage);
               ResultSet rs = st.executeQuery(); 
               
               while(rs.next()){
                   String idPeminjaman = rs.getString("ID_Peminjaman");
                   String idAnggota = rs.getString("ID_Anggota");
                   String namaAnggota = rs.getString("Nama_Anggota");
                   String idBuku = rs.getString("ID_Buku");
                   String tanggalPinjam = rs.getString("Tanggal_Peminjaman");
                   String tanggalKembali = rs.getString("Tanggal_Pengembalian");
                   String tanggalDikembalikan = rs.getString("Tanggal_Dikembalikan");
                   String statusPeminjaman = rs.getString("Status_Peminjaman");
                   String jumlah_Denda = rs.getString("Jumlah_Denda");
                   
                   Object[] rowData = {idPeminjaman, idAnggota, namaAnggota, idBuku, 
                       tanggalPinjam, tanggalKembali, tanggalDikembalikan, statusPeminjaman, jumlah_Denda};
                   model.addRow(rowData);
               }
            }
        }
        
        
        catch(Exception e){
            Logger.getLogger(LaporanPeminjaman.class.getName()).log(Level.SEVERE, null, e);
        }
    }


    private void resetForm() {
      
    }

    private void searchData() {
        String keyWord = txt_cari.getText();
        
        DefaultTableModel model = (DefaultTableModel)tbl_data.getModel();
        model.setRowCount(0);
        
        try{
            String sql = "SELECT "
                            + "pmj.ID_Peminjaman, "
                            + "agt.ID_Anggota, "
                            + "agt.Nama_Anggota, "
                            + "bk.ID_Buku, "
                            + "pmj.Tanggal_Peminjaman, "
                            + "pmj.Tanggal_Pengembalian, "
                            + "png.Tanggal_Dikembalikan, "
                            + "dpm.Status_Peminjaman, "
                            + "dpn.Jumlah_Denda "
                    
                        + "FROM pengembalian png "
                    
                        + "INNER JOIN detail_pengembalian dpn ON dpn.ID_Pengembalian = png.ID_Pengembalian "
                        + "INNER JOIN peminjaman pmj ON pmj.ID_Peminjaman = png.ID_Peminjaman "
                        + "INNER JOIN detail_peminjaman dpm ON dpm.ID_Peminjaman = pmj.ID_Peminjaman "
                        + "INNER JOIN anggota agt ON agt.ID_Anggota = pmj.ID_Anggota "
                        + "INNER JOIN buku bk ON bk.ID_Buku = dpn.ID_Buku "
                    
                        + "WHERE (pmj.ID_Peminjaman LIKE ? OR agt.Nama_Anggota LIKE ? OR bk.ID_Buku LIKE ?) "
                        + "AND pmj.Tanggal_Peminjaman BETWEEN ? AND ? AND dpm.Status_Peminjaman = 'Sudah Dikembalikan'"
                        
                        + "GROUP BY "
                            + "bk.ID_Buku, "
                            + "pmj.ID_Peminjaman, "
                            + "png.ID_Pengembalian, "
                            + "pmj.Tanggal_Peminjaman, "
                            + "pmj.Tanggal_Pengembalian, "
                            + "png.Tanggal_Dikembalikan ";
            
            try(PreparedStatement st = conn.prepareStatement(sql)){
               st.setString(1, "%" + keyWord + "%");
               st.setString(2, "%" + keyWord + "%");
               st.setString(3, "%" + keyWord + "%");
               st.setString(4, dateFormat.format(tanggalMulai));
               st.setString(5, dateFormat.format(tanggalAkhir));
               
               ResultSet rs = st.executeQuery(); 
               
               while(rs.next()){
                   String idPeminjaman = rs.getString("ID_Peminjaman");
                   String idAnggota = rs.getString("ID_Anggota");
                   String namaAnggota = rs.getString("Nama_Anggota");
                   String idBuku = rs.getString("ID_Buku");
                   String tanggalPinjam = rs.getString("Tanggal_Peminjaman");
                   String tanggalKembali = rs.getString("Tanggal_Pengembalian");
                   String tanggalDikembalikan = rs.getString("Tanggal_Dikembalikan");
                   String statusPeminjaman = rs.getString("Status_Peminjaman");
                   String jumlah_Denda = rs.getString("Jumlah_Denda");
                   
                   Object[] rowData = {idPeminjaman, idAnggota, namaAnggota, idBuku, 
                       tanggalPinjam, tanggalKembali, tanggalDikembalikan, statusPeminjaman, jumlah_Denda};
                   model.addRow(rowData);
               }
            }
        }
        
        catch(Exception e){
            Logger.getLogger(LaporanPeminjaman.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void paginationAnggota() {
       btn_firts.addActionListener(new ActionListener() { 
        @Override
        public void actionPerformed(ActionEvent e) { 
            halamanSaatIni = 1;
               loadData();
        }
        });
       
       btn_previous.addActionListener(new ActionListener() { 
        @Override
        public void actionPerformed(ActionEvent e) { 
           if(halamanSaatIni > 1){
               
           }
           halamanSaatIni--;
               loadData();
        }
        });
       
       btn_next.addActionListener(new ActionListener() { 
        @Override
        public void actionPerformed(ActionEvent e) { 
           if (halamanSaatIni < totalPages){
            halamanSaatIni++;
                loadData();
        }
           
        }
        });
       
        btn_last.addActionListener(new ActionListener() { 
        @Override
        public void actionPerformed(ActionEvent e) { 
           halamanSaatIni = totalPages;
                loadData();  
        }
        });
        
        jcbx_data.addActionListener(new ActionListener() { 
        @Override
        public void actionPerformed(ActionEvent e) { 
           dataPerHalaman = Integer.parseInt(jcbx_data.getSelectedItem().toString());
           halamanSaatIni = 1;
                loadData();
        }
        });
   
       }
    
    private void calculateTotalPages(){
        int totalData = getTotalData();
        totalPages = (int) Math.ceil((double) totalData / dataPerHalaman);
    }

    private int getTotalData() {
        int totalData = 0;
        
        try{
            String sql = "SELECT COUNT(*) AS total FROM pengembalian";
            try(PreparedStatement st = conn.prepareStatement(sql)){
                ResultSet rs = st.executeQuery();
                if(rs.next()){
                    totalData = rs.getInt("total");
                }
            }
        }
        catch(Exception e){
            Logger.getLogger(LaporanPeminjaman.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return totalData;
    }
    
    private void cetakLaporan() {
        String tanggalMulai = jtxt_tanggalmulai.getText();
        String tanggalAkhir = jtxt_tanggalakhir.getText();

        try {
            String reportPath = "src/Reports/LaporanPeminjaman.jasper";

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date tglMulai = dateFormat.parse(tanggalMulai);
            Date tglAkhir = dateFormat.parse(tanggalAkhir);

            HashMap<String, Object> parameters = new HashMap<>();
            parameters.put("tanggalMulai", tglMulai);
            parameters.put("tanggalAkhir", tglAkhir);

            JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
            JasperViewer viewer = new JasperViewer(print, false);
            viewer.setExtendedState(JasperViewer.MAXIMIZED_BOTH);
            viewer.setVisible(true);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
 }