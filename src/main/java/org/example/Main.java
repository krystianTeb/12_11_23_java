package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int tab[] = new int[400];//Deklaracja tablicy i określenie długości (4 elementy - długość)

        for(int i = 0; i < tab.length; i++){
            tab[i] = i;
        }

        //pętla wyświetla wszystko z tablicy (iteruje po elementach tablicy)
        for(int i : tab){
            System.out.println(i);
        }




    }
}