import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double tutar, kdvOran, kdvTutar, kdvliTutar;

        System.out.print("Ücret Tutarını Giriniz: ");
        tutar = inp.nextDouble();
        kdvOran = (tutar > 0) && (tutar < 1000) ? 0.18 : 0.8;
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV oranı : " + kdvOran);
        System.out.println("KDV Tutarı: " + kdvTutar);
        System.out.println("KDV'li Tutar: " + kdvliTutar);
    }
}