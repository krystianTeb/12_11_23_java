package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj słowo: ");
        String slowo = scan.nextLine();

        System.out.println("To twoje słowo pisane małymi literami: " + slowo.toLowerCase());
        System.out.println("To twoje słowo pisane dużymi literami: " + slowo.toUpperCase());
        //powyższe wywołania metody .toUpperCase i toLowerCase nie zmienia zawartości zmiennej.
        System.out.println("To twoje słowo pisane oryginalnie: " + slowo);







    }
}