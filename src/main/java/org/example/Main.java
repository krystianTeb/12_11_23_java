package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj słowo (mniejsze niż 10 znaków): ");
        String slowo = scan.nextLine();

        if(slowo.length() < 10){
            System.out.println("Brawo! Wprowadziłeś słowo krótsze niż 10 znaków! Słowo: " + slowo);
        }else{
            System.out.println("Źle! Wprowadziłeś słowo dłuższe lub równe 10 znaków! Słowo: " + slowo);
        }




    }
}