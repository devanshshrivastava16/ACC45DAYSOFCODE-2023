import java.util.*;
class bubblesort
{
    int A[]=new int[5];
    int i,j,t;
    void get()
    {
        System.out.println("enter 5 no. in array");
        Scanner sc=new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            A[i]=sc.nextInt();
        }
    }
    void sort()
    {
        for(i=0;i<5;i++)
        {
            for(j=0;j<5-1-i;j++)
            {
                if(A[j]>A[j+1])
                {
                    t=A[j];
                    A[j]=A[j+1];
                    A[j+1]=t;
                }
            }
        }
    }
    void show()
    {
        for(i=0;i<5;i++)
        {
            System.out.print(A[i]+" ");
        }
    }
    public static void main(String args[])
    {
        bubblesort ob=new bubblesort();
        ob.get();
        ob.sort();
        ob.show();
    }
}
