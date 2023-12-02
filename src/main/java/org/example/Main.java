package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Ćwiczenie 5
        Napisz program, w którym zostanie utworzona 100-elementowa tablica liczb typu int.
        Komórkom o indeksach 0, 10, 20, … , 90 przypisz wartość 0, komórkom 1, 11, 21, … , 91
        wartość 1, komórkom 2, 12, 22, … , 92 wartość 2 itd.
        */

        int[] liczby = new int[100];
        for(int i = 0; i < liczby.length; i++){
            liczby[i] = i % 10; // 1 % 10 reszta: 1    2 % 10 reszta: 2   10 % 10 reszta: 0    11 % 10  reszta: 1
        }
        // 0, 10, 20, 30 ... to przypisuje 0
        // 1, 11, 21, 31 ... to podstawia 1
        // 2, 12, 22, 32 ... to podstawia 2
        for(int liczba : liczby){
            System.out.print(liczba);
        }
        System.out.println("\n" + liczby[0] + " " + liczby[10] + " " + liczby[20] + " " + liczby[30]);

        System.out.println(liczby[1] + " " + liczby[11] + " " + liczby[21] + " " + liczby[31]);
    }
}