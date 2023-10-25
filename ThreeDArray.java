public class ThreeDArray
{
    public static void main(String[] args) 
    {
        int x = 3;
        int y = 4;
        int z = 2;

        int[][][] threeDArray = new int[x][y][z];

        for (int i = 0; i < x; i++) 
        {
            for (int j = 0; j < y; j++) 
            {
                for (int k = 0; k < z; k++) 
                {
                    threeDArray[i][j][k] = i + j + k;
                }
            }
        }

        for (int i = 0; i < x; i++) 
        {
            for (int j = 0; j < y; j++) 
            {
                for (int k = 0; k < z; k++) 
                {
                    System.out.println("threeDArray[" + i + "][" + j + "][" + k + "] = " + threeDArray[i][j][k]);
                }
            }
        }
    }
}
```
