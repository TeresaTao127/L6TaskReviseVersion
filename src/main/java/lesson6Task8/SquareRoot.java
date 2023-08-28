package lesson6Task8;

public class SquareRoot {

    private final double number;

    public SquareRoot(double number) {
        this.number=number;
    }

    public static void main(String[] args) {
        double number = 25;
        double result = SquareRoot.getSquareRoot(number);
        try {
            System.out.println("Square root of:" + number + " is " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


    public static double getSquareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Input value cannot be negative!!");
        }
        return Math.sqrt(number);

    }
}
