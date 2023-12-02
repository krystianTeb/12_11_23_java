package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Ćwiczenie 1
        Napisz program, w którym zostanie utworzona 10-elementowa tablica liczb typu int. Za pomocą pętli for zapisz
        w kolejnych komórkach liczby od 101 do 110. Zawartość tablicy wyświetl na ekranie.
        */
        int[] elementy = new int[10];
        for(int i = 0; i < elementy.length; i++){
            elementy[i] = i + 101;
        }

        for(int element : elementy){
            System.out.println(element);
        }

    }
}