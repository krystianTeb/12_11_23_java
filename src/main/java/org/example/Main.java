package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*  Ćwiczenie 3 i 4
            Napisz program, w którym zostanie utworzona 20-elementowa tablica typu boolean. Komórkom o indeksie
            parzystym przypisz wartość true, a o indeksie nieparzystym - false (zero możesz uznać za wartość parzystą).
            Zawartość tablicy wyświetl na ekranie.
        */
        boolean[] tablica = new boolean[20];

        for (int i = 0; i < tablica.length; i++){
            tablica[i] = i % 2 == 0 && i != 0 ? true : false;
        }

        for(boolean element : tablica){
            System.out.println(element);
        }

    }
}