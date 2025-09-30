import java.util.Scanner;

public class passwordRetry {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);

        String password = "sarim123";
        int maxAttempts = 3;

        while (maxAttempts > 0) {
            System.out.print("Enter password: ");
            String userInput = h.nextLine();

            if (userInput.equals(password)) {
                System.out.println("Login Successful!");
                break;
            } else {
                maxAttempts--;
                if (maxAttempts > 0) {
                    System.out.println("Incorrect password. You have " + maxAttempts + " attempts left.");
                } else {
                    System.out.println("Account locked. Please contact support.");
                }
            }
        }
        h.close();
    }
}
