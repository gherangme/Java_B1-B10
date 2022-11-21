import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Input
        Scanner scan = new Scanner(System.in);
        System.out.println("Vui lòng nhập năm: ");
        int nam = Integer.parseInt(scan.nextLine());

        //Output
        if(nam % 4==0) {
            if(nam % 100 == 0 && nam % 400 != 0) {
                System.out.println("Năm "+nam+" không phải là năm nhuận");
            }else {
                System.out.println("Năm "+nam+" là năm nhuận");
            }
        }else {
            System.out.println("Năm "+nam+" không phải là năm nhuận");
        }
    }
}