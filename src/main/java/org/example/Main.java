package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int tab[] = {3, 6, 6, 8};

        System.out.println( "Długość tab: " + tab.length ); //zwróci długość tablicy (liczba elementów w tablicy)
        System.out.println( "Pierwszy element: " + tab[0] ); // Odwołanie do pierwszego elementu tablicy (pod indeks 0 jest wartość 3)

        for(int val: tab){ // pod val zostają podstawiane wszystkie elementy w tablicy.
            System.out.println(  val );
        }

        for(int i = 0; i < tab.length; i++){
            System.out.println("Indeks: " + i + " pod tym indeksem jest wartość: " + tab[i]);
        }

    }
}