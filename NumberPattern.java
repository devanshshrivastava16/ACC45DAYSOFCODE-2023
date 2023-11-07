import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        for (int i = num; i >= 1; i--) {
            for (int j = num; j >= 1; j--) {
                if (j > i)
                    System.out.print(j + " ");
                else
                    System.out.print(i + " ");
            }
            for (int j = 2; j <= num; j++) {
                if (j < i)
                    System.out.print(i + " ");
                else
                    System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = 2; i <= num; i++) {
            for (int j = num; j >= 2; j--) {
                if (j > i)
                    System.out.print(j + " ");
                else
                    System.out.print(i + " ");
            }
            System.out.print(i + " ");
            for (int j = 2; j <= num; j++) {
                if (j < i)
                    System.out.print(i + " ");
                else
                    System.out.print(j + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
