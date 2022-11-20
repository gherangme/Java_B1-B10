import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Input
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập số phần tử");
        int soPhanTu = Integer.parseInt(scan.nextLine());
        double[] arr = new double[100];
        //nhập mảng
        for(int i = 0; i<soPhanTu; i++) {
            System.out.println("Nhập phần tử thứ "+i+": ");
            arr[i] = Double.parseDouble(scan.nextLine());
        }
        //xuất mảng
        System.out.println("Mảng nhập vào: ");
        for(int i = 0; i<soPhanTu ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //Xử lý sắp xếp
        sapXep(arr, soPhanTu);

        //Output
        System.out.println("Mảng sau khi sắp xếp");
        for(int i = 0; i<soPhanTu ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //Xử lý xóa phần tử
        double[] new_arr = xoaPhanTuLapLai(arr, soPhanTu);

        //Output
        System.out.println("Mảng sau khi xóa phần tử lặp lại");
        for(int i = 0; i < new_arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    //hàm sắp xếp mảng
    public static double[] sapXep(double [] arr, int soPhanTu) {
        double temp = 0;
        for (int i = 0; i < soPhanTu - 1; i++) {
            for (int j = i + 1; j < soPhanTu; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    //hàm xóa phần tử lặp lại
    public static double[] xoaPhanTuLapLai(double[] arr, int soPhanTu) {
        for(int i = 0; i<soPhanTu - 1; i++) {
                if(arr[i] == arr[i+1]) {
                    for(int j = i; j<soPhanTu; j++) {
                        arr[j] = arr[j+1];
                }
                    soPhanTu--;
            }
        }

        double[] new_arr = new double[soPhanTu];
        for(int i = 0; i < soPhanTu; i++) {
            new_arr[i] = arr[i];
        }
        return new_arr;
    }
}