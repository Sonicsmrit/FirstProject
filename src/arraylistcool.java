import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arraylistcool {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(2);
//        list.add(0, 3);
//
//
//        list.remove(2);
//
//        System.out.println(list);


        /// wap to create array of the length n and n values
        ArrayList<Integer> list = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arraylist");
        int n = sc.nextInt();
        System.out.println("Enter the elements of arraylist");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());

        }
//        System.out.println(Arrays.toString(list.toArray())); /// ways to print arraylist
        for (int i = 0; i < n; i++) {
            System.out.println(list.get(i));    /// ways to print arraylist
        }
//        for(Integer e: list){
//            System.out.println(e);   /// ways to print arraylist
//        }

    }
}
