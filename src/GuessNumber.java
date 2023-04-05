import java.util.Scanner;

public class GuessNumber {
    public static final int MAX = 100;
    public static final int MIN = 1;
    public static int number = (int)Math.floor(Math.random() * (MAX - MIN + 1) + MIN);
    public static int tries = 0;
    public static void winner(){
        tries++;
        Scanner inputUser = new Scanner(System.in);
        int inputNumber;
        try{
            inputNumber = inputUser.nextInt();
        }catch (Exception e){
            System.out.println("Invalid: try again");
            winner();
            return;
        }
        if(inputNumber > number) {
            System.out.println("Too high");
            winner();
        }
        if(inputNumber < number){
            System.out.println("Too low");
            winner();
        }
        if(inputNumber == number) System.out.println("Congratulations!!" + " Attempts " + tries);
    }

    public static void main(String[] args) {
        System.out.println("Guess the number between 1 to 100");
        winner();
    }
}
