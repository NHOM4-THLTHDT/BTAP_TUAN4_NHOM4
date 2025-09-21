import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a,b,kq;
        int choice;
        System.out.println("Nhap so thu nhat");
        a=sc.nextDouble();
        System.out.println("Nhap so thu hai");
        b=sc.nextDouble();
        System.out.println("\nChon phep tinh");
        System.out.println("1.Cong");
        System.out.println("2.Tru");
        System.out.println("3.Nhan");
        System.out.println("4.Chia");
        choice=sc.nextInt();
        switch(choice){
            case 1:
                kq=a+b;
                System.out.printf("Ket qua: %.2f + %.2f = %.2f\n", a, b, kq);
                break;
            case 2:
                kq=a-b;
                System.out.printf("Ket qua: %.2f - %.2f = %.2f\n", a, b, kq);
                break;
            case 3:
                kq=a*b;
                System.out.printf("Ket qua: %.2f * %.2f = %.2f\n", a, b, kq);
                break;
            case 4:
                if(b!=0){
                    kq=a/b;
                    System.out.printf("Ket qua: %.2f / %.2f = %.2f\n", a, b, kq);
                }else{
                    System.out.println("Khong the chia cho 0");
                }
                break;
            default:
                System.out.println("Khong hop le");
        }
        sc.close();
    }
    }