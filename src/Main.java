import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, passWord;
        Scanner input = new Scanner(System.in);

        int balance = 5000;
        int select;

        for (int i = 2; i >= 0; i--) {

            System.out.print("Kullanıcı Adınızı Giriniz: ");
            userName = input.nextLine();
            System.out.print("Parolanız: ");
            passWord = input.nextLine();

            if (userName.equals("elifsavas") && passWord.equals("2022elif")) {
                System.out.println("Giriş Başarılı!");
                do {
                    System.out.println("Merhaba! Kodluyoruz Bankasına Hoşgeldiniz!");
                    System.out.println("1- Para Yatırma\n" +
                            "2- Para Çekme\n" +
                            "3- Bakiye Sorgulama\n" +
                            "4- Çıkış Yap"
                    );

                    System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz: ");

                    select = input.nextInt();

                    if (select == 1) {
                        System.out.print("Yatırılacak Para Miktarı: ");
                        int price = input.nextInt();
                        balance += price;
                    } else if (select == 2) {
                        System.out.print("Çekilecek Para Miktarı: ");
                        int price = input.nextInt();

                        if (price > balance) {
                            System.out.println("Yetersiz Bakiye!");
                        } else {
                            balance -= price;
                        }

                    } else if (select == 3) {
                        System.out.println("Bakiyeniz :" + balance);
                    }


                } while (select != 4);
                System.out.println("Çıkış Başarılı! Tekrar görüşmek üzere.");
                break;
            } else {
                System.out.println("Hatalı Giriş Yaptınız! Lütfen Tekrar Deneyiniz");
                System.out.println("Kalan Hakkınız: " + i);
                if (i == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen bankanız ile iletişime geçiniz.");
                }


            }
        }

    }
}
