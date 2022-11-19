import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Input
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int tong = 0;

        //Xử lý
        for(int i = n; i>1; i--) {
            if(kiemTraSNT(i)==true) {
                tong += i;
            }
        }

        //Output
        System.out.println("Tổng các số nguyên tố cần tìm: "+tong);
    }
    //hàm kiểm tra số nguyên tố
    public static boolean kiemTraSNT(int n) {
        boolean flag = true;
        for(int i = 2; i< n; i++) {
            if(n%i==0) {
                return flag=false;
            }
        }
        return flag;
    }
}