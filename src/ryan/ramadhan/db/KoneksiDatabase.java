
package ryan.ramadhan.db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.sql.SQLException;

/**
 * Ryan Ramadhan || 1910631170229 || 5H
 */

public class KoneksiDatabase {
    //inisialisasi variabel dengan connection file class JDBC
    private static Connection conn;
    
    public static Properties propert = new Properties();
            
    public static Connection getKoneksi()throws SQLException{ //throws digunakan untuk menangkap error
        // cek koneksi
        if(conn == null){
            try{
            propert.load(new FileInputStream("C:\\Users\\ADAM HAWA\\Documents\\NetBeansProjects\\JavaMVC_POS_RyanRamadhan_19229_5H\\src\\ryan\\ramadhan\\db\\konfigurasiDatabase.properties"));
        }catch(IOException ex){
            System.err.println("Koneksi Gagal "+ex); //Menampilkan error pada konekasi
            System.err.println("Koneksi Gagal "+ex); //Menampilkan error pada konekasi
            }
            conn = DriverManager.getConnection("jdbc:mysql://localhost/java_pos","root","");
        }
        return conn;
    }
    
    public static void main(String[] args) throws SQLException{
        if(getKoneksi().equals(conn)){
            System.out.print("Sukses Terkoneksi");
        }
    }
}

//conn = (Connection)
//DriverManager.getConnection(propert.getProperty("jdbc.url"),
//
//propert.getProperty("jdbc.username"),
//propert.getProperty("jdbc.password"));