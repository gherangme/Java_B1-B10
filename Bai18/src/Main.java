import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Input
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập số tiền muốn gửi: ");
        double soTienGui = Double.parseDouble(scan.nextLine());
        System.out.println("Nhập phần trăm tiền lãi một năm: ");
        double phanTram = Double.parseDouble(scan.nextLine());
        System.out.println("Nhập số tiền mong muốn trong tương lai: ");
        double soTienMongMuon = Double.parseDouble(scan.nextLine());
        int soNam = 0;

        //Xử lý
        for(int i = 1; i<Integer.MAX_VALUE; i++) {
            soTienGui = soTienGui+soTienGui*phanTram/100;
            if(soTienGui>=soTienMongMuon) {
                soNam = i;
                break;
            }
        }

        //Output
        System.out.println("Sau "+soNam+" năm bạn sẽ có số tiền mong muốn là "+soTienGui);
    }
}