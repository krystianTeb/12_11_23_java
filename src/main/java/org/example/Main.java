package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Ćwiczenie 2
        Napisz program, w którym zostanie utworzona 10-elementowa tablica liczb typu int. Użyj pętli for do
        wypełnienia jej danymi w taki sposób, aby w kolejnych komórkach znalazły się liczby od 10 do 100 (czyli 10,
        20, 30 itd.). Zawartość tablicy wyświetl na ekranie.
        */
        int[] liczby = new int[10];

        int wartosc = 10;
        for (int i = 0; i < liczby.length; i++){
            liczby[i] = wartosc;
            wartosc += 10;
        }

        for(int element : liczby){
            System.out.println(element);
        }

    }
}