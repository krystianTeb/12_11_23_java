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

        int i = 5,
            s = 5;

        for(int u = 0; u <= 5; u++){
            System.out.println(u);
        }
        float x = 0.5f;
        while(x <= 45){
            System.out.println(x);
            x+=1.25;
        }

        Scanner scan = new Scanner(System.in);
        int liczba = scan.nextInt();
        System.out.println(liczba);
        System.out.println("To jest liczba1: " + liczba);


    }
}