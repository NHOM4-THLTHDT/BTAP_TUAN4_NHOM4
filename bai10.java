import java.util.ArrayList;
import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> danhSach = new ArrayList<>();

        // Nhập danh sách ban đầu
        System.out.print("Nhap so luong phan tu ban dau: ");
        int n = sc.nextInt();
        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            danhSach.add(sc.nextInt());
        }
        System.out.println("Danh sach ban dau: " + danhSach);

        // Thêm phần tử
        System.out.print("Nhap phan tu muon them: ");
        int them = sc.nextInt();
        System.out.print("Nhap vi tri muon them (1 den " + (danhSach.size() + 1) + "): ");
        int viTriThem = sc.nextInt();

        // Chuyển vị trí từ 1-based sang 0-based
        if (viTriThem < 1 || viTriThem > danhSach.size() + 1) {
            System.out.println("Vi tri khong hop le!");
        } else {
            danhSach.add(viTriThem - 1, them);
            System.out.println("Danh sach sau khi them: " + danhSach);
        }

        // Xóa phần tử
        System.out.print("Nhap vi tri muon xoa (1 den " + danhSach.size() + "): ");
        int viTriXoa = sc.nextInt();

        // Chuyển vị trí từ 1-based sang 0-based
        if (viTriXoa < 1 || viTriXoa > danhSach.size()) {
            System.out.println("Vi tri khong hop le!");
        } else {
            int xoa = danhSach.remove(viTriXoa - 1);
            System.out.println("Da xoa phan tu: " + xoa);
            System.out.println("Danh sach sau khi xoa: " + danhSach);
        }

        sc.close();
    }
}
