
package ryan.ramadhan.controller;

import ryan.ramadhan.model.ModelPelanggan;
import ryan.ramadhan.view.viewPelangganInternal;

/**
 * @author Ryan Ramadhan || 1910631170229
 */

public class controllerPelanggan {
    
    //inisisalisasi variable class modelPelanggan dan viewPelangganInternal
    private ModelPelanggan mP;
    private viewPelangganInternal vP;
    
    public controllerPelanggan(viewPelangganInternal vP){
        this.vP = vP;
    }
    
    //Method Bersihkan
    //Ryan Ramadhan || 1910631170229 || 5H
    public void bersihkan(){
        vP.getIdPelangganView().setText("");
        vP.getNamaPelangganView().setText("");
        vP.getNoHpView().setText("");
        vP.getAlamatView().setText("");
        vP.getUmurView().setText("");
    }
    
    //Method kontrolButton
    //Ryan Ramadhan || 1910631170229 || 5H
    public void kontrolButton(){
        vP.getTombolSimpan().setEnabled(true);
        vP.getTombolEdit().setEnabled(false);
        vP.getTombolHapus().setEnabled(false);
        vP.getTombolBatal().setEnabled(true);
    }
    
    //Method kontrolButton2
    //Ryan Ramadhan || 1910631170229 || 5H
    public void kontrolButtonDua(){
        vP.getTombolSimpan().setEnabled(true);
        vP.getTombolEdit().setEnabled(true);
        vP.getTombolHapus().setEnabled(true);
        vP.getTombolBatal().setEnabled(true);
    }
    
    //Method delete
    //Ryan Ramadhan || 1910631170229 || 5H
    public void delete(){
        mP = new ModelPelanggan();
        mP.setIdPelangganModel(Integer.parseInt(vP.getIdPelangganView().getText()));
        
        mP.HapusDataPelanggan();
        bersihkan();
        kontrolButton();
    }
    
    //Method update
    //Ryan Ramadhan || 1910631170229 || 5H
    public void update(){
        mP = new ModelPelanggan();
        mP.setIdPelangganModel(Integer.parseInt(vP.getIdPelangganView().getText()));
        mP.setNamaPelangganModel(vP.getNamaPelangganView().getText());
        mP.setNomorHpModel(vP.getNoHpView().getText());
        
        if(vP.getPriaView().isSelected()){
            mP.setJenisKelaminModel("Pria");
        }
        else if(vP.getWanitaView().isSelected()){
            mP.setJenisKelaminModel("Wanita");
        }
        
        mP.setUmur(Integer.parseInt(vP.getUmurView().getText()));
        mP.setAlamat(vP.getAlamatView().getText());
        
        mP.UpdateDataPelanggan();
        kontrolButton();
    }
    
    //Method simpan
    //Ryan Ramadhan || 1910631170229 || 5H
    public void simpan(){
        mP = new ModelPelanggan();
        mP.setIdPelangganModel(Integer.parseInt(vP.getIdPelangganView().getText()));
        mP.setNamaPelangganModel(vP.getNamaPelangganView().getText());
        mP.setNomorHpModel(vP.getNoHpView().getText());
        
        if(vP.getPriaView().isSelected()){
            mP.setJenisKelaminModel("Pria");
        }
        else if(vP.getWanitaView().isSelected()){
            mP.setJenisKelaminModel("Wanita");
        }
        
        mP.setUmur(Integer.parseInt(vP.getUmurView().getText()));
        mP.setAlamat(vP.getAlamatView().getText());
        
        mP.simpanDataPelanggan();
        bersihkan();
    }
}
