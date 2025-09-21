import java.util.Scanner;

public class Bai6_UCLN_BCNN {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        int a = sc.nextInt();
        System.out.print("Nhap so thu hai: ");
        int b = sc.nextInt();
        int x = a;
        int y = b;
        while (b != 0) 
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int ucln = a;
        int bcnn = (x * y) / ucln;
        System.out.println("UCLN cua hai so la: " + ucln);
        System.out.println("BCNN cua hai so la: " + bcnn);
        sc.close();
    }
}
