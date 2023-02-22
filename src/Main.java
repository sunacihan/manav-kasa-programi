import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Armutun kilosunu giriniz :");
        double armut_kilo=input.nextDouble();
        System.out.print("Elmanın kilosunu giriniz :");
        double elma_kilo=input.nextDouble();
        System.out.print("Domatesin kilosunu giriniz :");
        double d_kilo=input.nextDouble();
        System.out.print("Muz kilosunu giriniz :");
        double muz_kilo=input.nextDouble();
        System.out.print("Patlıcan kilosunu giriniz :");
        double pat_kilo=input.nextDouble();

        double toplam=(armut_kilo*2.14+elma_kilo*3.67+d_kilo*1.11+muz_kilo*0.95+pat_kilo*5.00);
        System.out.println("Toplam tutar:"+toplam);


    }
}