/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package rentalmobil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author A314
 */
public class Rentalmobil {

    
   public static void main(String[] args) {
      
      List<perental> c = new ArrayList<perental>();
      Scanner s = new Scanner(System.in);
      Scanner s1 = new Scanner(System.in);
      int ch;
      do{
         System.out.println("1.INSERT");
         System.out.println("2.DISPLAY");
         System.out.println("3.SEARCH");
         System.out.println("4.UPDATE");
         System.out.println("5.DELETE");
         System.out.print("Enter Your Choice : ");
         ch = s.nextInt();

         switch(ch){
            case 1:
               System.out.print("Masukan kode perental : ");
               int code = s.nextInt();
               System.out.print("Masukan nama : ");
               String name_perental = s1.nextLine();
               System.out.print("Masukan jumlah mobil yang dirental : ");
               int jumlah = s.nextInt();
               System.out.print("Masukan harga : ");
               int Harga = s.nextInt();

               c.add(new perental(code,jumlah,name_perental,Harga));
            break;
            case 2:
                 System.out.println("\n|kode|\tNama|\tJumlah rental|\tHarga");
                 System.out.println("--------------------------------------------------");

               Iterator<perental> i = c.iterator();
               while(i.hasNext()){
                  perental e = i.next(); 
                  System.out.println(e);
               }
               System.out.println("--------------------------------------------------");
            break;
                 
            case 3:
               boolean found = false;
               System.out.print("masukan kode yang dicari :");
               int kode_perental = s.nextInt();
               System.out.println("--------------------------------------------------");
               i = c.iterator();
               while(i.hasNext()){
                  perental e = i.next();
                  if(e.getkode_perental() == kode_perental)  {
                     System.out.println(e);
                     found = true;
                  }
               }
               
               if(!found){
                  System.out.println("Record Not Found");
               }
               System.out.println("--------------------------------------------------");
            break;

            case 4:
               found = false;
               System.out.print("masukan kode yang ingin diupdate :");
               kode_perental = s.nextInt();
               
               ListIterator<perental>li = c.listIterator();
               while(li.hasNext()){
                  perental e = li.next();
                  if(e.getkode_perental() == kode_perental)  {
                     System.out.print("Masukan nama baru : ");
                     name_perental = s1.nextLine();
                     
                     System.out.print("masukan  jumlah mobil baru : ");
                     jumlah = s.nextInt();
                     
                     System.out.print("masukan harga baru : ");
                     Harga = s.nextInt();
                     
                     li.set(new perental(kode_perental,jumlah,name_perental,Harga));
                     found = true;
                  }
               }
               
               if(!found){
                  System.out.println("Record Not Found");
               }else{
                  System.out.println("Record is Updated Successfully...!");
               }

               
            break;
                 
            case 5:
                found = false;
               System.out.print("masukan kode yang ingin dihapus :");
               kode_perental = s.nextInt();
               System.out.println("--------------------------------------------------");
               i = c.iterator();
               while(i.hasNext()){
                  perental e = i.next();
                  if(e.getkode_perental() == kode_perental)  {
                     i.remove();
                     found = true;
                  }
               }
               
               if(!found){
                  System.out.println("Record Not Found");
               }else{
                  System.out.println("Record is Deleted Successfully...!");
               }

               System.out.println("--------------------------------------------------");
            break;
            
         }
      }while(ch!=0);
   }
}



