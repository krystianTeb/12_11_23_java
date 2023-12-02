package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj słowo: ");
        String slowo = scan.next();

        System.out.println("Podaj literę: ");
        String litera = scan.next();
        int index = slowo.indexOf(litera);
        System.out.println(index != -1 ? "Litera: " + litera + " jest pod indexem: " + index :
                                         "Litery " + litera + " nie ma w słowie!");




    }
}