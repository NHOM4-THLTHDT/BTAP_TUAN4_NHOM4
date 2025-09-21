import java.util.Scanner;
public class Bai6 {
    public static int UCLN(int a, int b) {
        while (b != 0) {
            int r=a % b;
            a=b;
            b=r;
        }
        return a;
    }
    public static int BCNN(int a, int b) {
        return (a * b) / UCLN(a, b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Nhap so thu nhat");
        a=sc.nextInt();
        System.out.println("Nhap so thu hai");
        b=sc.nextInt();
        System.out.printf("UCLN: %d\n", UCLN(a, b));
        System.out.printf("BCNN: %d\n", BCNN(a, b));
        sc.close();
    }
}