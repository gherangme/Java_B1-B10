import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\nNhập vào chuỗi cần in hoa ký tự đầu: ");
        String str = scan.nextLine();
        char[] c = str.toCharArray();
        boolean flag = true;
        for(int i = 0; i < c.length; i++) {
            if(Character.isLetter(c[i])) {
                if(flag) {
                    c[i] = Character.toUpperCase(c[i]);
                    flag = false;
                }
            }
            else {
                flag = true;
            }
        }
        str = String.valueOf(c);
        System.out.println("Chuỗi sau khi đổi: \n" + str);
    }
}