package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Tworzenie obiektu scan do pobierania danych:
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj wartość int: [Zatwierdź ENTEREM]");
        int a = Integer.parseInt(scan.next());//parsowanie typu Integer.parseInt(String "")
        System.out.println("Podaj wartość int 2: [Zatwierdź ENTEREM]");
        int b = scan.nextInt();
        System.out.println("Podana wartość int1: " + a);
        System.out.println("Podana wartość int2: " + b);
    }
}