import java.util.*;
public class neon
{ 
    char isAuto(int n)
    {
        int t,d,sq,c;
        t=n;
        c=0;
        while(n>0)
        {
            c++;
            n=n/10;
        }
        n=t;
        sq=n*n;
        d=sq%(int)Math.pow(10,c);
            if (d==t)
            {
                return ('A');
            }
            else 
            {
                return ('N');
            }
            
            
     }  
    public static void main (String args[])
    {
        neon ob=new neon();
        int i;
        char r;
        for(i=1;i<=1000;i++)
        {
            r=ob.isAuto(i);
            if (r=='A')
            {
                System.out.println(i);
            }
        }
    }
}
