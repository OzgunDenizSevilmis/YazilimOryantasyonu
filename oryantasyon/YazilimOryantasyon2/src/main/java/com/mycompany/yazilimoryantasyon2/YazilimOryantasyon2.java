//Girilen sayını tek veya cift oldugunu anlayan program

package com.mycompany.yazilimoryantasyon2;

import java.util.Scanner;
 
public class YazilimOryantasyon2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayi = input.nextInt();
        if (sayi %2 == 0)
            System.out.println("Girilen sayi cifttir.");
        else
            System.out.println("Girilen sayi tektir.");

    }
}
