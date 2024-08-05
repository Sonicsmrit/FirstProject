
import java.util.ArrayList;
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



        while (run) {
            System.out.print("Enter your id: ");
            int id = sc.nextInt();
            System.out.println("Enter your password: ");
            int pass = sc.nextInt();
            sc.nextLine();


            System.out.println("welcome the automatic check out system");
            System.out.println("enter the number of items you have purchased: ");
            int items = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<Integer>();

            for (int i = 0; i < items; i++) {
                System.out.println("Enter the price for " + (i+1) + " item: ");
                list.add(sc.nextInt());


            }
            int sum = 0;
            for (int i = 0; i < items; i++) {
                sum += list.get(i);

            }


            System.out.println("do you want VAT to be added(Y/N): ");
            sc.nextLine();
            boolean go = true;
            int amount = 0;

            while(go){
                String vat = sc.nextLine();
                if (vat.equalsIgnoreCase("Y")) {
                    amount = (sum * 13 / 100) + sum;
                    go = false;
                } else if (vat.equalsIgnoreCase("N")) {
                    amount = sum;
                    go = false;
                } else {
                    System.out.println("wrong input, try again with inputs Y and N");
                }
            }
            System.out.println("your sum after the vat is" + amount);
            System.out.println("do you want discount(Y/N): ");
            boolean good = true;
            float discountamount = amount;

            while (good) {
                String dis = sc.nextLine();

                if (dis.equalsIgnoreCase("Y")) {
                    System.out.println("Enter the discount percentage: ");
                    float percentage = sc.nextFloat();
                    sc.nextLine();

                    if (percentage > 0 && percentage <= 100) {
                         discountamount = amount - (amount * percentage / 100);
                            good = false;
                    } else {
                        System.out.println("Invalid percentage. Please enter a value between 0 and 100.");
                    }
                } else if (dis.equalsIgnoreCase("N")) {
                    good = false;
                } else {
                    System.out.println("Wrong input, try again with inputs Y and N");
                }
            }

            System.out.println("The total after the discount is: " + discountamount);


            System.out.println("please enter the payment amount without the cents: ");
                int notes = sc.nextInt();
                int payment = Math.round(discountamount);
                if(notes == discountamount) {
                    int fifty = 0;
                    int hundred = 0;
                    int fivehun = 0;
                    int thou = 0;
                    int ten = 0;

                    if (notes >= 100) {
                        thou = notes / 1000;
                        notes = notes % 1000;

                    }
                    if (notes >= 500) {
                        fivehun = notes / 500;
                        notes = notes % 500;

                    }
                    if (notes >= 100) {
                        hundred = notes / 100;
                        notes = notes % 100;
                    }
                    if (notes >= 50) {
                        fifty = notes / 50;
                        notes = notes % 50;
                    }
                    if (notes >= 10) {
                        ten = notes / 10;
                        notes = notes % 10;

                    }
                    System.out.println("The number of 1000 notes: " + thou);
                    System.out.println("The number of 500 notes: " + fivehun);
                    System.out.println("The number of 100 notes: " + hundred);
                    System.out.println("The number of 50 notes: " + fifty);
                    System.out.println("The number of 10 notes: " + ten);
                }

                sc.nextLine();
                System.out.println("enter quit or QUIT to leave");
                String quit = sc.nextLine();
                if (quit.equalsIgnoreCase("QUIT")) {
                    run = false;
                }

        }
    }
}
