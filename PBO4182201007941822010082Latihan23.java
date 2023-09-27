/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo.pkg41822010079.pkg41822010082.latihan23;

/**
 *
 * @author Caca
 * Nama : Adjeng Rara Rengganis
 * NIM  : 41822010079
 * Nama : Vanisha Putri Kania
 * NIM  : 41822010082
 */
import java.util.Scanner;
public class PBO4182201007941822010082Latihan23 {

    /**
     * @param args the command line arguments
     * @param String
     */
    public static void main(String[] args, String String) {
        System.out.println("Format Tugas PBO");
   
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.println("========Program Nilai Terbesar dan Terkecil Nilai Mahasiswa======");
            System.out.print("Masukkan Nama Petugas: ");
            String nmPetugas   = scanner.nextLine();
            
            System.out.println("Masukkan Banyaknya Nilai Mahasiswa:");
            int jumlahMahasiswa = scanner.nextInt();
            
            if (jumlahMahasiswa <= 0) {
                System.out.println("Jumlah mahasiswa harus lebih dari 0.");
                return;
            }
            
            double nilaiTerbesar = Double.MIN_VALUE;
            double nilaiTerkecil = Double.MAX_VALUE;
            
            for (int i = 1; i <= jumlahMahasiswa; i++) {
                System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
                double nilai = scanner.nextDouble();
                
                if (nilai > nilaiTerbesar) {
                    nilaiTerbesar = nilai;
                }
                
                if (nilai < nilaiTerkecil) {
                    nilaiTerkecil = nilai;
                }
            }
            
            System.out.print("Nilai terbesar: " + nilaiTerbesar);
            System.out.print("Nilai terkecil: " + nilaiTerkecil);
            }
        }
    }


// TODO code application logic here
   
    

