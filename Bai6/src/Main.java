import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Input
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi");
        String s = scan.nextLine();

        //Output
        char[] c = s.toCharArray();
        for(int i = (c.length - 1); i>=0; i--) {
            System.out.print(c[i]);
        }
    }
}