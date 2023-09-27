/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pbo.latihan19;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class PBO4182201007941822010082Latihan19 {

    public static void main(String[] args) 
    {
        System.out.println("FORMAT TUGAS PBO");
        Scanner scanner = new Scanner(System.in);
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.getDefault());
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        // Input saldo awal, bunga per bulan, dan lama dalam bulan
        System.out.print("Saldo Awal (Rp.): ");
        double saldoAwal = scanner.nextDouble();
        
        System.out.print("Bunga/Bulan (%): ");
        double bungaPerBulan = scanner.nextDouble() / 100;
        
        System.out.print("Lama (bulan): ");
        int lamaBulan = scanner.nextInt();
        
        // Menghitung saldo akhir
        for (int i = 1; i <= lamaBulan; i++) {
            saldoAwal += (saldoAwal * bungaPerBulan);
            System.out.println("Saldo di bulan " + i + ": " + currencyFormat.format(Double.valueOf(decimalFormat.format(saldoAwal))));
        }
    }
}

