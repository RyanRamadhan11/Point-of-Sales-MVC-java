
package ryan.ramadhan.model;

import ryan.ramadhan.db.KoneksiDatabase;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * @author Ryan Ramadhan || 1910631170229
 */

public class ModelPelanggan {
    private int idPelangganModel;
    private String namaPelangganModel;
    private String nomorHpModel;
    private String jenisKelaminModel;
    private int umur;
    private String alamat;
    
    //agar terhubung dengan file koneksi database yang sudah kita buat 
    KoneksiDatabase koneksi = new KoneksiDatabase();
    
    public ModelPelanggan() {
    }

    public int getIdPelangganModel() {
        return idPelangganModel;
    }

    public void setIdPelangganModel(int idPelangganModel) {
        this.idPelangganModel = idPelangganModel;
    }
    
    public String getNamaPelangganModel() {
        return namaPelangganModel;
    }

    public void setNamaPelangganModel(String namaPelangganModel) {
        this.namaPelangganModel = namaPelangganModel;
    }

    public String getNomorHpModel() {
        return nomorHpModel;
    }

    public void setNomorHpModel(String nomorHpModel) {
        this.nomorHpModel = nomorHpModel;
    }

    public String getJenisKelaminModel() {
        return jenisKelaminModel;
    }

    public void setJenisKelaminModel(String jenisKelaminModel) {
        this.jenisKelaminModel = jenisKelaminModel;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }  
    
    //Ryan Ramadhan || 1910631170229 || 5H
    public void simpanDataPelanggan() {
        //inisialisasi query untuk insert ke dalam database
        String sql = "INSERT INTO pelanggan (idPelanggan, namaPelanggan, noHp, jenisKelamin, umur, alamat)"
                + "VALUES('"+getIdPelangganModel()+"','"+getNamaPelangganModel()
                +"','"+getNomorHpModel()+"','"+getJenisKelaminModel()+"','"
                +getUmur()+"','"+getAlamat()+"')";
         //inisialisasi PreparedStatement
        try{
            PreparedStatement eksekusi = KoneksiDatabase.getKoneksi().prepareStatement(sql);
            eksekusi.execute();
            //pemberitahuan jika data berhasil disimpan
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        } catch (SQLException ex) {
            //pemberitahuan jika data gagal disimpan
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan\n"+ ex);
        }
    }
    
    //Ryan Ramadhan || 1910631170229
    //Membuat fungsi atau method Edit/Update data
    public void UpdateDataPelanggan() {
        String sql = "UPDATE pelanggan set namaPelanggan = '"+getNamaPelangganModel()+"'"
                +" ,noHp = '"+getNomorHpModel()+"'"
                +" ,jenisKelamin = '"+getJenisKelaminModel()+"'"
                +" ,umur = '"+getUmur()+"'"
                +" ,alamat= '"+getAlamat()+"' WHERE idPelanggan = '"+getIdPelangganModel()+"'";
                
        try{
            PreparedStatement eksekusi = KoneksiDatabase.getKoneksi().prepareStatement(sql);
            eksekusi.execute();
            
            JOptionPane.showMessageDialog(null, "Data Berhasil Diedit");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Gagal Diedit\n"+ ex);
        }
    }
    
    //Ryan Ramadhan || 1910631170229
    //Membuat fungsi atau method Edit/Update data
    public void HapusDataPelanggan() {
        String sql = "DELETE FROM pelanggan WHERE idPelanggan = "+ "'"+getIdPelangganModel()+"'";
        
        try{
            PreparedStatement eksekusi = KoneksiDatabase.getKoneksi().prepareStatement(sql);
            eksekusi.execute();
            
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus\n"+ ex);
        }
    }
}
