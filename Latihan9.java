package com.belajar;

import java.util.Scanner;

public class Latihan9 {
    //Method non void untuk menghitung luas persegi panjang
    public static double hitungluas(double panjang, double lebar){
        return panjang * lebar;
    }
    //Mengembalikan hasil perkalian panjang dan lebar
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    //Mengambil input panjang
    System.out.print("Masukkan panjang persegi panjang : ");
    double panjang = scanner.nextDouble();
    //Mengambil input lebar
    System.out.print("Masukkan lebar persegi panjang : ");
    double lebar = scanner.nextDouble();
    //Memanggil method hitungLuas dan menyimpan hasilnya
    double luas = hitungluas(panjang, lebar);
    //Menampilkan hasil
    System.out.println("Luas persegi panjang adalah : " + luas);
    //Menutup scanner
    scanner.close();
    }
}
