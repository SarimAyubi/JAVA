import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);

        System.out.println("Welcome to your Bank Account!");
        System.out.println("1. View balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");

        int choice = h.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Viewing your balance...");
                break;

            case 2:
                System.out.println("Proceeding to deposit...");
                break;

            case 3:
                System.out.println("Initiating Withdrawal...");
                break;

            case 4:
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Invalid choice, Please try again!");
            }

            h.close();
        }
    }

