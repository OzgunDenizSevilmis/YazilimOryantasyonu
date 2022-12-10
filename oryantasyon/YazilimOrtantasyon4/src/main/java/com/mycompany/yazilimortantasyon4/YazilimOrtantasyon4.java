//Gunler

package com.mycompany.yazilimortantasyon4;
import java.util.Scanner;

public class YazilimOrtantasyon4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Gun icin 1 ile 7 arasinda bir sayi giriniz:");
        int gun = input.nextInt();
        switch (gun) {
            case 1: System.out.println("Bugun gunlerden pazartesi");
            break;
            case 2:System.out.println("Bugun gunlerden sali");
            break;
            case 3: System.out.println("Bugun gunlerden carsamba");
            break;
            case 4: System.out.println("Bugun gunlerden persembe");
            break;
            case 5: System.out.println("Bugun gunlerden cuma");
            break;
            case 6: System.out.println("Bugun gunlerden cumartesi");
            break;
            case 7: System.out.println("Bugun gunlerden pazar");
            break;
            default: System.out.println("Lutfen gecerli bir sayi giriniz");
            System.exit(1);
            
            
        }
    }
}
