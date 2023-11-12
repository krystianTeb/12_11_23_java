package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int liczbaCalkowita = 5; // 1. Deklaracja zmiennej int o wartości 5

        if(liczbaCalkowita % 5 == 0){           // 2. Sprawdza czy w zmiennej liczbaCalkowita mamy liczbę podzielną przez 5
            System.out.println(liczbaCalkowita); // 2.1. Jeśli liczba podzielna przez 5 to wypisze zawartość zmiennej.
        }else{                                  // 3. W przeciwnym wypadku jeśli inna zawartość zmiennej.
            System.out.println(liczbaCalkowita);// 3.2. Wypisuje zawartość zmiennej jeśli niepodzielna przez 5
        }

        /*
         * 1. Deklaracja zmiennej int o wartości 5
         * 2. Sprawdza czy w zmiennej liczbaCalkowita mamy liczbę podzielną przez 5
         * 2.1. Jeśli liczba podzielna przez 5 to wypisze zawartość zmiennej.
         * 3. W przeciwnym wypadku jeśli inna zawartość zmiennej.
         * 3.2. Wypisuje zawartość zmiennej jeśli niepodzielna przez 5
         * */




    }
}