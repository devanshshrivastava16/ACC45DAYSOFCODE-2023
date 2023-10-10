public class Pronic
{
    char isPronic(int n)
    {
        int i,a=0;
        for(i=1;i<=n;i++)
        {
            
            a=i*(i+1);
            if(a==n)
            {
                return ('p');
            }
            else
            {
                return ('n');
            }
        }
        
    }
    public static void main(String args[])
    {
        Pronic ob=new Pronic();
        int i;
        char x;
        for(i=1;i<=100;i++)
        {
            x=ob.isPronic(i);
            if(x=='p')
            {
                System.out.println(i+","+(i+1));
            }
        }
    }
}
