import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so a: ");
        double a = sc.nextDouble();
        System.out.print("nhap so b: ");
        double b=sc.nextDouble();
        System.out.print("nhap so c: ");
        double c=sc.nextDouble();
        double min=a;
        if(b<min){
            min=b;
        }
        if(c<min){
            min=c;
        }
       System.out.println("so nho nhat trong ba so la"+min);
       sc.close();
    }
}
