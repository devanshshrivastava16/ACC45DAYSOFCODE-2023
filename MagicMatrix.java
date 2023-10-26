public class MagicMatrix 
{
    public static void main(String[] args) 
    {
        int n = 3;
        int[][] magicMatrix = generateMagicMatrix(n);

        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(magicMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] generateMagicMatrix(int n) {
        int[][] magicMatrix = new int[n][n];
        int i = n / 2;
        int j = n - 1;

        for (int num = 1; num <= n * n; ) 
        {
            if (i == -1 && j == n) 
            {
                j = n - 2;
                i = 0;
            } 
            else 
            {
                if (j == n)
                    j = 0;
                if (i < 0)
                    i = n - 1;
            }

            if (magicMatrix[i][j] != 0) 
            {
                j -= 2;
                i++;
                continue;
            } 
            else 
            {
                magicMatrix[i][j] = num++;
            }

            j++;
            i--;
        }
        return magicMatrix;
    }
}
