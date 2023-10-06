public class Kaprekar
{
    boolean isKerp(int n)
    {
        int t,a,b,p,sq,c=0;
        t=n;
        sq=n*n;
        while(n>0)
        {
            c++;
            n=n/10;
        }
        a=sq/(int)Math.pow(10,c);
        b=sq%(int)Math.pow(10,c);
        p=a+b;
        if (p==t)
        {
            return(true);
        }
        else 
        {
            return(false);
        }
    
    }
    public static void main(String args[])
    {
        Kaprekar ob=new Kaprekar();
        int i;
        boolean r;
        for (i=1;i<=1000;i++)
        {
            r=ob.isKerp(i);
            if(r==true)
            {
                System.out.println(i);
            }
        }
    }
}
