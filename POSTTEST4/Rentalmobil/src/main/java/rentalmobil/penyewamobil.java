/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentalmobil;

/**
 *
 * @author A314
 */
public class penyewamobil {
    
    
   protected String namaPenyewa,alamat;
   protected int nohp, jumlahpinjam;
   
   
    public  penyewamobil(String namaPenyewa, String alamat, int nohp){
      this.namaPenyewa = namaPenyewa;
      this.alamat = alamat;
      this.nohp = nohp;
      
   }
    
 public void status(){
     System.out.println("data penyewa");
 }
    // overloading
  public  penyewamobil( int jumlahpinjam){
      this.jumlahpinjam= jumlahpinjam;
      
  }
  
  public  penyewamobil(String namaPenyewa,String alamat, int nohp,int jumlahpinjam){
      this.namaPenyewa = namaPenyewa;
      this.alamat = alamat;
      this.nohp = nohp;
      this.jumlahpinjam= jumlahpinjam;
  }
    public String getnamaPenyewa(){
      return namaPenyewa;
    }
    
      public void setnamaPenyewa(String namaPenyewa) {
        this.namaPenyewa = namaPenyewa;
    }

   public String getalamat(){
    return alamat;
   }
   
    public void setalamat(String alamat) {
       this.alamat= alamat;
    }

   public int getnohp(){
      return nohp;
   }

       public void setnohp(int nohp) {
       this.nohp= nohp;
    }

      public int getjumlahpinjam(){
      return jumlahpinjam;
   }

       public void setjumlahpinjam(int jumlahpinjam) {
       this.jumlahpinjam= jumlahpinjam;
    }


   public String toString(){
      

      return namaPenyewa+"     "+alamat+"            "+nohp+"         "+jumlahpinjam;
   }                               
} 
    
  

    

