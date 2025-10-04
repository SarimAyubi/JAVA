import java.util.Scanner;

public class Sum_Average {
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                System.out.print("Enter how many numbers you want to input: ");
                int n = input.nextInt();

                double sum = 0;

                for (int i = 1; i <= n; i++) {
                    System.out.print("Enter number " + i + ": ");
                    double num = input.nextDouble();
                    sum += num;
                }

                double avg = sum / n;

                System.out.println("\nSum of numbers = " + sum);
                System.out.printf("Average of numbers = %.2f", avg);

                input.close();
            }
        }
