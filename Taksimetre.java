import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int km;
        double perKm = 2.20, total = 10;
        System.out.print("Mesafeyi KM Bazında Yazınız: ");
        km = inp.nextInt();
        total += km * perKm;
        total = (total < 20) ? 20 : total;
        System.out.print("Toplam Tutar: " + total);
    }
}