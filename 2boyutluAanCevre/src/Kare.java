import java.util.Scanner;

public class Kare {

    private double kenar;
    private double alan;
    private double cevre;

    public Kare(double kenar) {
        this.kenar = kenar;
        this.alan = kenar*kenar;
        this.cevre = kenar*4;
    }
    public void yazdir(){
        System.out.println("Karenin alanı: "+alan);
        System.out.println("Karenin kenar: "+kenar);
    }
    public static void kareHesapla(){
        System.out.print("Karenin kenarını giriniz: ");
        Scanner scan = new Scanner(System.in);
        double k=scan.nextDouble();
        Kare kare = new Kare(k);
        kare.yazdir();
    }
}
