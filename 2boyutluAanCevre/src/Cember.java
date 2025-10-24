import java.util.Scanner;

public class Cember {
    private double yaricap;
    private double cevre;
    private double alan;

    public Cember(double yaricap){
        this.yaricap = yaricap;
        this.cevre =2*Math.PI*yaricap;
        this.alan=Math.PI*(yaricap*yaricap);
    }
    public void yazdir(){
        System.out.println("Çemberin alanı: "+alan);
        System.out.println("Çemberin çevresi: "+cevre);
    }
    public static void cemberHesapla(){
        System.out.print("Çemberin Yarıçapını giriniz : ");
        Scanner scanner=new Scanner(System.in);
        double yaricap=scanner.nextDouble();
        Cember cember=new Cember(yaricap);
        cember.yazdir();
    }
}
