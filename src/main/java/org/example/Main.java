package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Utworzenie 26-elementowej tablicy typu char
        char[] alphabet = new char[26];

        // Zapisanie małych liter alfabetu od a do z w tablicy
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) ('a' + i); // 97 + 0 == 97     2_iteracja: 97 + 1 == 98     3_iteracja:  97 + 2 == 99
        }

        // Wyświetlenie zawartości tablicy
        for (char letter : alphabet) {
            System.out.print(letter + " ");
        }
    }
}