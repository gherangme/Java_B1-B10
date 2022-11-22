import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi palindrome");
        String str = scan.nextLine();
        char[] ch = str.toCharArray();

        char[] ch_1 = new char[ch.length/2];
        for(int i = 0; i<ch_1.length; i++) {
            ch_1[i] = ch[i];
        }
//        for(int i = 0; i<ch_1.length; i++) {
//            System.out.print(ch_1[i]);
//        }

        char[] ch_2 = new char[ch.length/2];
        for(int i = 0; i<ch_2.length; i++) {
            ch_2[i] = ch[ch_2.length+i];
        }
//        System.out.println();
//        for(int i = 0; i<ch_2.length; i++) {
//            System.out.print(ch_2[i]);
//        }

        char[] ch_2_new = new char[ch.length/2];
        for(int i = ch_2_new.length-1; i>=0; i--) {
            ch_2_new[i] = ch_2[ch_2_new.length-1-i];
        }
//        System.out.println();
//        for(int i = 0; i<ch_2_new.length; i++) {
//            System.out.print(ch_2_new[i]);
//        }
//        System.out.println();

        String str_1 = new String().valueOf(ch_1);
//        System.out.println(str_1);
        String str_2 = new String().valueOf(ch_2);
//        System.out.println(str_2);
        String str_2_new = new String().valueOf(ch_2_new);
//        System.out.println(str_2_new);


        if(str_1.equals(str_2_new)) {
            System.out.print("Đây là chuỗi palindrome\n" +
                    "Output: ");
            for(int i = 0; i<ch_2.length; i++) {
                System.out.print(ch_2[i]);
            }
        }else {
            System.out.println("Đây không phải là chuỗi palindrome");
        }
    }
}
