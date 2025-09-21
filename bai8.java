import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("nhap cac phan tu cua mang: ");
        for (int i= 0;i<n;i++){
            System.out.print("arr["+ i + "]=");
            arr[i]=sc.nextInt();
        }
        int phantunhieunhat=arr[0];
        int solanxuathienmax=1;
        for (int i=0;i<n;i++){
            int dem=1;
            for (int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                dem++;
            }
        }
        if (dem > solanxuathienmax){
            solanxuathienmax = dem;
            phantunhieunhat = arr[i];
        }
    }
    System.out.println(" phan tu xuat hien nhieu nhat la:" + phantunhieunhat + "(xuat hien" + solanxuathienmax+ "lan)");
    sc.close();
    }
}
