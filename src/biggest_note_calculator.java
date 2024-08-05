import java.util.Scanner;

public class biggest_note_calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of notes");
        int notes = sc.nextInt();
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
}
