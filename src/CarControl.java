import java.util.Objects;
import java.util.Scanner;

public class CarControl {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean run = true;

        System.out.println("press 'h' for help");

        while (run) {
            System.out.print("Enter key: ");
            String command = sc.nextLine();

            if (command.equals("w")) {
                System.out.println("The car is moving forward");
            }
            else if (command.equals("s")) {
                System.out.println("The car is moving backward");
            }
            else if (command.equals("a")) {
                System.out.println("The car is moving left");
            }
            else if (command.equals("d")) {
                System.out.println("The car is moving right");
            }
            else if (command.equals("e")) {
                System.out.println("The car stopped");


            }
            else if (command.equals("h")) {
                System.out.println("Car Control System");
                System.out.println("Commands:");
                System.out.println("w - the car goes forward");
                System.out.println("s - the car goes backward");
                System.out.println("a - the car goes left");
                System.out.println("d - the car goes right");
                System.out.println("e - brake");
                System.out.println("h - Show Hints");
                System.out.println("q - quit");
            }
            else if (command.equals("q")) {
                System.out.println("simulation stopped");
                run = false;


            }

            else {
                System.out.println("Wrong command, press h for support");


            }
        }
    }
}
