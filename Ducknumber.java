import java.util.Scanner;

public class DuckNumber 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = scanner.next();
        
        if (isDuckNumber(number)) {
            System.out.println(number + " is a duck number.");
        } else {
            System.out.println(number + " is not a duck number.");
        }
     }

     private static boolean isDuckNumber(String num) 
     {   
        return num.contains("0") && num.charAt(0) != '0'; 
     }
}
