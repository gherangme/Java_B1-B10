import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Input
        Scanner scan = new Scanner(System.in);
        System.out.println("Vui lòng nhập số phần tử");
        int[] arr = new int[100];
        int soPhanTu = Integer.parseInt(scan.nextLine());
        if(soPhanTu < 0) {
            do {
                System.out.println("Vui lòng nhập số phần tử lớn hơn bằng 0");
                soPhanTu = Integer.parseInt(scan.nextLine());
            }while(soPhanTu<0);
        }

        System.out.println("Vui lòng nhập phần tử là số tự nhiên lớn hơn bằng 0");

        //Duyệt mảng nhập vào
        arr = nhapTungPhanTu(scan, soPhanTu);
        System.out.println("Mảng vừa nhập: ");
        xuatMang(arr, soPhanTu);

        //Xử lý tách mảng chẵn
        int[] arrChan = tachMangChan(arr, soPhanTu);
        //Output mảng chẵn
        System.out.println("Mảng chẳn sau khi tách: ");
        xuatMang(arrChan, arrChan.length);

        //Xử lý tách mảng lẻ
        int[] arrLe = tachMangLe(arr, soPhanTu);
        //Output mảng lẻ
        System.out.println("Mảng lẻ sau khi tách: ");
        xuatMang(arrLe, arrLe.length);
    }

    //hàm nhập mảng
    public static int[] nhapTungPhanTu(Scanner scan, int soPhanTu) {
        int[] arr = new int[soPhanTu];
        for(int i = 0; i < soPhanTu; i++) {
            System.out.println("Phần tử thứ "+i);
            arr[i] = Integer.parseInt(scan.nextLine());
            if(arr[i] < 0) {
                do {
                    System.out.println("Nhập sai, vui lòng nhập lại");
                    arr[i] = Integer.parseInt(scan.nextLine());
                }while(arr[i] < 0);
            }
        }
        return arr;
    }

    //hàm xuất mảng
    public static void xuatMang(int[] arr, int soPhanTu) {
        for(int i = 0; i<soPhanTu; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //Tách thành mảng chẵn
    public static int[] tachMangChan(int[] arr, int soPhanTu) {
        int[] arr_copy = new int[soPhanTu];
        int count = 0;
        for(int i = 0; i<soPhanTu; i++) {
            if(arr[i] % 2 == 0) {
                arr_copy[count] = arr[i];
                count++;
            }
        }
        int[] new_arr = new int[count];
        for(int i = 0; i < count; i++) {
            new_arr[i] = arr_copy[i];
        }
        return new_arr;
    }

    //Tách thành mảng lẻ
    public static int[] tachMangLe(int[] arr, int soPhanTu) {
        int[] arr_copy = new int[soPhanTu];
        int count = 0;
        for(int i = 0; i<soPhanTu; i++) {
            if(arr[i] % 2 == 1) {
                arr_copy[count] = arr[i];
                count++;
            }
        }
        int[] new_arr = new int[count];
        for(int i = 0; i < count; i++) {
            new_arr[i] = arr_copy[i];
        }
        return new_arr;
    }
}