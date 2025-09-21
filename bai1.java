import java.util.Scanner;
public class Bai1_tuan4 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen : ");
        int soNguyen = scanner.nextInt();
        if (soNguyen < 0) {
            System.out.println("So am");
        } else if (soNguyen == 0) {
            System.out.println("So ban nhap = 0");
        } else {
            System.out.println("So duong");
        }
        scanner.close();
    }
}