package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Tworzenie obiektu scan do pobierania danych:
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Podaj liczbę do weryfikacji: [Zatwierdź ENTEREM]");
            int liczba = scan.nextInt();

            if (liczba % 2 == 0) {
                System.out.println("Liczba: " + liczba + " jest parzysta!");
            } else {
                System.out.println("Liczba: " + liczba + " nie jest parzysta!");
            }
        }



    }
}