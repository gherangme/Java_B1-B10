import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int diemGapNhau = 0;
        //Input
        //nhập x1
        System.out.println("Vui lòng nhập địa chỉ x1 của kan 1");
        int x1 = Integer.parseInt(scan.nextLine());
        //kiểm tra điều kiện x1
        if(x1<0 || x1 >9998) {
            do {
                System.out.println("Nhập sai, vui lòng nhập 0<= x1 <=9998");
                x1 = Integer.parseInt(scan.nextLine());
            }while (x1<0 || x1>9998);
        }

        //nhập x2
        System.out.println("Vui lòng nhập địa chỉ x2 của kan 2");
        int x2 = Integer.parseInt(scan.nextLine());
        //kiểm tra điều kiện x2
        if(x2<=x1 || x2>9999) {
            do {
                System.out.println("Nhập sai, vui lòng nhập x1< x2 <=9999");
                x2 = Integer.parseInt(scan.nextLine());
            }while (x2<=x1 || x2>9999);
        }

        //Nhập v1
        System.out.println("Vui lòng nhập vận tốc v1 của kan 1");
        int v1 = Integer.parseInt(scan.nextLine());
        //kiểm tra điều kiện v1
        if(v1<1 || v1>10000) {
            do {
                System.out.println("Nhập sai, vui lòng nhập 1<=v1<=10000");
                v1 = Integer.parseInt(scan.nextLine());
            }while(v1<1 || v1>10000);
        }

        //Nhập v2
        System.out.println("Vui lòng nhập vận tốc v2 của kan 2");
        int v2 = Integer.parseInt(scan.nextLine());
        //Kiểm tra điều kiện v2
        if(v2<1 || v2>10000) {
            do {
                System.out.println("Nhập sai, vui lòng nhập 1<=v2<=10000");
                v2 = Integer.parseInt(scan.nextLine());
            }while(v2<1 || v2>10000);
        }

        //Xử lý
        x1 += v1;
        x2 += v2;
        if(x2<10000) {
            if (x1 == x2) {
                System.out.println("2 kangaroo gặp nhau tại x1 = x2 = "+x1);
            }else {
                do {
                    x1 += v1;
                    x2 += v2;
                    if(x1 == x2) {
                        System.out.println("2 kangaroo gặp nhau tại x1 = x2 = "+x1);
                        break;
                    }
                }while(x2<10000);
                if(x1 != x2)
                    System.out.println("2 kangaroo không gặp nhau");
            }
        }else {
            System.out.println("2 kangaroo không gặp nhau");
        }
    }
}
