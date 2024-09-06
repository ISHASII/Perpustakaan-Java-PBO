package Main;

import Kode.MenuAnggota;
import Kode.MenuBuku;
import Kode.MenuDashboard;
import Kode.MenuKategori;
import Kode.MenuPenerbit;
import Kode.MenuPetugas;
import java.awt.Color;
import javax.swing.JPanel;


public class MenuMaster extends javax.swing.JPanel {

    private MenuUtama menuUtama;
    
    public MenuMaster(MenuUtama menuUtama) {
        initComponents();
        this.menuUtama = menuUtama;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpn_btndhsbrd = new javax.swing.JPanel();
        jpn_line1 = new javax.swing.JPanel();
        jpn_dashboard = new javax.swing.JLabel();
        btn_dashboard = new javax.swing.JLabel();
        jpn_btnaggta = new javax.swing.JPanel();
        jpn_line = new javax.swing.JPanel();
        jpn_anggota = new javax.swing.JLabel();
        btn_anggota = new javax.swing.JLabel();
        jpn_btnbuku = new javax.swing.JPanel();
        jpn_line5 = new javax.swing.JPanel();
        jpn_buku = new javax.swing.JLabel();
        btn_buku = new javax.swing.JLabel();
        jpn_btnkategori = new javax.swing.JPanel();
        jpn_line11 = new javax.swing.JPanel();
        jpn_petugas1 = new javax.swing.JLabel();
        btn_kategori = new javax.swing.JLabel();
        jpn_btnpenerbit = new javax.swing.JPanel();
        jpn_line12 = new javax.swing.JPanel();
        jpn_petugas2 = new javax.swing.JLabel();
        btn_penerbit = new javax.swing.JLabel();
        jpn_btnptgs = new javax.swing.JPanel();
        jpn_line6 = new javax.swing.JPanel();
        jpn_petugas = new javax.swing.JLabel();
        btn_petugas = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jpn_btndhsbrd.setBackground(new java.awt.Color(255, 255, 255));

        jpn_line1.setBackground(new java.awt.Color(255, 255, 255));
        jpn_line1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpn_line1Layout = new javax.swing.GroupLayout(jpn_line1);
        jpn_line1.setLayout(jpn_line1Layout);
        jpn_line1Layout.setHorizontalGroup(
            jpn_line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jpn_line1Layout.setVerticalGroup(
            jpn_line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        jpn_dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-dashboard-30.png"))); // NOI18N

        btn_dashboard.setBackground(new java.awt.Color(255, 255, 255));
        btn_dashboard.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_dashboard.setForeground(new java.awt.Color(102, 102, 102));
        btn_dashboard.setText("DASHBOARD");
        btn_dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_dashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_dashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_dashboardMouseExited(evt);
            }
        });

        jpn_btnaggta.setBackground(new java.awt.Color(255, 255, 255));

        jpn_line.setBackground(new java.awt.Color(255, 255, 255));
        jpn_line.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpn_lineLayout = new javax.swing.GroupLayout(jpn_line);
        jpn_line.setLayout(jpn_lineLayout);
        jpn_lineLayout.setHorizontalGroup(
            jpn_lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jpn_lineLayout.setVerticalGroup(
            jpn_lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        jpn_anggota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-friends-30.png"))); // NOI18N

        btn_anggota.setBackground(new java.awt.Color(255, 255, 255));
        btn_anggota.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_anggota.setForeground(new java.awt.Color(102, 102, 102));
        btn_anggota.setText("ANGGOTA");
        btn_anggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_anggotaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_anggotaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_anggotaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpn_btnaggtaLayout = new javax.swing.GroupLayout(jpn_btnaggta);
        jpn_btnaggta.setLayout(jpn_btnaggtaLayout);
        jpn_btnaggtaLayout.setHorizontalGroup(
            jpn_btnaggtaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_btnaggtaLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jpn_anggota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_anggota, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jpn_btnaggtaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpn_btnaggtaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpn_line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(247, Short.MAX_VALUE)))
        );
        jpn_btnaggtaLayout.setVerticalGroup(
            jpn_btnaggtaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_btnaggtaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpn_btnaggtaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpn_anggota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_anggota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpn_btnaggtaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpn_btnaggtaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpn_line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(7, Short.MAX_VALUE)))
        );

        jpn_btnbuku.setBackground(new java.awt.Color(255, 255, 255));

        jpn_line5.setBackground(new java.awt.Color(255, 255, 255));
        jpn_line5.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpn_line5Layout = new javax.swing.GroupLayout(jpn_line5);
        jpn_line5.setLayout(jpn_line5Layout);
        jpn_line5Layout.setHorizontalGroup(
            jpn_line5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jpn_line5Layout.setVerticalGroup(
            jpn_line5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        jpn_buku.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-book-30.png"))); // NOI18N

        btn_buku.setBackground(new java.awt.Color(255, 255, 255));
        btn_buku.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_buku.setForeground(new java.awt.Color(102, 102, 102));
        btn_buku.setText("BUKU");
        btn_buku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_bukuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_bukuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_bukuMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpn_btnbukuLayout = new javax.swing.GroupLayout(jpn_btnbuku);
        jpn_btnbuku.setLayout(jpn_btnbukuLayout);
        jpn_btnbukuLayout.setHorizontalGroup(
            jpn_btnbukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_btnbukuLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jpn_buku)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_buku, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jpn_btnbukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpn_btnbukuLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpn_line5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(247, Short.MAX_VALUE)))
        );
        jpn_btnbukuLayout.setVerticalGroup(
            jpn_btnbukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_btnbukuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpn_btnbukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpn_buku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_buku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpn_btnbukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpn_btnbukuLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpn_line5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(7, Short.MAX_VALUE)))
        );

        jpn_btnkategori.setBackground(new java.awt.Color(255, 255, 255));

        jpn_line11.setBackground(new java.awt.Color(255, 255, 255));
        jpn_line11.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpn_line11Layout = new javax.swing.GroupLayout(jpn_line11);
        jpn_line11.setLayout(jpn_line11Layout);
        jpn_line11Layout.setHorizontalGroup(
            jpn_line11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jpn_line11Layout.setVerticalGroup(
            jpn_line11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        jpn_petugas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-category-30.png"))); // NOI18N

        btn_kategori.setBackground(new java.awt.Color(255, 255, 255));
        btn_kategori.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_kategori.setForeground(new java.awt.Color(102, 102, 102));
        btn_kategori.setText("KATEGORI");
        btn_kategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_kategoriMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_kategoriMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_kategoriMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpn_btnkategoriLayout = new javax.swing.GroupLayout(jpn_btnkategori);
        jpn_btnkategori.setLayout(jpn_btnkategoriLayout);
        jpn_btnkategoriLayout.setHorizontalGroup(
            jpn_btnkategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_btnkategoriLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jpn_petugas1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_kategori, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jpn_btnkategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpn_btnkategoriLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpn_line11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(247, Short.MAX_VALUE)))
        );
        jpn_btnkategoriLayout.setVerticalGroup(
            jpn_btnkategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_btnkategoriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpn_btnkategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpn_petugas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_kategori, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpn_btnkategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpn_btnkategoriLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpn_line11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(7, Short.MAX_VALUE)))
        );

        jpn_btnpenerbit.setBackground(new java.awt.Color(255, 255, 255));

        jpn_line12.setBackground(new java.awt.Color(255, 255, 255));
        jpn_line12.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpn_line12Layout = new javax.swing.GroupLayout(jpn_line12);
        jpn_line12.setLayout(jpn_line12Layout);
        jpn_line12Layout.setHorizontalGroup(
            jpn_line12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jpn_line12Layout.setVerticalGroup(
            jpn_line12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        jpn_petugas2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-publishing-30.png"))); // NOI18N

        btn_penerbit.setBackground(new java.awt.Color(255, 255, 255));
        btn_penerbit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_penerbit.setForeground(new java.awt.Color(102, 102, 102));
        btn_penerbit.setText("PENERBIT");
        btn_penerbit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_penerbitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_penerbitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_penerbitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpn_btnpenerbitLayout = new javax.swing.GroupLayout(jpn_btnpenerbit);
        jpn_btnpenerbit.setLayout(jpn_btnpenerbitLayout);
        jpn_btnpenerbitLayout.setHorizontalGroup(
            jpn_btnpenerbitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_btnpenerbitLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jpn_petugas2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_penerbit, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jpn_btnpenerbitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpn_btnpenerbitLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpn_line12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(247, Short.MAX_VALUE)))
        );
        jpn_btnpenerbitLayout.setVerticalGroup(
            jpn_btnpenerbitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_btnpenerbitLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpn_btnpenerbitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpn_petugas2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_penerbit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpn_btnpenerbitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpn_btnpenerbitLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpn_line12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(7, Short.MAX_VALUE)))
        );

        jpn_btnptgs.setBackground(new java.awt.Color(255, 255, 255));

        jpn_line6.setBackground(new java.awt.Color(255, 255, 255));
        jpn_line6.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpn_line6Layout = new javax.swing.GroupLayout(jpn_line6);
        jpn_line6.setLayout(jpn_line6Layout);
        jpn_line6Layout.setHorizontalGroup(
            jpn_line6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jpn_line6Layout.setVerticalGroup(
            jpn_line6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        jpn_petugas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-staff-30.png"))); // NOI18N

        btn_petugas.setBackground(new java.awt.Color(255, 255, 255));
        btn_petugas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_petugas.setForeground(new java.awt.Color(102, 102, 102));
        btn_petugas.setText("PETUGAS");
        btn_petugas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_petugasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_petugasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_petugasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpn_btnptgsLayout = new javax.swing.GroupLayout(jpn_btnptgs);
        jpn_btnptgs.setLayout(jpn_btnptgsLayout);
        jpn_btnptgsLayout.setHorizontalGroup(
            jpn_btnptgsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_btnptgsLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jpn_petugas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_petugas, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jpn_btnptgsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpn_btnptgsLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpn_line6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(247, Short.MAX_VALUE)))
        );
        jpn_btnptgsLayout.setVerticalGroup(
            jpn_btnptgsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_btnptgsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpn_btnptgsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpn_petugas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_petugas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpn_btnptgsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpn_btnptgsLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpn_line6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(7, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jpn_btndhsbrdLayout = new javax.swing.GroupLayout(jpn_btndhsbrd);
        jpn_btndhsbrd.setLayout(jpn_btndhsbrdLayout);
        jpn_btndhsbrdLayout.setHorizontalGroup(
            jpn_btndhsbrdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_btndhsbrdLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jpn_dashboard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_btndhsbrdLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jpn_btndhsbrdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpn_btnaggta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpn_btnbuku, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpn_btnkategori, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpn_btnpenerbit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpn_btnptgs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jpn_btndhsbrdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpn_btndhsbrdLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpn_line1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(247, Short.MAX_VALUE)))
        );
        jpn_btndhsbrdLayout.setVerticalGroup(
            jpn_btndhsbrdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_btndhsbrdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpn_btndhsbrdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpn_dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpn_btnaggta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpn_btnbuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpn_btnkategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpn_btnpenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpn_btnptgs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpn_btndhsbrdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpn_btndhsbrdLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpn_line1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(7, Short.MAX_VALUE)))
        );

        jLabel7.setFont(new java.awt.Font("Adobe Fan Heiti Std B", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("MASTER DATA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpn_btndhsbrd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpn_btndhsbrd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dashboardMouseClicked
        jpn_btndhsbrd.setBackground(new Color(240, 240, 240));
        jpn_line1.setBackground(new Color(128, 0, 0));

        JPanel jp = menuUtama.getPanelUtama();
      
        jp.removeAll();
        jp.add(new MenuDashboard());
        jp.repaint();
        jp.revalidate();
    }//GEN-LAST:event_btn_dashboardMouseClicked

    private void btn_dashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dashboardMouseEntered
        jpn_btndhsbrd.setBackground(new Color(250, 250, 250));
        jpn_line1.setBackground(new Color(128, 0, 0));
    }//GEN-LAST:event_btn_dashboardMouseEntered

    private void btn_dashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dashboardMouseExited
        jpn_btndhsbrd.setBackground(new Color(255, 255, 255));
        jpn_line1.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_dashboardMouseExited

    private void btn_anggotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_anggotaMouseClicked
        jpn_btnaggta.setBackground(new Color(250, 250, 250));
        jpn_line.setBackground(new Color(128, 0, 0));

        JPanel jp = menuUtama.getPanelUtama();
        
        jp.removeAll();
        jp.add(new MenuAnggota());
        jp.repaint();
        jp.revalidate();

    }//GEN-LAST:event_btn_anggotaMouseClicked

    private void btn_anggotaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_anggotaMouseEntered
        jpn_btnaggta.setBackground(new Color(250, 250, 250));
        jpn_line.setBackground(new Color(128, 0, 0));
    }//GEN-LAST:event_btn_anggotaMouseEntered

    private void btn_anggotaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_anggotaMouseExited
        jpn_btnaggta.setBackground(new Color(255, 255, 255));
        jpn_line.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_anggotaMouseExited

    private void btn_bukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bukuMouseClicked
        btn_buku.setBackground(new Color(240, 240, 240));
        jpn_line5.setBackground(new Color(128, 0, 0));

        JPanel jp = menuUtama.getPanelUtama();
        
        jp.removeAll();
        jp.add(new MenuBuku());
        jp.repaint();
        jp.revalidate();
    }//GEN-LAST:event_btn_bukuMouseClicked

    private void btn_bukuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bukuMouseEntered
        jpn_btnbuku.setBackground(new Color(250, 250, 250));
        jpn_line5.setBackground(new Color(128, 0, 0));
    }//GEN-LAST:event_btn_bukuMouseEntered

    private void btn_bukuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bukuMouseExited
        jpn_btnbuku.setBackground(new Color(255, 255, 255));
        jpn_line5.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_bukuMouseExited

    private void btn_kategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_kategoriMouseClicked
        jpn_btnkategori.setBackground(new Color(250, 250, 250));
        jpn_line11.setBackground(new Color(128, 0, 0));

        JPanel jp = menuUtama.getPanelUtama();
        
        jp.removeAll();
        jp.add(new MenuKategori());
        jp.repaint();
        jp.revalidate();
    }//GEN-LAST:event_btn_kategoriMouseClicked

    private void btn_kategoriMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_kategoriMouseEntered
        jpn_btnkategori.setBackground(new Color(250, 250, 250));
        jpn_line11.setBackground(new Color(128, 0, 0));
    }//GEN-LAST:event_btn_kategoriMouseEntered

    private void btn_kategoriMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_kategoriMouseExited
        jpn_btnkategori.setBackground(new Color(255, 255, 255));
        jpn_line11.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_kategoriMouseExited

    private void btn_penerbitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_penerbitMouseClicked
        jpn_btnpenerbit.setBackground(new Color(250, 250, 250));
        jpn_line12.setBackground(new Color(128, 0, 0));

        JPanel jp = menuUtama.getPanelUtama();
        
        jp.removeAll();
        jp.add(new MenuPenerbit());
        jp.repaint();
        jp.revalidate();
    }//GEN-LAST:event_btn_penerbitMouseClicked

    private void btn_penerbitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_penerbitMouseEntered
        jpn_btnpenerbit.setBackground(new Color(250, 250, 250));
        jpn_line12.setBackground(new Color(128, 0, 0));
    }//GEN-LAST:event_btn_penerbitMouseEntered

    private void btn_penerbitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_penerbitMouseExited
        jpn_btnpenerbit.setBackground(new Color(255, 255, 255));
        jpn_line12.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_penerbitMouseExited

    private void btn_petugasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_petugasMouseClicked
        jpn_btnptgs.setBackground(new Color(240, 240, 240));
        jpn_line6.setBackground(new Color(128, 0, 0));

        JPanel jp = menuUtama.getPanelUtama();
        
        jp.removeAll();
        jp.add(new MenuPetugas());
        jp.repaint();
        jp.revalidate();
    }//GEN-LAST:event_btn_petugasMouseClicked

    private void btn_petugasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_petugasMouseEntered
        jpn_btnptgs.setBackground(new Color(250, 250, 250));
        jpn_line6.setBackground(new Color(128, 0, 0));
    }//GEN-LAST:event_btn_petugasMouseEntered

    private void btn_petugasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_petugasMouseExited
        jpn_btnptgs.setBackground(new Color(255, 255, 255));
        jpn_line6.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_petugasMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_anggota;
    private javax.swing.JLabel btn_buku;
    private javax.swing.JLabel btn_dashboard;
    private javax.swing.JLabel btn_kategori;
    private javax.swing.JLabel btn_penerbit;
    private javax.swing.JLabel btn_petugas;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jpn_anggota;
    private javax.swing.JPanel jpn_btnaggta;
    private javax.swing.JPanel jpn_btnbuku;
    private javax.swing.JPanel jpn_btndhsbrd;
    private javax.swing.JPanel jpn_btnkategori;
    private javax.swing.JPanel jpn_btnpenerbit;
    private javax.swing.JPanel jpn_btnptgs;
    private javax.swing.JLabel jpn_buku;
    private javax.swing.JLabel jpn_dashboard;
    private javax.swing.JPanel jpn_line;
    private javax.swing.JPanel jpn_line1;
    private javax.swing.JPanel jpn_line11;
    private javax.swing.JPanel jpn_line12;
    private javax.swing.JPanel jpn_line5;
    private javax.swing.JPanel jpn_line6;
    private javax.swing.JLabel jpn_petugas;
    private javax.swing.JLabel jpn_petugas1;
    private javax.swing.JLabel jpn_petugas2;
    // End of variables declaration//GEN-END:variables
}