import java.util.Scanner;

public class Sicaklık {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);

        System.out.println("Sıcaklığı giriniz");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapmaya gidebilirsiniz.");
        }
        if (heat >= 5 && heat < 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        if (heat >= 10 && heat < 25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        }
        if (heat >= 25) {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }

}
