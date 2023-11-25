package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Tworzenie obiektu scan do pobierania danych:
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.println("Podaj wartość float: [Zatwierdź ENTEREM]");
        float liczba = scan.nextFloat(); //2,56  2.56

        System.out.println("To jest liczba float podana przez Ciebie: " + liczba);


    }
}