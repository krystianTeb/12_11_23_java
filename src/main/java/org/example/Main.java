package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /* Program wypisujący coś na ekranie.
          W pierwszej kolejności program prosi o podanie imienia.
          Program przyjmuje od użytkownika w konsoli tekst.
          Program wyświetla określony tekst podstawiając wartość pobraną od użytkownika.
       */

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj swoje imię: ");
        String imie = scan.next();

        System.out.println("Cześć " + imie + "!\nWitaj w systemie!");


    }
}