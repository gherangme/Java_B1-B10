import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1.DEC -> BIN"+"\n"+"2.BIN -> DEC");
        int chon = Integer.parseInt(scan.nextLine());
        switch(chon) {
            //chuyển DEC -> BIN
            case 1:{
                System.out.println("Nhập số thập phân");
                int thapPhan = Integer.parseInt(scan.nextLine());
                int[] nhiPhan = new int[10];
                int index = 0;
                while(thapPhan>0) {
                    nhiPhan[index++] = thapPhan%2;
                    thapPhan = thapPhan/2;
                }
                for(int i = index - 1; i >= 0; i--) {
                    System.out.print(nhiPhan[i]);
                }
                break;
            }

            //chuyển BIN -> DEC
            case 2:{
                System.out.println("Nhập số nhị phân");
                int soNhiPhan = Integer.parseInt(scan.nextLine());
                int dec = 0;
                int p = 0;
                while(true) {
                    if(soNhiPhan == 0) {
                        break;
                    }else {
                        int temp = soNhiPhan%10;
                        dec += temp*Math.pow(2,p);
                        soNhiPhan = soNhiPhan/10;
                        p++;
                    }
                }
                System.out.println("So thap phan: "+dec);
                break;
            }
            default:
                System.out.println("Chương trình kết thúc");
                break;
        }
    }
}