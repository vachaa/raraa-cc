 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pbo.latihan20;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author ASUS
 */
public class PBO4182201007941822010082Latihan20 {

    public static void main(String[] args) {
        System.out.println("FORMAT TUGAS PBO");
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.getDefault());
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        double saldoAwal = 3500000;
        double bungaPerBulan = 0.08;
        int lamaBulan = 8;

        System.out.println("Saldo Awal: " + currencyFormat.format(saldoAwal));

        for (int i = 1; i <= lamaBulan; i++)
        {
            saldoAwal += (saldoAwal * bungaPerBulan);
            System.out.println("Saldo bulan " + i + ": " + currencyFormat.format (Double.valueOf(decimalFormat.format(saldoAwal))));
        }
    }
}

