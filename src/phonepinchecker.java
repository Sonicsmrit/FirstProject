import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class phonepinchecker {
    public static void main(String[] args) throws InterruptedException {
        int realPin = 1234;

        for(int a = 0; a<=99999; a++){
            for (int i = 0; i < 4; i++) {
                System.out.println("enter a 4 digit phone number: ");
                Scanner in = new Scanner(System.in);
                int number = in.nextInt();
                if(number == realPin){
                    System.out.println("phone unlocked");

                }
                else{
                    System.out.println("try again");
                }
            }

            System.out.println("phone locked");
            for(int j = 0; j < 15; j++){
                TimeUnit.SECONDS.sleep(1);
                System.out.println(j + " ");


            }}
    }
}
