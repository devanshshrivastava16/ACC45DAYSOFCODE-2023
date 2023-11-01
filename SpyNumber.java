import java.util.Scanner;

public class SpyNumber 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isSpyNumber(num)) 
        {
            System.out.println(num + " is a Spy number.");
        } 
        else 
        {
            System.out.println(num + " is not a Spy number.");
        }
    }

    static boolean isSpyNumber(int n) 
    {
        int sum = 0, product = 1;

        while (n > 0) 
        {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }

        return sum == product;
    }
}
