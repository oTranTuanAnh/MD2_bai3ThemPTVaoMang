import java.util.Scanner;

public class InsertArr {
    public static void main(String[] args) {
        int[] arr;
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang: ");
        size = sc.nextInt();
        arr = new int[size];

        int num;
        int index;
        System.out.print("Nhap so can them: ");
        num = sc.nextInt();
        System.out.print("Nhap v tri: ");
        index = sc.nextInt();

        if (index<=-1 || index >= arr.length-1){
            System.out.println("Khong chen duoc vao mang");
        } else {
            for (int i = arr.length-1; i >index ; i--) {
                arr[i] = arr[i-1];
            }
            arr[index] = num;
        }

        for (int b:arr){
            System.out.print(b + " ");
        }



    }
}
