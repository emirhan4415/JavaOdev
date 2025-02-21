package Atm;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int pinCode = 123456;
        int testPin;
        double balance = 2000;
        double amount;
        int choice;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen pin kodunuzu giriniz : ");
        testPin = scanner.nextInt();

        if (testPin == pinCode){
            System.out.println("Giriş Başarılı!!");
        } else {
            System.out.println("Giriş Başarısız??");
            return;
        }

        while (true) {

            System.out.println("******Menü******");
            System.out.println("=> 1.Bakiye Görüntüleme.");
            System.out.println("=> 2.Para Yatırma.");
            System.out.println("=> 3.Para Çekme.");
            System.out.println("=> 4.Çıkış.");
            System.out.print("=> Yapmak İstediğiniz İşlemin Numarasını Giriniz : ");
            choice = scanner.nextInt();

            if (choice == 1) {

                System.out.println("Bakiyeniz : " + balance);

            } else if (choice == 2) {

                System.out.print("Yatırmak İstediğiniz Tutar : ");
                amount = scanner.nextDouble();
                balance = balance + amount;
                System.out.println("Güncel bakiyeniz : " + balance);

            } else if (choice == 3) {

                System.out.print("Çekmek İstediğiniz Tutar : ");
                amount = scanner.nextDouble();

                if (amount > balance) {

                    System.out.println("Yetersiz Bakiye!!!");

                } else {

                    balance -= amount;
                    System.out.println("Güncel Bakiyeniz : " + balance);

                }

            } else if (choice == 4) {

                System.out.println("Çıkış yapılıyor...");
                break;

            } else {

                System.out.println("Geçerli Bir Sayi Giriniz...");

            }
        }
    }

}