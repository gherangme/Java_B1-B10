import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Input
        Scanner scan = new Scanner(System.in);
        int soTuNhien = kiemTraSoTuNhien(scan);

        //Xử lý và Output
        for(int i = 1; i<=soTuNhien; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    //hàm kiểm tra số tự nhiên
    public static int kiemTraSoTuNhien(Scanner scan) {
        System.out.println("Nhập một số tự nhiên 1 - 9");
        int soTuNhien = Integer.parseInt(scan.nextLine());
        if(soTuNhien<1 || soTuNhien>9) {
            do {
                System.out.println("Nhập sai, vui lòng nhập lại một số tự nhiên 1 - 9");
                soTuNhien = Integer.parseInt(scan.nextLine());
            }while (soTuNhien<1 || soTuNhien>9);
        }
        return soTuNhien;
    }
}