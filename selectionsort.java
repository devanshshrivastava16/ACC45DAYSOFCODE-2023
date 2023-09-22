import java.util.*;
public class selectionsort
{
    int A[]=new int[5];
    int i,t,j;
    void get()
    {
        System.out.println("enter 5 no. in arrray");
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
            for(j=i+1;j<5;j++)
            {
                if(A[i]>A[j])
                {
                    t=A[i];
                    A[i]=A[j];
                    A[j]=t;
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
        selectionsort ob=new selectionsort();
        ob.get();
        ob.sort();
        ob.show();
    }
}
