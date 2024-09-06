package Main;

import Kode.MenuPeminjaman;
import Kode.MenuPengembalian;
import java.awt.Color;
import javax.swing.JPanel;

public class MenuTransaksi extends javax.swing.JPanel {

    private MenuUtama menuUtama;
    
    public MenuTransaksi(MenuUtama menuUtama) {
        initComponents();
        this.menuUtama = menuUtama;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jpn_btnpeminjaman = new javax.swing.JPanel();
        jpn_line7 = new javax.swing.JPanel();
        jpn_peminjaman = new javax.swing.JLabel();
        btn_peminjaman = new javax.swing.JLabel();
        jpn_btnpengembalian = new javax.swing.JPanel();
        jpn_line8 = new javax.swing.JPanel();
        jpn_pengembalian = new javax.swing.JLabel();
        btn_pengembalian = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Adobe Fan Heiti Std B", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("TRANSAKSI");

        jpn_btnpeminjaman.setBackground(new java.awt.Color(255, 255, 255));

        jpn_line7.setBackground(new java.awt.Color(255, 255, 255));
        jpn_line7.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpn_line7Layout = new javax.swing.GroupLayout(jpn_line7);
        jpn_line7.setLayout(jpn_line7Layout);
        jpn_line7Layout.setHorizontalGroup(
            jpn_line7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jpn_line7Layout.setVerticalGroup(
            jpn_line7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        jpn_peminjaman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-borrow-book-30 (1).png"))); // NOI18N

        btn_peminjaman.setBackground(new java.awt.Color(255, 255, 255));
        btn_peminjaman.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_peminjaman.setForeground(new java.awt.Color(102, 102, 102));
        btn_peminjaman.setText("PEMINJAMAN");
        btn_peminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_peminjamanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_peminjamanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_peminjamanMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpn_btnpeminjamanLayout = new javax.swing.GroupLayout(jpn_btnpeminjaman);
        jpn_btnpeminjaman.setLayout(jpn_btnpeminjamanLayout);
        jpn_btnpeminjamanLayout.setHorizontalGroup(
            jpn_btnpeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_btnpeminjamanLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jpn_peminjaman)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_peminjaman, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jpn_btnpeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpn_btnpeminjamanLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpn_line7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(247, Short.MAX_VALUE)))
        );
        jpn_btnpeminjamanLayout.setVerticalGroup(
            jpn_btnpeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_btnpeminjamanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpn_btnpeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpn_peminjaman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_peminjaman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jpn_btnpeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpn_btnpeminjamanLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpn_line7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(7, Short.MAX_VALUE)))
        );

        jpn_btnpengembalian.setBackground(new java.awt.Color(255, 255, 255));

        jpn_line8.setBackground(new java.awt.Color(255, 255, 255));
        jpn_line8.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpn_line8Layout = new javax.swing.GroupLayout(jpn_line8);
        jpn_line8.setLayout(jpn_line8Layout);
        jpn_line8Layout.setHorizontalGroup(
            jpn_line8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jpn_line8Layout.setVerticalGroup(
            jpn_line8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        jpn_pengembalian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-return-book-30.png"))); // NOI18N

        btn_pengembalian.setBackground(new java.awt.Color(255, 255, 255));
        btn_pengembalian.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_pengembalian.setForeground(new java.awt.Color(102, 102, 102));
        btn_pengembalian.setText("PENGEMBALIAN");
        btn_pengembalian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pengembalianMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_pengembalianMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_pengembalianMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpn_btnpengembalianLayout = new javax.swing.GroupLayout(jpn_btnpengembalian);
        jpn_btnpengembalian.setLayout(jpn_btnpengembalianLayout);
        jpn_btnpengembalianLayout.setHorizontalGroup(
            jpn_btnpengembalianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_btnpengembalianLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jpn_pengembalian)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_pengembalian, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jpn_btnpengembalianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpn_btnpengembalianLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpn_line8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(247, Short.MAX_VALUE)))
        );
        jpn_btnpengembalianLayout.setVerticalGroup(
            jpn_btnpengembalianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_btnpengembalianLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpn_btnpengembalianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpn_pengembalian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_pengembalian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jpn_btnpengembalianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpn_btnpengembalianLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpn_line8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(7, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpn_btnpeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpn_btnpengembalian, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpn_btnpeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpn_btnpengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_peminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_peminjamanMouseClicked
        jpn_btnpeminjaman.setBackground(new Color(240, 240, 240));
        jpn_line7.setBackground(new Color(128, 0, 0));

        JPanel jp = menuUtama.getPanelUtama();
        
        jp.removeAll();
        jp.add(new MenuPeminjaman(menuUtama.getUserID()));
        jp.repaint();
        jp.revalidate();
    }//GEN-LAST:event_btn_peminjamanMouseClicked

    private void btn_peminjamanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_peminjamanMouseEntered
        jpn_btnpeminjaman.setBackground(new Color(250, 250, 250));
        jpn_line7.setBackground(new Color(128, 0, 0));
    }//GEN-LAST:event_btn_peminjamanMouseEntered

    private void btn_peminjamanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_peminjamanMouseExited
        jpn_btnpeminjaman.setBackground(new Color(255, 255, 255));
        jpn_line7.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_peminjamanMouseExited

    private void btn_pengembalianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pengembalianMouseClicked
        btn_pengembalian.setBackground(new Color(240, 240, 240));
        jpn_line8.setBackground(new Color(128, 0, 0));

        JPanel jp = menuUtama.getPanelUtama();
        
        jp.removeAll();
        jp.add(new MenuPengembalian(menuUtama.getUserID()));
        jp.repaint();
        jp.revalidate();
    }//GEN-LAST:event_btn_pengembalianMouseClicked

    private void btn_pengembalianMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pengembalianMouseEntered
        jpn_btnpengembalian.setBackground(new Color(250, 250, 250));
        jpn_line8.setBackground(new Color(128, 0, 0));
    }//GEN-LAST:event_btn_pengembalianMouseEntered

    private void btn_pengembalianMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pengembalianMouseExited
        jpn_btnpengembalian.setBackground(new Color(255, 255, 255));
        jpn_line8.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_pengembalianMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_peminjaman;
    private javax.swing.JLabel btn_pengembalian;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jpn_btnpeminjaman;
    private javax.swing.JPanel jpn_btnpengembalian;
    private javax.swing.JPanel jpn_line7;
    private javax.swing.JPanel jpn_line8;
    private javax.swing.JLabel jpn_peminjaman;
    private javax.swing.JLabel jpn_pengembalian;
    // End of variables declaration//GEN-END:variables
}
