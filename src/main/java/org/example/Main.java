package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] elementy = new int[10];
        for(int i = 0; i < elementy.length; i++){
            elementy[i] = i + 101;
        }

        for(int element : elementy){
            System.out.println(element);
        }

    }
}