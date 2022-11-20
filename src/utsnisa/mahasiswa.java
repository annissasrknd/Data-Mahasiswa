/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsnisa;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Anissa Srikandi
 */
public class mahasiswa {
    
    public static void main(String[] args) {
        String[] size = new String[5];
        Scanner input = new Scanner (System.in);
             Random randomGenerator = new Random();

             //==================Create Tipe Data==========================
             int id[] = new int[10];
             int tglMasuk[] = new int[10];
             String nama[] = new String[10];
             String kelas[] = new String[10];
             int i=0,total=0;
             
             
        //================DoWhile=====================
        do {
            i++;
            //================Input Nama==================
            System.out.print("Nama : ");
            nama[i] = input.next();
            //================Input kelas=================
            System.out.print("Kelas : ");
            kelas[i] = input.next();
            
            //================Input Tgl Masuk=============
            System.out.print("tglMasuk : ");
            tglMasuk[i] = input.nextInt();
            
            //================Random Number===============
            id[i] = randomGenerator.nextInt(100);
            
            
            if (i% 2 == 0) {
                //================Absen Ganjil===============
                System.out.print(id[1]+" Adalah Absen Genap");
            } else {
                //================Absen Genap================
                System.out.print(id[1]+" Adalah Absen Ganjil");
//                    
            }
            ArrayList DataMahasiswa;
        DataMahasiswa = new DataMahasiswa();
        
        System.out.println("");
        System.out.println("Data Nama Di Hapus");
        
        //================Add Data===============
        DataMahasiswa.add(nama[i]);
        DataMahasiswa.add(kelas[i]);
        DataMahasiswa.add(tglMasuk[i]);
        
        //================Remove Data Nama============
        DataMahasiswa.remove(nama[i]);
        System.out.println(DataMahasiswa);
        System.out.println("Size Data : "+DataMahasiswa.size());
            
            
            
            
        }while(nama[i] == null ? "0" != null : !nama[i].equals("0"));
                //================Nodata========================
                System.out.print("\n----[Hasil Data]----\n");
        }     

    private static class DataMahasiswa extends ArrayList {

        public DataMahasiswa() {
        }
    }
}

