import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vui lòng chọn chức năng\n" +
                "1.Giải phương trình bậc 1\n" +
                "2.Giải phương trình bậc 2\n"+
                "Chọn số bất kì khác để thoát chương trình");
        double a, b, c;
        int chonChucNang = Integer.parseInt(scan.nextLine());
        switch(chonChucNang) {
            case 1:
                System.out.println("Phương trình bậc 1: ax + b = 0");
                System.out.println("Nhập vào a: ");
                a = Double.parseDouble(scan.nextLine());
                System.out.println("Nhập vào b: ");
                b = Double.parseDouble(scan.nextLine());
                phuongTrinhBac1(a, b);
                break;
            case 2:
                System.out.println("Phương trình bậc 2: ax^2 + bx + c = 0");
                System.out.println("Nhập vào a: ");
                a = Double.parseDouble(scan.nextLine());
                System.out.println("Nhập vào b: ");
                b = Double.parseDouble(scan.nextLine());
                System.out.println("Nhập vào b: ");
                c = Double.parseDouble(scan.nextLine());
                phuongTrinhBac2(a, b, c);
                break;
            default:
                System.out.println("Chương trình kết thúc");
                break;
        }
    }
    public static void phuongTrinhBac1(double a, double b) {
        if(a==0) {
            if(b==0) {
                System.out.println("Phương trình có vô số nghiệm");
            }else {
                System.out.println("Phương trình vô nghiệm");
            }
        }else {
            double x = -b/a;
            System.out.println("Phương trình có nghiệm là "+x);
        }
    }
    public static void phuongTrinhBac2(double a, double b, double c) {
        double delta = b*b - 4*a*c , x1, x2;
        if(delta < 0) {
            System.out.println("Phương trình vô nghiệm");
        }else if(delta == 0) {
            x1 = -b/(2*a);
            System.out.println("Phương trình có nghiệm kép x = "+x1);
        }else {
            x1 = (-b-Math.sqrt(delta))/(2*a);
            x2 = (-b+Math.sqrt(delta))/(2*a);
            System.out.println("Phương trình có 2 nghiệm phân biệt\n" +
                    "x1 = "+x1+"\n" +
                    "x2 = "+x2);
        }
    }
}