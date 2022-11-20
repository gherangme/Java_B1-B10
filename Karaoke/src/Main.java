import java.util.Scanner;

public class Main {
    //Khai báo hằng số
    final static int BA_GIO_DAU = 30000;
    final static int SAU_BA_GIO = 90000*30/100;
    final static int GIA_MOT_CHAI = 10000;

    public static void main(String[] args) {
        //Input
        Scanner scan = new Scanner(System.in);
        int gioVao = nhapGioVao(scan);
        int gioRa = nhapGioRa(scan, gioVao);
        int soChaiNuoc = nhapSoChaiNuoc(scan);

        //Xử lý
        int tienNuoc = tienNuoc(soChaiNuoc);
        int tienGio = tinhTienGio(gioVao, gioRa);
        int tongTien = tinhTongTien(tienNuoc, tienGio, gioVao);

        //Output
        System.out.println("Tổng số tiền cần thanh toán: "+tongTien);
    }

    //Nhập giờ vào
    public static int nhapGioVao(Scanner scan) {
        int nhapGioVao;
        System.out.println("Vui lòng nhập giờ vào ");
        do {
            nhapGioVao = Integer.parseInt(scan.nextLine());
            if(nhapGioVao<9) {
                System.out.println("Mở cửa từ 9:00, vui lòng nhập lại");
            }
        }while(nhapGioVao<9 || nhapGioVao >24);
        if(nhapGioVao<=17) {
            System.out.println("Bạn được giảm 20% tổng hóa đơn");
        }else {
            System.out.println("Bạn không được giảm giá");
        }
        return nhapGioVao;
    }

    //Nhập giờ ra
    public  static int nhapGioRa(Scanner scan, int gioVao) {
        int nhapGioRa;
        System.out.println("Vui lòng nhập giờ ra ");
        do {
            nhapGioRa = Integer.parseInt(scan.nextLine());
            if(nhapGioRa<9) {
                System.out.println("Không qua đêm, vui lòng nhập lại");
            }
            if(gioVao >= nhapGioRa || nhapGioRa>24) {
                do {
                    System.out.println("Giờ ra phải lớn hơn giờ vào và nhỏ hơn hoặc bằng 24");
                    nhapGioRa = Integer.parseInt(scan.nextLine());
                }while(gioVao >= nhapGioRa || nhapGioRa>24);
            }
        }while(nhapGioRa<9 || nhapGioRa >24);
        return nhapGioRa;
    }

    //Nhập số lượng nước
    public static int nhapSoChaiNuoc(Scanner scan) {
        int soChaiNuoc;
        System.out.println("Vui lòng nhập số chai nước ");
        do {
            soChaiNuoc = Integer.parseInt(scan.nextLine());
            if(soChaiNuoc < 0) {
                System.out.println("Vui lòng nhập lại số lượng >= 0");
            }
        }while(soChaiNuoc<0);
        return soChaiNuoc;
    }

    //Tính tiền giờ
    public static int tinhTienGio(int gioVao, int gioRa) {
        int tienGio = 0;
        if(gioRa - gioVao <=3) {
            tienGio = (gioRa - gioVao) * BA_GIO_DAU;
        }else {
            tienGio = 3 * BA_GIO_DAU + (gioRa - gioVao - 3) * SAU_BA_GIO;
        }
        return tienGio;
    }

    //Tính tiền nước
    public static int tienNuoc(int soChaiNuoc) {
        int tienNuoc = soChaiNuoc * GIA_MOT_CHAI;
        return  tienNuoc;
    }

    //Tính tổng tiền
    public static int tinhTongTien(int tienGio, int tienNuoc, int gioVao) {
        int tongTien = 0;
        if(gioVao <= 17) {
            tongTien = tienGio + tienNuoc;
            tongTien = tongTien * 80/100;
        }else {
            tongTien = tienGio + tienNuoc;
        }
        return tongTien;
    }
}