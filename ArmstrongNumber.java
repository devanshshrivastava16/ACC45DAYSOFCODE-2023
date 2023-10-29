import java.util.Scanner;
public class ArmstrongNumber 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isArmstrong(num)) 
        {
            System.out.println(num + " is an Armstrong number.");
        } 
        else 
        {
            System.out.println(num + " is not an Armstrong number.");
        }
    }

    static boolean isArmstrong(int number) 
    {
        int numDigits = (int) Math.log10(number) + 1;
        int total = 0;
        int temp = number;

        while (temp > 0) 
        {
            int digit = temp % 10;
            total += Math.pow(digit, numDigits);
            temp /= 10;
        }

        return total == number;
    }
}
