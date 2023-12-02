package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Wprowadź liczbę[zatwierdź enter]: ");
        Scanner scan = new Scanner(System.in);
        int liczba = scan.nextInt();
        System.out.println("Wprowadziłeś taką liczbę: " + liczba);




    }
}