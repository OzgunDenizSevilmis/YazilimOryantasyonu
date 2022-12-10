//0'dan baslayip N'e kadar olan sayıların toplamı

package com.mycompany.yazilimoryantasyon3;

import java.util.Scanner;


public class YazilimOryantasyon3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Girin:");
 
        int sayi = input.nextInt();
        int toplam = 0;
 
        for(int i = 1; i <= sayi; ++i)
        {
            toplam = i + toplam;
        }
 
        System.out.println("Sayıların Toplamı = " + toplam);
        
        
   
    }
}
