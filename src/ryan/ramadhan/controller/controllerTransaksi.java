
package ryan.ramadhan.controller;

import ryan.ramadhan.model.ModelTransaksi;
import ryan.ramadhan.view.viewTransaksi;

/**
 * @author Ryan Ramadhan || 1910631170229
 */

public class controllerTransaksi {
    
    //inisialisasi model dam inisialisasi view Transaksi
    private ModelTransaksi mT;
    private viewTransaksi vT;
    
    //membuat konstruktor
    public controllerTransaksi(viewTransaksi vT){
        this.vT = vT;
    }
    
    //Fungsi untuk memanggil simpan transaksi
    public void simpanTransaksi(){
        mT = new ModelTransaksi();
        mT.setIdPelanggan(Integer.parseInt(vT.getIdPelanggan().getText()));
        mT.setNamaPelanggan(vT.getNamaPelanggan().getText());
        mT.setNamaBarang(vT.getNamaBarang().getText());
        mT.setQty(vT.getQty().getText());
        mT.setTotalBayar(vT.getTotalBayar().getText());
        mT.setUangBayar(vT.getUangBayar().getText());
        
        mT.simpanTransaksi();
    }
    
     public void bersihkan(){
        vT.getIdPelanggan().setText("");
        vT.getNamaPelanggan().setText("");
        vT.getAlamatPelanggan().setText("");
        vT.getNomorHp().setText("");
        vT.getJenisKelamin().setText("");
        vT.getNamaBarang().setText("");
        vT.getHargaBarang().setText("");
        vT.getQty().setText("");
        vT.getTotalBayar().setText("");
        vT.getUangBayar().setText("");
    }
}

