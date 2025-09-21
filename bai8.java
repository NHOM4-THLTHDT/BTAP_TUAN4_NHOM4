import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Đếm số lần xuất hiện
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Tìm maxCount
        int maxCount = 0;
        for (int count : countMap.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        if (maxCount == 1) {
            System.out.println("Tat ca cac phan tu chi xuat hien 1 lan.");
        } else {
            // Tìm tất cả phần tử có số lần xuất hiện = maxCount
            ArrayList<Integer> mostFrequentList = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
                if (entry.getValue() == maxCount) {
                    mostFrequentList.add(entry.getKey());
                }
            }

            System.out.print("Phan tu xuat hien nhieu nhat: ");
            for (int i = 0; i < mostFrequentList.size(); i++) {
                System.out.print(mostFrequentList.get(i));
                if (i != mostFrequentList.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(" (xuat hien " + maxCount + " lan)");
        }

        sc.close();
    }
}
