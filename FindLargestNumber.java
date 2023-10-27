 import java.util.Scanner;

public class FindLargestNumber 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        double largest = findLargest(num1, num2, num3);

        System.out.println("The largest number is: " + largest);
    }

    private static double findLargest(double a, double b, double c) 
    {
        return Math.max(Math.max(a, b), c);
    }
}
