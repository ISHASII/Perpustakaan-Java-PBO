package Main;

import Kode.LaporanPeminjaman;
import Kode.MenuAnggota;
import java.awt.Color;
import javax.swing.JPanel;

public class MenuLaporan extends javax.swing.JPanel {
    private MenuUtama menuUtama;

    public MenuLaporan(MenuUtama menuUtama) {
        this.menuUtama = menuUtama;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jpn_btnlappeminjaman = new javax.swing.JPanel();
        jpn_line9 = new javax.swing.JPanel();
        jpn_lappeminjaman = new javax.swing.JLabel();
        btn_lappeminjaman = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Adobe Fan Heiti Std B", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("LAPORAN");

        jpn_btnlappeminjaman.setBackground(new java.awt.Color(255, 255, 255));

        jpn_line9.setBackground(new java.awt.Color(255, 255, 255));
        jpn_line9.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpn_line9Layout = new javax.swing.GroupLayout(jpn_line9);
        jpn_line9.setLayout(jpn_line9Layout);
        jpn_line9Layout.setHorizontalGroup(
            jpn_line9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jpn_line9Layout.setVerticalGroup(
            jpn_line9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        jpn_lappeminjaman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-report-30.png"))); // NOI18N

        btn_lappeminjaman.setBackground(new java.awt.Color(255, 255, 255));
        btn_lappeminjaman.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_lappeminjaman.setForeground(new java.awt.Color(102, 102, 102));
        btn_lappeminjaman.setText("PEMINJAMAN");
        btn_lappeminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_lappeminjamanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_lappeminjamanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_lappeminjamanMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpn_btnlappeminjamanLayout = new javax.swing.GroupLayout(jpn_btnlappeminjaman);
        jpn_btnlappeminjaman.setLayout(jpn_btnlappeminjamanLayout);
        jpn_btnlappeminjamanLayout.setHorizontalGroup(
            jpn_btnlappeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_btnlappeminjamanLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jpn_lappeminjaman)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_lappeminjaman, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jpn_btnlappeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpn_btnlappeminjamanLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpn_line9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(247, Short.MAX_VALUE)))
        );
        jpn_btnlappeminjamanLayout.setVerticalGroup(
            jpn_btnlappeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_btnlappeminjamanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpn_btnlappeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpn_lappeminjaman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_lappeminjaman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpn_btnlappeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpn_btnlappeminjamanLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpn_line9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(7, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpn_btnlappeminjaman, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpn_btnlappeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_lappeminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_lappeminjamanMouseClicked
        jpn_btnlappeminjaman.setBackground(new Color(240, 240, 240));
        jpn_line9.setBackground(new Color(128, 0, 0));

        JPanel jp = menuUtama.getPanelUtama();
        
        jp.removeAll();
        jp.add(new LaporanPeminjaman());
        jp.repaint();
        jp.revalidate();
    }//GEN-LAST:event_btn_lappeminjamanMouseClicked

    private void btn_lappeminjamanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_lappeminjamanMouseEntered
        jpn_btnlappeminjaman.setBackground(new Color(250, 250, 250));
        jpn_line9.setBackground(new Color(128, 0, 0));
    }//GEN-LAST:event_btn_lappeminjamanMouseEntered

    private void btn_lappeminjamanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_lappeminjamanMouseExited
        jpn_btnlappeminjaman.setBackground(new Color(255, 255, 255));
        jpn_line9.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_lappeminjamanMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_lappeminjaman;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jpn_btnlappeminjaman;
    private javax.swing.JLabel jpn_lappeminjaman;
    private javax.swing.JPanel jpn_line9;
    // End of variables declaration//GEN-END:variables
}
