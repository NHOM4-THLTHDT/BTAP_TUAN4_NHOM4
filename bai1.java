import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot so: ");
        double so = sc.nextDouble();

        if (so > 0) {
            System.out.println("So " + so + " la so duong.");
        } else if (so < 0) {
            System.out.println("So " + so + " la so am.");
        } else {
            System.out.println("So ban nhap la 0 (ko am, ko duong).");
        }

        sc.close();
    }
}
