//Basit hesap makinesi

package com.mycompany.yazilimoryantasyon9;
import java.util.Scanner;

public class YazilimOryantasyon9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayıyı giriniz: ");
        int sayi1 = input.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        int sayi2 = input.nextInt();
        
        System.out.println("İSLEMİNİZİ SEÇİNİZ");
        System.out.println("1. TOPLAMA");
        System.out.println("2. ÇIKARMA");
        System.out.println("3. ÇARPMA");
        System.out.println("4. BÖLME");
        
        System.out.print("Secimininizi giriniz: ");
        int secim = input.nextInt();
        
        if(secim == 1) {
            System.out.println("Toplama isleminin sonucu = " + (sayi1 + sayi2));
        }
        else if(secim == 2) {
            System.out.println("Çıkarma isleminin sonucu = " + (sayi1 - sayi2));
        }
        else if(secim == 3) {
            System.out.println("Carpma isleminin sonucu = " + (sayi1 * sayi2));
        }
        else if(secim == 4) {
            System.out.println("Bölme isleminin sonucu = " + (float)sayi1 / sayi2);
        }
        else {
            System.out.println("Yanlıs secim yaptınız. Seciminizi kontrol ediniz.");
        }
    }
}
