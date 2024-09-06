package Kode;

import Koneksi.Koneksi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MenuPengembalian extends javax.swing.JPanel {
    
    private String userID;
    
    private int halamanSaatIni = 1;
    private int dataPerHalaman = 10;
    private int totalPages;

    private final Connection conn;
    
    public MenuPengembalian(String userID) {
        this.userID = userID;
        initComponents();
        
        conn = Koneksi.getConnection();
        setTabelModel();
        setTabelModelDetail();
        loadData();
        paginationBuku();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser1 = new com.raven.datechooser.DateChooser();
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
        jtxt_idpeminjam = new property.JtextfieldroundedCustom();
        jLabel9 = new javax.swing.JLabel();
        jtxt_tanggalaktual = new property.JtextfieldroundedCustom();
        jLabel17 = new javax.swing.JLabel();
        jtxt_denda = new property.JtextfieldroundedCustom();
        lb_infodenda = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtxt_idpeminjaman = new property.JtextfieldroundedCustom();
        jLabel13 = new javax.swing.JLabel();
        jtxt_tanggalpinjam = new property.JtextfieldroundedCustom();
        jLabel14 = new javax.swing.JLabel();
        jtxt_tanggalkembali = new property.JtextfieldroundedCustom();
        jLabel15 = new javax.swing.JLabel();
        jtxt_idanggota = new property.JtextfieldroundedCustom();
        btn_getpeminjaman = new rojerusan.RSMaterialButtonRectangle();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jtxt_judul = new property.JtextfieldroundedCustom();
        jtxt_pengarang = new property.JtextfieldroundedCustom();
        jtxt_penerbit = new property.JtextfieldroundedCustom();
        jLabel21 = new javax.swing.JLabel();
        jtxt_idbuku = new property.JtextfieldroundedCustom();
        jLabel24 = new javax.swing.JLabel();
        jtxt_namaanggota = new property.JtextfieldroundedCustom();
        jLabel22 = new javax.swing.JLabel();
        jtxt_jumlahkembali = new property.JtextfieldroundedCustom();

        dateChooser1.setTextRefernce(jtxt_tanggalaktual);

        setPreferredSize(new java.awt.Dimension(1325, 887));
        setLayout(new java.awt.CardLayout());

        jpn_main.setBackground(new java.awt.Color(255, 255, 255));
        jpn_main.setPreferredSize(new java.awt.Dimension(1325, 887));
        jpn_main.setLayout(new java.awt.CardLayout());

        jpn_view.setBackground(new java.awt.Color(255, 255, 255));
        jpn_view.setPreferredSize(new java.awt.Dimension(1325, 887));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("TRANSAKSI > PENGEMBALIAN");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 51));
        jLabel2.setText("Data Pengembalian");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-dashboard-30.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-return-book-30.png"))); // NOI18N

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

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-return-book-30.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 51));
        jLabel5.setText("Data Detail Pengembalian Buku");

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
        jLabel7.setText("Tambah Data Pengembalian");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-dashboard-30.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-return-book-30.png"))); // NOI18N

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
        jLabel16.setText("TRANSAKSI > PENGEMBALIAN");

        panelCustom1.setBackground(new java.awt.Color(255, 255, 153));
        panelCustom1.setRoundBottomLeft(20);
        panelCustom1.setRoundBottomRight(20);
        panelCustom1.setRoundTopLeft(20);
        panelCustom1.setRoundTopRight(20);

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 51));
        jLabel6.setText("ID PEMINJAM");

        jtxt_idpeminjam.setLineColor(new java.awt.Color(153, 0, 51));
        jtxt_idpeminjam.setPlaceholder("Masukkan Id ");
        jtxt_idpeminjam.setSelectionColor(new java.awt.Color(153, 0, 51));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 51));
        jLabel9.setText("TANGGAL");

        jtxt_tanggalaktual.setLineColor(new java.awt.Color(153, 0, 51));
        jtxt_tanggalaktual.setPlaceholder("Masukkan Tanggal");
        jtxt_tanggalaktual.setSelectionColor(new java.awt.Color(153, 0, 51));

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 0, 51));
        jLabel17.setText("DENDA");

        jtxt_denda.setLineColor(new java.awt.Color(153, 0, 51));
        jtxt_denda.setPlaceholder("Jumlah Denda");
        jtxt_denda.setSelectionColor(new java.awt.Color(153, 0, 51));
        jtxt_denda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_dendaActionPerformed(evt);
            }
        });

        lb_infodenda.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb_infodenda.setForeground(new java.awt.Color(153, 0, 51));
        lb_infodenda.setText("INFO DENDA");

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
                    .addComponent(jtxt_idpeminjam, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(jtxt_tanggalaktual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(90, 90, 90)
                .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCustom1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(jtxt_denda, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                        .addGap(109, 109, 109))
                    .addGroup(panelCustom1Layout.createSequentialGroup()
                        .addComponent(lb_infodenda)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelCustom1Layout.setVerticalGroup(
            panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_idpeminjam, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel17)
                    .addComponent(jtxt_denda, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCustom1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxt_tanggalaktual, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(15, 15, 15))
                    .addGroup(panelCustom1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_infodenda)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 0, 51));
        jLabel12.setText("PEMINJAMAN");

        jtxt_idpeminjaman.setLineColor(new java.awt.Color(153, 0, 51));
        jtxt_idpeminjaman.setPlaceholder("Masukkan Id Peminjam");
        jtxt_idpeminjaman.setSelectionColor(new java.awt.Color(153, 0, 51));

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 0, 51));
        jLabel13.setText("TANGGAL PINJAM");

        jtxt_tanggalpinjam.setLineColor(new java.awt.Color(153, 0, 51));
        jtxt_tanggalpinjam.setPlaceholder("Masukkan Tanggal Pinjam");
        jtxt_tanggalpinjam.setSelectionColor(new java.awt.Color(153, 0, 51));

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 0, 51));
        jLabel14.setText("TANGGAL KEMBALI");

        jtxt_tanggalkembali.setLineColor(new java.awt.Color(153, 0, 51));
        jtxt_tanggalkembali.setPlaceholder("Masukkan Tanggal Kembali");
        jtxt_tanggalkembali.setSelectionColor(new java.awt.Color(153, 0, 51));

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 0, 51));
        jLabel15.setText("ID ANGGOTA");

        jtxt_idanggota.setLineColor(new java.awt.Color(153, 0, 51));
        jtxt_idanggota.setPlaceholder(" Masukkan Id Anggota");
        jtxt_idanggota.setSelectionColor(new java.awt.Color(153, 0, 51));

        btn_getpeminjaman.setBackground(new java.awt.Color(153, 0, 51));
        btn_getpeminjaman.setText("...");
        btn_getpeminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_getpeminjamanActionPerformed(evt);
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

        jLabel24.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(153, 0, 51));
        jLabel24.setText("NAMA ANGGOTA");

        jtxt_namaanggota.setLineColor(new java.awt.Color(153, 0, 51));
        jtxt_namaanggota.setPlaceholder("Masukkan Nama Anggota");
        jtxt_namaanggota.setSelectionColor(new java.awt.Color(153, 0, 51));

        jLabel22.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(153, 0, 51));
        jLabel22.setText("JUMLAH KEMBALI");

        jtxt_jumlahkembali.setLineColor(new java.awt.Color(153, 0, 51));
        jtxt_jumlahkembali.setPlaceholder("Masukkan Jumlah Kembali");
        jtxt_jumlahkembali.setSelectionColor(new java.awt.Color(153, 0, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_btl, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addGap(210, 210, 210)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel15))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtxt_tanggalkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtxt_idanggota, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtxt_namaanggota, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jtxt_idpeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_getpeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jtxt_tanggalpinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18)
                            .addComponent(jLabel21)
                            .addComponent(jLabel20)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxt_jumlahkembali, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtxt_pengarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxt_judul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxt_penerbit, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                .addComponent(jtxt_idbuku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(48, Short.MAX_VALUE)
                        .addComponent(panelCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(506, 1245, Short.MAX_VALUE))
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
                    .addComponent(jtxt_idpeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(btn_getpeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_idbuku, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_tanggalpinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel18)
                    .addComponent(jtxt_judul, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_tanggalkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel19)
                    .addComponent(jtxt_pengarang, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_idanggota, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel20)
                    .addComponent(jtxt_penerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_namaanggota, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel22)
                    .addComponent(jtxt_jumlahkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(446, Short.MAX_VALUE))
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

        jtxt_idpeminjam.setText(setIdPengembalian());
        jtxt_idpeminjam.setEnabled(false);
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

    private void btn_getpeminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_getpeminjamanActionPerformed
        getPeminjaman();
        hitungDenda();
    }//GEN-LAST:event_btn_getpeminjamanActionPerformed

    private void jtxt_dendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_dendaActionPerformed

    }//GEN-LAST:event_jtxt_dendaActionPerformed

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
    private javax.swing.JButton btn_firts;
    private rojerusan.RSMaterialButtonRectangle btn_getpeminjaman;
    private javax.swing.JButton btn_last;
    private javax.swing.JButton btn_next;
    private javax.swing.JButton btn_previous;
    private rojerusan.RSMaterialButtonRectangle btn_simpan;
    private rojerusan.RSMaterialButtonRectangle btn_tambah;
    private com.raven.datechooser.DateChooser dateChooser1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JComboBox<String> jcbx_data;
    private javax.swing.JLabel jlbl_halaman;
    private javax.swing.JPanel jpn_add;
    private javax.swing.JPanel jpn_main;
    private javax.swing.JPanel jpn_view;
    private property.JtextfieldroundedCustom jtxt_denda;
    private property.JtextfieldroundedCustom jtxt_idanggota;
    private property.JtextfieldroundedCustom jtxt_idbuku;
    private property.JtextfieldroundedCustom jtxt_idpeminjam;
    private property.JtextfieldroundedCustom jtxt_idpeminjaman;
    private property.JtextfieldroundedCustom jtxt_judul;
    private property.JtextfieldroundedCustom jtxt_jumlahkembali;
    private property.JtextfieldroundedCustom jtxt_namaanggota;
    private property.JtextfieldroundedCustom jtxt_penerbit;
    private property.JtextfieldroundedCustom jtxt_pengarang;
    private property.JtextfieldroundedCustom jtxt_tanggalaktual;
    private property.JtextfieldroundedCustom jtxt_tanggalkembali;
    private property.JtextfieldroundedCustom jtxt_tanggalpinjam;
    private javax.swing.JLabel lb_infodenda;
    private property.PanelCustom panelCustom1;
    private javax.swing.JPanel pnDetail;
    private javax.swing.JPanel pnPages;
    private rojerusan.RSMaterialButtonCircleBeanInfo rSMaterialButtonCircleBeanInfo1;
    private javax.swing.JTable tbl_data;
    private javax.swing.JTable tbl_dataDetail;
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
        lb_infodenda.setVisible(false);
    }
    
    private void showPanel(){
        jpn_main.removeAll();
        jpn_main.add(new MenuPengembalian(userID));
        jpn_main.repaint();
        jpn_main.revalidate();
    }
    
    private void setTabelModel(){
        DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
        model.addColumn("ID PENGEMBALIAN");
        model.addColumn("TANGGAL DIKEMBALIKAN");
        model.addColumn("ID PEMINJAM");
        model.addColumn("PETUGAS");
    }


    private void getData(int startIndex, int entriesPage, DefaultTableModel model) {
        model.setRowCount(0);

        try {
            String sql = "SELECT png.ID_Pengembalian, png.Tanggal_Dikembalikan, png.ID_Peminjaman, usr.Nama_User " +
                         "FROM pengembalian png " +
                         "INNER JOIN peminjaman pmj ON pmj.ID_Peminjaman = png.ID_Peminjaman " +
                         "INNER JOIN user usr ON usr.ID_User = png.ID_User " +
                         "ORDER BY png.ID_Pengembalian ASC LIMIT ?, ?";

            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setInt(1, startIndex);
                st.setInt(2, entriesPage);
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    String idPengembalian = rs.getString("ID_Pengembalian");
                    String tanggalDikembalikan = rs.getString("Tanggal_Dikembalikan");
                    String idPeminjaman = rs.getString("ID_Peminjaman");
                    String namaUser = rs.getString("Nama_User");

                    Object[] rowData = {idPengembalian, tanggalDikembalikan, idPeminjaman, namaUser};
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(MenuPengembalian.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void setTabelModelDetail() {
        DefaultTableModel model = (DefaultTableModel) tbl_dataDetail.getModel();
        model.addColumn("ID PENGEMBALIAN");
        model.addColumn("ID BUKU");
        model.addColumn("JUDUL");
        model.addColumn("DENDA");
    }
    
    public void getDataDetail(DefaultTableModel model, String id) {
        model.setRowCount(0);

        try {
            String sql = "SELECT png.ID_Pengembalian, bk.ID_Buku, bk.Judul_Buku, png.Jumlah_Denda\n" +
                        "FROM detail_pengembalian png\n" +
                        "INNER JOIN buku bk ON bk.ID_Buku = png.ID_Buku\n" +
                        "WHERE png.ID_Pengembalian = '"+id+"'"+
                        "ORDER BY png.ID_Pengembalian ASC";

            try (PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();

                DecimalFormat decimalFormat = new DecimalFormat("#");

                while (rs.next()) {
                    String idPengembalian = rs.getString("ID_Pengembalian");
                    String idBuku = rs.getString("ID_Buku");
                    String judulBuku = rs.getString("Judul_Buku");
                    Double jumlahDenda = rs.getDouble("Jumlah_Denda");

                    String formatDenda = (jumlahDenda == 0.0) ? "0" : decimalFormat.format(jumlahDenda);

                    Object[] rowData = {idPengembalian, idBuku, judulBuku, formatDenda};
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(MenuPengembalian.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private String setIdPengembalian() {
        String urutan = null;
        Date now = new Date();
        SimpleDateFormat noFormat = new SimpleDateFormat("yyMM");
        String no = noFormat.format(now);

        String sql = "SELECT RIGHT(ID_Pengembalian, 3) AS Nomor " +
                     "FROM pengembalian " +
                     "WHERE ID_Pengembalian LIKE 'PNG" + no + "%' " +
                     "ORDER BY Nomor DESC, ID_Pengembalian DESC " + // Menambahkan DESC setelah kolom Nomor
                     "LIMIT 1";

        try (PreparedStatement st = conn.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                int nomor = Integer.parseInt(rs.getString("Nomor"));
                nomor++;
                urutan = "PNG" + no + String.format("%03d", nomor);
            } else {
                urutan = "PNG" + no + "001";
            }
        } catch (SQLException e) {
            Logger.getLogger(MenuPengembalian.class.getName()).log(Level.SEVERE, null, e);
        }
        return urutan;
    }
    
    private void getPeminjaman(){
        boolean closeable = true;
        DataPeminjaman pmj = new DataPeminjaman(null, closeable);
        pmj.setVisible(true);

        String id = pmj.getIdBuku(); 

        jtxt_idpeminjaman.setText(pmj.getIdPeminjaman());
        jtxt_tanggalpinjam.setText(pmj.getTanggalPinjam());
        jtxt_tanggalkembali.setText(pmj.getTanggalKembali());
        jtxt_idanggota.setText(pmj.getIdAnggota());
        jtxt_namaanggota.setText(pmj.getNamaAnggota());
        jtxt_idbuku.setText(pmj.getIdBuku());
        jtxt_judul.setText(pmj.getJudulBuku());
        jtxt_pengarang.setText(pmj.getPengarangBuku());
        jtxt_penerbit.setText(pmj.getPenerbitBuku());
        jtxt_jumlahkembali.setText(pmj.getJumlahPinjam());

        jtxt_idpeminjaman.setEnabled(false);
        jtxt_tanggalpinjam.setEnabled(false);
        jtxt_tanggalkembali.setEnabled(false);
        jtxt_idanggota.setEnabled(false);
        jtxt_namaanggota.setEnabled(false);
        jtxt_idbuku.setEnabled(false);
        jtxt_judul.setEnabled(false);
        jtxt_pengarang.setEnabled(false);
        jtxt_penerbit.setEnabled(false);
        jtxt_jumlahkembali.setEnabled(false);
    }
    
    private void hitungDenda(){
        int dendaPerhari = 500;
        String tanggalKembaliAktual = jtxt_tanggalaktual.getText();
        String tanggalKembali = jtxt_tanggalkembali.getText();

        if(!tanggalKembali.isEmpty()){
            try{
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date tanggalAktual = dateFormat.parse(tanggalKembaliAktual);
                Date tanggalDikembalikan = dateFormat.parse(tanggalKembali);

                long selisihHari = (tanggalAktual.getTime() - tanggalDikembalikan.getTime()) / (24 * 60 * 60 * 1000);
                int denda = (int) (selisihHari * dendaPerhari);

                jtxt_denda.setText(Integer.toString(denda));

                if(denda > 0){
                    lb_infodenda.setVisible(true);
                    lb_infodenda.setText("Telat : " + selisihHari + " Hari");
                } else {
                    lb_infodenda.setText("Tidak Ada Denda");
                }

            } catch(ParseException e){
                e.printStackTrace();
            }
        }
    }
    
    private void insertData() {
        String idPengembalian = jtxt_idpeminjam.getText();
        String tanggalAktual = jtxt_tanggalaktual.getText();
        String idPeminjaman = jtxt_idpeminjaman.getText();

        try {

            String sql = "INSERT INTO pengembalian (ID_Pengembalian, Tanggal_Dikembalikan, ID_Peminjaman, ID_User) VALUES (?, ?, ?, ?)";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, idPengembalian);
                st.setString(2, tanggalAktual);
                st.setString(3, idPeminjaman);
                st.setString(4, userID);

                int rowInserted = st.executeUpdate();

                if (rowInserted > 0) {
                    JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan");
                }
                
                insertDataDetail();
                updateStatus();
                resetForm();
                loadData();
                showPanel();
            }
        } catch (SQLException e) {
            Logger.getLogger(MenuPengembalian.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void insertDataDetail() {
        String idPengembalian = jtxt_idpeminjam.getText();
        String idBuku = jtxt_idbuku.getText();
        String jumlahKembali = jtxt_jumlahkembali.getText();
        String jumlahDenda = jtxt_denda.getText();

        try {
            String sql = "INSERT INTO detail_pengembalian (ID_Pengembalian, ID_Buku, Jumlah_Kembali,Jumlah_Denda) VALUES (?, ?, ?, ?)";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, idPengembalian);
                st.setString(2, idBuku);
                st.setString(3, jumlahKembali);
                st.setString(4, jumlahDenda);
                
                st.executeUpdate();
            }
        } 
        
        catch (SQLException e) {
            Logger.getLogger(MenuPengembalian.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void updateStatus(){
        String idPeminjaman = jtxt_idpeminjaman.getText();
        String idBuku = jtxt_idbuku.getText();
        String statusPeminjaman = "Sudah dikembalikan";

        try{
            String sql = "UPDATE detail_peminjaman SET Status_Peminjaman = ? WHERE ID_Peminjaman = ? AND ID_Buku = ?";

            try(PreparedStatement st = conn.prepareStatement(sql)){
                st.setString(1, statusPeminjaman);
                st.setString(2, idPeminjaman);
                st.setString(3, idBuku);

                st.executeUpdate();
            }
        }

        catch(Exception e){
            Logger.getLogger(MenuPengembalian.class.getName()).log(Level.SEVERE, null, e);
        }    
    }
    
    private void resetForm() {
       jtxt_idpeminjam.setText("");
       jtxt_tanggalaktual.setText("");
       jtxt_idpeminjam.setText("");
       jtxt_tanggalpinjam.setText("");
       jtxt_tanggalkembali.setText("");
       jtxt_idanggota.setText("");
       jtxt_idbuku.setText("");
       jtxt_judul.setText("");
       jtxt_pengarang.setText("");
       jtxt_penerbit.setText("");
       jtxt_denda.setText("");
    }


    private void searchData() {
        String keyWord = txt_cari.getText();
        
        DefaultTableModel model = (DefaultTableModel)tbl_data.getModel();
        model.setRowCount(0);
        
        try{
            String sql = "SELECT * FROM pengembalian png " +
                    "INNER JOIN peminjaman pmj ON pmj.ID_Peminjaman = png.ID_Peminjaman " +
                    "INNER JOIN USER usr ON usr.ID_User = png.ID_User " +
                    "WHERE png.ID_Pengembalian LIKE ? OR pmj.ID_Peminjaman LIKE ?";
            
            try(PreparedStatement st = conn.prepareStatement(sql)){
               st.setString(1, "%" + keyWord + "%");
               st.setString(2, "%" + keyWord + "%");
               
               ResultSet rs = st.executeQuery(); 
               
               while (rs.next()) {
                    String idPengembalian = rs.getString("ID_Pengembalian");
                    String tanggalDikembalikan = rs.getString("Tanggal_Dikembalikan");
                    String idPeminjaman = rs.getString("ID_Peminjaman");
                    String namaUser = rs.getString("Nama_User");

                    Object[] rowData = {idPengembalian, tanggalDikembalikan, idPeminjaman, namaUser};
                    model.addRow(rowData);
                }
            }
        }
        
        catch(Exception e){
            Logger.getLogger(MenuPengembalian.class.getName()).log(Level.SEVERE, null, e);
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
            String sql = "SELECT COUNT(*) AS total FROM pengembalian";
            try(PreparedStatement st = conn.prepareStatement(sql)){
                ResultSet rs = st.executeQuery();
                if(rs.next()){
                    totalData = rs.getInt("total");
                }
            }
        }
        catch(Exception e){
            Logger.getLogger(MenuPengembalian.class.getName()).log(Level.SEVERE, null, e);
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
            Logger.getLogger(MenuPengembalian.class.getName()).log(Level.SEVERE, null, e);
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