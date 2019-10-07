/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaimaxmin;

import java.util.Scanner;

/**
 *
 * @author 'KoalaX'
 * NAMA     : Fiqri Akbar Pratama
 * KELAS    : PBO1/IF1
 * NIM      : 10118020
 * Deksripsi Program : Program ini berisi program untuk menampilkan nilai
 * terbesar dan terkecil dari beberapa nilai yang sudah di inputkan serta
 * menampilkan nama petugas yang menginputkan
 */
public class Nilaimaxmin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int [] nilai = new int [20];
        int a;
        String nama;
        
        System.out.println("====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa====");
       
        Scanner ns = new Scanner(System.in);
        System.out.printf("Masukkan Nama Petugas\t\t\t : ");
        nama = ns.nextLine();
        
        System.out.printf("Masukkan Banyaknya Nilai Mahasiswa\t : ");
        n = ns.nextInt();
        for (a = 0; a < n; a++){
            System.out.printf("Masukkan Nilai Mahasiswa Ke-"+(a+1)+"\t = ");
            nilai[a] = ns.nextInt();
        }
        
        System.out.println("\n"+"====Hasil Nilai Mahasiswa====");
        for (a = 0; a < n; a++){
            System.out.println("Nilai Mahasiswa Ke-"+(a+1)+" = "+nilai[a]);
        }
        
        int min = nilai[1];
        int max = nilai[1];
        
        for ( a = 0; a < n; a++){
            if (nilai[a] < min){
                min = nilai[a];
            } else if (nilai[a] > max){
                max = nilai[a];
            }
        }
        System.out.println("\nNilai Terbesar Adalah "+ max);
        System.out.println("Nilai Terkecil adalah "+ min);
        System.out.println("\nPetugas\t : "+ nama);
      
    }
    
}
