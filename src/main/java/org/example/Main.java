package org.example;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        System.out.println( Dodawanie(2, 2) );
        System.out.println( Dodawanie(5, 2) );
        System.out.println( Dodawanie(5, 5) );
    }
    static int Dodawanie(int liczba1, int liczba2){
        return liczba1 + liczba2;
    }
}