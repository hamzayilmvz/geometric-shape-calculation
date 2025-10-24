import java.util.Scanner;

public class Ucgen {
    private double a;
    private double b;
    private double Hipotenus;
    private double alan;
    private double cevre;

    public Ucgen(double a, double b, double hipotenus) {
        this.a = a;
        this.b = b;
        this.Hipotenus = Hipotenus;
        this.alan = 0.5*a*b;
        this.cevre = a+b+Hipotenus;

    }
    public void yazdir(){
        System.out.println("Dik Üçgenin Çevresi : "+cevre);
        System.out.println("Dik Üçgenin Alanı : "+alan);
    }
    public static void ucgenHesapla(){
        System.out.print("Dik Üçgenin dik kenarını giriniz :");
        Scanner scanner=new Scanner(System.in);
        double dk=scanner.nextDouble();
        System.out.print("Dik Üçgenin yatay kenarını giriniz :");
        double yk=scanner.nextDouble();
        System.out.print("Dik Üçgenin Hipotenüsünü giriniz: ");
        double hip=scanner.nextDouble();
        Ucgen ucgen=new Ucgen(dk,yk,hip);
        ucgen.yazdir();

    }

}
