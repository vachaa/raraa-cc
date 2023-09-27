/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo.pkg41822010079.pkg41822010082latihan25;

/**
 *
 * @author Caca
 * Nama : Adjeng Rara Rengganis
 * NIM  : 41822010079
 * Nama : Vanisha Putri Kania
 * NIM  : 41822010082
 */
import java.util.Scanner;
public class PBO4182201007941822010082Latihan25 {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
         System.out.println("Format Tugas PBO");
      
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan nama depan Anda untuk dieja: ");
            String nama = input.nextLine();
            
            ejaNama(nama);
        }
    }

    public static void ejaNama(String nama) {
        System.out.println("Ejaan nama \"" + nama + "\":");
        for (int i = 0; i < nama.length(); i++) {
            char huruf = nama.charAt(i);
            int indeks = i + 1; 

            System.out.println("Huruf ke-" + indeks + ": " + huruf);
        }
    }
}

    


        
    

// TODO code application logic here
    
   
