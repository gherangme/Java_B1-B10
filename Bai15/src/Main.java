import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Input
        Scanner scan = new Scanner(System.in);
        System.out.println("Vui lòng nhập vào một chuỗi: ");
        String str = scan.nextLine();
        System.out.println("Vui lòng nhập vào vị trí cần xuất ra ký tự: ");
        int index = Integer.parseInt(scan.nextLine());

        //Xử lý
        char[] c = str.toCharArray();
        boolean kiemTraChuoiPhu = str.contains("abcdef");

        //Output
        System.out.println("Độ dài của chuỗi: "+str.length());
        System.out.println("Ký tự tại vị trí "+index+" là: "+c[index]);
        if(kiemTraChuoiPhu) {
            System.out.println("Có chuỗi phụ abcdef");
        }else {
            System.out.println("Không có chuỗi phụ abcdef");
        }
    }
}