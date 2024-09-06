package Kode;

import Main.MenuUtama;
import java.awt.Color;
import javax.swing.JPanel;

public class MenuProfile extends java.awt.Dialog {
    private MenuUtama menuUtama;

    public MenuProfile(java.awt.Frame parent, boolean modal, MenuUtama menuUtama) {
        super(parent, modal);
        initComponents();
        this.menuUtama = menuUtama;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpn_btngantipassword = new javax.swing.JPanel();
        jpn_line9 = new javax.swing.JPanel();
        jpn_gantipassword = new javax.swing.JLabel();
        btn_gantipassword = new javax.swing.JLabel();
        jpn_btnlogout = new javax.swing.JPanel();
        jpn_line10 = new javax.swing.JPanel();
        jpn_logout = new javax.swing.JLabel();
        btn_logout = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jpn_btngantipassword.setBackground(new java.awt.Color(255, 255, 255));

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

        jpn_gantipassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-reset-30.png"))); // NOI18N

        btn_gantipassword.setBackground(new java.awt.Color(255, 255, 255));
        btn_gantipassword.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_gantipassword.setForeground(new java.awt.Color(102, 102, 102));
        btn_gantipassword.setText("PERGANTIAN PASSWORD");
        btn_gantipassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_gantipasswordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_gantipasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_gantipasswordMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpn_btngantipasswordLayout = new javax.swing.GroupLayout(jpn_btngantipassword);
        jpn_btngantipassword.setLayout(jpn_btngantipasswordLayout);
        jpn_btngantipasswordLayout.setHorizontalGroup(
            jpn_btngantipasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_btngantipasswordLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jpn_gantipassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_gantipassword, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jpn_btngantipasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpn_btngantipasswordLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpn_line9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(247, Short.MAX_VALUE)))
        );
        jpn_btngantipasswordLayout.setVerticalGroup(
            jpn_btngantipasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_btngantipasswordLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpn_btngantipasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpn_gantipassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_gantipassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpn_btngantipasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpn_btngantipasswordLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpn_line9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(7, Short.MAX_VALUE)))
        );

        jPanel1.add(jpn_btngantipassword);

        jpn_btnlogout.setBackground(new java.awt.Color(255, 255, 255));

        jpn_line10.setBackground(new java.awt.Color(255, 255, 255));
        jpn_line10.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpn_line10Layout = new javax.swing.GroupLayout(jpn_line10);
        jpn_line10.setLayout(jpn_line10Layout);
        jpn_line10Layout.setHorizontalGroup(
            jpn_line10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jpn_line10Layout.setVerticalGroup(
            jpn_line10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        jpn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-logout-30.png"))); // NOI18N

        btn_logout.setBackground(new java.awt.Color(255, 255, 255));
        btn_logout.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(102, 102, 102));
        btn_logout.setText("LOGOUT");
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_logoutMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpn_btnlogoutLayout = new javax.swing.GroupLayout(jpn_btnlogout);
        jpn_btnlogout.setLayout(jpn_btnlogoutLayout);
        jpn_btnlogoutLayout.setHorizontalGroup(
            jpn_btnlogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_btnlogoutLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jpn_logout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_logout, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jpn_btnlogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpn_btnlogoutLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpn_line10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(247, Short.MAX_VALUE)))
        );
        jpn_btnlogoutLayout.setVerticalGroup(
            jpn_btnlogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_btnlogoutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpn_btnlogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpn_logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpn_btnlogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpn_btnlogoutLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpn_line10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(7, Short.MAX_VALUE)))
        );

        jPanel1.add(jpn_btnlogout);

        add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void btn_gantipasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_gantipasswordMouseEntered
        jpn_btngantipassword.setBackground(new Color(250, 250, 250));
        jpn_line9.setBackground(new Color(128, 0, 0));
    }//GEN-LAST:event_btn_gantipasswordMouseEntered

    private void btn_gantipasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_gantipasswordMouseExited
        jpn_btngantipassword.setBackground(new Color(255, 255, 255));
        jpn_line9.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_gantipasswordMouseExited

    private void btn_gantipasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_gantipasswordMouseClicked
        jpn_btngantipassword.setBackground(new Color(240, 240, 240));
        jpn_line9.setBackground(new Color(128, 0, 0));

        dispose();
        
        JPanel jp = menuUtama.getPanelUtama();
        FormLogin formLogin = new FormLogin();
        MenuPergantianPassword formGantiPassword = new MenuPergantianPassword();
      
        jp.removeAll();
        jp.add(formGantiPassword);
        jp.repaint();
        jp.revalidate();
    }//GEN-LAST:event_btn_gantipasswordMouseClicked

    private void btn_logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseEntered
        jpn_btnlogout.setBackground(new Color(250, 250, 250));
        jpn_line10.setBackground(new Color(128, 0, 0));
    }//GEN-LAST:event_btn_logoutMouseEntered

    private void btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseClicked
        jpn_btnlogout.setBackground(new Color(240, 240, 240));
        jpn_line10.setBackground(new Color(128, 0, 0));

        dispose();
        menuUtama.dispose();
        FormLogin formLogin = new FormLogin();
        formLogin.setVisible(true);
    }//GEN-LAST:event_btn_logoutMouseClicked

    private void btn_logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseExited
        jpn_btnlogout.setBackground(new Color(255, 255, 255));
        jpn_line10.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_logoutMouseExited

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuProfile dialog = new MenuProfile(new java.awt.Frame(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_gantipassword;
    private javax.swing.JLabel btn_logout;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpn_btngantipassword;
    private javax.swing.JPanel jpn_btnlogout;
    private javax.swing.JLabel jpn_gantipassword;
    private javax.swing.JPanel jpn_line10;
    private javax.swing.JPanel jpn_line9;
    private javax.swing.JLabel jpn_logout;
    // End of variables declaration//GEN-END:variables
}
