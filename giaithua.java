package tinhgiaithua;

import java.util.Scanner;

public class giaithua {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap gia tri cho n: ");
        n = sc.nextInt();
        giaithua(n);
    }
    public static void giaithua(int n){
        int ketqua = 1;
        for (int i = 1; i <=n ; i++) {
            ketqua *=i;
        }
        System.out.println("giai thua la:" + ketqua);
    }

}
