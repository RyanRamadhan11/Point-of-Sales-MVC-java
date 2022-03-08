
package ryan.ramadhan.model;

import ryan.ramadhan.db.KoneksiDatabase;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * @author Ryan Ramadhan || 1910631170229
 */

public class ModelSupplier {
    //inisialisasi variabel
    private String idSupplier;
    private String namaSupplier;
    private String barangSupplier;
    private String alamatSupplier;

    KoneksiDatabase koneksi = new KoneksiDatabase();
    //membuat kosntruktor
    public ModelSupplier() {
    }

    public String getIdSupplierModel() {
        return idSupplier;
    }

    public void setIdSupplierModel(String idSupplier) {
        this.idSupplier = idSupplier;
    }

    public String getNamaSupplierModel() {
        return namaSupplier;
    }

    public void setNamaSupplierModel(String namaSupplier) {
        this.namaSupplier = namaSupplier;
    }

    public String getBarangSupplierModel() {
        return barangSupplier;
    }

    public void setBarangSupplierModel(String barangSupplier) {
        this.barangSupplier = barangSupplier;
    }

    public String getAlamatSupplierModel() {
        return alamatSupplier;
    }

    public void setAlamatSupplierModel(String alamatSupplier) {
        this.alamatSupplier = alamatSupplier;
    }
    
    //Ryan Ramadhan || 1910631170229
    //method simpandata
    public void simpanDataSupplier(){
        //inisialisasi query untuk insert ke dalam database
        String sql = ("INSERT INTO supplier ( idSupplier, namaSupplier,alamatSupplier,barangSupplier)" 
                + "VALUES ('"+getIdSupplierModel()+"','"+getNamaSupplierModel()
                +"','"+getAlamatSupplierModel()+"','"+getBarangSupplierModel()+"')");
    
        //inisialisasi preparedstatement
        try {
            PreparedStatement eksekusi = koneksi.getKoneksi().prepareStatement(sql);
            eksekusi.execute();
            
            //pemberitahuan jika data berhasil disimpan
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        } catch (SQLException ex) {
            //Logger.getLogger(modelPelanggan.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan \n" +ex);
        }
    }
    
    //Ryan Ramadhan || 1910631170229
    //method hapusdata
     public void hapusDataSupplier(){
        String sql = "DELETE FROM supplier WHERE idSupplier = "
                + "'"+getIdSupplierModel()+"'";
        
        try {
            PreparedStatement eksekusi = koneksi.getKoneksi().prepareStatement(sql);
            eksekusi.execute();
            
            //pemberitahuan jika data berhasil disimpan
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
        } catch (SQLException ex) {
            //Logger.getLogger(modelPelanggan.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus \n" +ex);
        }
    }
     
    //Ryan Ramadhan || 1910631170229
    //method updatedata
    public void updateDataSupplier(){
        //inisialisasi query untuk insert ke dalam database
        String sql = "UPDATE supplier SET namaSupplier = '"+getNamaSupplierModel()+"'"
                +" ,alamatSupplier = '"+getAlamatSupplierModel()+"'"
                +" ,barangSupplier = '"+getBarangSupplierModel()+"' WHERE idSupplier = '"+getIdSupplierModel()+"'";
               
        //inisialisasi preparedstatement
        try {
            PreparedStatement eksekusi = koneksi.getKoneksi().prepareStatement(sql);
            eksekusi.execute();
            
            //pemberitahuan jika data berhasil disimpan
            JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate");
        } catch (SQLException ex) {
            //Logger.getLogger(modelPelanggan.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data Gagal Diupdate \n" +ex);
        }
    }
}

