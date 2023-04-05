import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Select a mode: Dark, Light, Blue");
        String userMode = userInput.nextLine();
        String finalAnswer = userMode.toLowerCase().trim();
        System.out.println(finalAnswer);
        switch (finalAnswer){
            case "dark":
                System.out.println("Dark Mode activate");
                break;
            case "light":
                System.out.println("Light mode activate");
                break;
            case "blue":
                System.out.println("Blue mode activate. Taking care of you eyes;)");
                break;
            default:
                System.out.println("Incorrect");
        }
    }
}
