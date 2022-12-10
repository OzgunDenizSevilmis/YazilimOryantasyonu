//Girilen 3 sayinin en büyügünü bulma

package com.mycompany.yazilimoryantasyon7;
import java.util.Scanner;

public class YazilimOryantasyon7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci sayiyi giriniz:");
        int sayi1 = input.nextInt();
        System.out.println("ikinci sayiyi giriniz:");
        int sayi2 = input.nextInt();
        System.out.print("Ucuncu sayiyi giriniz:");
        int sayi3 = input.nextInt();
        int enbuyuk = sayi1;
        if(sayi2 > enbuyuk){
            enbuyuk = sayi2;
        }
          if(sayi3 > enbuyuk){
              enbuyuk = sayi3;
           
          }   
      System.out.println("Girilen sayilarin en buyugu ="+enbuyuk+"dir");
    }
}
