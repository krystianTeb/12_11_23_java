package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj słowo: ");
        String zdanie = scan.nextLine();

        //Ala ma kota.    string[0] = "Ala"   string[1] = "ma"  string[2] = "kota."
        String[] slowa = zdanie.split(" "); // Podział wprowadzonego tekstu na słowa
        for(String slowo : slowa){
            System.out.println(slowo);
        }
        System.out.println(slowa[0] + " " + slowa[1] + " " + slowa[2]);






    }
}