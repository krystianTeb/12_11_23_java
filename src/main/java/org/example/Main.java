package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Tworzenie obiektu scan do pobierania danych:
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj wartość float: [Zatwierdź ENTEREM]");
        float liczba = scan.nextFloat(); // dobre: 2,56  zła: 2.56 no chyba, że zmienimy ustawienia językowe.

        System.out.println("To jest liczba float podana przez Ciebie: " + liczba);


    }
}