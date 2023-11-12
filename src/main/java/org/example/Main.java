package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int tab[] = new int[4];
        tab[0] = 1;
        tab[1] = 2;
        tab[2] = 3;
        tab[3] = 4;

        for(int val: tab){ // pod val zostają podstawiane wszystkie elementy w tablicy.
            System.out.println(  val );
        }



    }
}