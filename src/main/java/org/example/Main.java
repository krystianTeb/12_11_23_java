package org.example;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
     /*  Sposob 1
     while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj liczbę z przedziału od 1-6: ");
            int podanaLiczba = scan.nextInt();

            int wylosowanaLiczba = (int) Math.ceil(Math.random() * 6);
            System.out.println(podanaLiczba == wylosowanaLiczba ?
                    "Liczba jest trafiona! \nLiczba: " + podanaLiczba + "\nWylosowane: " + wylosowanaLiczba :
                    "Liczba NIE jest trafiona! \nLiczba: " + podanaLiczba + "\nWylosowane: " + wylosowanaLiczba);
        }*/

        /* Sposob 2 */

        while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj liczbę z przedziału od 1-6: ");
            int podanaLiczba = scan.nextInt();

            Random rand = new Random();
            //int wylosowanaLiczba = rand.nextInt(5); // generuje wartości: 0-5
            //int wylosowanaLiczba = rand.nextInt(5) + 1; // generuje wartości: 1-6
            int wylosowanaLiczba = rand.nextInt(1, 7); // generuje wartości: 1-6

            System.out.println(podanaLiczba == wylosowanaLiczba ?
                    "Liczba jest trafiona! \nLiczba: " + podanaLiczba + "\nWylosowane: " + wylosowanaLiczba :
                    "Liczba NIE jest trafiona! \nLiczba: " + podanaLiczba + "\nWylosowane: " + wylosowanaLiczba);
        }



    }

}