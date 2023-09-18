import java.util.*;
class chef
{
    public static void main(String args[])
    {
        int i,T,X;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of patient");
        T=sc.nextInt();
        for(i=1;i<=T;i++)
        {
               System.out.println("Enter the amount of water "+i+" chef drink");
               X=sc.nextInt();
               if (X>=2000)
               {
                    System.out.println("YES");
               }
               else 
               {
                    System.out.println("NO");
               }
        }
    }
}