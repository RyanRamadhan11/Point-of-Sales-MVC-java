
package ryan.ramadhan.controller;

import ryan.ramadhan.model.ModelSupplier;
import ryan.ramadhan.view.viewSupplierInternal;

/**
 * @author Ryan Ramadhan || 1910631170229
 */

public class controllerSupplier {
    
    //inisialisasi
    private ModelSupplier ms;
    private viewSupplierInternal vsi;
    
    //membuat konstruktor
    public controllerSupplier(viewSupplierInternal vsi) {
        this.vsi = vsi;
    }
    
    //membuat method yang dibutuhkan
    public void bersihkan(){
        //pemanggilan variable objek swing yang ada di view
        vsi.getIdSupplier().setText("");
        vsi.getNamaSupplier().setText("");
        vsi.getAlamatSupplier().setText("");
        vsi.getBarangSupplier().setText("");
    }
    
    public void kontrolButton(){
        vsi.getTombolTambah().setEnabled(true);
        vsi.getTombolUbah().setEnabled(false);
        vsi.getTombolHapus().setEnabled(false);
        vsi.getTombolBatal().setEnabled(true); 
    }
    
    public void kontrolButtonDua(){
        vsi.getTombolTambah().setEnabled(true);
        vsi.getTombolUbah().setEnabled(true);
        vsi.getTombolHapus().setEnabled(true);
        vsi.getTombolBatal().setEnabled(true); 
    }
    
    public void deleteData(){
        ms = new ModelSupplier();
        ms.setIdSupplierModel(vsi.getIdSupplier().getText());
        
        ms.hapusDataSupplier();
        bersihkan();
        kontrolButton();
    }
    
    public void updateData(){
        ms = new ModelSupplier();
        ms.setIdSupplierModel(vsi.getIdSupplier().getText());
        ms.setNamaSupplierModel(vsi.getNamaSupplier().getText());
        ms.setAlamatSupplierModel(vsi.getAlamatSupplier().getText());
        ms.setBarangSupplierModel(vsi.getBarangSupplier().getText());
        
        ms.updateDataSupplier();
        kontrolButton();
    }
    
    public void simpan(){
        ms = new ModelSupplier();
        ms.setIdSupplierModel((vsi.getIdSupplier().getText()));
        ms.setNamaSupplierModel(vsi.getNamaSupplier().getText());
        ms.setAlamatSupplierModel(vsi.getAlamatSupplier().getText());
        ms.setBarangSupplierModel(vsi.getBarangSupplier().getText());
        
        ms.simpanDataSupplier();
        bersihkan();
    }
}
