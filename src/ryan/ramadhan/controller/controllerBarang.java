package ryan.ramadhan.controller;

import ryan.ramadhan.model.ModelBarang;
import ryan.ramadhan.view.viewBarangInternal;

/**
 * @author Ryan Ramadhan || 1910631170229
 */

public class controllerBarang {
    
    //inisisalisasi variable class modelBarang dan viewBarangInternal
    private ModelBarang mB;
    private viewBarangInternal vB;
    
    public controllerBarang(viewBarangInternal vB){
        this.vB = vB;
    }
    
    //Method Bersihkan
    public void bersihkan(){
        //Ryan Ramadhan || 1910631170229 || 5H
        //pemanggilan variable objek swing yang ada di view
        vB.getIdBarangView().setText("");
        vB.getNamaBarangView().setText("");
        vB.getHargaBarangView().setText("");
        vB.getJumlahBarangView().setText("");
    }
    
    //Method kontrolButton
    public void kontrolButton(){
        //Ryan Ramadhan || 1910631170229 || 5H
        vB.getTombolSimpan().setEnabled(true);
        vB.getTombolUbah().setEnabled(false);
        vB.getTombolHapus().setEnabled(false);
        vB.getTombolBatal().setEnabled(true);
    }
    
    //Method kontrolButton2
    public void kontrolButtonDua(){
        //Ryan Ramadhan || 1910631170229 || 5H
        vB.getTombolSimpan().setEnabled(true);
        vB.getTombolUbah().setEnabled(true);
        vB.getTombolHapus().setEnabled(true);
        vB.getTombolBatal().setEnabled(true);
    }
    
    //Method delete
    public void delete(){
        //Ryan Ramadhan || 1910631170229 || 5H
        mB = new ModelBarang();
        mB.setIdBarangModel(Integer.parseInt(vB.getIdBarangView().getText()));
        
        mB.HapusDataBarang();
        bersihkan();
        kontrolButton();
    }
    
    //Method update
    public void update(){
        //Ryan Ramadhan || 1910631170229 || 5H
        mB = new ModelBarang();
        mB.setIdBarangModel(Integer.parseInt(vB.getIdBarangView().getText()));
        mB.setNamaBarangModel(vB.getNamaBarangView().getText());
        mB.setHargaBarangModel(Integer.parseInt(vB.getHargaBarangView().getText()));
        mB.setJumlahBarangModel(Integer.parseInt(vB.getJumlahBarangView().getText()));
       
        mB.UpdateDataBarang();
        kontrolButton();
    }
    
    //Method simpan
    public void simpan(){
        //Ryan Ramadhan || 1910631170229 || 5H
        mB = new ModelBarang();
        mB.setIdBarangModel(Integer.parseInt(vB.getIdBarangView().getText()));
        mB.setNamaBarangModel(vB.getNamaBarangView().getText());
        mB.setHargaBarangModel(Integer.parseInt(vB.getHargaBarangView().getText()));
        mB.setJumlahBarangModel(Integer.parseInt(vB.getJumlahBarangView().getText()));
       
        mB.simpanDataBarang();
        bersihkan();
    }
}
