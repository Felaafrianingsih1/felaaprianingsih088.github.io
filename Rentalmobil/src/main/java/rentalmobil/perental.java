/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentalmobil;

/**
 *
 * @author A314
 */
public class perental {
   private int jumlah_rental,Harga;;
   private String name_perental;
   private int kode_perental;

   perental(int kode_perental,int jumlah_rental, String name_perental, int Harga){
      this.kode_perental = kode_perental;
      this.jumlah_rental = jumlah_rental;
      this.name_perental = name_perental;
      this.Harga = Harga;
   }

   
    public int getkode_perental(){
      return kode_perental;
    }
   public int getjumlah_rental(){
      return jumlah_rental;
   }
   public int getHarga(){
      return Harga;
   }
   public String getname_perental(){
      return name_perental;
   }

   public String toString(){
      

      return kode_perental+"      "+name_perental+"        "+jumlah_rental+"                "+Harga;
   }                               
} 


