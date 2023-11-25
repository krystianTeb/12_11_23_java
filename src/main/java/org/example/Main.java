package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Tworzenie obiektu scan do pobierania danych:
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Podaj liczbę do weryfikacji: [Zatwierdź ENTEREM]");
            int liczba = scan.nextInt();

            System.out.println( liczba % 2 == 0 ? "Liczba: " + liczba + " jest parzysta!" :
                                                  "Liczba: " + liczba + " nie jest parzysta!" );

            System.out.println("Aby kontynuować wpisz T ,jeśli zatrzamać wpisz N!");
            String czyZatrzymac = scan.next();
            if(czyZatrzymac.equals("N") || czyZatrzymac.equals("n") || czyZatrzymac.equals("nie")) break;


        }



    }
}