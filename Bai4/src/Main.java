import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập một số tự nhiên ");
        //Input
        Scanner scan = new Scanner(System.in);
        int soTuNhien = Integer.parseInt(scan.nextLine());

        //Output
        System.out.println(tongChuSo(soTuNhien, scan));
    }

    //hàm xử lý
    public static int tongChuSo(int soTuNhien, Scanner scan) {
        int tongChuSo = 0;
        //kiểm tra số tự nhiên
        if(soTuNhien<0) {
            do {
                System.out.println("Nhập sai, vui lòng nhập số tự nhiên");
                soTuNhien = Integer.parseInt(scan.nextLine());
            } while (soTuNhien < 0);
        }

        //xử lý
        while(soTuNhien > 0) {
            tongChuSo += soTuNhien%10;
            soTuNhien = soTuNhien/10;
        }
        return tongChuSo;
    }
}