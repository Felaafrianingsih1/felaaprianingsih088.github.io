/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentalmobil;

/**
 *
 * @author A314
 */
public final class Keterangan {
    
    protected final String hargaperhari;
    protected final String kondisi;
    
    
    public Keterangan(String hargaperhari,String kondisi){
        this.hargaperhari = hargaperhari;
        this.kondisi = kondisi;
    }
    
      public String gethargaperhari(){
          return hargaperhari;
      }
      
      public String kondisi(){
          return kondisi;
      }
    
     
    public final void ketentuan( ){
        System.out.println(" ketentuan setiap  mobil harus sesuai dengan keterangan");
    }
     
    
    
}
