/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package rentalmobil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author A314
 */
public class Rentalmobil {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        ArrayList <datasewamobil> dtsewamobil = new ArrayList<>();
        ArrayList <datamobilkembali> dtmobilkembali = new ArrayList<>();
        
        while (true){
            System.out.println("=     MENU   =");
            System.out.println("1. INSERT DATA");
            System.out.println("2. READ   DATA");
            System.out.println("3. UPDATE DATA");
            System.out.println("4. DELETE DATA");
            System.out.println("5. Exit       ");
            System.out.println("==============");
            System.out.print("Input: ");
            int menu = Integer.parseInt(br.readLine());
            
            switch (menu) {
                case 1:
                    System.out.println("==========================");
                    System.out.println("=    INSERT DATA         =");
                    System.out.println("= 1. Data penyewa Mobil  =");
                    System.out.println("= 2. Data Mobil  kembali =");
                    System.out.println("=====================");
                    int pilih = Integer.parseInt(br.readLine());
                    switch(pilih){
                        case 1 : 
                            System.out.print("Masukkan Nama  : ");
                            String namaPenyewa = br.readLine();
                            System.out.print("Masukkan alamat : ");
                            String alamat =br.readLine();
                            System.out.print("Masukkan nomor hp : ");
                            int nohp = Integer.parseInt(br.readLine());
                            System.out.print("Masukkan Nama  : ");
                            String namamobil = br.readLine();
                            System.out.print("Masukkan id penyewa : ");
                            int idsewa = Integer.parseInt(br.readLine());
                            System.out.print("Masukkan harga sewa perhari  : ");
                            int hargaperhari = Integer.parseInt(br.readLine());                           
                            datasewamobil baru = new datasewamobil( namaPenyewa,  alamat,  nohp, namamobil, idsewa,  hargaperhari);
                            dtsewamobil.add(baru);
                            break;
                        case 2 :
                            System.out.print("Masukkan Nama  : ");
                            String namasewa= br.readLine();
                            System.out.print("Masukkan alamat : ");
                            String alamatpenyewa =br.readLine();
                            System.out.print("Masukkan nomor hp : ");
                            int nohppenyewa = Integer.parseInt(br.readLine());
                            System.out.print("Masukkan id penyewa : ");
                            int idsewamblkembali = Integer.parseInt(br.readLine());
                            System.out.print("Masukkan harga sewa perhari  : ");
                            String kondisimobil = br.readLine();
                            datamobilkembali dtbaru = new datamobilkembali(namasewa, alamatpenyewa,  nohppenyewa,  idsewamblkembali, kondisimobil);
                            dtmobilkembali.add(dtbaru);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("= READ DATA          =");
                    System.out.println("1. Data penyewa Mobil ");
                    System.out.println("2. Data  Mobil kembali");
                    System.out.println("======================");
                    System.out.println("Masukkan pilihan : ");
                    int choose = Integer.parseInt(br.readLine());
                    switch (choose) {
                        case 1:
                            System.out.println("Data Sewa mobil");
                            for (int i = 0; i < dtsewamobil.size(); i++){
                                System.out.println("Nama  : " + dtsewamobil.get(i).getnamaPenyewa());
                                System.out.println("alamat  : " + dtsewamobil.get(i).getalamat());
                                System.out.println("nomor  hp : " + dtsewamobil.get(i).getnohp());
                                System.out.println("Nama mobil : " + dtsewamobil.get(i).getnamamobil());
                                System.out.println("id penyewa  : " + dtsewamobil.get(i).getidsewa());
                                System.out.println("harga sewa perhari  : " + dtsewamobil.get(i).gethargaperhari());
                                System.out.println("=====================");
                            }
                            break;
                        case 2:
                            System.out.println("Data mobil kembali");
                            for (int i = 0; i < dtmobilkembali.size(); i++){
                                System.out.println("Nama  : " + dtmobilkembali.get(i).getnamaPenyewa());
                                System.out.println("alamat  : " + dtmobilkembali.get(i).getalamat());
                                System.out.println("nomor hp  : " + dtmobilkembali.get(i).getnohp());
                                System.out.println("id penyewa  : " + dtmobilkembali.get(i).getidsewa());
                                System.out.println("kondisi mobil : " + dtmobilkembali.get(i).getkondisimobil());
                                System.out.println("=====================");
                            }
                            break;
                        default:
                            System.out.println("Pilihan Tidak Tersedia");
                            break;
                }
                    break;

                case 3:
                   
                    System.out.println("= EDIT DATA =");
                    System.out.println("1. Edit Data penyewa ");
                    System.out.println("2. Edit data mobil kembali ");
                    System.out.println("========");     
                    System.out.print("Masukkan data yang ingin diedit : ");
                    int menuEdit = Integer.parseInt(br.readLine());
                    if(menuEdit == 1){
                        //Code Process By 079
                        System.out.println("Masukan Nama  : "); String findsewa = br.readLine();
                        
                        for(datasewamobil sewa : dtsewamobil){
                            if(sewa.getnamaPenyewa().equals(findsewa)){
                                System.out.println("Nama  : "); sewa.setnamaPenyewa(br.readLine());
                                System.out.println("alamat         : "); sewa.setalamat(br.readLine());
                                System.out.println("hp           : "); sewa.setnohp(Integer.parseInt(br.readLine()));
                                System.out.println("Nama  : "); sewa.setnamamobil(br.readLine());
                                System.out.println("idsewa            : "); sewa.setidsewa(Integer.parseInt(br.readLine()));
                                System.out.println("harga             : "); sewa.sethargaperhari(Integer.parseInt(br.readLine()));
                                System.out.println("==================");
                            }
                        }
                        
                   
                    }else if(menuEdit == 2){
                        System.out.println("Masukan  : "); String findkmbl = br.readLine();
                        //Code Process By 079
                        for(datamobilkembali kmbl : dtmobilkembali){
                            if(kmbl.getnamaPenyewa().equals(findkmbl)){
                                System.out.println("Nama           : "); kmbl.setnamaPenyewa(br.readLine());
                                System.out.println("alamat         : "); kmbl.setalamat(br.readLine());
                                System.out.println("nomor hp           : "); kmbl.setnohp(Integer.parseInt(br.readLine()));
                                System.out.println("idsewa            : "); kmbl.setidsewa(Integer.parseInt(br.readLine()));
                                System.out.println("kondisimobil            : "); kmbl.setkondisimobil(br.readLine());
                                System.out.println("==================");
                            }
                        }
                        
                    }else{
                        System.out.println("Data yang dipilih tidak tersedia");
                    }
                    break;
                case 4:
                    System.out.println("= DELETE DATA =");
                    System.out.println("1. Delete Data PENYEWA");
                    System.out.println("2. Delete Data Mobil kembali");
                    System.out.println("========");     
                    System.out.print("Masukkan data yang ingin dihapus : ");
                    int menuHapus = Integer.parseInt(br.readLine());
                    if(menuHapus == 1){
                        //Code Process By 079
                        System.out.println("Masukan Nama penyewa : "); String findswl = br.readLine();
                        
                        for(int i = 0; i < dtsewamobil.size(); i++){
                            if(dtsewamobil.get(i).getnamaPenyewa().equals(findswl)){
                                dtsewamobil.remove(i);
                                System.out.println(" Data Terhapus!\n");
                            }
                        }
                                          
                    }else if(menuHapus == 2){
                        //Code Process By 079
                        System.out.println("Masukan Nama penyewa : "); String findkmbll= br.readLine();
                        
                        for(int i = 0; i < dtmobilkembali.size(); i++){
                            if(dtmobilkembali.get(i).getnamaPenyewa().equals(findkmbll)){
                                dtmobilkembali.remove(i);
                                System.out.println(" Data Terhapus!\n");
                            }
                        }
                    }
                    break;
                case 5 :
                    System.out.println("Exit program...");
                    System.exit(0);
                    break;
                default :
                    System.out.println("Pilihan Tidak Ada!");
            }
        }
    }
}

