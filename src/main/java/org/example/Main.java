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
            liczby[i] = i % 10;
        }

        for(int liczba : liczby){
            System.out.print(liczba);
        }

    }
}