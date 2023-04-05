import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What number I'm gonna factorial today");
        int userNumber = userInput.nextInt();
        int number = (userNumber == 1) ? 0 : 1;
        int finalNumber = userNumber * (userNumber - number);
        while (number < userNumber) {
            number++;
            if(number == userNumber){
                break;
            }
            finalNumber *= (userNumber - number);
        }
        System.out.println(finalNumber);
    }
}
