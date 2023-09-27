/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo.pkg41822010079.pkg41822010082.latihan22;

/**
 *
 * @author Caca
 * Nama : Adjeng Rara Rengganis
 * NIM  : 41822010079
 * Nama : Vanisha Putri Kania
 * NIM  : 41822010082
 */
import java.util.Scanner;
public class PBO4182201007941822010082Latihan22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Format Tugas PBO");
     
       
        try (Scanner input = new Scanner(System.in)) {
            
            double diameter = 0;
            boolean inputValid = false;
            
            do {
                System.out.print("Masukkan Nilai Diameter Lingkaran: ");
                if (input.hasNextDouble()) {
                    diameter = input.nextDouble();
                    inputValid = true;
                } else {
                    System.out.println("Nilai Diameter Tidak Sesuai.");
                    input.nextLine(); 
                }
            } while (!inputValid);
            
            double jariJari = diameter / 2;
            double luas = Math.PI * Math.pow(jariJari, 2);
            double keliling = Math.PI * diameter;
            
            // Menampilkan hasil perhitungan
            System.out.println("Jari-jari Lingkaran: " + jariJari);
            System.out.println("Luas Lingkaran: " + luas);
            System.out.println("Keliling Lingkaran: " + keliling);
        }
    }

    
    }

// TODO code application logic here
    
    

