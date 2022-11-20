import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Input
        Scanner scan = new Scanner(System.in);
        int soTuNhien = kiemTraSoTuNhien(scan);

        //Xử lý
        long soCanTim = lonNhatVaNhoHonLog2_n(soTuNhien);

        //Output
        System.out.println("Số tự nhiên lớn nhất nhỏ hơn log2(n): "+soCanTim);
    }

    //hàm kiểm tra số tự nhiên
    public static int kiemTraSoTuNhien(Scanner scan) {
        System.out.println("Nhập vào một số tự nhiên");
        int soTuNhien = Integer.parseInt(scan.nextLine());
        if(soTuNhien<0) {
            do{
                System.out.println("Nhập sai, vui lòng nhập lại một số tự nhiên");
                soTuNhien = Integer.parseInt(scan.nextLine());
            }while(soTuNhien<0);
        }
        return soTuNhien;
    }

    //hàm kiểm tra số lớn nhất và nhỏ hơn log2(n)
    public static long lonNhatVaNhoHonLog2_n(int soTuNhien) {
        double lonNhat = Math.log(soTuNhien)/Math.log(2);
        long soLonNhat = (long) lonNhat;
        return soLonNhat;
    }
}