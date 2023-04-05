import java.util.Scanner;

public class userNameAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;

        while (true) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();

            System.out.print("Enter your age: ");
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                scanner.nextLine(); // to consume the remaining newline character
                if (validateInput(name, age)) {
                    break;
                }
            } else {
                scanner.nextLine(); // to consume the invalid input
            }
            System.out.println("Invalid input. Please try again.");
        }

        outputMessage(name, age);
    }

    public static boolean validateInput(String name, int age) {
        return !name.isEmpty() && age > 0;
    }

    public static void outputMessage(String name, int age) {
        int nextYearAge = age + 1;
        System.out.println("Hello " + name + ", you will be " + nextYearAge + " years old next year!");
    }
}
