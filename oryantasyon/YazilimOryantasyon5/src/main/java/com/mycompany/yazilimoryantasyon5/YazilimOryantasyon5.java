//Bir ogrencinin girdigi 2 sinavin ortalaması

package com.mycompany.yazilimoryantasyon5;
import java.util.Scanner;

public class YazilimOryantasyon5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ogrencinin sinavlarini giriniz:");
        double sinav1 = input.nextDouble();
        double sinav2 = input.nextDouble();
     double toplam = sinav1 + sinav2;
     double ortalama = toplam/2;
     System.out.println("Sinavlarin ortalamasi:" + ortalama);
 
    }
}
