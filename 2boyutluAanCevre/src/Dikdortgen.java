import java.util.Scanner;

public class Dikdortgen {
    private double uzunKenar;
    private double kisaKenar;
    private double alan;
    private double cevre;
    public Dikdortgen(double uzunKenar,double kisaKenar) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar=kisaKenar;
        this.alan=kisaKenar*uzunKenar;
        this.cevre=(uzunKenar+kisaKenar)*2;
    }
    public void yazdir(){
        System.out.println("Dikdörtgenin alanı: "+alan);
        System.out.println("Dikdörtgenin çevresi: "+cevre);
    }
    public static void dikdortgenHesapla(){
        System.out.print("Dikdörtgenin Uzun kenarını giriniz: ");
        Scanner scan = new Scanner(System.in);
        double uk=scan.nextDouble();
        System.out.print("Dikdörtgenin Kısa kenarını giriniz: ");
        double kk=scan.nextDouble();
        Dikdortgen dikdortgen=new Dikdortgen(uk,kk);
        dikdortgen.yazdir();
    }
}
