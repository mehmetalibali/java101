import java.util.Scanner;

public class NotOrtalaması {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik Notunuz: ");
        int mat = inp.nextInt();
        System.out.print("Fizik Notunuz: ");
        int fizik = inp.nextInt();
        System.out.print("Kimya Notunuz: ");
        int kimya = inp.nextInt();
        System.out.print("Türkçe Notunuz: ");
        int turkce = inp.nextInt();
        System.out.print("Tarih Notunuz: ");
        int tarih = inp.nextInt();
        System.out.print("Müzik Notunuz: ");
        int muzik = inp.nextInt();
        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double ortalama = toplam / 6;
        System.out.print("Ortalamanız: " + ortalama);
        String sonuc = ortalama > 60 ? "\nGeçti" : "\nKaldı";
        System.out.println(sonuc);
    }
}