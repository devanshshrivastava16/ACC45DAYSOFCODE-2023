public class happy
{
    char isHappy(int n)
    {
        int d,s=0;
        while (n>0)
        {
            s=0;
            while(n>0)
            {
                d=n%10;
                s+=d*d;
                n=n/10;
            }
            
            if(s>9)
            {
                n=s;
            }
        }
        if (s==1)
        {
            return('H');
        }
        else
        {
            return('N');
        }
    }
    
        public static void main (String args[])
        {
            happy ob=new happy();
            int i;
            char r;
            for(i=1;i<=1000;i++)
            {
                r=ob.isHappy(i);
                if (r=='H')
                {
                    System.out.println(i);
                }
            }
        }
    }
