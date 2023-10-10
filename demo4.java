public class demo4
{
    
    
    void show()
    {
   
        int i,j;
        char ch,d;
        String w,w1;
        StringTokenizer st=new StringTokenizer("Devansh adnan aditya dhruv");
        int c=st.countTokens();
        for(i=0;i<=c;i++)
        {
            w=st.nextToken();
            w1=w.toLowerCase();
            
                ch=w1.charAt(0);
                d=w1.charAt(w1.length()-1);
                if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')&&(d!='a'||d!='e'||d!='i'||d!='o'||d!='u'))
                {
                    System.out.println(w);
                }
            
        }
    }
    public static void main(String args[])
    {
        demo4 ob=new demo4();
        ob.show();}
}
