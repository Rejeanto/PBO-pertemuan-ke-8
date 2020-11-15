package com.pboreg;
import java.util.Scanner;

abstract class Luas {
    Scanner userInput = new Scanner(System.in);
    public abstract double hitungLuas();
    public abstract void Input();
}   
class Segitiga extends Luas {
    double luasSeg, alasSeg, tinggiSeg;
    public  double hitungLuas(){
        luasSeg = ((double)1/2) * alasSeg * tinggiSeg;
        return luasSeg;
    }

    public void Input(){
        System.out.println("SELAMAT DATANG DI PERHITUNGAN");
        System.out.println("------------------------------");
        System.out.println("Luas Segitiga");
        System.out.print("Alas = ");
        alasSeg = userInput.nextDouble();
        System.out.print("Tinggi = ");
        tinggiSeg = userInput.nextDouble();
        System.out.println("------------------------------");

    }
}

class Lingkaran extends Luas {
    double luasLing, jariLing, diameter;

    public double hitungLuas(){
        jariLing = diameter / 2;
        luasLing = (3.14) * jariLing * jariLing;
        return luasLing;
    }

    public  void Input() {
        System.out.println("Luas Lingkaran");
        System.out.print("Diameter : ");
        diameter = userInput.nextDouble();
        System.out.println("------------------------------");
    }
}

public class Main{
    public static void main(String[] args){
        Segitiga segitiga = new Segitiga();
        segitiga.Input();
        System.out.println("Hasil Luas Segitiga : " + segitiga.hitungLuas());
        System.out.println("------------------------------");

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.Input();
        System.out.println("Hasil Luas Lingkaran : " + lingkaran.hitungLuas());
        System.out.println("------------------------------");
    }
}