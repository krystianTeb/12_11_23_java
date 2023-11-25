package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Tworzenie obiektu scan do pobierania danych:
        Scanner scan = new Scanner(System.in);

            //System.out.println("Podaj liczbę do weryfikacji: [Zatwierdź ENTEREM]");
            //int liczba = scan.nextInt();


        for( ; true ; ) {
            System.out.println("Podaj liczbę: [Zatwierdź ENTEREM]");
            int liczba = scan.nextInt();
            System.out.println(liczba);
        }



    }
}