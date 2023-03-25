import java.util.Scanner;

public class SayiAdeti {
    public static void main(String[] args) {
        Scanner deger = new Scanner(System.in);
        int x, y = 0, adet = 0;
        double ort;
        System.out.print("Sayıyı giriniz: ");
        x = deger.nextInt();
        for (int i = 1; i <= x; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);
                y += i;
                adet++;
            }
        }
        System.out.println("Toplam :" + y);
        System.out.println("Kat adet :" + adet);
        ort = y / adet;
        System.out.println("Sayıların ortalaması:" + ort);
    }
}