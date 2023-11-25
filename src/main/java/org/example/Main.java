package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Tworzenie obiektu scan do pobierania danych:
        Scanner scan = new Scanner(System.in);

            //System.out.println("Podaj liczbę do weryfikacji: [Zatwierdź ENTEREM]");
            //int liczba = scan.nextInt();


        for( ; true ; ) {
            System.out.println("Podaj wartość tekstową 1: [Zatwierdź ENTEREM]");
            String text1 = scan.nextLine();
            System.out.println("Podaj wartość tekstową 2: [Zatwierdź ENTEREM]");
            String text2 = scan.nextLine();
            System.out.println("Podaj wartość tekstową 3: [Zatwierdź ENTEREM]");
            String text3 = scan.nextLine();
            System.out.println(text1 + text2 + text3);
        }



    }
}