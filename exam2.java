package com.belajar2;
//Overriding
class CobaHitung1 {
    double p, l;
    
    double hitung(double p, double l){
        return(p*l);
    }
}

class CobaHitung2 {
    double a, t;
    double hitung(double a, double t){
        return(a*t/2);
    }
}

public class exam2 {
    public static void main(String[] args) {
        CobaHitung1 datar = new CobaHitung1();
        System.out.println("Hirung Persegi Panjang = " + datar.hitung(6, 4));
        CobaHitung2 segitiga = new CobaHitung2();
        System.out.println("Hitung segitiga = " + segitiga.hitung(5, 9));
    }
}
