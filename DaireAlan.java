import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double r, alan, a;
        System.out.print("Dairenin Yarıçapını Giriniz: ");
        r = inp.nextDouble();
        System.out.print("Dairenin Merkez Açısının Ölçüsüsünü Giriniz: ");
        a = inp.nextDouble();
        alan = Math.PI * r * r * a / 360;
        System.out.println("Dairenin Alanı: " + alan);
    }
}