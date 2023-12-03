package org.example;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        System.out.println( Math.floor( Math.random() * 10) );//generuje wartości od 0 - 9
        System.out.println( Math.floor( Math.random() * 10) + 1 );//generuje wartości od 1 - 10
        System.out.println( Math.ceil( Math.random() * 10) );//generuje wartości od 1 - 10

        //Zapisanie jako int
        System.out.println( (int)Math.floor( Math.random() * 10) );//generuje wartości od 0 - 9
        System.out.println( (int)Math.floor( Math.random() * 10) + 1 );//generuje wartości od 1 - 10
        System.out.println( (int)Math.ceil( Math.random() * 10) );//generuje wartości od 1 - 10

    }

}