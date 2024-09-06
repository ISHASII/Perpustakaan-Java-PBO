package Kode;

import Koneksi.Koneksi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class DataAnggota extends java.awt.Dialog {

    private int halamanSaatIni = 1;
    private int dataPerHalaman = 10;
    private int totalPages;

    private final Connection conn;
    
    private String idAnggota;
    private String namaAnggota;
    private String emailAnggota;
    private String teleponAnggota;

    public String getIdAnggota() {
        return idAnggota;
    }

    public String getNamaAnggota() {
        return namaAnggota;
    }

    public String getEmailAnggota() {
        return emailAnggota;
    }

    public String getTeleponAnggota() {
        return teleponAnggota;
    }
    
    public DataAnggota(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
         conn = Koneksi.getConnection();
         setTabelModel();
         loadData();
         paginationAnggota();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpn_view = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_firts = new javax.swing.JButton();
        btn_previous = new javax.swing.JButton();
        jcbx_data = new javax.swing.JComboBox<>();
        btn_next = new javax.swing.JButton();
        btn_last = new javax.swing.JButton();
        jlbl_halaman = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_cari = new property.JtextfieldroundedCustom();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_data = new javax.swing.JTable();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jpn_view.setBackground(new java.awt.Color(255, 255, 255));
        jpn_view.setPreferredSize(new java.awt.Dimension(1325, 887));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 51));
        jLabel2.setText("Data Anggota Perpustakaan");

        btn_firts.setText("First Page");

        btn_previous.setText("<");

        jcbx_data.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "30", "40", "50", "60", "70", "80", "90", "100" }));

        btn_next.setText(">");

        btn_last.setText("Last Page");

        jlbl_halaman.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jlbl_halaman.setForeground(new java.awt.Color(153, 0, 51));
        jlbl_halaman.setText("Halaman of Total Halaman");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-friends-30.png"))); // NOI18N

        txt_cari.setLineColor(new java.awt.Color(153, 0, 51));
        txt_cari.setPlaceholder("Pencariaan");
        txt_cari.setSelectionColor(new java.awt.Color(153, 0, 51));
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
                        .addGroup(jpn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpn_viewLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addGroup(jpn_viewLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(txt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 385, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_viewLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jpn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpn_viewLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jlbl_halaman))
                    .addGroup(jpn_viewLayout.createSequentialGroup()
                        .addComponent(btn_firts, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_previous, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_last, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbx_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(225, 225, 225))
        );
        jpn_viewLayout.setVerticalGroup(
            jpn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_viewLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jpn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(txt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlbl_halaman)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_firts, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_previous, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_last, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbx_data))
                .addGap(244, 244, 244))
        );

        add(jpn_view, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void tbl_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dataMouseClicked
        pilihData();
    }//GEN-LAST:event_tbl_dataMouseClicked

    private void txt_cariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cariKeyReleased
        searchData();
    }//GEN-LAST:event_txt_cariKeyReleased

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DataAnggota dialog = new DataAnggota(new java.awt.Frame(), true);
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
    private javax.swing.JButton btn_firts;
    private javax.swing.JButton btn_last;
    private javax.swing.JButton btn_next;
    private javax.swing.JButton btn_previous;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jcbx_data;
    private javax.swing.JLabel jlbl_halaman;
    private javax.swing.JPanel jpn_view;
    private javax.swing.JTable tbl_data;
    private property.JtextfieldroundedCustom txt_cari;
    // End of variables declaration//GEN-END:variables

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
    
    private void loadData(){
        calculateTotalPages();
        int totalData = getTotalData();
        jlbl_halaman.setText(String.valueOf("Halaman" + halamanSaatIni + "dari Total Data" + totalData));
        
        int startIndex = (halamanSaatIni - 1) * dataPerHalaman;
        getData(startIndex, dataPerHalaman, (DefaultTableModel) tbl_data.getModel());
    }
    
    private void getData(int startIndex, int entriesPage, DefaultTableModel model) {
        model.setRowCount(0);
        
        try {
            String sql = "SELECT * FROM anggota LIMIT ?, ?";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setInt(1, startIndex);
                st.setInt(2, entriesPage);
                ResultSet rs = st.executeQuery(); 
                
                while (rs.next()) {
                    String idAnggota = rs.getString("ID_Anggota");
                    String namaAnggota = rs.getString("Nama_Anggota");
                    String emailAnggota = rs.getString("Email");
                    String teleponAnggota = rs.getString("Telepon");
                    
                    Object[] rowData = {idAnggota, namaAnggota, emailAnggota, teleponAnggota};
                    model.addRow(rowData);
                }
            }
        } 
        catch (SQLException e) {
            Logger.getLogger(MenuAnggota.class.getName()).log(Level.SEVERE, null, e);
        }
    }
   
    private void setTabelModel(){
        DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
        model.addColumn("ID ANGGOTA");
        model.addColumn("NAMA");
        model.addColumn("EMAIL");
        model.addColumn("TELEPON");
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
                   String idAnggota = rs.getString("ID_Anggota");
                   String namaAnggota = rs.getString("Nama_Anggota");
                   String emailAnggota = rs.getString("Email");
                   String teleponAnggota = rs.getString("Telepon");
                   
                   Object[] rowData = {idAnggota, namaAnggota, emailAnggota, teleponAnggota};
                   model.addRow(rowData);
               }
            }
        }
        
        catch(Exception e){
            Logger.getLogger(MenuAnggota.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void pilihData(){
        int row = tbl_data.getSelectedRow();
        
        idAnggota = tbl_data.getValueAt(row, 0).toString();
        namaAnggota = tbl_data.getValueAt(row, 1).toString();
        emailAnggota = tbl_data.getValueAt(row, 2).toString();
        teleponAnggota = tbl_data.getValueAt(row,3).toString();
        
        tbl_data.setVisible(false);
        
        dispose();
    }
}