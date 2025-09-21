import java.util.Scanner;
class Bai7_tuan4 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap so phan tu mang:");
        int n=scanner.nextInt();
        int[] a=new int[n+1];
        int tong=0;
        System.out.println("Nhap gia tri mang:");
        for(int i=1;i<=n;i++){
            System.out.print("a["+i+"]=");
            a[i]=scanner.nextInt();
            tong=tong+a[i];    
        }
        System.out.println("Tong cac gia tri cua mang la:" + tong );
        scanner.close();
    }  
}