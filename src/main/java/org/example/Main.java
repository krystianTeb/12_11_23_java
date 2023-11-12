package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int tab[] = new int[100];

        for(int i = 0; i < 100; i++){ //Pętla generująca wartości do tablicy
            tab[i] = i;
        }

        for(int val: tab){ // Pętla wyświetlająca zawartość tab. Pod val zostają podstawiane wszystkie elementy w tablicy.
            System.out.println(  val );
        }



    }
}