
//Daire Cevre Hesabi
package com.mycompany.yazilimoryantasyon1;
import java.util.Scanner;
public class YazilimOryantasyon1 {

    public static void main(String[] args) {
        final double PI = 3.14;
        Scanner input = new Scanner(System.in);
        //Kullanıdan yaricap degeri almak icin 
        System.out.println("Bir yaricap degeri giriniz:");
        double yaricap = input.nextDouble();
        //Dairenin cevresini hesaplama
        double cevre = 2*PI*yaricap;
        System.out.println(yaricap + "yaricapli dairenin cevresi"+ cevre + "dir");
        
         
    }
}
