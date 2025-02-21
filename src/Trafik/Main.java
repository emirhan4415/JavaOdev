package Trafik;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double maxSpeed = 90;
        double speed;
        double ticket = 0;
        boolean license = true;
        int menuChoice;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sürücünün hızını giriniz : ");
        speed = scanner.nextDouble();


        if (speed <= 90) {
            System.out.println("Hız limitinin altındadır");
        } else if (90 < speed && speed <= 110) {
            System.out.println("1000tl ceza!!");
            ticket += 1000;
        } else if (110 < speed && speed <= 130) {
            System.out.println("2000tl ceza!!");
            ticket +=2000;
        } else {
            System.out.println("Ehliyetinize el kondu!!");
            license = false;
        }

        System.out.println("=> 1.Hızınızı görmek için seçiniz.");
        System.out.println("=> 2.Cezanızı görmek için seçiniz.");
        System.out.println("=> 3.Ehliyetinizin durumunu görmek için seçiniz.");
        System.out.println("=> 0.Çıkış yapmak için seçiniz.");
        menuChoice = scanner.nextInt();

        switch (menuChoice) {
            case 1:
                System.out.println("Hızınız = " + speed);
                break;
            case 2:
                System.out.println("Cezanız = " + ticket);
                break;
            case 3:
                if (license) {
                    System.out.println("Ehliyetiniz bulunmaktadır");
                } else {
                    System.out.println("Ehliyetiniz yoktur");
                }
                break;
            default:
                System.out.println("tekrar deneyiniz");
        }

    }
}
