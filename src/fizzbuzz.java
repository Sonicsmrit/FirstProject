import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = in.nextInt();
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("fizzbuzz");
        }
        else if (n % 3 == 0) {
            System.out.println("fizz");
        }
        else if (n % 5 == 0) {
            System.out.println("buzz");
        }
        else{
            System.out.println(n);
        }

    }
}
