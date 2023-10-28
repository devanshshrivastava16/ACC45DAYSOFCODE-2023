import java.util.Scanner;

public class SquarePattern  
{
    public static void main(String[] args) 
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side length of the square:");
        int sideLength = scanner.nextInt();

        for (int i = 0; i < sideLength; i++)
        {
            for (int j = 0; j < sideLength; j++) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
