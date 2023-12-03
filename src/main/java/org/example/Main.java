package org.example;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

/*        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj słowo: ");
        String zdanie = scan.nextLine();*/


        //Jak zmodyfikować pierwszą literę aby była wielka:
        String testoweSlowo = "test";
        System.out.println(Character.toUpperCase(testoweSlowo.charAt(0)) + testoweSlowo.substring(1));

        //Palindrom:
        String str = "Augusta".toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                System.out.println("Słowo nie jest palindromem!"); // Jeśli litery nie są sobie równe, to słowo nie jest palindromem
                break;
            }
        }




    }
}