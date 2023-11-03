import java.util.Scanner;

public class MatrixTranspose 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

   
        int[][] matrix = new int[rows][columns];

   
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        
        int[][] transpose = new int[columns][rows];
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                transpose[j][i] = matrix[i][j];
            }
        }

       
        System.out.println("Original Matrix:");
        displayMatrix(matrix);

       
        System.out.println("Transpose Matrix:");
        displayMatrix(transpose);
    }

   
    public static void displayMatrix(int[][] matrix) 
    {
        for (int[] row : matrix) 
        {
            for (int element : row) 
            {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
