import java.util.Scanner;

public class Main{

    public static double getRadius(int radius, double pi){
        return (pi * (Math.pow(radius, 2)));
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is the radius of your circle:");
        int userRadius = userInput.nextInt();
        final double PI = Math.PI;
        double radius = getRadius(userRadius, PI);
        System.out.println(radius);
    }
}