package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Blok START
        Scanner scan = new Scanner(System.in);

        //Trzy bloki wejścia wyjścia:
        System.out.println("Podaj a: [Zatwierdź ENTEREM]");
        int a = scan.nextInt();
        System.out.println("Podaj b: [Zatwierdź ENTEREM]");
        int b = scan.nextInt();
        System.out.println("Podaj c: [Zatwierdź ENTEREM]");
        int c = scan.nextInt();
        //Blok operacji:
        int suma = a + b + c;
        //Blok wejścia/wyjścia:
        System.out.println("Wynik sumy: " + a + " + " + b + " + " + c + " = " + suma );
        //Blok STOP

    }
}