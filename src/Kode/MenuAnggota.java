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



        
public class MenuAnggota extends javax.swing.JPanel {
    
    private static final String ID_Anggota = "id_anggota";
    private static final String Nama_Anggota = "nama_anggota";
    private static final String Email = "email";
    private static final String Telepon = "telepon";
    private static final String Tanggal_Bergabung = "tanggal_bergabung";
    private static final String Jenis_Kelamin = "jenis_kelamin";
    
    private int halamanSaatIni = 1;
    private int dataPerHalaman = 10;
    private int totalPages;

    private final Connection conn;
    private String setIDAnggota;
    
    public MenuAnggota() {
        JTextField jtxt_id = new JTextField();
        initComponents();
        
        conn = Koneksi.getConnection();
        setTabelModel();
        loadData();
        paginationAnggota();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser1 = new com.raven.datechooser.DateChooser();
        rbg_jenisKelamin = new javax.swing.ButtonGroup();
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
        btn_tambah = new rojerusan.RSMaterialButtonRectangle();
        btn_hapus = new rojerusan.RSMaterialButtonRectangle();
        btn_batal = new rojerusan.RSMaterialButtonRectangle();
        txt_cari = new property.JtextfieldroundedCustom();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_data = new javax.swing.JTable();
        jpn_add = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_simpan = new rojerusan.RSMaterialButtonRectangle();
        btn_btl = new rojerusan.RSMaterialButtonRectangle();
        jtxt_id = new property.JtextfieldroundedCustom();
        jLabel16 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtxt_email = new property.JtextfieldroundedCustom();
        jLabel11 = new javax.swing.JLabel();
        jtxt_nama = new property.JtextfieldroundedCustom();
        jLabel12 = new javax.swing.JLabel();
        jtxt_tlp = new property.JtextfieldroundedCustom();
        jLabel13 = new javax.swing.JLabel();
        jtxt_tgl = new property.JtextfieldroundedCustom();
        jLabel14 = new javax.swing.JLabel();
        jrb_laki = new javax.swing.JRadioButton();
        jrb_perempuan = new javax.swing.JRadioButton();

        dateChooser1.setDateFormat("yyyy-MM-dd");
        dateChooser1.setTextRefernce(jtxt_tgl);

        setPreferredSize(new java.awt.Dimension(1325, 887));
        setLayout(new java.awt.CardLayout());

        jpn_main.setBackground(new java.awt.Color(255, 255, 255));
        jpn_main.setPreferredSize(new java.awt.Dimension(1325, 887));
        jpn_main.setLayout(new java.awt.CardLayout());

        jpn_view.setBackground(new java.awt.Color(255, 255, 255));
        jpn_view.setPreferredSize(new java.awt.Dimension(1325, 887));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("MASTER DATA > ANGGOTA");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 51));
        jLabel2.setText("Data Anggota Perpustakaan");

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
        jlbl_halaman.setText("Halaman   of Total Halaman ");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-friends-30.png"))); // NOI18N

        btn_tambah.setBackground(new java.awt.Color(51, 0, 204));
        btn_tambah.setText("TAMBAH");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_hapus.setBackground(new java.awt.Color(204, 0, 51));
        btn_hapus.setText("HAPUS");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
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
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cariKeyTyped(evt);
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
        tbl_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_dataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_data);

        javax.swing.GroupLayout jpn_viewLayout = new javax.swing.GroupLayout(jpn_view);
        jpn_view.setLayout(jpn_viewLayout);
        jpn_viewLayout.setHorizontalGroup(
            jpn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_viewLayout.createSequentialGroup()
                .addGroup(jpn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpn_viewLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jpn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jpn_viewLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 901, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jpn_viewLayout.createSequentialGroup()
                                    .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpn_viewLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
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
                                .addComponent(jcbx_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(431, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlbl_halaman)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_firts, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_previous, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_last, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbx_data))
                .addGap(250, 250, 250))
        );

        jpn_main.add(jpn_view, "card2");

        jpn_add.setBackground(new java.awt.Color(255, 255, 255));
        jpn_add.setPreferredSize(new java.awt.Dimension(1325, 887));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 51));
        jLabel6.setText("ID");

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 51));
        jLabel7.setText("Tambah Data Anggota Perpustakaan");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-dashboard-30.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-friends-30.png"))); // NOI18N

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

        jtxt_id.setLineColor(new java.awt.Color(153, 0, 51));
        jtxt_id.setPlaceholder("Masukkan Id Anggota");
        jtxt_id.setSelectionColor(new java.awt.Color(153, 0, 51));
        jtxt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_idActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 0, 51));
        jLabel16.setText("MASTER DATA > ANGGOTA");

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 51));
        jLabel9.setText("NAMA");

        jtxt_email.setLineColor(new java.awt.Color(153, 0, 51));
        jtxt_email.setPlaceholder("Masukkan Nama Anggota");
        jtxt_email.setSelectionColor(new java.awt.Color(153, 0, 51));
        jtxt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_emailActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 0, 51));
        jLabel11.setText("EMAIL");

        jtxt_nama.setLineColor(new java.awt.Color(153, 0, 51));
        jtxt_nama.setPlaceholder("Masukkan Id Anggota");
        jtxt_nama.setSelectionColor(new java.awt.Color(153, 0, 51));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 0, 51));
        jLabel12.setText("TELEPHONE");

        jtxt_tlp.setLineColor(new java.awt.Color(153, 0, 51));
        jtxt_tlp.setPlaceholder("Masukkan Nomor Telephone");
        jtxt_tlp.setSelectionColor(new java.awt.Color(153, 0, 51));
        jtxt_tlp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_tlpActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 0, 51));
        jLabel13.setText("TANGGAL BERGABUNG");

        jtxt_tgl.setLineColor(new java.awt.Color(153, 0, 51));
        jtxt_tgl.setPlaceholder("Masukkan Tanggal bergabung");
        jtxt_tgl.setSelectionColor(new java.awt.Color(153, 0, 51));
        jtxt_tgl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_tglActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 0, 51));
        jLabel14.setText("JENIS KELAMIN");

        rbg_jenisKelamin.add(jrb_laki);
        jrb_laki.setText("Laki - Laki");

        rbg_jenisKelamin.add(jrb_perempuan);
        jrb_perempuan.setText("Perempuan");

        javax.swing.GroupLayout jpn_addLayout = new javax.swing.GroupLayout(jpn_add);
        jpn_add.setLayout(jpn_addLayout);
        jpn_addLayout.setHorizontalGroup(
            jpn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_addLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jpn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(jpn_addLayout.createSequentialGroup()
                        .addComponent(jrb_laki)
                        .addGap(32, 32, 32)
                        .addComponent(jrb_perempuan)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpn_addLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jpn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpn_addLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jpn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel9)
                            .addGroup(jpn_addLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jpn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel6)))))
                    .addComponent(jtxt_tlp, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpn_addLayout.createSequentialGroup()
                        .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_btl, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpn_addLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addComponent(jtxt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_tgl, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(743, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_addLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(424, 424, 424))
        );
        jpn_addLayout.setVerticalGroup(
            jpn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_addLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jpn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(jpn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jpn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_btl, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxt_tlp, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxt_tgl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrb_perempuan)
                    .addComponent(jrb_laki))
                .addGap(202, 202, 202))
        );

        jpn_main.add(jpn_add, "card2");

        add(jpn_main, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        jpn_main.removeAll();
        jpn_main.add(jpn_add);
        jpn_main.repaint();
        jpn_main.revalidate();

        jtxt_id.setText(setIDAnggota());

        if(btn_tambah.getText().equals("UBAH")){
            dataTabel();
            btn_simpan.setText("PERBARUI");
        }
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        deleteData();
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        showPanel();
        loadData();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void btn_btlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_btlActionPerformed
        showPanel();
        loadData();
    }//GEN-LAST:event_btn_btlActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        if(btn_simpan.getText().equals("TAMBAH") || btn_simpan.getText().equals("SIMPAN")){
            insertData();
        
        } 
        else if (btn_simpan.getText().equals("PERBARUI")){
            updateData();
        }
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void jtxt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_emailActionPerformed
       
    }//GEN-LAST:event_jtxt_emailActionPerformed

    private void jtxt_tlpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_tlpActionPerformed
        
    }//GEN-LAST:event_jtxt_tlpActionPerformed

    private void jtxt_tglActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_tglActionPerformed
        
    }//GEN-LAST:event_jtxt_tglActionPerformed

    private void txt_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cariActionPerformed

    private void jtxt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_idActionPerformed

    private void tbl_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dataMouseClicked
        if(btn_tambah.getText().equals("TAMBAH")){
            btn_tambah.setText("UBAH");
            btn_hapus.setVisible(true);
            btn_batal.setVisible(true);
        }
    }//GEN-LAST:event_tbl_dataMouseClicked

    private void txt_cariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cariKeyTyped
        searchData();
    }//GEN-LAST:event_txt_cariKeyTyped

    private void btn_previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_previousActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_previousActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btn_batal;
    private rojerusan.RSMaterialButtonRectangle btn_btl;
    private javax.swing.JButton btn_firts;
    private rojerusan.RSMaterialButtonRectangle btn_hapus;
    private javax.swing.JButton btn_last;
    private javax.swing.JButton btn_next;
    private javax.swing.JButton btn_previous;
    private rojerusan.RSMaterialButtonRectangle btn_simpan;
    private rojerusan.RSMaterialButtonRectangle btn_tambah;
    private com.raven.datechooser.DateChooser dateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jcbx_data;
    private javax.swing.JLabel jlbl_halaman;
    private javax.swing.JPanel jpn_add;
    private javax.swing.JPanel jpn_main;
    private javax.swing.JPanel jpn_view;
    private javax.swing.JRadioButton jrb_laki;
    private javax.swing.JRadioButton jrb_perempuan;
    private property.JtextfieldroundedCustom jtxt_email;
    private property.JtextfieldroundedCustom jtxt_id;
    private property.JtextfieldroundedCustom jtxt_nama;
    private property.JtextfieldroundedCustom jtxt_tgl;
    private property.JtextfieldroundedCustom jtxt_tlp;
    private javax.swing.ButtonGroup rbg_jenisKelamin;
    private javax.swing.JTable tbl_data;
    private property.JtextfieldroundedCustom txt_cari;
    // End of variables declaration//GEN-END:variables

    private void loadData(){
        calculateTotalPages();
        int totalData = getTotalData();
        jlbl_halaman.setText(String.valueOf("Halaman" + halamanSaatIni + "dari Total Data" + totalData));
        
        int startIndex = (halamanSaatIni - 1) * dataPerHalaman;
        getData(startIndex, dataPerHalaman, (DefaultTableModel) tbl_data.getModel());
            btn_hapus.setVisible(false);
            btn_batal.setVisible(false);
    }
    
    private void showPanel(){
        jpn_main.removeAll();
        jpn_main.add(new MenuAnggota());
        jpn_main.repaint();
        jpn_main.revalidate();
    }
    
    private void setTabelModel(){
        DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
        model.addColumn("ID ANGGOTA");
        model.addColumn("NAMA");
        model.addColumn("EMAIL");
        model.addColumn("TELEPON");
        model.addColumn("TANGGAL BERGABUNG");
        model.addColumn("JENIS KELAMIN");
    }

    private void getData(int startIndex, int entriesPage, DefaultTableModel model) {
        model.setRowCount(0);
        
        try{
            String sql = "SELECT * FROM anggota LIMIT ?,?";
            try(PreparedStatement st = conn.prepareStatement(sql)){
               st.setInt(1, startIndex);
               st.setInt(2, entriesPage);
               ResultSet rs = st.executeQuery(); 
               
               while(rs.next()){
                   String idAnggota = rs.getString(ID_Anggota);
                   String namaAnggota = rs.getString(Nama_Anggota);
                   String emailAnggota = rs.getString(Email);
                   String teleponAnggota = rs.getString(Telepon);
                   String tanggalBergabung = rs.getString(Tanggal_Bergabung);
                   String jenisKelamin = rs.getString(Jenis_Kelamin);
                   
                   Object[] rowData = {idAnggota, namaAnggota, emailAnggota, teleponAnggota, tanggalBergabung, jenisKelamin};
                   model.addRow(rowData);
               }
            }
        }
        
        catch(Exception e){
            Logger.getLogger(MenuAnggota.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private String setIDAnggota() {
        String urutan = null;
        Date now = new Date();
        SimpleDateFormat noFormat = new SimpleDateFormat("yyMM");
        String no = noFormat.format(now);

        String sql = "SELECT RIGHT(ID_Anggota, 3) AS Nomor " +
                     "FROM anggota " +
                     "WHERE ID_Anggota LIKE 'USK" + no + "%' " +
                     "ORDER BY Nomor DESC " +
                     "LIMIT 1";

        try (PreparedStatement st = conn.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                int nomor = Integer.parseInt(rs.getString("Nomor"));
                nomor++;
                urutan = "USK" + no + String.format("%03d", nomor);
            } else {
                urutan = "USK" + no + "001";
            }
        } catch (SQLException e) {
            Logger.getLogger(MenuAnggota.class.getName()).log(Level.SEVERE, null, e);
        }
        return urutan;
    }


    private void insertData() {
        String idAnggota = setIDAnggota();
        String namaAnggota = jtxt_nama.getText();
        String emailAnggota = jtxt_email.getText();
        String teleponAnggota = jtxt_tlp.getText();
        String tanggalBergabungStr = jtxt_tgl.getText();
        String jenisKelamin;

        SimpleDateFormat inputFormat = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date tanggalBergabung = null;
        
            try {
                tanggalBergabung = inputFormat.parse(tanggalBergabungStr);
                tanggalBergabungStr = outputFormat.format(tanggalBergabung);
            } 

            catch (ParseException e) {
                e.printStackTrace();
            }

    
            if(jrb_laki.isSelected()){
                jenisKelamin = jrb_laki.getText();
            } 

            else if(jrb_perempuan.isSelected()){
                jenisKelamin = jrb_perempuan.getText();
            } 

            else {
                jenisKelamin = "";
            }

    
        if(namaAnggota.isEmpty() || emailAnggota.isEmpty() || teleponAnggota.isEmpty() || tanggalBergabungStr.isEmpty() || jenisKelamin.isEmpty()){
            JOptionPane.showMessageDialog(this, "Semua Kolom Wajib Diisi !!!", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try{
            String sqlCheck = "SELECT ID_Anggota FROM anggota WHERE ID_Anggota = ?";
            try (PreparedStatement stCheck = conn.prepareStatement(sqlCheck)) {
                stCheck.setString(1, idAnggota);
                ResultSet rsCheck = stCheck.executeQuery();
                if (rsCheck.next()) {
                    JOptionPane.showMessageDialog(this, "ID Anggota sudah ada dalam database. Silakan coba lagi.", "Valisasi", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            
        String sql = "INSERT INTO anggota (ID_Anggota, Nama_Anggota, Email, Telepon, Tanggal_Bergabung, Jenis_Kelamin) VALUES (?, ?, ?, ?, ?, ?)";
            try(PreparedStatement st = conn.prepareStatement(sql)){
                st.setString(1, idAnggota);
                st.setString(2, namaAnggota);
                st.setString(3, emailAnggota);
                st.setString(4, teleponAnggota);
                st.setString(5, tanggalBergabungStr);
                st.setString(6, jenisKelamin);

                int rowInserted = st.executeUpdate();

                if(rowInserted > 0){
                    JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan");
                        resetForm();
                        loadData();
                        showPanel();
                }
            }
        } 
        catch(SQLException e){
        Logger.getLogger(MenuAnggota.class.getName()).log(Level.SEVERE, null, e);
        }
    }


    private void updateData() {
        String idAnggota = jtxt_id.getText();
        String namaAnggota = jtxt_nama.getText();
        String emailAnggota = jtxt_email.getText();
        String teleponAnggota = jtxt_tlp.getText();
        String tanggalBergabungStr = jtxt_tgl.getText();
        String jenisKelamin = "";

        SimpleDateFormat inputFormat = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date tanggalBergabung = null;

        try {
            tanggalBergabung = inputFormat.parse(tanggalBergabungStr);
            tanggalBergabungStr = outputFormat.format(tanggalBergabung);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Format tanggal tidak valid.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (jrb_laki.isSelected()) {
            jenisKelamin = jrb_laki.getText();
        } else if (jrb_perempuan.isSelected()) {
            jenisKelamin = jrb_perempuan.getText();
        } else {
            JOptionPane.showMessageDialog(this, "Jenis kelamin belum dipilih.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (namaAnggota.isEmpty() || emailAnggota.isEmpty() || teleponAnggota.isEmpty() || tanggalBergabungStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom wajib diisi.", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            // Periksa apakah ID Anggota sudah ada dalam database
            String sqlCheck = "SELECT ID_Anggota FROM anggota WHERE ID_Anggota = ?";
            try (PreparedStatement stCheck = conn.prepareStatement(sqlCheck)) {
                stCheck.setString(1, idAnggota);
                ResultSet rsCheck = stCheck.executeQuery();
                if (!rsCheck.next()) {
                    JOptionPane.showMessageDialog(this, "ID Anggota tidak ditemukan dalam database. Silakan tambahkan data baru.", "Validasi", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            // Lakukan pembaruan data
            String sql = "UPDATE anggota SET Nama_Anggota=?, Email=?, Telepon=?, Tanggal_bergabung=?, Jenis_Kelamin=? WHERE ID_Anggota=?";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, namaAnggota);
                st.setString(2, emailAnggota);
                st.setString(3, teleponAnggota);
                st.setString(4, tanggalBergabungStr);
                st.setString(5, jenisKelamin);
                st.setString(6, idAnggota);

                int rowUpdated = st.executeUpdate();
                if (rowUpdated > 0) {
                    JOptionPane.showMessageDialog(this, "Data berhasil diperbarui.");
                    resetForm();
                    loadData();
                    showPanel();
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
       jtxt_email.setText("");
       jtxt_tlp.setText("");
       jtxt_tgl.setText("");
       rbg_jenisKelamin.clearSelection();
    }

    private void dataTabel() {
        jpn_view.setVisible(false);
        jpn_add.setVisible(true);

        int row = tbl_data.getSelectedRow();
        jLabel7.setText("Perbarui Data Anggota Perpustakaan");

        jtxt_id.setEnabled(false);
        jtxt_tgl.setEnabled(false);

        jtxt_id.setText(tbl_data.getValueAt(row, 0).toString());
        jtxt_nama.setText(tbl_data.getValueAt(row, 1).toString());
        jtxt_email.setText(tbl_data.getValueAt(row, 2).toString());
        jtxt_tlp.setText(tbl_data.getValueAt(row, 3).toString());
        jtxt_tgl.setText(tbl_data.getValueAt(row, 4).toString());

        String jenisKelamin = tbl_data.getValueAt(row, 5).toString();
        if(jenisKelamin.equals("Laki - Laki")){
            jrb_laki.setSelected(true);
        }

        else if(jenisKelamin.equals("Perempuan")){
            jrb_perempuan.setSelected(true);
        }
    }

    private void deleteData() {
        int selectedRow = tbl_data.getSelectedRow();
        int confirm = JOptionPane.showConfirmDialog
            (this, "Apakah Anda yakin ingin Menghapus Data ?",
                    "Konfirmasi Hapus Data",JOptionPane.YES_NO_OPTION);
        
        if(confirm == JOptionPane.YES_OPTION){
            String id = tbl_data.getValueAt(selectedRow, 0).toString();
            try{
                String sql = "DELETE from anggota WHERE ID_Anggota = ?";
                try(PreparedStatement st = conn.prepareStatement(sql)){
                    st.setString(1, id);
                    
                    int rowDeleted = st.executeUpdate();
                    if(rowDeleted > 0){
                        JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
                    }
                    else{
                       JOptionPane.showMessageDialog(this, "Data Gagal Ditambahkan");
                    }
                    
                }
            }
    
            catch(Exception e){
                Logger.getLogger(MenuAnggota.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        resetForm();
        loadData();
        showPanel();
    }

    private void searchData() {
        String keyWord = txt_cari.getText();
        
        DefaultTableModel model = (DefaultTableModel)tbl_data.getModel();
        model.setRowCount(0);
        
        try{
            String sql = "SELECT * FROM anggota WHERE ID_Anggota LIKE ? OR Nama_Anggota LIKE ? OR Email LIKE ?" ;
            try(PreparedStatement st = conn.prepareStatement(sql)){
               st.setString(1, "%" + keyWord + "%");
               st.setString(2, "%" + keyWord + "%");
               st.setString(3, "%" + keyWord + "%");
               
               ResultSet rs = st.executeQuery(); 
               
               while(rs.next()){
                   String idAnggota = rs.getString(ID_Anggota);
                   String namaAnggota = rs.getString(Nama_Anggota);
                   String emailAnggota = rs.getString(Email);
                   String teleponAnggota = rs.getString(Telepon);
                   String tanggalBergabung = rs.getString(Tanggal_Bergabung);
                   String jenisKelamin = rs.getString(Jenis_Kelamin);
                   
                   Object[] rowData = {idAnggota, namaAnggota, emailAnggota, teleponAnggota, tanggalBergabung, jenisKelamin};
                   model.addRow(rowData);
               }
            }
        }
        
        catch(Exception e){
            Logger.getLogger(MenuAnggota.class.getName()).log(Level.SEVERE, null, e);
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
            String sql = "SELECT COUNT(*) AS total FROM anggota";
            try(PreparedStatement st = conn.prepareStatement(sql)){
                ResultSet rs = st.executeQuery();
                if(rs.next()){
                    totalData = rs.getInt("total");
                }
            }
        }
        catch(Exception e){
            Logger.getLogger(MenuAnggota.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return totalData;
    }
 }