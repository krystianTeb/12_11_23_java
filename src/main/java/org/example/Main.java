package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int tab[] = new int[4];//Deklaracja tablicy i określenie długości (4 elementy - długość)

        tab[0] = 5;//inicjalizacja wartości w tablicy (przypisanie wartości do indeksów)
        tab[1] = 4;//inicjalizacja wartości w tablicy (przypisanie wartości do indeksów)
        tab[2] = 3;//inicjalizacja wartości w tablicy (przypisanie wartości do indeksów)
        tab[3] = 2;//inicjalizacja wartości w tablicy (przypisanie wartości do indeksów)

        //pętla wyświetla wszystko z tablicy (iteruje po elementach tablicy)
        for(int i : tab){
            System.out.println(i);
        }




    }
}