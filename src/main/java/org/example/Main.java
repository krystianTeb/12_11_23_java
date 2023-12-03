package org.example;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int liczba1, liczba2, liczba3;

        System.out.println("Podaj liczbę 1: ");
        liczba1 = pobierzLiczbeOdUzytkownika();
        System.out.println("Podaj liczbę 2: ");
        liczba2 = pobierzLiczbeOdUzytkownika();
        System.out.println(liczba1 + " " + liczba2);

        System.out.println("Wartość max: " + Math.max(liczba1, liczba2));
        System.out.println("Wartość min: " + Math.min(liczba1, liczba2));
    }
    static int pobierzLiczbeOdUzytkownika(){
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
}