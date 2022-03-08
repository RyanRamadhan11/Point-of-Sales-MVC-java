
package ryan.ramadhan.model;

import ryan.ramadhan.db.KoneksiDatabase;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 * @author Ryan Ramadhan || 1910631170229
 */

public class ModelTransaksi {
    private String namaPelanggan;
    private int idPelanggan;
    private String totalBayar;
    private String uangBayar;
    private String qty;
    private int idTransaksiDetail;
    private String idTransaksi;
    private String namaBarang;
    private String subTotal;

    KoneksiDatabase koneksi = new KoneksiDatabase();
    
    public ModelTransaksi() {
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public int getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(int idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getTotalBayar() {
        return totalBayar;
    }

    public void setTotalBayar(String totalBayar) {
        this.totalBayar = totalBayar;
    }

    public String getUangBayar() {
        return uangBayar;
    }

    public void setUangBayar(String uangBayar) {
        this.uangBayar = uangBayar;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public int getIdTransaksiDetail() {
        return idTransaksiDetail;
    }

    public void setIdTransaksiDetail(int idTransaksiDetail) {
        this.idTransaksiDetail = idTransaksiDetail;
    }

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(String subTotal) {
        this.subTotal = subTotal;
    }
    
    //Ryan Ramadhan || 1910631170229
    public void simpanTransaksi() {
        String sql = "INSERT INTO transaksi  (namaPelanggan, namaBarang, qty, totalBayar, uangBayar)"
                + "VALUES ('"+getNamaPelanggan()+"','"+getNamaBarang()+"','"+getQty()+"','"+getTotalBayar()+"',"
                + " '"+getUangBayar()+"')";
        
        try {
            PreparedStatement eksekusi = KoneksiDatabase.getKoneksi().prepareStatement(sql);
            eksekusi.execute();
            
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan\n"+ e);
        }
    }
}
