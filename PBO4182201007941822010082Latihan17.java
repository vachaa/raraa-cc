/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pbo.latihan17;

import java.util.Scanner;

/**
 *
 * @author ASUS
 * Nama : Adjeng Rara Rengganis
 * NIM  : 41822010079
 * Nama : Vanisha Putri Kania 
 * NIM  : 41822010082
 */
public class PBO4182201007941822010082Latihan17 {

    public static void main(String[] args) {
        System.out.println("FORMAT TUGAS PBO");
        
        System.out.println("============Program Tunjangan=============");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan gaji pokok (Rp): ");
        double gajiPokok = scanner.nextDouble();

        scanner.nextLine(); // Membersihkan newline dari buffer

        System.out.print("Status Anda? (Menikah/Belum) : ");
        String statusMenikah = scanner.nextLine();

        double tunjangan = 0;

        if (statusMenikah.equalsIgnoreCase("Menikah")) {
            tunjangan = 0.35 * gajiPokok;
        }

        double totalGaji = gajiPokok + tunjangan;
        System.out.println("=====HASIL PERHITUNGAN GAJI ANDA=====");
        System.out.println("\nDetail Gaji");
        System.out.println("Gaji Pokok    : Rp " + gajiPokok);
        System.out.println("Tunjangan     : Rp " + tunjangan);
        System.out.println("Total Gaji    : Rp " + totalGaji);
    }
}
