package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* Zadanie 2 slajd 169
        Ćwiczenie 2
        Napisz program który przyjmie trzy dane typu String i łączy je w jeden łańcuch tekstowy i wypisuje go w
        konsoli.*/

        System.out.println("Podaj pierwszy segment tekstu: ");
        String tekst1 = scan.next();

        System.out.println("Podaj pierwszy segment tekstu: ");
        String tekst2 = scan.next();

        System.out.println("Podaj pierwszy segment tekstu: ");
        String tekst3 = scan.next();

        System.out.println(tekst1 + tekst2 + tekst3);//1 sposób



    }
}