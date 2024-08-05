import java.util.Scanner;

public class test {
//    Develop a prototype billing system for a fast food chain based on the following user stories:
//            : The program should terminate when the user types "quit" or "QUIT" in the console.
//: Users must log in with a user ID and password to access the system features.
//: After logging in, users will input the number of items and then the price of each item.
//            : Once all prices are entered, the system will ask if VAT is to be charged. If yes, a 13% VAT will be added.
//            : Users will be prompted to input a discount percentage.
//: The system will calculate the total amount to be paid.
//            : Users will input the payment amount, and the system will calculate the change and the highest denomination of the change.

    public static void main(String[] args) {
        boolean run = true;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your id");
        int id = sc.nextInt();
        System.out.println("Enter your password: ");
        int pass = sc.nextInt();

        while (run) {

            System.out.println("press h for help");
            String help = sc.nextLine();

            if (help.equals("h")) {
                System.out.println("press q for quit");

            }
            if (help.equals("q")) {
                run = false;
                break;
            }


            System.out.println("welcome the food system ");

            System.out.println();


        }
    }
}
