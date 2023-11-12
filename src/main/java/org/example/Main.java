package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Podaj Liczbę: ");
            int liczba = scan.nextInt();
            System.out.println(liczba % 2 == 0 ?
                    "Liczba: " + liczba + " jest parzysta." :
                    "Liczba: " + liczba + " jest nieparzysta.");
        }





    }
}