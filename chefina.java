import java.util.*;
class Chefina
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int X,Y,Z,T,i;
        System.out.println("Enter the no. of Test cases");
        T=sc.nextInt();
        for(i=1;i<=T;i++)
        {
            X=sc.nextInt();
            Y=sc.nextInt();
            Z=sc.nextInt();
            System.out.println((X*5+Y*10)/Z);
       }
   }
    
}
