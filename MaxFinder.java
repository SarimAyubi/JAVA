public class MaxFinder {
    public int findMax(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }
    public double findMax(double a, double b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {

        MaxFinder max = new MaxFinder();

        int maxInt = max.findMax(5, 7);
        double maxDouble = max.findMax(12.75, 12.5);

        System.out.println("Maximum: " + maxInt);
        System.out.println("Maximum: " + maxDouble);
    }
}
