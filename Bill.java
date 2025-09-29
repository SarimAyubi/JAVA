import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {

        Scanner h = new Scanner(System.in);

        System.out.print("Enter bill amount: ");
        double billAmount = h.nextDouble();

        System.out.print("Enter tip percentage: ");
        double tipPercent = h.nextDouble();

        double tip = billAmount * (tipPercent / 100);
        double total = billAmount + tip;

        System.out.println("Tip (" + tipPercent + "%): " + tip);
        System.out.println("Total amount (bill + tip): " + total);

        h.close();
    }
}
