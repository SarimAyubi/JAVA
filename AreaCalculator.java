public class AreaCalculator {
    public int calculateArea(int side) {
        return side * side;
    }

    public int calculateArea(int length, int width) {
        return length * width;
    }

    public static void main(String[] args) {

        AreaCalculator area = new AreaCalculator();

        int squareArea = area.calculateArea(5);
        int rectangleArea = area.calculateArea(4, 5);

        System.out.println("Area of Square: " + squareArea);
        System.out.println("Area of Rectangle: " + rectangleArea);
    }
}
