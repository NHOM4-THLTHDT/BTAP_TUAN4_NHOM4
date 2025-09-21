import java.util.ArrayList; 
import java.util.Scanner;
public class Bai9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> ds = new ArrayList<>();
        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            int x=sc.nextInt();
            ds.add(x);
        }
        System.out.println("Danh sach vua nhap: ");
        for (int i=0; i<ds.size(); i++) {
                System.out.print(ds.get(i) + " ");
        }
        sc.close();
    }
}