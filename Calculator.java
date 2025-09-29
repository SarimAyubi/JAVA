import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);

        System.out.print("Enter first number: ");
       float num1 = h.nextLong();

        System.out.print("Enter second number: ");
        float num2 = h.nextLong();

        System.out.print("Enter the operation (+, -, *, /) : ");
        char operator = h.next().charAt(0);

        float result;

        if (operator == '+'){
            result = num1 + num2;
            System.out.println(num1 + " + " + num2 + " : "+result);
        } else if (operator == '-') {
            result = num1 - num2;
            System.out.println(num1 + " - " + num2 + " : "+result);
        } else if (operator == '*'){
            result = num1 * num2;
            System.out.println(num1 + " * " + num2 + " : "+result);
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " : " + result);
            } else {
                System.out.println("Number cannot be divided by zero!");
            }
        }
            else {
            System.out.println("Invalid operator, Please try again!");
            }
            h.close();
        }
    }

