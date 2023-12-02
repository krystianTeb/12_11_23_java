package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String imie = "Adam";
        System.out.println(imie);

        char tablica[] = new char[]{'A', 'D', 'A', 'M'};
        String imieZTablicy = new String(tablica);

        for(short i = 0; i < tablica.length; i++){
            System.out.print(tablica[i]);
        }

        System.out.println("\n" + imieZTablicy);

    }
}