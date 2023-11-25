package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Tworzenie obiektu scan do pobierania danych:
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Podaj liczbę 1: [Zatwierdź ENTEREM]");
            int liczba1 = scan.nextInt();
            System.out.println("Podaj liczbę 2: [Zatwierdź ENTEREM]");
            int liczba2 = scan.nextInt();
            System.out.println("Podaj operator arytmetyczny (+, -, *, /): [Zatwierdź ENTEREM]");
            String operator = scan.next();

            switch (operator) {
                case "+" -> System.out.println(liczba1 + " + " + liczba2 + " = " + (liczba1 + liczba2));
                case "-" -> System.out.println(liczba1 + " - " + liczba2 + " = " + (liczba1 - liczba2));
                case "*" -> System.out.println(liczba1 + " * " + liczba2 + " = " + (liczba1 * liczba2));
                case "/" -> System.out.println(liczba1 + " : " + liczba2 + " = " + (liczba1 / liczba2));
                default -> System.out.println("Podałeś operator: " + operator + "Nie rozpoznaje tej operacji.");
            }
        }






    }
}