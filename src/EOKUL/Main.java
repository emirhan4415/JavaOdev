package EOKUL;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] results = new double[5];
        double total = 0;
        double topHighResult = results[0];
        double topLowResult = results[0];
        double average = total / 5;

        for (int i=0;i<results.length;i++) {
            System.out.print(i + 1 + ".Dersin Notunu Giriniz : ");
            results[i] = scanner.nextDouble();
            total += results[i];

            if (results[i] < 30) {
                System.out.println("Düşük not aldığınız dersler var!");
            }

            if (results[i] > topHighResult) {
                topHighResult = results[i];
            }

        }

        for (int i=0;i<results.length;i++) {
            if (results[i] < topLowResult) {
                topLowResult = results[i];
            }
        }//şu kısım nye çalışmadı anlamadım gpt hata yok dedi

        if (average <50) {
            System.out.println("Sınıftan kaldınız!");
        }else {
            System.out.println("Sınıfı geçtiniz!");
        }

        System.out.println("En yüksek not : " + topHighResult);
        System.out.println("En düşük not : " + topLowResult);


    }
}
