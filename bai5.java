import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao so nguyen: ");
        int x = sc.nextInt();
        boolean languyento = true;
        if(x<2){
        languyento = false;
        }
        else{
            for(int i = 2;i <=  Math.sqrt(x);i++){
                if(x % i == 0){
                    languyento = false;
                    break;
                }

            }
        }
        if (languyento){
            System.out.println(x + " la so nguyen to.");
        } else {
            System.out.println(x + " khong phai la so nguyen to.");
        }
        sc.close();
    }
    
}
