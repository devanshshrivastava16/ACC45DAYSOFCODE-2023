import java.util.Scanner;

public class StudentGrading 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Maths: ");
        int x = scanner.nextInt();
        System.out.print("Computer: ");
        int y = scanner.nextInt();
        System.out.print("Chemistry: ");
        int z = scanner.nextInt();

        int sum = x + y + z;
        int a = sum * 100 / 300;

        System.out.println("Student's percentage = " + a);

        if (a > 91 && a < 100) {
            System.out.println("YOU GOT A+ GRADE");
        } else if (a > 81 && a < 91) {
            System.out.println("YOU GOT A GRADE");
        } else if (a < 71) {
            System.out.println("YOU ARE FAIL");
        }
    }
}
