import java.util.Scanner;

public class hotcoldprogram {
    public static void main(String[] args) {
        int a = 10;

        Scanner sc = new Scanner(System.in);

            while(true){
                System.out.print("Enter an integer between 0 and 100: ");
                int guess = sc.nextInt();
                if(guess == a){
                    System.out.println("You guessed correctly!");

                }
                else if(guess > a){
                    System.out.println("Yoy guessed high");
                }
                else if(guess < a){
                    System.out.println("Yoy guessed low");
                }
                else{
                    System.out.println("use your brains");
                }
            }



    }
}
