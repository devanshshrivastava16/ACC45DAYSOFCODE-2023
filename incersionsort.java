import java.util.*;
class incersionsort
{
    int A[]=new int[5];
    int i,j,key;
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
            key=A[i];
            j=i-1;
            while(j>=0&&A[j]>key)
            {
                A[j+1]=A[j];
                j--;
            }
            A[j+1]=key;
        }
    }
    void show()
    {
        for(i=0;i<5;i++)
        {
            System.out.println(A[i]+" ");
        }
    }
    public static void main(String args[])
    {
        incersionsort ob=new incersionsort();
        ob.get();
        ob.sort();
        ob.show();
    }
}
