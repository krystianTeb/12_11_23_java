package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*  Ćwiczenie 3
            Napisz program, w którym zostanie utworzona 20-elementowa tablica typu boolean. Komórkom o indeksie
            parzystym przypisz wartość true, a o indeksie nieparzystym - false (zero możesz uznać za wartość parzystą).
            Zawartość tablicy wyświetl na ekranie.
        */
        boolean[] tablica = new boolean[20];

        for (int i = 0; i < tablica.length; i++){
            if(i % 2 == 0 && i != 0){
                tablica[i] = true;
            }
            else{
                tablica[i] = false;
            }
        }

        for(boolean element : tablica){
            System.out.println(element);
        }

    }
}