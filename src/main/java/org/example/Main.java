package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean czyWykonywacDalejWhile = true;

        while (czyWykonywacDalejWhile) {
            System.out.println("Podaj Liczbę 1: ");
            int liczba = scan.nextInt();
            System.out.println("Podaj Liczbę 2: ");
            int liczba2 = scan.nextInt();
            System.out.println("Podaj operator (+, -, *, /) wpisz x, żeby zakończyć: ");
            String operator = scan.next();

            switch (operator) {
                case "+" -> System.out.println("Wynik dodawania: " + liczba + operator + liczba2 + " = " + (liczba + liczba2));
                case "-" -> System.out.println("Wynik odejmowania: " + liczba + operator + liczba2 + " = " + (liczba - liczba2));
                case "*" -> System.out.println("Wynik mnożenia: " + liczba + operator + liczba2 + " = " + (liczba * liczba2));
                case "/" -> System.out.println("Wynik dzielenia: " + liczba + operator + liczba2 + " = " + (liczba / liczba2));
                case "x" -> {
                    czyWykonywacDalejWhile = false;
                    System.out.println("Zakończyłeś wykonywanie programu (wprowadziłeś x).");
                }
                default -> System.out.println("Podałeś zły operator, podaj inny.");
            }
        }



    }
}