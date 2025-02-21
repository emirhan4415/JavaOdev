package Market;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int itemID;
        double total = 0;
        double tomato = 10;
        double potato = 12;
        double cheese = 7;
        String ticket = "emir";
        String ticketTest;

        for (;;) {

            System.out.println("*****Market*****");
            System.out.println("=> 1.Domates almak için  seçiniz ");
            System.out.println("=> 2.Patates almak için  seçiniz ");
            System.out.println("=> 3.Peynir almak için  seçiniz ");
            System.out.print("=> 0.Alış verişi tamamla ve fiyatı ekrana yazdır : ");
            itemID = scanner.nextInt();

            switch (itemID) {

                case 1:
                    total += tomato;
                    System.out.println("sepetiniz : " + total);
                    break;
                case 2:
                    total += potato;
                    System.out.println("sepetiniz : " + total);
                    break;
                case 3:
                    total += cheese;
                    System.out.println("sepetiniz : " + total);
                    break;
                case 0:
                    System.out.println("Toplam sepet : " + total);
                    System.out.println("İndirim kuponunuz varsa giriniz yoksa atlayınız : ");
                    scanner.nextLine();
                    ticketTest = scanner.nextLine();

                    if (ticket.equals(ticketTest)){
                        total = total * 0.9;
                        System.out.println("indirim uygulandı sepetiniz : " + total);
                    }else {
                        System.out.println("indirim tanımlanmadı sepetiniz : " + total);
                    }
                    return;
                default:
                    System.out.println("Hatalı işlem tekrar deneyin");

            }
        }

    }
}

