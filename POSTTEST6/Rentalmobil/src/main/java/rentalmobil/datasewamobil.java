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

    public datasewamobil(String namaPenyewa,String alamat, int nohp,int jumlahpinjam, String namamobil,  int idsewa, int hargaperhari) {
        super(namaPenyewa, alamat, nohp, jumlahpinjam); 
        this.namamobil = namamobil;
        this.idsewa = idsewa;
        this.hargaperhari =  hargaperhari;
    }

 
  
    @Override
public void status(){
     System.out.println("data mobil yang disewa");
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
//        @Override
//        void display(){
//            System.out.print(this.namaPenyewa + "");
//            System.out.print(this.alamat + " ");
//            System.out.print(this.nohp + "");
//            System.out.print(this.jumlahpinjam + " ");
//            System.out.print(this.namamobil + "");
//            System.out.print(this.idsewa + " ");
//            System.out.print(this.hargaperhari + " ");
//            
//            
     
}

