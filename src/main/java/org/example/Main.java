package org.example;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        int wynikPotegowania = (int)Math.pow(2, 2);//konwersja double na int (stabdardowo metoda pow zwraca double)
        double wynikPotegowania2 = Math.pow(2, 2);
        System.out.println(wynikPotegowania);
        System.out.println(wynikPotegowania2);

        System.out.println(Math.ceil(4.1));//5.0 jako double
        System.out.println((int)Math.ceil(4.1));//5 jako int


    }

}