import java.util.*;
class binarysearch
{
    int A[]=new int[5];
    int i;
    void get()
    {
        System.out.println("enter 5 no. in array in ascending orde");
        Scanner sc=new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            A[i]=sc.nextInt();
        }
    }
    void search(int n)
    {
        int l=0,h=A.length-1,mid,flag=0;
        while(l<=h)
        {
            mid=(l+h)/2;
            if(n>A[mid])
            {
                l=mid+1;
            }
            else if(n<A[mid])
            {
                h=mid-1;
            }
            else 
            {
                flag=1;
                break;
            }
        }
        if (flag==1)
        {
            System.out.println("found");
        }
        else
        {
            System.out.println("not found");
        }
    }
    public static void main(String args[])
    {
        binarysearch ob=new binarysearch();
        Scanner sc=new Scanner(System.in);
        ob.get();
        System.out.println("enter a no. to search");
        int a=sc.nextInt();
        ob.search(a);
    }
}
