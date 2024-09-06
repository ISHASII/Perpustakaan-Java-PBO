package Kode;

import Koneksi.Koneksi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;


        
public class MenuBuku extends javax.swing.JPanel {
    
    private String ID_Buku = "id_Buku";
    private String Nama_Buku = "nama_Buku";
    private String Pengarang_Buku = "pengarang_Buku";
    private String Tahun_Terbit = "tahun_Terbit";
    private String idKategori;
    private String idPenerbit;
    
    private int halamanSaatIni = 1;
    private int dataPerHalaman = 10;
    private int totalPages;

    private final Connection conn;
    private String setIDBuku;
    
    public MenuBuku() {
        JTextField jtxt_id = new JTextField();
        initComponents();
        
        conn = Koneksi.getConnection();
        setTabelModel();
        loadData();
        paginationBuku();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jtxt_pengarang = new property.JtextfieldroundedCustom();
        jLabel11 = new javax.swing.JLabel();
        jtxt_nama = new property.JtextfieldroundedCustom();
        jLabel12 = new javax.swing.JLabel();
        jtxt_tahunterbit = new property.JtextfieldroundedCustom();
        jLabel15 = new javax.swing.JLabel();
        jcb_kategori = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jcb_penerbit = new javax.swing.JComboBox<>();
        jtxt_stok = new property.JtextfieldroundedCustom();
        jLabel17 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1325, 887));
        setLayout(new java.awt.CardLayout());

        jpn_main.setBackground(new java.awt.Color(255, 255, 255));
        jpn_main.setPreferredSize(new java.awt.Dimension(1325, 887));
        jpn_main.setLayout(new java.awt.CardLayout());

        jpn_view.setBackground(new java.awt.Color(255, 255, 255));
        jpn_view.setPreferredSize(new java.awt.Dimension(1325, 887));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("MASTER DATA > BUKU");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 51));
        jLabel2.setText("Data Buku");

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
        jlbl_halaman.setText("Halaman   of   Total Halaman");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-book-30.png"))); // NOI18N

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
                .addContainerGap(402, Short.MAX_VALUE))
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
        jLabel7.setText("Tambah Data Buku");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-dashboard-30.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-book-30.png"))); // NOI18N

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
        jtxt_id.setPlaceholder("Masukkan Id Buku");
        jtxt_id.setSelectionColor(new java.awt.Color(153, 0, 51));
        jtxt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_idActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 0, 51));
        jLabel16.setText("MASTER DATA > BUKU");

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 51));
        jLabel9.setText("NAMA");

        jtxt_pengarang.setLineColor(new java.awt.Color(153, 0, 51));
        jtxt_pengarang.setPlaceholder("Masukkan Nama Pengarang");
        jtxt_pengarang.setSelectionColor(new java.awt.Color(153, 0, 51));
        jtxt_pengarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_pengarangActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 0, 51));
        jLabel11.setText("PENGARANG");

        jtxt_nama.setLineColor(new java.awt.Color(153, 0, 51));
        jtxt_nama.setPlaceholder("Masukkan Nama Buku");
        jtxt_nama.setSelectionColor(new java.awt.Color(153, 0, 51));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 0, 51));
        jLabel12.setText("PENERBIT");

        jtxt_tahunterbit.setLineColor(new java.awt.Color(153, 0, 51));
        jtxt_tahunterbit.setPlaceholder("Masukkan Tahun Terbit");
        jtxt_tahunterbit.setSelectionColor(new java.awt.Color(153, 0, 51));
        jtxt_tahunterbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_tahunterbitActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 0, 51));
        jLabel15.setText("TAHUN TERBIT");

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 0, 51));
        jLabel13.setText("KATEGORI");

        jtxt_stok.setLineColor(new java.awt.Color(153, 0, 51));
        jtxt_stok.setPlaceholder("Masukkan Stok Buku");
        jtxt_stok.setSelectionColor(new java.awt.Color(153, 0, 51));
        jtxt_stok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_stokActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 0, 51));
        jLabel17.setText("STOK BUKU");

        javax.swing.GroupLayout jpn_addLayout = new javax.swing.GroupLayout(jpn_add);
        jpn_add.setLayout(jpn_addLayout);
        jpn_addLayout.setHorizontalGroup(
            jpn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_addLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jpn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxt_stok, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel13)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jtxt_tahunterbit, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_pengarang, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jLabel15)
                    .addComponent(jLabel12)
                    .addGroup(jpn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jcb_penerbit, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcb_kategori, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(363, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_addLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195))
        );
        jpn_addLayout.setVerticalGroup(
            jpn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_addLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel8))
                .addGap(1, 1, 1)
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
                .addComponent(jtxt_pengarang, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxt_tahunterbit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcb_kategori, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcb_penerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxt_stok, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
        );

        jpn_main.add(jpn_add, "card2");

        add(jpn_main, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        jpn_main.removeAll();
        jpn_main.add(jpn_add);
        jpn_main.repaint();
        jpn_main.revalidate();

        jtxt_id.setText(setIDBuku());

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

    private void jtxt_pengarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_pengarangActionPerformed
       
    }//GEN-LAST:event_jtxt_pengarangActionPerformed

    private void jtxt_tahunterbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_tahunterbitActionPerformed
        
    }//GEN-LAST:event_jtxt_tahunterbitActionPerformed

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

    private void jtxt_stokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_stokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_stokActionPerformed
    
    
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jcb_kategori;
    private javax.swing.JComboBox<String> jcb_penerbit;
    private javax.swing.JComboBox<String> jcbx_data;
    private javax.swing.JLabel jlbl_halaman;
    private javax.swing.JPanel jpn_add;
    private javax.swing.JPanel jpn_main;
    private javax.swing.JPanel jpn_view;
    private property.JtextfieldroundedCustom jtxt_id;
    private property.JtextfieldroundedCustom jtxt_nama;
    private property.JtextfieldroundedCustom jtxt_pengarang;
    private property.JtextfieldroundedCustom jtxt_stok;
    private property.JtextfieldroundedCustom jtxt_tahunterbit;
    private javax.swing.JTable tbl_data;
    private property.JtextfieldroundedCustom txt_cari;
    // End of variables declaration//GEN-END:variables

    private void loadData(){
        getKategori();
        getPenerbit();
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
        jpn_main.add(new MenuBuku());
        jpn_main.repaint();
        jpn_main.revalidate();
    }
    
    private void setTabelModel(){
        DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
        model.addColumn("ID Buku");
        model.addColumn("NAMA");
        model.addColumn("PENGARANG BUKU");
        model.addColumn("TAHUN TERBIT");
        model.addColumn("ID KATEGORI");
        model.addColumn("ID PENERBIT");
        model.addColumn("NAMA KATEGORI");
        model.addColumn("NAMA PENERBIT");
        model.addColumn("STOK");
    }

    private void getData(int startIndex, int entriesPage, DefaultTableModel model) {
        model.setRowCount(0);

        try {
            String sql = "SELECT bk.ID_Buku, bk.Judul_Buku, bk.Pengarang_Buku, bk.Tahun_Terbit, bk.ID_Kategori, ktg.Nama_Kategori, bk.ID_Penerbit, pnb.Nama_Penerbit, bk.Stok\n" +
                         "FROM buku bk\n" +
                         "INNER JOIN kategori ktg ON ktg.ID_Kategori = bk.ID_Kategori\n" +
                         "INNER JOIN penerbit pnb ON pnb.ID_Penerbit = bk.ID_Penerbit\n" +
                         "ORDER BY bk.ID_Buku ASC LIMIT ?, ?";

            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setInt(1, startIndex);
                st.setInt(2, entriesPage);
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    String idBuku = rs.getString("ID_Buku");
                    String namaBuku = rs.getString("Judul_Buku");
                    String pengarangBuku = rs.getString("Pengarang_Buku");
                    String tahunTerbit = rs.getString("Tahun_Terbit");
                    String idKategori = rs.getString("ID_Kategori");
                    String namaKategori = rs.getString("Nama_Kategori");
                    String idPenerbit = rs.getString("ID_Penerbit");
                    String namaPenerbit = rs.getString("Nama_Penerbit");
                    int stokBuku = rs.getInt("Stok");

                    Object[] rowData = {idBuku, namaBuku, pengarangBuku, tahunTerbit, idKategori, idPenerbit, namaKategori, namaPenerbit, stokBuku};
                    model.addRow(rowData);
                }
            }
        } 
        
        catch (SQLException e) {
            Logger.getLogger(MenuBuku.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private String setIDBuku() {
        String urutan = null;
        Date now = new Date();
        SimpleDateFormat noFormat = new SimpleDateFormat("yyMM");
        String no = noFormat.format(now);

        String sql = "SELECT RIGHT(ID_Buku, 3) AS Nomor " +
                     "FROM buku " +
                     "WHERE ID_Buku LIKE 'BKU" + no + "%' " +
                     "ORDER BY Nomor DESC " +
                     "LIMIT 1";

        try (PreparedStatement st = conn.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                int nomor = Integer.parseInt(rs.getString("Nomor"));
                nomor++;
                urutan = "BKU" + no + String.format("%03d", nomor);
            } else {
                urutan = "BKU" + no + "001";
            }
        } catch (SQLException e) {
            Logger.getLogger(MenuBuku.class.getName()).log(Level.SEVERE, null, e);
        }
        return urutan;
    }
    
    private void getKategori(){
        try{
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
            model.addElement("Pilih Kategori");
    
            String sql = "SELECT ID_Kategori, Nama_Kategori FROM kategori";
            PreparedStatement st = conn.prepareStatement(sql,
                                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY); 
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                String idKategori = rs.getString("ID_Kategori");
                String namaKategori = rs.getString("Nama_Kategori");
                model.addElement(namaKategori);
            }
            
            jcb_kategori.setModel(model);
            jcb_kategori.addActionListener(e ->{
                int selectIndex = jcb_kategori.getSelectedIndex();
                
                    if(selectIndex > 0){
                        try{
                            rs.absolute(selectIndex);
                            idKategori = rs.getString("ID_Kategori");
                            
                        }
                        catch(SQLException x){
                            x.printStackTrace();
                        }
                    } 
            });
            jcb_kategori.setModel(model);
        }
        
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    private void getPenerbit(){
        try{
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
            model.addElement("Pilih Penerbit");
    
            String sql = "SELECT ID_Penerbit, Nama_Penerbit FROM penerbit";
            PreparedStatement st = conn.prepareStatement(sql,
                                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY); 
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                String idPenerbit = rs.getString("ID_Penerbit");
                String namaPenerbit = rs.getString("Nama_Penerbit");
                model.addElement(namaPenerbit);
            }
            
            jcb_penerbit.setModel(model);
            jcb_penerbit.addActionListener(e ->{
                int selectIndex = jcb_penerbit.getSelectedIndex();
                
                    if(selectIndex > 0){
                        try{
                            rs.absolute(selectIndex);
                            idPenerbit = rs.getString("ID_Penerbit");
                            
                        }
                        catch(SQLException x){
                            x.printStackTrace();
                        }
                    } 
            });
            jcb_penerbit.setModel(model);
        }
        
        catch(Exception e){
            e.printStackTrace();
        }
    }

    private void insertData() {
        String idBuku = setIDBuku();
        String namaBuku = jtxt_nama.getText();
        String pengarangBuku = jtxt_pengarang.getText();
        String tahunTerbit = jtxt_tahunterbit.getText();
        String kategori = jcb_kategori.getSelectedItem().toString();
        String penerbit = jcb_penerbit.getSelectedItem().toString();
        String stokBuku = jtxt_stok.getText().toString();

        if (namaBuku.isEmpty() || pengarangBuku.isEmpty() || tahunTerbit.isEmpty() ||
            "Pilih Kategori".equals(kategori) || "Pilih Penerbit".equals(penerbit) || stokBuku.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua Kolom Wajib Diisi !!!", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            String sqlCheck = "SELECT ID_Buku FROM buku WHERE ID_Buku = ?";
            try (PreparedStatement stCheck = conn.prepareStatement(sqlCheck)) {
                stCheck.setString(1, idBuku);
                ResultSet rsCheck = stCheck.executeQuery();
                if (rsCheck.next()) {
                    JOptionPane.showMessageDialog(this, "ID Buku sudah ada dalam database. Silakan coba lagi.", "Validasi", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                rsCheck.close();
            }

            String sql = "INSERT INTO buku (ID_Buku, Judul_Buku, Pengarang_Buku, Tahun_Terbit, ID_Kategori, ID_Penerbit, Stok) VALUES (?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, idBuku);
                st.setString(2, namaBuku);
                st.setString(3, pengarangBuku);
                st.setString(4, tahunTerbit);
                st.setString(5, idKategori);
                st.setString(6, idPenerbit); 
                st.setString(7, stokBuku); 

                int rowInserted = st.executeUpdate();

                if (rowInserted > 0) {
                    JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan");
                    resetForm();
                    loadData();
                    showPanel();
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(MenuBuku.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void updateData() {
        String idBuku = jtxt_id.getText();
        String namaBuku = jtxt_nama.getText();
        String pengarangBuku = jtxt_pengarang.getText();
        String tahunTerbit = jtxt_tahunterbit.getText();
        String kategori = jcb_kategori.getSelectedItem().toString();
        String penerbit = jcb_penerbit.getSelectedItem().toString();
        int stokBuku = Integer.parseInt(jtxt_stok.getText());

        if (namaBuku.isEmpty() || pengarangBuku.isEmpty() || tahunTerbit.isEmpty() ||
            "Pilih Kategori".equals(kategori) || "Pilih Penerbit".equals(penerbit)) {
            JOptionPane.showMessageDialog(this, "Semua Kolom Wajib Dipilih !!!", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            String idKategori = getIDKategori(kategori);
            String idPenerbit = getIDPenerbit(penerbit);

            if (idKategori == null || idPenerbit == null) {
                JOptionPane.showMessageDialog(this, "ID Kategori atau ID Penerbit tidak ditemukan.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String sql = "UPDATE buku SET Judul_Buku=?, Pengarang_Buku=?, Tahun_Terbit=?, ID_Kategori=?, ID_Penerbit=?, Stok=? WHERE ID_Buku=?";

            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, namaBuku);
                st.setString(2, pengarangBuku);
                st.setString(3, tahunTerbit);
                st.setString(4, idKategori);
                st.setString(5, idPenerbit);
                st.setInt(6, stokBuku);
                st.setString(7, idBuku);

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
       jtxt_pengarang.setText("");
       jtxt_tahunterbit.setText("");
    }

    private void dataTabel() {
        jpn_view.setVisible(false);
        jpn_add.setVisible(true);

        int row = tbl_data.getSelectedRow();
        jLabel7.setText("Perbarui Data Buku Perpustakaan");

        jtxt_id.setEnabled(false);
        String id = tbl_data.getModel().getValueAt(row, 0).toString();
        
        jtxt_id.setText(tbl_data.getValueAt(row, 0).toString());
        jtxt_nama.setText(tbl_data.getValueAt(row, 1).toString());
        jtxt_pengarang.setText(tbl_data.getValueAt(row, 2).toString());
        jtxt_tahunterbit.setText(tbl_data.getValueAt(row, 3).toString());
        idKategori = tbl_data.getModel().getValueAt(row, 4).toString();
        idPenerbit = tbl_data.getModel().getValueAt(row, 5).toString();
        jtxt_stok.setText(tbl_data.getValueAt(row, 8).toString());
        
        getKategoriID(idKategori);
        getPenerbitID(idPenerbit);
  
    }

    private void deleteData() {
        int selectedRow = tbl_data.getSelectedRow();
        int confirm = JOptionPane.showConfirmDialog
            (this, "Apakah Anda yakin ingin Menghapus Data ?",
                    "Konfirmasi Hapus Data",JOptionPane.YES_NO_OPTION);
        
        if(confirm == JOptionPane.YES_OPTION){
            String id = tbl_data.getValueAt(selectedRow, 0).toString();
            try{
                String sql = "DELETE from buku WHERE ID_Buku = ?";
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
                Logger.getLogger(MenuBuku.class.getName()).log(Level.SEVERE, null, e);
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
            String sql = "SELECT bk.ID_Buku, bk.Judul_Buku, bk.Pengarang_Buku, bk.Tahun_Terbit, "
                         + "bk.ID_Kategori, ktg.Nama_Kategori, bk.ID_Penerbit, pnb.Nama_Penerbit, bk.Stok "
                         + "FROM buku bk "
                         + "INNER JOIN kategori ktg ON ktg.ID_Kategori = bk.ID_Kategori "
                         + "INNER JOIN penerbit pnb ON pnb.ID_Penerbit = bk.ID_Penerbit "
                         + "WHERE bk.Judul_Buku LIKE ? OR bk.Pengarang_Buku LIKE ?" ;
            try(PreparedStatement st = conn.prepareStatement(sql)){
               st.setString(1, "%" + keyWord + "%");
               st.setString(2, "%" + keyWord + "%");
               
               ResultSet rs = st.executeQuery(); 
               
               while (rs.next()) {
                    String idBuku = rs.getString("ID_Buku");
                    String namaBuku = rs.getString("Judul_Buku");
                    String pengarangBuku = rs.getString("Pengarang_Buku");
                    String tahunTerbit = rs.getString("Tahun_Terbit");
                    String idKategori = rs.getString("ID_Kategori");
                    String namaKategori = rs.getString("Nama_Kategori");
                    String idPenerbit = rs.getString("ID_Penerbit");
                    String namaPenerbit = rs.getString("Nama_Penerbit");
                    String stokBuku = rs.getString("Stok");

                    Object[] rowData = {idBuku, namaBuku, pengarangBuku, tahunTerbit, idKategori, idPenerbit, namaKategori, namaPenerbit, stokBuku};
                    model.addRow(rowData);
                }
            }
        }
        
        catch(Exception e){
            Logger.getLogger(MenuBuku.class.getName()).log(Level.SEVERE, null, e);
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
            String sql = "SELECT COUNT(*) AS total FROM buku";
            try(PreparedStatement st = conn.prepareStatement(sql)){
                ResultSet rs = st.executeQuery();
                if(rs.next()){
                    totalData = rs.getInt("total");
                }
            }
        }
        catch(Exception e){
            Logger.getLogger(MenuBuku.class.getName()).log(Level.SEVERE, null, e);
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
            Logger.getLogger(MenuBuku.class.getName()).log(Level.SEVERE, null, e);
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

    private void getKategoriID(String id) {
        try {
            String sql = "SELECT ID_Kategori, Nama_Kategori FROM kategori";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            jcb_kategori.removeAllItems();

            while (rs.next()) {
                String idKategori = rs.getString("ID_Kategori");
                String namaKategori = rs.getString("Nama_Kategori");
                jcb_kategori.addItem(namaKategori);

                if (id.equals(idKategori)) {
                    jcb_kategori.setSelectedItem(namaKategori);              
                }
            }

            jcb_kategori.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        String selectedKategori = jcb_kategori.getSelectedItem().toString();
                        updateKategoriID(selectedKategori);
                    }
                }
            });
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + e.getMessage());
        }
    }
    
    private void updateKategoriID(String selectedKategori) {
        try {
            String sql = "SELECT ID_Kategori, Nama_Kategori FROM kategori WHERE Nama_Kategori = ?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, selectedKategori);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                String idKategori = rs.getString("ID_Kategori");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void getPenerbitID(String id) {
        try {
            String sql = "SELECT ID_Penerbit, Nama_Penerbit FROM penerbit";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            jcb_penerbit.removeAllItems();

            while (rs.next()) {
                String idPenerbit = rs.getString("ID_Penerbit");
                String namaPenerbit = rs.getString("Nama_Penerbit");
                jcb_penerbit.addItem(namaPenerbit);

                if (id.equals(idPenerbit)) {
                    jcb_penerbit.setSelectedItem(namaPenerbit);              
                }
            }

            jcb_penerbit.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        String selectedPenerbit = jcb_penerbit.getSelectedItem().toString();
                        updatePenerbitID(selectedPenerbit);
                    }
                }
            });
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + e.getMessage());
        }
    }

    private void updatePenerbitID(String selectedPenerbit){
        try {
            String sql = "SELECT ID_Penerbit, Nama_Penerbit FROM penerbit WHERE Nama_Penerbit = ?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, selectedPenerbit);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                String idPenerbit = rs.getString("ID_Penerbit");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
 }