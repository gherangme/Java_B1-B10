import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //InPut
        Scanner scan = new Scanner(System.in);
        System.out.println("Vui lòng nhập vào hai số nguyên dương từ 10 - 99");
        System.out.println("Số thứ nhất");
        int soThuNhat = kiemTraSoNguyenDuong(scan);

        System.out.println("Số thứ hai:");
        int soThuHai = kiemTraSoNguyenDuong(scan);

        //Xử lý
        boolean ketQua = kiemTraCungChuSo(soThuNhat, soThuHai);

        //Output
        if(ketQua) {
            System.out.println("TRUE");
        }else {
            System.out.println("FALSE");
        }
    }

    //Kiểm tra số nguyên dương nhập vào
    public static int kiemTraSoNguyenDuong(Scanner scan) {
        int so = Integer.parseInt(scan.nextLine());
        do {
            if (so < 10 || so > 99) {
                System.out.println("Nhập sai, vui lòng nhập lại số nguyên dương từ 10 - 99");
                so = Integer.parseInt(scan.nextLine());
            }
        }while(so >99 || so<10);
        return so;
    }

    //Hàm xử lý cùng chữ số
    public static boolean kiemTraCungChuSo(int soThuNhat, int soThuHai) {
        int hangDonVi1 = soThuNhat%10;
        int hangChuc1 = (soThuNhat - hangDonVi1)/10;
        int hangDonVi2 = soThuHai%10;
        int hangChuc2 = (soThuHai - hangDonVi2)/10;
        if(hangDonVi1==hangDonVi2 || hangDonVi1==hangChuc2 || hangChuc1==hangDonVi2 || hangChuc1==hangChuc2) {
            return true;
        }else {
            return false;
        }
    }
}