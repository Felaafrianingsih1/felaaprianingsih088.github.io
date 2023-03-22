/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentalmobil;

/**
 *
 * @author A314
 */
public class datasewamobil  extends penyewamobil{
     private String namamobil;
    
    private int idsewa;
    private int hargaperhari;

    public datasewamobil(String namaPenyewa,String alamat, int nohp, String namamobil,  int idsewa, int hargaperhari) {
        super(namaPenyewa, alamat, nohp);
        this.namamobil = namamobil;
        this.idsewa = idsewa;
        this.hargaperhari =  hargaperhari;
    }
    
        
      public String getnamamobil() {
        return namamobil;
    }
    public int getidsewa() {
        return idsewa;
    }
    
        public int gethargaperhari() {
        return hargaperhari;
    }
        
    
    public void setnamamobil(String namamobil) {
        this.namamobil = namamobil;
    } 

    public void setidsewa(int idsewa) {
        this.idsewa = idsewa;
    }
    
    
        public void sethargaperhari(int hargaperhari) {
        this.hargaperhari = hargaperhari;
    }
}

