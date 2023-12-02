package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] zbiorLiczb = new int[150]; //Deklaracja tablicy typu int, która zawiera 4 elementy.

        //pętla dodająca do tablicy nowe wartości
        for(int i = 0; i < zbiorLiczb.length; i++){
            zbiorLiczb[i] = i;
        }

        //pętla foreach - wypisującą wszystko z tablicy
        for(int element : zbiorLiczb){
            System.out.println( element );
        }


    }
}