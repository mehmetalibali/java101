import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double kenar1, kenar2, kenar3, alan, u;
        System.out.print("Birinci Kenarı Giriniz: ");
        kenar1 = inp.nextDouble();
        System.out.print("İkinci Kenarı Giriniz: ");
        kenar2 = inp.nextDouble();
        System.out.print("Üçüncü Kenarı Giriniz: ");
        kenar3 = inp.nextDouble();

        u = kenar1 + kenar2 + kenar3 / 2;
        alan = Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));
        System.out.print("Alan: " + alan);
    }
}