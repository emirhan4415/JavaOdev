package Restoran;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double fish = 25;
        double burger = 20;
        int choice;
        double total = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("=> 1.Balık almak için seçiniz.");
            System.out.println("=> 2.Burger almak için seçiniz.");
            System.out.println("=> 3.Sepeti onaylamak için seçiniz.");
            System.out.println("=> 0.Çıkış yapmak için seçiniz.");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    total += fish;
                    System.out.println("Balık aldınız.");
                    break;
                case 2:
                    total += burger;
                    System.out.println("Burger aldınız.");
                    break;
                case 3:
                    System.out.println("Toplam sepet : " + total);
                    break;
                case 0:
                    System.out.println("Çıkış yapıldı!");
                    return;
                default:
                    System.out.println("Geçerli bir işlem seçiniz!");
                    break;

            }
        }while(true);

    }
}
