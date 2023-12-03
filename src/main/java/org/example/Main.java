package org.example;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] wartosciPobrane = pobierzLiczbeOdUzytkownika(5);

        for(int w : wartosciPobrane){
            System.out.println(w);
        }
    }
    static int[] pobierzLiczbeOdUzytkownika(int ilePobrac){
        Scanner scan = new Scanner(System.in);
        int[] pobraneWartosci = new int[ilePobrac];
        for(int i = 0; i < pobraneWartosci.length; i++){
            System.out.println("Podaj liczbę " + (i + 1));
            pobraneWartosci[i] = scan.nextInt();
        }
        return pobraneWartosci;
    }

}