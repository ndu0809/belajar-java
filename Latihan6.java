package com.belajar;

import javax.swing.JOptionPane;

public class Latihan6 {
    public static void main(String[] args) {
        String nama = "";
        nama = JOptionPane.showInputDialog("Silahkan masukkan nama anda");
        String msg = "Hello " + nama + "!";
        JOptionPane.showMessageDialog(null, msg);
    }
}
