import java.util.ArrayList;
import java.util.Scanner;

public class userInputarraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        int even = 0, odd = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of elements you wish to enter: ");
        int n = sc.nextInt();

        System.out.println("enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arraylist.add(sc.nextInt());

        }

        for (int i = 0; i < n; i++) {
            if (arraylist.get(i) % 2 == 0) {
                even = even + 1;

                System.out.println("the even number is: " + arraylist.get(i));
            } else if (arraylist.get(i) % 2 == 1) {
                odd = odd + 1;

                System.out.println("the odd numbers: "+ arraylist.get(i));
            }


        }
        System.out.println("the number of odd elements is: " + odd);
        System.out.println("the number of even elements is: " + even);
        if (even > odd) {
            System.out.println("even is greater than odd");
        } else if (even < odd) {
            System.out.println("even is greater than odd");
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = arraylist.get(i) + sum;
        }
        System.out.println("the sum of all the elements is: " + sum);


    }
}
