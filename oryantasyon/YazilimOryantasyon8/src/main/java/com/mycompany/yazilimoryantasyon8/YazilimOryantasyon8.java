//Dikdörtgenin alani ve cevresini hesaplama

package com.mycompany.yazilimoryantasyon8;
import java.util.Scanner;

public class YazilimOryantasyon8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci kenari giriniz:");
        int kenar1 = input.nextInt();
        System.out.println("Ikinci kenari giriniz:");
        int kenar2 = input.nextInt();
        System.out.println("Dikdörtgenin alani ="+(kenar1 * kenar2));
        System.out.println("Dikdörtgenin cevresi ="+(2 * (kenar1 + kenar2)));
    }
}
