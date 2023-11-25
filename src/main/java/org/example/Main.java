package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Tworzenie obiektu scan do pobierania danych:
        Scanner scan = new Scanner(System.in);

       boolean zm = true;

        //1 sposób
       String imie = "Ala";
       System.out.println( imie + " " + imie );

        //2 sposób
        String imie2 = "Ala ";
        System.out.println( imie2 + imie2 );




    }
}