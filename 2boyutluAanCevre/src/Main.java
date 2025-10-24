import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n****************************************************");
            System.out.println("Geometrik şekil hesaplama uygulamasına hoşgeldiniz.");
            System.out.println("****************************************************");
            System.out.println("1)Kare");
            System.out.println("2)Dikdörtgen");
            System.out.println("3)Çember");
            System.out.println("4)Dik Üçgen");
            System.out.println("5)Çıkış");
            System.out.print("Seçiminizi giriniz: ");
            int secim= scanner.nextInt();
            switch (secim) {
                case 1:Kare.kareHesapla();
                break;
                case 2:Dikdortgen.dikdortgenHesapla();
                break;
                case 3:Cember.cemberHesapla();
                break;
                case 4:Ucgen.ucgenHesapla();
                break;
                case 5:{
                    System.out.println("Program sonlandırıldı....");
                    scanner.close();
                    return;
                }
                default:
                    System.out.println("Geçersiz seçim yeniden deneyin");
                    break;
            }
        }


    }
}