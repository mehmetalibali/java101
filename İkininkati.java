import java.util.Scanner;

public class İkininkati {
    public static void main(String[] args) {

        int n;

        Scanner input = new Scanner(System.in);
        System.out.print("Sınır değerini giriniz: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i *= 2) {

            System.out.println(i);

        }
    }
}