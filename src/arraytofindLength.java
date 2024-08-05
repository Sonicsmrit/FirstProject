import java.util.Arrays;
import java.util.Scanner;

public class arraytofindLength {
    public static void main(String[] args) {
        ///wap to create 3 arrays
//        int arrays[] = new int[3];
//        arrays[0] = 10;
//        arrays[1] = 20;
//        arrays[2] = 30;
//
//        System.out.println(Arrays.toString(arrays));
//        System.out.println(arrays[1]);
//        System.out.println(arrays[2]);



//      /// wap to create array of the length n and n values
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the values of array: ");

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();

        }
        System.out.println(Arrays.toString(array));
//        for (int i = 0; i < n; i++){
//            System.out.println("its value is: "+ array[i]);
//        }

        //// Study how to remove amd replace a values from the array





    }
}
