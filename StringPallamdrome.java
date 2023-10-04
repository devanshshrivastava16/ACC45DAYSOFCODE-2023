import java.util.*;
class StringPallamdrome
{
    String s;
    void get()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Senstance");
        s=sc.nextLine();
    }
    void show()
    {
        int i,l;
        char a,b;
        String w;
        StringTokenizer st=new StringTokenizer(s);
        int c=st.countTokens();
        for(i=0;i<=c;i++)
        {
            w=st.nextToken();
            l=w.length();
            a=w.charAt(0);
            b=w.charAt(l-1);
            
            
            if(Character.isUpperCase(a)&&Character.isLowerCase(b))
            {
                System.out.println(w);
            }
        }
    }
    void check()
    {
        String w,w1,rev="";
        int i,l,j;
        StringTokenizer st=new StringTokenizer(s);
        int c=st.countTokens();
        for(i=0;i<=c;i++)
        {
            
            w=st.nextToken();
            w1=w.toLowerCase();
            l=w.length();
            for( j=l-1;j>=0;j--)
            {
               
               rev=rev+w1.charAt(j);
            }
            if (rev.equalsIgnoreCase(w1))
            {
               System.out.println(w+" is pallamdrome");
            }
        }
    }
    public static void main(String args[])
    {
        StringPallamdrome ob=new StringPallamdrome();
        ob.get();
        ob.show();
        ob.check();
    }
}
