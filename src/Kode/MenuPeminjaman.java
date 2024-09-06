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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MenuPeminjaman extends javax.swing.JPanel {
    
    private String userID;
    
    private int halamanSaatIni = 1;
    private int dataPerHalaman = 10;
    private int totalPages;

    private final Connection conn;
    
    public MenuPeminjaman(String userID) {
        this.userID = userID;
        initComponents();
        
        conn = Koneksi.getConnection();
        setTabelModel();
        setTabelModelDetail();
        setTabelModelSementara();
        loadData();
        loadDataSementara();
        paginationBuku();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser1 = new com.raven.datechooser.DateChooser();
        dateChooser2 = new com.raven.datechooser.DateChooser();
        rSMaterialButtonCircleBeanInfo1 = new rojerusan.RSMaterialButtonCircleBeanInfo();
        jpn_main = new javax.swing.JPanel();
        jpn_view = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_tambah = new rojerusan.RSMaterialButtonRectangle();
        btn_batal = new rojerusan.RSMaterialButtonRectangle();
        txt_cari = new property.JtextfieldroundedCustom();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_data = new javax.swing.JTable();
        pnPages = new javax.swing.JPanel();
        pnDetail = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jlbl_halaman = new javax.swing.JLabel();
        btn_firts = new javax.swing.JButton();
        btn_previous = new javax.swing.JButton();
        btn_next = new javax.swing.JButton();
        btn_last = new javax.swing.JButton();
        jcbx_data = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_dataDetail = new javax.swing.JTable();
        jpn_add = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_simpan = new rojerusan.RSMaterialButtonRectangle();
        btn_btl = new rojerusan.RSMaterialButtonRectangle();
        jLabel16 = new javax.swing.JLabel();
        panelCustom1 = new property.PanelCustom();
        jLabel6 = new javax.swing.JLabel();
        jtxt_id = new property.JtextfieldroundedCustom();
        jLabel9 = new javax.swing.JLabel();
        jtxt_tanggalpinjam = new property.JtextfieldroundedCustom();
        jtxt_tanggalpengembalian = new property.JtextfieldroundedCustom();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jtxt_jumlahbuku = new property.JtextfieldroundedCustom();
        jLabel22 = new javax.swing.JLabel();
        lb_total = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtxt_idanggota = new property.JtextfieldroundedCustom();
        jLabel13 = new javax.swing.JLabel();
        jtxt_nama = new property.JtextfieldroundedCustom();
        jLabel14 = new javax.swing.JLabel();
        jtxt_email = new property.JtextfieldroundedCustom();
        jLabel15 = new javax.swing.JLabel();
        jtxt_telephone = new property.JtextfieldroundedCustom();
        btn_setanggota = new rojerusan.RSMaterialButtonRectangle();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jtxt_judul = new property.JtextfieldroundedCustom();
        jtxt_pengarang = new property.JtextfieldroundedCustom();
        jtxt_penerbit = new property.JtextfieldroundedCustom();
        jLabel21 = new javax.swing.JLabel();
        jtxt_idbuku = new property.JtextfieldroundedCustom();
        btn_setbuku = new rojerusan.RSMaterialButtonRectangle();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_datasementara = new javax.swing.JTable();
        btn_ubah = new rojerusan.RSMaterialButtonRectangle();
        btn_hapus = new rojerusan.RSMaterialButtonRectangle();
        btn_btlSementara = new rojerusan.RSMaterialButtonRectangle();

        dateChooser1.setTextRefernce(jtxt_tanggalpinjam);

        dateChooser2.setTextRefernce(jtxt_tanggalpengembalian);

        setPreferredSize(new java.awt.Dimension(1325, 887));
        setLayout(new java.awt.CardLayout());

        jpn_main.setBackground(new java.awt.Color(255, 255, 255));
        jpn_main.setPreferredSize(new java.awt.Dimension(1325, 887));
        jpn_main.setLayout(new java.awt.CardLayout());

        jpn_view.setBackground(new java.awt.Color(255, 255, 255));
        jpn_view.setPreferredSize(new java.awt.Dimension(1325, 887));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("TRANSAKSI > PEMINJAMAN");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 51));
        jLabel2.setText("Data Peminjaman");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-dashboard-30.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-borrow-book-30 (1).png"))); // NOI18N

        btn_tambah.setBackground(new java.awt.Color(51, 0, 204));
        btn_tambah.setText("TAMBAH");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_batal.setBackground(new java.awt.Color(204, 204, 0));
        btn_batal.setText("BATAL");
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        txt_cari.setLineColor(new java.awt.Color(153, 0, 51));
        txt_cari.setPlaceholder("Pencariaan");
        txt_cari.setSelectionColor(new java.awt.Color(153, 0, 51));
        txt_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cariActionPerformed(evt);
            }
        });
        txt_cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cariKeyReleased(evt);
            }
        });

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
        tbl_data.setRowHeight(30);
        tbl_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_dataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_data);

        pnPages.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnPagesLayout = new javax.swing.GroupLayout(pnPages);
        pnPages.setLayout(pnPagesLayout);
        pnPagesLayout.setHorizontalGroup(
            pnPagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 409, Short.MAX_VALUE)
        );
        pnPagesLayout.setVerticalGroup(
            pnPagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
        );

        pnDetail.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnDetailLayout = new javax.swing.GroupLayout(pnDetail);
        pnDetail.setLayout(pnDetailLayout);
        pnDetailLayout.setHorizontalGroup(
            pnDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDetailLayout.createSequentialGroup()
                .addContainerGap(803, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        pnDetailLayout.setVerticalGroup(
            pnDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDetailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        jlbl_halaman.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jlbl_halaman.setForeground(new java.awt.Color(153, 0, 51));
        jlbl_halaman.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbl_halaman.setText("Halaman   of   Total Halaman");

        btn_firts.setText("First Page");
        btn_firts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_firtsActionPerformed(evt);
            }
        });

        btn_previous.setText("<");
        btn_previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_previousActionPerformed(evt);
            }
        });

        btn_next.setText(">");
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });

        btn_last.setText("Last Page");
        btn_last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lastActionPerformed(evt);
            }
        });

        jcbx_data.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "30", "40", "50", "60", "70", "80", "90", "100" }));
        jcbx_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbx_dataActionPerformed(evt);
            }
        });

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-borrow-book-30 (1).png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 51));
        jLabel5.setText("Data Detail Peminjamam Buku");

        tbl_dataDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_dataDetail.setRowHeight(30);
        jScrollPane4.setViewportView(tbl_dataDetail);

        javax.swing.GroupLayout jpn_viewLayout = new javax.swing.GroupLayout(jpn_view);
        jpn_view.setLayout(jpn_viewLayout);
        jpn_viewLayout.setHorizontalGroup(
            jpn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_viewLayout.createSequentialGroup()
                .addGroup(jpn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpn_viewLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnPages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpn_viewLayout.createSequentialGroup()
                        .addGroup(jpn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpn_viewLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jpn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpn_viewLayout.createSequentialGroup()
                                        .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_cari, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpn_viewLayout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jpn_viewLayout.createSequentialGroup()
                                .addGap(236, 236, 236)
                                .addComponent(jlbl_halaman, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jpn_viewLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jpn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpn_viewLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(jpn_viewLayout.createSequentialGroup()
                        .addComponent(btn_firts, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_previous, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_last, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbx_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpn_viewLayout.setVerticalGroup(
            jpn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_viewLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jpn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addGroup(jpn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbl_halaman)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_firts)
                    .addComponent(btn_previous)
                    .addComponent(btn_next)
                    .addComponent(btn_last)
                    .addComponent(jcbx_data))
                .addGroup(jpn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpn_viewLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(pnPages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpn_viewLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel5))
                        .addGroup(jpn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpn_viewLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(pnDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpn_viewLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
                .addGap(186, 186, 186))
        );

        jpn_main.add(jpn_view, "card2");

        jpn_add.setBackground(new java.awt.Color(255, 255, 255));
        jpn_add.setPreferredSize(new java.awt.Dimension(1325, 887));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 51));
        jLabel7.setText("Tambah Data Peminjam");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-dashboard-30.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-borrow-book-30 (1).png"))); // NOI18N

        btn_simpan.setBackground(new java.awt.Color(51, 0, 204));
        btn_simpan.setText("SIMPAN");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        btn_btl.setBackground(new java.awt.Color(204, 204, 0));
        btn_btl.setText("BATAL");
        btn_btl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_btlActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 0, 51));
        jLabel16.setText("TRANSAKSI > PEMINJAMAN");

        panelCustom1.setBackground(new java.awt.Color(255, 255, 153));
        panelCustom1.setRoundBottomLeft(20);
        panelCustom1.setRoundBottomRight(20);
        panelCustom1.setRoundTopLeft(20);
        panelCustom1.setRoundTopRight(20);

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 51));
        jLabel6.setText("ID PEMINJAM");

        jtxt_id.setLineColor(new java.awt.Color(153, 0, 51));
        jtxt_id.setPlaceholder("Masukkan Id ");
        jtxt_id.setSelectionColor(new java.awt.Color(153, 0, 51));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 51));
        jLabel9.setText("TANGGAL PINJAM");

        jtxt_tanggalpinjam.setLineColor(new java.awt.Color(153, 0, 51));
        jtxt_tanggalpinjam.setPlaceholder("Masukkan Tanggal Pinjam");
        jtxt_tanggalpinjam.setSelectionColor(new java.awt.Color(153, 0, 51));

        jtxt_tanggalpengembalian.setLineColor(new java.awt.Color(153, 0, 51));
        jtxt_tanggalpengembalian.setPlaceholder("Masukkan Tanggal Pengembalian");
        jtxt_tanggalpengembalian.setSelectionColor(new java.awt.Color(153, 0, 51));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 0, 51));
        jLabel11.setText("TANGGAL KEMBALI");

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 0, 51));
        jLabel17.setText("JUMLAH");

        jtxt_jumlahbuku.setLineColor(new java.awt.Color(153, 0, 51));
        jtxt_jumlahbuku.setPlaceholder("Masukkan Jumlah Buku");
        jtxt_jumlahbuku.setSelectionColor(new java.awt.Color(153, 0, 51));
        jtxt_jumlahbuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_jumlahbukuActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(153, 0, 51));
        jLabel22.setText("TOTAL PINJAM");

        lb_total.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lb_total.setForeground(new java.awt.Color(153, 0, 51));
        lb_total.setText("TOTAL");

        javax.swing.GroupLayout panelCustom1Layout = new javax.swing.GroupLayout(panelCustom1);
        panelCustom1.setLayout(panelCustom1Layout);
        panelCustom1Layout.setHorizontalGroup(
            panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxt_id, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(jtxt_tanggalpinjam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxt_jumlahbuku, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(jtxt_tanggalpengembalian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(lb_total))
                .addContainerGap())
        );
        panelCustom1Layout.setVerticalGroup(
            panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtxt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel17)
                        .addComponent(jtxt_jumlahbuku, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCustom1Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_total)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_tanggalpinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jtxt_tanggalpengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(15, 15, 15))
        );

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 0, 51));
        jLabel12.setText("ANGGOTA");

        jtxt_idanggota.setLineColor(new java.awt.Color(153, 0, 51));
        jtxt_idanggota.setPlaceholder("Masukkan Id Anggota");
        jtxt_idanggota.setSelectionColor(new java.awt.Color(153, 0, 51));

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 0, 51));
        jLabel13.setText("NAMA");

        jtxt_nama.setLineColor(new java.awt.Color(153, 0, 51));
        jtxt_nama.setPlaceholder("Masukkan Nama");
        jtxt_nama.setSelectionColor(new java.awt.Color(153, 0, 51));

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 0, 51));
        jLabel14.setText("EMAIL");

        jtxt_email.setLineColor(new java.awt.Color(153, 0, 51));
        jtxt_email.setPlaceholder("Masukkan Email");
        jtxt_email.setSelectionColor(new java.awt.Color(153, 0, 51));

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 0, 51));
        jLabel15.setText("TELEPHONE");

        jtxt_telephone.setLineColor(new java.awt.Color(153, 0, 51));
        jtxt_telephone.setPlaceholder("Masukkan Nomor Telephone");
        jtxt_telephone.setSelectionColor(new java.awt.Color(153, 0, 51));

        btn_setanggota.setBackground(new java.awt.Color(153, 0, 51));
        btn_setanggota.setText("...");
        btn_setanggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_setanggotaActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 0, 51));
        jLabel18.setText("JUDUL");

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 0, 51));
        jLabel19.setText("PENGARANG");

        jLabel20.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(153, 0, 51));
        jLabel20.setText("PENERBIT");

        jtxt_judul.setLineColor(new java.awt.Color(153, 0, 51));
        jtxt_judul.setPlaceholder("Masukkan Judul");
        jtxt_judul.setSelectionColor(new java.awt.Color(153, 0, 51));

        jtxt_pengarang.setLineColor(new java.awt.Color(153, 0, 51));
        jtxt_pengarang.setPlaceholder("Masukkan Pengarang");
        jtxt_pengarang.setSelectionColor(new java.awt.Color(153, 0, 51));

        jtxt_penerbit.setLineColor(new java.awt.Color(153, 0, 51));
        jtxt_penerbit.setPlaceholder("Masukkan Penerbit");
        jtxt_penerbit.setSelectionColor(new java.awt.Color(153, 0, 51));

        jLabel21.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 0, 51));
        jLabel21.setText("BUKU");

        jtxt_idbuku.setLineColor(new java.awt.Color(153, 0, 51));
        jtxt_idbuku.setPlaceholder("Masukkan Id Buku");
        jtxt_idbuku.setSelectionColor(new java.awt.Color(153, 0, 51));

        btn_setbuku.setBackground(new java.awt.Color(153, 0, 51));
        btn_setbuku.setText("...");
        btn_setbuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_setbukuActionPerformed(evt);
            }
        });

        tbl_datasementara.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_datasementara.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_datasementaraMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_datasementara);

        btn_ubah.setBackground(new java.awt.Color(51, 0, 204));
        btn_ubah.setText("UBAH");
        btn_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ubahActionPerformed(evt);
            }
        });

        btn_hapus.setBackground(new java.awt.Color(204, 0, 51));
        btn_hapus.setText("HAPUS");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_btlSementara.setBackground(new java.awt.Color(204, 204, 0));
        btn_btlSementara.setText("BATAL");
        btn_btlSementara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_btlSementaraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_btl, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_btlSementara, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(jtxt_idanggota, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_setanggota, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtxt_telephone, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel13))
                                    .addGap(47, 47, 47)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtxt_nama, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                                        .addComponent(jtxt_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18)
                            .addComponent(jLabel21)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtxt_pengarang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtxt_judul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jtxt_idbuku, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_setbuku, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtxt_penerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(panelCustom1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1279, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_btl, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(panelCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_idanggota, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(btn_setanggota, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_idbuku, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(btn_setbuku, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel18)
                    .addComponent(jtxt_judul, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel19)
                    .addComponent(jtxt_pengarang, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel20)
                    .addComponent(jtxt_penerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_btlSementara, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpn_addLayout = new javax.swing.GroupLayout(jpn_add);
        jpn_add.setLayout(jpn_addLayout);
        jpn_addLayout.setHorizontalGroup(
            jpn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpn_addLayout.setVerticalGroup(
            jpn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpn_main.add(jpn_add, "card2");

        add(jpn_main, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        jpn_main.removeAll();
        jpn_main.add(jpn_add);
        jpn_main.repaint();
        jpn_main.revalidate();

        jtxt_id.setText(setIdPeminjaman());
        jtxt_id.setEnabled(false);

        btn_ubah.setText("TAMBAH");
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        showPanel();
        loadData();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void btn_btlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_btlActionPerformed
        showPanel();
        loadData();
    }//GEN-LAST:event_btn_btlActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        insertData();
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void tbl_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dataMouseClicked
        pnDetail.setVisible(true);
                
        int row = tbl_data.getSelectedRow();
        String id = tbl_data.getValueAt(row, 0).toString();
        getDataDetail((DefaultTableModel) tbl_dataDetail.getModel(), id);
    }//GEN-LAST:event_tbl_dataMouseClicked

    private void btn_setanggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_setanggotaActionPerformed
        setAnggota();
    }//GEN-LAST:event_btn_setanggotaActionPerformed

    private void btn_setbukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_setbukuActionPerformed
        setBuku();
    }//GEN-LAST:event_btn_setbukuActionPerformed

    private void jtxt_jumlahbukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_jumlahbukuActionPerformed
       if(btn_ubah.getText().equals("TAMBAH")){
            insertDataSementara();
        } else if(btn_ubah.getText().equals("UBAH")){
            updateData();
        }
    }//GEN-LAST:event_jtxt_jumlahbukuActionPerformed

    private void tbl_datasementaraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_datasementaraMouseClicked
        btn_ubah.setText("UBAH");
        btn_hapus.setVisible(true);
        btn_btlSementara.setVisible(true);
        dataTabelSementara();
    }//GEN-LAST:event_tbl_datasementaraMouseClicked

    private void btn_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ubahActionPerformed
        if(btn_ubah.getText().equals("TAMBAH")){
            insertDataSementara();
        } else if(btn_ubah.getText().equals("UBAH")){
            updateData();
        }
    }//GEN-LAST:event_btn_ubahActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        deleteData();
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_btlSementaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_btlSementaraActionPerformed
        loadDataSementara();
        resetFormBuku();
        btn_ubah.setText("TAMBAH");
    }//GEN-LAST:event_btn_btlSementaraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        showPanel();
        loadData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_cariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cariKeyReleased
        searchData();
    }//GEN-LAST:event_txt_cariKeyReleased

    private void btn_firtsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_firtsActionPerformed
        halamanSaatIni = 1;
        loadData();
    }//GEN-LAST:event_btn_firtsActionPerformed

    private void btn_previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_previousActionPerformed
        if (halamanSaatIni > 1) {
            halamanSaatIni--;
            loadData();
        }
    }//GEN-LAST:event_btn_previousActionPerformed

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        if (halamanSaatIni < totalPages) {
            halamanSaatIni++;
            loadData();
        }
    }//GEN-LAST:event_btn_nextActionPerformed

    private void btn_lastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lastActionPerformed
        halamanSaatIni = totalPages;
        loadData();
    }//GEN-LAST:event_btn_lastActionPerformed

    private void jcbx_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbx_dataActionPerformed
        dataPerHalaman = Integer.parseInt(jcbx_data.getSelectedItem().toString());
        halamanSaatIni = 1;
        loadData();
    }//GEN-LAST:event_jcbx_dataActionPerformed

    private void txt_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cariActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btn_batal;
    private rojerusan.RSMaterialButtonRectangle btn_btl;
    private rojerusan.RSMaterialButtonRectangle btn_btlSementara;
    private javax.swing.JButton btn_firts;
    private rojerusan.RSMaterialButtonRectangle btn_hapus;
    private javax.swing.JButton btn_last;
    private javax.swing.JButton btn_next;
    private javax.swing.JButton btn_previous;
    private rojerusan.RSMaterialButtonRectangle btn_setanggota;
    private rojerusan.RSMaterialButtonRectangle btn_setbuku;
    private rojerusan.RSMaterialButtonRectangle btn_simpan;
    private rojerusan.RSMaterialButtonRectangle btn_tambah;
    private rojerusan.RSMaterialButtonRectangle btn_ubah;
    private com.raven.datechooser.DateChooser dateChooser1;
    private com.raven.datechooser.DateChooser dateChooser2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JComboBox<String> jcbx_data;
    private javax.swing.JLabel jlbl_halaman;
    private javax.swing.JPanel jpn_add;
    private javax.swing.JPanel jpn_main;
    private javax.swing.JPanel jpn_view;
    private property.JtextfieldroundedCustom jtxt_email;
    private property.JtextfieldroundedCustom jtxt_id;
    private property.JtextfieldroundedCustom jtxt_idanggota;
    private property.JtextfieldroundedCustom jtxt_idbuku;
    private property.JtextfieldroundedCustom jtxt_judul;
    private property.JtextfieldroundedCustom jtxt_jumlahbuku;
    private property.JtextfieldroundedCustom jtxt_nama;
    private property.JtextfieldroundedCustom jtxt_penerbit;
    private property.JtextfieldroundedCustom jtxt_pengarang;
    private property.JtextfieldroundedCustom jtxt_tanggalpengembalian;
    private property.JtextfieldroundedCustom jtxt_tanggalpinjam;
    private property.JtextfieldroundedCustom jtxt_telephone;
    private javax.swing.JLabel lb_total;
    private property.PanelCustom panelCustom1;
    private javax.swing.JPanel pnDetail;
    private javax.swing.JPanel pnPages;
    private rojerusan.RSMaterialButtonCircleBeanInfo rSMaterialButtonCircleBeanInfo1;
    private javax.swing.JTable tbl_data;
    private javax.swing.JTable tbl_dataDetail;
    private javax.swing.JTable tbl_datasementara;
    private property.JtextfieldroundedCustom txt_cari;
    // End of variables declaration//GEN-END:variables

    private void loadData(){
        calculateTotalPages();
        int totalData = getTotalData();
        jlbl_halaman.setText(String.valueOf("Halaman " + halamanSaatIni + " dari Total Data " + totalData));
        
        int startIndex = (halamanSaatIni - 1) * dataPerHalaman;
        getData(startIndex, dataPerHalaman, (DefaultTableModel) tbl_data.getModel());
        btn_batal.setVisible(false);
        pnDetail.setVisible(false);
    }
    
    private void loadDataSementara(){
        getDataSementara((DefaultTableModel)tbl_datasementara.getModel());
        
        btn_ubah.setText("TAMBAH");
        btn_hapus.setVisible(false);
        btn_btlSementara.setVisible(false);
    }
    
    private void showPanel(){
        jpn_main.removeAll();
        jpn_main.add(new MenuPeminjaman(userID));
        jpn_main.repaint();
        jpn_main.revalidate();
    }
    
    private void setTabelModel(){
        DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
        model.addColumn("ID PEMINJAM");
        model.addColumn("TANGGAL PEMINJAMAN");
        model.addColumn("TANGGAL PENGEMBALIAN");
        model.addColumn("TOTAL PINJAM");
        model.addColumn("NAMA ANGGOTA");
        model.addColumn("PETUGAS");
    }

    private void getData(int startIndex, int entriesPage, DefaultTableModel model) {
        model.setRowCount(0);

        try {
            String sql = "SELECT pm.ID_Peminjaman, pm.Tanggal_Peminjaman, pm.Tanggal_Pengembalian, pm.Total_Pinjam, agt.Nama_Anggota, usr.Nama_User\n" +
                         "FROM peminjaman pm\n" +
                         "INNER JOIN anggota agt ON agt.ID_Anggota = pm.ID_Anggota\n" +
                         "INNER JOIN USER usr ON usr.ID_User = pm.ID_User\n" +
                         "ORDER BY pm.ID_Peminjaman ASC LIMIT ?, ?";

            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setInt(1, startIndex);
                st.setInt(2, entriesPage);
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    String idPeminjam = rs.getString("ID_Peminjaman");
                    String tanggalPinjam = rs.getString("Tanggal_Peminjaman");
                    String tanggalKembali = rs.getString("Tanggal_Pengembalian");
                    String totalPinjam = rs.getString("Total_Pinjam");
                    String namaAnggota = rs.getString("Nama_Anggota");
                    String namaUser = rs.getString("Nama_User");

                    Object[] rowData = {idPeminjam, tanggalPinjam, tanggalKembali, totalPinjam, namaAnggota, namaUser};
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(MenuPeminjaman.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void setTabelModelSementara(){
        DefaultTableModel model = (DefaultTableModel) tbl_datasementara.getModel();
        model.addColumn("ID PEMINJAM");
        model.addColumn("JUDUL BUKU");
        model.addColumn("PENGARANG");
        model.addColumn("PENERBIT");
        model.addColumn("JUMLAH PINJAM");
    }
    
    private void getDataSementara(DefaultTableModel model) {
        model.setRowCount(0);

        try {
            String sql = "SELECT * FROM sementara";

            try (PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    String idBuku = rs.getString("ID_Buku");
                    String judulBuku = rs.getString("Judul_Buku");
                    String pengarangBuku = rs.getString("Pengarang_Buku");
                    String penerbitBuku = rs.getString("Penerbit_Buku");
                    String jumlahPinjam = rs.getString("Jumlah_Pinjam");

                    Object[] rowData = {idBuku, judulBuku, pengarangBuku, penerbitBuku, jumlahPinjam};
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(MenuPeminjaman.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void setTabelModelDetail() {
        DefaultTableModel model = (DefaultTableModel) tbl_dataDetail.getModel();
        model.addColumn("ID");
        model.addColumn("ID BUKU");
        model.addColumn("JUDUL");
        model.addColumn("JUMLAH");
        model.addColumn("STATUS PEMINJAMAN");
    }
    
    public void getDataDetail(DefaultTableModel model, String id) {
        model.setRowCount(0);

        try {
            String sql = "SELECT pmd.ID_Peminjaman, bk.ID_Buku, bk.Judul_Buku, pmd.Jumlah_Pinjam, pmd.Status_Peminjaman\n" +
                        "FROM detail_peminjaman pmd\n" +
                        "INNER JOIN buku bk ON bk.ID_Buku = pmd.ID_Buku\n" +
                        "WHERE pmd.ID_Peminjaman = '"+id+"'"+
                        "ORDER BY pmd.ID_Peminjaman ASC";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    String idPeminjaman     = rs.getString("ID_Peminjaman");
                    String idBuku           = rs.getString("ID_Buku");
                    String judulBuku        = rs.getString("Judul_Buku");
                    String jumlahPinjam     = rs.getString("Jumlah_Pinjam");
                    String statusPeminjaman = rs.getString("Status_Peminjaman");
                    
                    Object[] rowData = {idPeminjaman, idBuku, judulBuku, jumlahPinjam, statusPeminjaman};
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(MenuPeminjaman.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private String setIdPeminjaman() {
        String urutan = null;
        Date now = new Date();
        SimpleDateFormat noFormat = new SimpleDateFormat("yyMM");
        String no = noFormat.format(now);

        String sql = "SELECT RIGHT(ID_Peminjaman, 3) AS Nomor " +
                     "FROM peminjaman " +
                     "WHERE ID_Peminjaman LIKE 'PMJ" + no + "%' " +
                     "ORDER BY ID_Peminjaman DESC " +
                     "LIMIT 1";

        try (PreparedStatement st = conn.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                int nomor = Integer.parseInt(rs.getString("Nomor"));
                nomor++;
                urutan = "PMJ" + no + String.format("%03d", nomor);
            } else {
                urutan = "PMJ" + no + "001";
            }
        } catch (SQLException e) {
            Logger.getLogger(MenuPeminjaman.class.getName()).log(Level.SEVERE, null, e);
        }
        return urutan;
    }
    
    private void setAnggota(){
        boolean closeable = true;
        DataAnggota anggota = new DataAnggota(null, closeable);
        anggota.setVisible(true);
        
        jtxt_idanggota.setText(anggota.getIdAnggota());
        jtxt_nama.setText(anggota.getNamaAnggota());
        jtxt_email.setText(anggota.getEmailAnggota());
        jtxt_telephone.setText(anggota.getTeleponAnggota());
        
        jtxt_idanggota.setEnabled(false);
        jtxt_nama.setEnabled(false);
        jtxt_email.setEnabled(false);
        jtxt_telephone.setEnabled(false);
    }
    
    private void setBuku(){
        boolean closeable = true;
        DataBuku buku = new DataBuku(null, closeable);
        buku.setVisible(true);

        jtxt_idbuku.setText(buku.getIdBuku());
        jtxt_judul.setText(buku.getJudulBuku());
        jtxt_pengarang.setText(buku.getPengarangBuku());
        jtxt_penerbit.setText(buku.getPenerbitBuku());

        jtxt_idbuku.setEnabled(false);
        jtxt_judul.setEnabled(false);
        jtxt_pengarang.setEnabled(false);
        jtxt_penerbit.setEnabled(false);
    }
    
    private void insertData() {
        String idPeminjam = jtxt_id.getText();
        String tglPinjam = jtxt_tanggalpinjam.getText();
        String tglKembali = jtxt_tanggalpengembalian.getText();
        String totalPinjam = lb_total.getText();
        String idAnggota = jtxt_idanggota.getText();

        if(idPeminjam.isEmpty() || tglPinjam.isEmpty() || tglKembali.isEmpty() || totalPinjam.isEmpty() || idAnggota.isEmpty()){
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi !", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {

            String sql = "INSERT INTO peminjaman (ID_Peminjaman, Tanggal_Peminjaman, Tanggal_Pengembalian, Total_Pinjam, ID_User, ID_Anggota) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, idPeminjam);
                st.setString(2, tglPinjam);
                st.setString(3, tglKembali);
                st.setString(4, totalPinjam);
                st.setString(5, userID);
                st.setString(6, idAnggota);

                int rowInserted = st.executeUpdate();

                if (rowInserted > 0) {
                    JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan");
                    insertDataDetail();
                    deleteDataSementara();
                    resetForm();
                    loadData();
                    showPanel();
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(MenuPeminjaman.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void insertDataDetail() {
        String idPeminjam = jtxt_id.getText();

        try {
            String sql = "INSERT INTO detail_peminjaman (ID_Peminjaman, ID_Buku, Jumlah_Pinjam, Status_Peminjaman) SELECT '"+idPeminjam+"',ID_Buku, Jumlah_Pinjam, Status_Pinjam FROM sementara";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.executeUpdate();
            }
        } catch (SQLException e) {
            Logger.getLogger(MenuPeminjaman.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private boolean cekStok(String idBuku, int jumlahPinjam){
        try{
            String sql = "SELECT Stok FROM buku WHERE ID_Buku=?";

            try(PreparedStatement st = conn.prepareStatement(sql)){
                st.setString(1, idBuku);

                ResultSet rs = st.executeQuery();

                if(rs.next()){
                    int stokTersedia = rs.getInt("Stok");
                    return jumlahPinjam <= stokTersedia;
                }
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    
    private void insertDataSementara() {
        String idBuku = jtxt_idbuku.getText();
        String namaBuku = jtxt_nama.getText();
        String pengarangBuku = jtxt_pengarang.getText();
        String penerbitBuku = jtxt_penerbit.getText();
        int jumlahPinjam = Integer.parseInt(jtxt_jumlahbuku.getText());
        String statusPinjam = "Sedang Dipinjam";

        if (namaBuku.isEmpty() || pengarangBuku.isEmpty() || penerbitBuku.isEmpty() || statusPinjam.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua Kolom Wajib Diisi !!!", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if(!cekStok(idBuku, jumlahPinjam)){
            JOptionPane.showMessageDialog(this, "Stok Buku Tidak tersedia!!!", "Peringatan", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            String sql = "INSERT INTO sementara (ID_Buku, Judul_Buku, Pengarang_Buku, Penerbit_Buku, Jumlah_Pinjam, Status_Pinjam) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, idBuku);
                st.setString(2, namaBuku);
                st.setString(3, pengarangBuku);
                st.setString(4, penerbitBuku);
                st.setInt(5, jumlahPinjam);
                st.setString(6, statusPinjam);

                int rowInserted = st.executeUpdate();

                if (rowInserted > 0) {
                    int totalPinjam = getTotalPinjam();
                    lb_total.setText(String.valueOf(totalPinjam));
                    loadDataSementara();

                    if (JOptionPane.showConfirmDialog(this, "Mau Tambah Barang?", "Konfirmasi", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                        resetFormBuku();
                        btn_setbuku.requestFocus();
                    } else {
                        resetFormBuku();
                        btn_simpan.requestFocus();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal menambahkan data sementara.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(MenuPeminjaman.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private int getTotalPinjam() {
        int totalPinjam = 0;

        try {
            String sql = "SELECT SUM(Jumlah_Pinjam) AS total FROM sementara";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    totalPinjam = rs.getInt("total");
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(MenuPeminjaman.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return totalPinjam;
    }

    private void updateData() {
        String idBuku = jtxt_idbuku.getText();
        String jumlahPinjam = jtxt_jumlahbuku.getText();
        
        if (idBuku.isEmpty() || jumlahPinjam.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua Kolom Wajib Dipilih !!!", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            String sql = "UPDATE sementara SET Jumlah_Pinjam=? WHERE ID_Buku=?";

            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, jumlahPinjam);
                st.setString(2, idBuku);
                int rowUpdated = st.executeUpdate();
                
                int totalPinjam = getTotalPinjam();
                lb_total.setText(String.valueOf(totalPinjam));
                
                if (rowUpdated > 0) {
                    JOptionPane.showMessageDialog(this, "Data berhasil diperbarui.");
                    resetFormBuku();
                    loadDataSementara();
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal memperbarui data.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat memperbarui data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void resetForm() {
       jtxt_id.setText("");
       jtxt_nama.setText("");
       jtxt_pengarang.setText("");
    }
    
    private void resetFormBuku(){
        jtxt_idbuku.setText("");
        jtxt_judul.setText("");
        jtxt_pengarang.setText("");
        jtxt_penerbit.setText("");
        jtxt_jumlahbuku.setText("");     
    }

    private void dataTabelSementara() {
        int row = tbl_datasementara.getSelectedRow();
        if(row!=-1){
            jtxt_idbuku.setText(tbl_datasementara.getValueAt(row, 0).toString());
            jtxt_judul.setText(tbl_datasementara.getValueAt(row, 1).toString());
            jtxt_pengarang.setText(tbl_datasementara.getValueAt(row, 2).toString());
            jtxt_penerbit.setText(tbl_datasementara.getValueAt(row, 3).toString());
            jtxt_jumlahbuku.setText(tbl_datasementara.getValueAt(row, 4).toString());

            jtxt_jumlahbuku.requestFocus();
        }
    }

    private void deleteData() {
        int selectedRow = tbl_datasementara.getSelectedRow();
        int confirm = JOptionPane.showConfirmDialog(this, 
                "Apakah yakin ingin menghapus data ini ?",
                "Konfirmasi Hapus Data", 
                JOptionPane.YES_NO_OPTION);
        
        if(confirm == JOptionPane.YES_OPTION){
            String id = tbl_datasementara.getValueAt(selectedRow, 0).toString();
            try {
                String sql =  "DELETE FROM sementara WHERE ID_Buku=?";
                try(PreparedStatement st = conn.prepareStatement(sql)){
                    st.setString(1, id);
                    int rowDeleted = st.executeUpdate();
                    
                    int totalPinjam = getTotalPinjam();
                    if(totalPinjam > 0){
                        lb_total.setText(String.valueOf(totalPinjam));
                    }else{
                        lb_total.setText("Total");
                    }
                    
                    if(rowDeleted > 0){
                        JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
                    }else{
                        JOptionPane.showMessageDialog(this, "Data Gagal Dihapus");
                    }
                    
                    btn_ubah.setText("TAMBAH");
                    
                }
            } catch (SQLException e) {
                Logger.getLogger(MenuPeminjaman.class.getName()).log(Level.SEVERE,null,e);
            }
        }
        resetFormBuku();
        loadDataSementara();
    }
    
    private void deleteDataSementara(){
        try{
            String sql = "DELETE FROM sementara";
                try(PreparedStatement st = conn.prepareStatement(sql)){
                    st.executeUpdate(); 
                }         
        }
        catch(Exception e){
            Logger.getLogger(MenuPeminjaman.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void searchData() {
        String keyWord = txt_cari.getText();
        
        DefaultTableModel model = (DefaultTableModel)tbl_data.getModel();
        model.setRowCount(0);
        
        try{
            String sql = "SELECT pm.ID_Peminjaman, pm.Tanggal_Peminjaman, pm.Tanggal_Pengembalian, pm.Total_Pinjam, agt.Nama_Anggota, usr.Nama_User\n" +
                            "FROM peminjaman pm\n" +
                            "INNER JOIN anggota agt ON agt.ID_Anggota = pm.ID_Anggota\n" +
                            "INNER JOIN USER usr ON usr.ID_User = pm.ID_User\n" +
                            "WHERE pm.ID_Peminjaman LIKE ? OR agt.Nama_Anggota LIKE ?";
            try(PreparedStatement st = conn.prepareStatement(sql)){
               st.setString(1, "%" + keyWord + "%");
               st.setString(2, "%" + keyWord + "%");
               
               ResultSet rs = st.executeQuery(); 
               
               while (rs.next()) {
                    String idPeminjam = rs.getString("ID_Peminjaman");
                    String tanggalPinjam = rs.getString("Tanggal_Peminjaman");
                    String tanggalKembali = rs.getString("Tanggal_Pengembalian");
                    String totalPinjam = rs.getString("Total_Pinjam");
                    String namaAnggota = rs.getString("Nama_Anggota");
                    String namaUser = rs.getString("Nama_User");

                    Object[] rowData = {idPeminjam, tanggalPinjam, tanggalKembali, totalPinjam, namaAnggota, namaUser};
                    model.addRow(rowData);
                }
            }
        }
        
        catch(Exception e){
            Logger.getLogger(MenuPeminjaman.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void paginationBuku() {
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
            String sql = "SELECT COUNT(*) AS total FROM peminjaman";
            try(PreparedStatement st = conn.prepareStatement(sql)){
                ResultSet rs = st.executeQuery();
                if(rs.next()){
                    totalData = rs.getInt("total");
                }
            }
        }
        catch(Exception e){
            Logger.getLogger(MenuPeminjaman.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return totalData;
    }
    private String getIDKategori(String namaKategori) {
        String idKategori = null;
        String sql = "SELECT ID_Kategori FROM kategori WHERE Nama_Kategori = ?";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, namaKategori);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                idKategori = rs.getString("ID_Kategori");
            }
        } catch (SQLException e) {
            Logger.getLogger(MenuPeminjaman.class.getName()).log(Level.SEVERE, null, e);
        }
        return idKategori;
    }
    
    private String getIDPenerbit(String namaPenerbit) {
        String idPenerbit = null;
        String sql = "SELECT ID_Penerbit FROM penerbit WHERE Nama_Penerbit = ?";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, namaPenerbit);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                idPenerbit = rs.getString("ID_Penerbit");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return idPenerbit;
    }
 }