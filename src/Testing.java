import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int userN;
        if(user.hasNextInt()){
            userN = user.nextInt();
            System.out.println("Correct");
        } else{
            System.out.println("What the fuck are you doing?");
        }
    }
}
