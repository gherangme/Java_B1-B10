import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập vào một tự nhiên");
        int soTuNhien = Integer.parseInt(scan.nextLine());
        do {
            if(soTuNhien<0) {
                System.out.println("Nhập sai, vui lòng nhập số tự nhiên");
                soTuNhien = Integer.parseInt(scan.nextLine());
            }
        }while(soTuNhien<0);
        if(soTuNhien == 0) {
            System.out.println("Ước của số 0 là tập hợp N*(tất cả các số tự nhiên khác 0)");
        }else {
            System.out.println("Ước của "+soTuNhien+" là:");
            for (int i = 1; i <= soTuNhien; i++) {
                if (soTuNhien % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}