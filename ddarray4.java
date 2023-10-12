import java.util.*;
public class ddarray4
{
    int A[][];
    int B[][];
    int C[][];
    int i,j,r,c;
    public ddarray4()
    {
       r=3;
       c=4;
       A=new int[r][c];
       B=new int[r][c];
       C=new int[r][c];
    }
    public ddarray4(int m,int n)
    {
       r=m;
       c=n;
       A=new int[r][c];
       B=new int[r][c];
       C=new int[r][c];
    }
    
    void get()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no in Matrix A");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                A[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("enter no in Matrix B");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                A[i][j]=sc.nextInt();
            }
            System.out.println();
        }
    }
    
    void sum()
    {
        
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                
                C[i][j]=A[i][j]+B[i][j];
            }
        }
        
    }
    void diff()
    {
        
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                
                C[i][j]=A[i][j]-B[i][j];
            }
        }
        
    }
    void show()
    {
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
            
                 System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        ddarray4 ob=new ddarray4();
        ob.get();
        ob.sum();
        ob.show();
        ob.diff();
        ob.show();
    }
}
