
package ryan.ramadhan.model;

import ryan.ramadhan.db.KoneksiDatabase;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * @author Ryan Ramadhan || 1910631170229
 */

public class ModelBarang {
    private int idBarang;
    private String namaBarang;
    private int hargaBarang;
    private int JumlahBarang;

    KoneksiDatabase koneksi = new KoneksiDatabase();
    
    public ModelBarang() {
    }

    public int getIdBarangModel() {
        return idBarang;
    }

    public void setIdBarangModel(int idBarang) {
        this.idBarang = idBarang;
    }
    
    public String getNamaBarangModel() {
        return namaBarang;
    }

    public void setNamaBarangModel(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getHargaBarangModel() {
        return hargaBarang;
    }

    public void setHargaBarangModel(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public int getJumlahBarangModel() {
        return JumlahBarang;
    }

    public void setJumlahBarangModel(int JumlahBarang) {
        this.JumlahBarang = JumlahBarang;
    } 
    
    public void simpanDataBarang() {
        //inisialisasi query untuk insert ke dalam database
        String sql = "INSERT INTO barang ( idBarang, namaBarang, hargaBarang, jumlahBarang)"
                + "VALUES('"+getIdBarangModel()+"','"+getNamaBarangModel()
                +"','"+getHargaBarangModel()+"','"+getJumlahBarangModel()+"')";
        
        //inisialisasi preparedstatement
        try{
            PreparedStatement eksekusi = KoneksiDatabase.getKoneksi().prepareStatement(sql);
            eksekusi.execute();
            
            //pemberitahuan jika data berhasil disimpan
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        } catch (SQLException ex) {
            //Logger.getLogger(modelPelanggan.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan\n"+ ex);
        }
    }
    
    public void UpdateDataBarang() {
        String sql = "UPDATE barang set namaBarang = '"+getNamaBarangModel()+"'"
                +" ,hargaBarang = '"+getHargaBarangModel()+"'"
                +" ,jumlahBarang = '"+getJumlahBarangModel()+"' WHERE idBarang = '"+getIdBarangModel()+"'";
                
        //inisialisasi preparedstatement
        try{
            PreparedStatement eksekusi = KoneksiDatabase.getKoneksi().prepareStatement(sql);
            eksekusi.execute();
            
            //pemberitahuan jika data berhasil disimpan
            JOptionPane.showMessageDialog(null, "Data Berhasil Diedit");
        } catch (SQLException ex) {
            //Logger.getLogger(modelPelanggan.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data Gagal Diedit\n"+ ex);
        }
    }
    
    public void HapusDataBarang() {
        String sql = "DELETE FROM barang WHERE idBarang = "+ "'"+getIdBarangModel()+"'";
        
        //inisialisasi preparedstatement
        try{
            PreparedStatement eksekusi = KoneksiDatabase.getKoneksi().prepareStatement(sql);
            eksekusi.execute();
            
            //pemberitahuan jika data berhasil disimpan
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
        } catch (SQLException ex) {
            //Logger.getLogger(modelPelanggan.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus\n"+ ex);
        }
    }
}
