package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean cond = true;
        while(cond){
            System.out.println("bd = bin-dec");
            System.out.println("db = dec-bin");
            System.out.println("dh = dec-hex");
            System.out.println("hd = hex-dec");
            System.out.println("e = konec");
            String s = sc.nextLine();
            switch (s){
                case "bd" -> bd(s);
                case "db" -> db(s);
                case "dh" -> dh(s);
                case "hd" -> hd(s);
                case "e" -> cond = false;
            }
        }
    }
    public static void bd(String b) {
        Scanner sc = new Scanner(System.in);
        System.out.println("teď to číslo");
        String number = sc.nextLine();
        System.out.print("tvoje číslo je: ");
        System.out.println(Integer.parseInt(number,2));
    }
    public static void db(String b) {
        Scanner sc = new Scanner(System.in);
        System.out.println("teď to číslo");
        String number = sc.nextLine();
        int i = Integer.parseInt(number);
        System.out.print("tvoje číslo je: ");
        System.out.println(Integer.toBinaryString(i));
    }
    public static void dh(String b) {
        Scanner sc = new Scanner(System.in);
        System.out.println("teď to číslo");
        String number = sc.nextLine();
        int i = Integer.parseInt(number);
        System.out.print("tvoje číslo je: ");
        System.out.println(Integer.toHexString(i));
    }
    public static void hd(String b) {
        Scanner sc = new Scanner(System.in);
        System.out.println("teď to číslo");
        String number = sc.nextLine();
        int decimal=Integer.parseInt(number,16);
        System.out.print("tvoje číslo je: ");
        System.out.println(decimal);
    }

}

