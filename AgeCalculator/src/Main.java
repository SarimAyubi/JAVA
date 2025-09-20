import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter your birth year: ");
        Scanner h = new Scanner(System.in);
        int birthYear = h.nextInt();

        int year = 2025;

        int age = year - birthYear;

        System.out.println("You are approximately "+age+" years old.");

        h.close();
        }
    }
