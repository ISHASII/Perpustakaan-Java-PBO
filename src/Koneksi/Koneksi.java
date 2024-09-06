package Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Koneksi {
    private static Connection conn;
    
    public static Connection getConnection(){
        if(conn == null){
            try{
                String url = "jdbc:mysql://localhost:3306/db_perpustakaan";
                String user = "root";
                String pass = "";
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(url, user, pass);
                
                if (conn != null) {
                    System.out.println("Koneksi ke database berhasil.");
                } 
                
                else {
                    System.out.println("Gagal melakukan koneksi ke database.");
                }
            }
            catch(Exception e){
                Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, e);
                System.out.println("Gagal melakukan koneksi ke database: " + e.getMessage());
            }
        }
        
        return conn;
        
    }
}