/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pbo.latihan26;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author ASUS
 * Nama : Adjeng Rara Rengganis
 * NIM  : 41822010079
 * Nama : Vanisha Putri Kania 
 * NIM  : 41822010082
 */
public class PBO4182201007941822010082Latihan26 
{

    public static void main(String[] args) 
    {
        System.out.println("FORMAT TUGAS PBO");
        
        Date date = new Date();

        // Mengatur format waktu
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        // Mengonversi waktu ke string dengan format yang diinginkan
        String formattedDate = sdf.format(date);

        // Mendapatkan hari
        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // Array untuk menyimpan nama hari
        String[] daysOfWeek = {"Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu"};

        // Menampilkan waktu dan hari
        
        System.out.println("Hari ini adalah hari : " + daysOfWeek [dayOfWeek - 1] + formattedDate); 
    }
}
