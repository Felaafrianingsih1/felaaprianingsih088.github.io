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
   protected int nohp;
   
    public  penyewamobil(String namaPenyewa,String alamat, int nohp){
      this.namaPenyewa = namaPenyewa;
      this.alamat = alamat;
      this.nohp = nohp;
      
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

   

   public String toString(){
      

      return namaPenyewa+"     "+alamat+"            "+nohp;
   }                               
} 
    
  

    

