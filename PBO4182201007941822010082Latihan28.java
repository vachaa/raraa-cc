/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo.pkg41822010079.pkg41822010082.latihan28;

/**
 *
 * @author Caca
 * Nama: Adjeng Rara Rengganis
 * NIM:  41822010079
 * Nama: Vanisha Putri Kania
 * NIM:  41822010082
 */

import java.util.Scanner;
public class PBO4182201007941822010082Latihan28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("Format Tugas PBO");
         
         System.out.println("====Program Mengganti Kata====");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan kalimat: ");
            String kalimat = scanner.nextLine();
            
            System.out.print("Ganti Kata: ");
            String kataLama = scanner.nextLine();
            
            System.out.print("Menjadi Kata: ");
            String kataBaru = scanner.nextLine();
            
            String kalimatBaru = gantiKata(kalimat, kataLama, kataBaru);
            
            System.out.println("Kalimat baru:");
            System.out.println(kalimatBaru);
        }
    }

    public static String gantiKata(String kalimat, String kataLama, String kataBaru) {
        String kalimatBaru = kalimat.replaceAll(kataLama, kataBaru);
        return kalimatBaru;
    }
}
// TODO code application logic here
    
    

