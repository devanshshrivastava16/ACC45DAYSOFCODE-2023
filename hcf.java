import java.util.*;
public class hcf
{
    int gcd (int a, int b)
    {
        if (a%b==0)
        {
            return(b);
        }
        else
        {
            return (gcd(b,a%b));
        }
    }
    public static void main (String args[])
    {
        hcf ob=new hcf();
        Scanner sc= new Scanner (System.in);
        int a,b,r,t;
        System.out.println("enter 2 no");
        a=sc.nextInt();
        b=sc.nextInt();
        if (a<b)
        {
            t=a;
            a=b;
            b=t;
        }
        r=ob.gcd(a,b);
        System.out.println("GCD="+r);
    }
}
