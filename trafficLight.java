import java.util.Locale;
import java.util.Scanner;

public class trafficLight {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);

        System.out.print("Enter traffic light color (red, yellow, green): ");
        String color = h.nextLine().toLowerCase(Locale.ROOT);

        if (color.equals("red")){
            System.out.println("Stop!");
        }
        else if (color.equals("yellow")) {
            System.out.println("Slow Down!");
        }
        else if (color.equals("green")) {
            System.out.println("Go!");
        }
        else {
            System.out.println("Invalid Color!");
        }
        h.close();
    }
}
