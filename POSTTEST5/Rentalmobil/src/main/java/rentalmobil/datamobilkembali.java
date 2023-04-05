/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentalmobil;

/**
 *
 * @author A314
 */
public  class datamobilkembali extends penyewamobil {
       private int idsewa;
       private String kondisimobil;

    public datamobilkembali (String namaPenyewa,String alamat, int nohp, int idsewa, String kondisimobil) {
        super(namaPenyewa, alamat, nohp);
       
        this.idsewa = idsewa;
        this.kondisimobil =  kondisimobil;
    }
    
    
       @Override
public void status(){
     System.out.println("data mobil yang kembali");
 }

    public int getidsewa() {
        return idsewa;
    }
    
        public String getkondisimobil() {
        return kondisimobil;
    }
     
      public void setidsewa(int idsewa) {
        this.idsewa = idsewa;
    } 

    
        public void setkondisimobil(String kondisimobil) {
        this.kondisimobil = kondisimobil;
    } 

   
}