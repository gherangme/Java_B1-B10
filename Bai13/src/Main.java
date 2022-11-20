import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Input
        Scanner scan = new Scanner(System.in);
        int soPhanTu = kiemTraPhanTu(scan);
        double[] arr = nhapTungPhanTu(scan, soPhanTu);
        System.out.println("Nhập vào số cần chèn");
        double soCanChen = Double.parseDouble(scan.nextLine());
        System.out.println("Nhập vào vị trí cần chèn");
        int index = Integer.parseInt(scan.nextLine());
        System.out.println("Nhập vào vị trí cần xóa");
        int index_xoa = Integer.parseInt(scan.nextLine());

        //sout
        for(int i = 0; i<soPhanTu; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //Xử lý
        double giaTriTrungBinh = tinhGiaTriTrungBinh(arr, soPhanTu);
        double phanTuLonNhat = timPhanTuLonNhat(arr, soPhanTu);
        double phanTuNhoNhat = timPhanTuNhoNhat(arr, soPhanTu);
        double phanTuAmLonNhat = timPhanTuAmLonNhat(arr, soPhanTu);
        double phanTuAmNhoNhat = timPhanTuAmNhoNhat(arr, soPhanTu);
        double phanTuDuongLonNhat = timPhanTuDuongLonNhat(arr, soPhanTu);
        double phanTuDuongNhoNhat = timPhanTuDuongNhoNhat(arr, soPhanTu);



        //Output
        //câu a
        System.out.println("Giá trị trung bình: "+giaTriTrungBinh);

        //câu b
        System.out.println("Phần tử lớn nhất: "+phanTuLonNhat);
        System.out.println("Phần tử nhỏ nhất: "+phanTuNhoNhat);

        //câu c
        if(phanTuAmLonNhat==Integer.MAX_VALUE) {
            System.out.println("Không tồn tại phần tử âm lớn nhất");
        }else {
            System.out.println("Phần tử âm lớn nhất: "+phanTuAmLonNhat);
        }
        if(phanTuAmNhoNhat==Integer.MIN_VALUE) {
            System.out.println("Không tồn tại phần tử âm nhỏ nhất");
        }else {
            System.out.println("Phần tử âm nhỏ nhất: "+phanTuAmNhoNhat);
        }

        //câu d
        if(phanTuDuongLonNhat==Integer.MIN_VALUE) {
            System.out.println("Không tồn tại phần tử dương lớn nhất");
        }else {
            System.out.println("Phần tử dương lớn nhất: "+phanTuDuongLonNhat);
        }
        if(phanTuDuongNhoNhat==Integer.MAX_VALUE) {
            System.out.println("Không tồn tại phần tử dương nhỏ nhất");
        }else {
            System.out.println("Phần tử dương nhỏ nhất: "+phanTuDuongNhoNhat);
        }

        //câu e
        phanTuChanLe(arr, soPhanTu);

        //câu f
        System.out.println();
        System.out.println("Mảng sau khi chèn: ");
        double[] new_arr = chenTaiViTriIndex(arr, soPhanTu, soCanChen, index);
        soPhanTu++;
        for(int i = 0; i<soPhanTu; i++) {
            System.out.print(new_arr[i]+" ");
        }

        //câu g
        System.out.println();
        double[] new_arr2 = xoaTaiViTriIndex(arr, soPhanTu, index_xoa);
        soPhanTu--;
        System.out.println("Mảng sau khi xóa: ");
        for(int i = 0; i<soPhanTu; i++) {
            System.out.print(new_arr2[i]+" ");
        }
    }

    //Hàm kiểm tra số phần tử
    public static int kiemTraPhanTu(Scanner scan) {
        System.out.println("Vui lòng nhập số phần tử: ");
        int soPhanTu = Integer.parseInt(scan.nextLine());
        if(soPhanTu<=0 || soPhanTu>100) {
            do {
                System.out.println("Số phần tử phải lớn hơn 0 và bé hơn bằng 100, vui lòng nhập lại");
                soPhanTu = Integer.parseInt(scan.nextLine());
            }while(soPhanTu<=0 || soPhanTu>100);
        }
        return soPhanTu;
    }

    //Hàm nhập từng phần tử
    public static double[] nhapTungPhanTu(Scanner scan, int soPhanTu) {
        double[] arr = new double[100];
        for(int i = 0; i < soPhanTu; i++) {
            System.out.println("Nhập phần tử thứ "+i+": ");
            arr[i] = Double.parseDouble(scan.nextLine());
        }
        return arr;
    }

    //câu a
    //Tính giá trị trung bình
    public static double tinhGiaTriTrungBinh(double[] arr, int soPhanTu) {
        double trungBinh = 0;
        for(int i = 0; i <soPhanTu;i++) {
            trungBinh += arr[i];
        }
        return trungBinh = trungBinh/soPhanTu;
    }

    //câu b
    //Tìm phần tử lớn nhất
    public static double timPhanTuLonNhat(double[] arr, int soPhanTu) {
        double max = arr[0];
        for(int i = 0; i<soPhanTu; i++) {
            if(max <= arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    //câu b
    //Tìm phần tử nhỏ nhất
    public static double timPhanTuNhoNhat(double[] arr, int soPhanTu) {
        double min = arr[0];
        for(int i = 0; i<soPhanTu; i++) {
            if(min >= arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    //câu c
    //Tìm xem có số âm hay không
    public static boolean timPhanTuAm(double[] arr, int soPhanTu) {
        boolean flag = false;
        for(int i = 0; i<soPhanTu; i++) {
            if(arr[i]<0) {
                return flag = true;
            }
        }
        return flag;
    }

    //câu c
    //Tìm số âm lớn nhất
    public static double timPhanTuAmLonNhat(double[] arr, int soPhanTu) {
        double phanTuAmLonNhat = Integer.MAX_VALUE;
        if(timPhanTuAm(arr, soPhanTu)) {
            for(int i = 0; i<soPhanTu; i++) {
                if(phanTuAmLonNhat>=arr[i]) {
                     phanTuAmLonNhat = arr[i];
                }
            }
        }
        return phanTuAmLonNhat;
    }

    //câu c
    //Tìm phần tử âm nhỏ nhất
    public static double timPhanTuAmNhoNhat(double[] arr, int soPhanTu) {
        double phanTuAmNhoNhat = Integer.MIN_VALUE;
        if(timPhanTuAm(arr, soPhanTu)) {
            for(int i = 0; i<soPhanTu; i++) {
                if(phanTuAmNhoNhat<=arr[i] && arr[i] <0) {
                    phanTuAmNhoNhat = arr[i];
                }
            }
        }
        return phanTuAmNhoNhat;
    }

    //câu d
    //Tìm xem có phần tử dương hay không
    public static boolean timPhanTuDuong(double[] arr, int soPhanTu) {
        boolean flag = false;
        for(int i = 0; i<soPhanTu; i++) {
            if(arr[i]>0) {
                return flag = true;
            }
        }
        return flag;
    }

    //câu d
    //Tìm phần tử dương lớn nhất
    public static double timPhanTuDuongLonNhat(double[] arr, int soPhanTu) {
        double phanTuDuongLonNhat = Integer.MIN_VALUE;
        if(timPhanTuDuong(arr, soPhanTu)) {
            for(int i = 0; i<soPhanTu; i++) {
                if(phanTuDuongLonNhat<=arr[i]) {
                    phanTuDuongLonNhat = arr[i];
                }
            }
        }
        return phanTuDuongLonNhat;
    }

    //câu d
    //Tìm phần tử dương nhỏ nhất
    public static double timPhanTuDuongNhoNhat(double[] arr, int soPhanTu) {
        double phanTuDuongNhoNhat = Integer.MAX_VALUE;
        if(timPhanTuDuong(arr, soPhanTu)) {
            for(int i = 0; i<soPhanTu; i++) {
                if(phanTuDuongNhoNhat>=arr[i] && arr[i] >0) {
                    phanTuDuongNhoNhat = arr[i];
                }
            }
        }
        return phanTuDuongNhoNhat;
    }

    //câu e
    //Tìm phần tử chẵn lẻ
    public static void phanTuChanLe(double[] arr, int soPhanTu) {
        System.out.println("Phần tử chẳn: ");
        for(int i = 0; i<soPhanTu; i++) {
            if(arr[i]%2==0) {
                System.out.print(arr[i]+" ");
            }
        }

        System.out.println();
        System.out.println("Phần tử lẻ: ");
        for(int i = 0; i<soPhanTu; i++) {
            if(arr[i]%2==1 || arr[i]%2==-1) {
                System.out.print(arr[i]+" ");
            }
        }
    }

    //câu f
    //Chèn phần tử tại vị trí index
    public static double[] chenTaiViTriIndex(double[] arr, int soPhanTu, double soCanChen, int index) {
        for(int i = soPhanTu - 1; i>=index; i--) {
            arr[i+1] = arr[i];
        }
        arr[index] = soCanChen;
        return arr;
    }

    //câu g
    //Xóa phần tử tại vị trí index
    public static double[] xoaTaiViTriIndex(double[] arr, int soPhantu, int index_xoa) {
        for(int i = index_xoa; i<soPhantu; i++) {
            arr[i] = arr[i+1];
        }
        //sau khi chèn bằng hàm chenTaiViTriIndex trên thì số phần tử cộng thêm 1.
        //vì thế muốn xóa thì gán phần tử [index_xoa + 1] vào index_xoa và xóa phần tử cuối bằng cách cho phần tử cuối cùng bằng 0
        //lo do là vì khi một mảng ban đầu được tạo ra mà không gán giá trị thì giá trị của mỗi phần tử trong mảng đó là 0 do đó:
        arr[soPhantu] = 0;
        return arr;
    }
}