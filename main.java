package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       int year;

       Scanner input = new Scanner(System.in);

        System.out.println("Yılı giriniz:");
        year = input.nextInt();

        if (year%4==0){
            if (year%100==0){
                if (year%400==0){
                    System.out.println(year+" Artık Yıldır.");
                }else {
                    System.out.println(year+" Artık Yıl Değildir.");
                }
            }else{
                System.out.println(year+" Artık Yıldır.");
            }

        }else {
            System.out.println(year+" Artık Yıl Değildir.");
        }
        

    }
}
