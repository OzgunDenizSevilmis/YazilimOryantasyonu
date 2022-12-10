//iki sayı arasında 3'e bölünen sayılari bulma   

package com.mycompany.yazilimoryantasyon6;
import java.util.Scanner;


public class YazilimOryantasyon6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci sayiyi giriniz:");
        int sayi1 = input.nextInt();
        System.out.println("İkinci sayiyi giriniz:");
        int sayi2 = input.nextInt();
        for(int i = sayi1; i < sayi2 ; i++)
        {
            if(i %3 == 0){
                System.out.println(i+"sayisi 3'ün katidir");
            }
        }

    }
}
