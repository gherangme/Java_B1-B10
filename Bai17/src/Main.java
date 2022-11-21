import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Input
        Scanner scan = new Scanner(System.in);
        Random rd = new Random();
        int soNgauNhien = rd.nextInt(1001);
        System.out.println("Nhập vào số bạn dự đoán: ");
        int soDuDoan = Integer.parseInt(scan.nextLine());
//        System.out.println("Số bí mật: "+soNgauNhien);

        //OutPut
        if(soDuDoan == soNgauNhien) {
            System.out.println("Bạn đoán đúng rồi");
        }else {
            do{
                if(soDuDoan>soNgauNhien) {
                    System.out.println("Số này lớn hơn số bí mật, đoán tiếp nhé: ");
                    soDuDoan = Integer.parseInt(scan.nextLine());
                }else if(soDuDoan < soNgauNhien) {
                    System.out.println("Số này nhỏ hơn số bí mật, đoán tiếp nhé: ");
                    soDuDoan = Integer.parseInt(scan.nextLine());
                }
            }while(soDuDoan != soNgauNhien);
            System.out.println("Bạn đoán đúng rồi");
        }
    }
}