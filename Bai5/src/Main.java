import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Input
        Scanner scan = new Scanner(System.in);
        System.out.println("Vui lòng nhập vào hoành độ xA");
        double xA = Double.parseDouble(scan.nextLine());

        System.out.println("Vui lòng nhập vào tung độ yA");
        double yA = Double.parseDouble(scan.nextLine());

        System.out.println("Vui lòng nhập vào hoành độ xB");
        double xB = Double.parseDouble(scan.nextLine());

        System.out.println("Vui lòng nhập vào tung độ yB");
        double yB = Double.parseDouble(scan.nextLine());

        //Code xử lý
        double doanThangAB = Math.sqrt(Math.pow(xA-xB,2) + Math.pow(yA-yB,2));

        //Output
        System.out.println("Độ dài đoạn thẳng AB: "+doanThangAB);
    }
}