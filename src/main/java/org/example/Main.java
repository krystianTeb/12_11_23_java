package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /* Program wypisujący coś na ekranie.
          W pierwszej kolejności program prosi o podanie imienia.
          Program przyjmuje od użytkownika w konsoli tekst.
          Program wyświetla określony tekst podstawiając wartość pobraną od użytkownika.
       */
        /*
        * 1. Tworzy obiekt skan służący do przyjmowania danych od użytkownika
        * 2. Wyświetla komunikat w konsoli o treści "Podaj swoje imię:
        * 3. Pobiera imię w konsoli od użytkownika i zapisuje pod nowo utworzoną zmienną imie.
        * 4. Wyświetla w konsoli komunikat podstawiając pobrane wcześniej imię.
         * */

        Scanner scan = new Scanner(System.in); //1.
        System.out.println("Podaj swoje imię: ");//2.
        String imie = scan.next();//3.

        System.out.println("Cześć " + imie + "!\nWitaj w systemie!");//4.


    }
}