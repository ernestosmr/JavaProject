import java.util.Scanner;

public class EvenOdd {
    /**
     * This is  going to be on JAVA DOCS!!
    **/
    // Create this method to return true if the number is even and false if is odd
    public static boolean isEven(int number){
        int resultNumber = number % 2;
        return resultNumber == 0;
    }

    public static void main(String[] args) {
        // First we request a number from our user, we import Scanner to do that
         System.out.println("Write a number");
         Scanner userInput = new Scanner(System.in);
         int userNumber = userInput.nextInt();
        System.out.println(isEven(userNumber));
    }
}
