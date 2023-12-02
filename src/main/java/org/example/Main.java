package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        String imie = scan.nextLine();

        if(imie.equals("Ala")  || imie.equals("ala")) {
            System.out.println("Podane imię to Ala! ");
        }





    }
}