public class baseconverter
{
    int maxbase=16;
    char[] digitstable={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    
    void printbase(int n,int base)
    {
        if((base<=1)||(base>maxbase))
        {
            System.out.println("Invalid");
        }
        else
        {
            if(n<0)
            {
                System.out.print("-");
                n=-n;
            }
            printrecur(n,base);
        } 
    }
    void printrecur(int n,int base)
    {
        if(n>=base)
        {
            printrecur(n/base,base);
        }
        System.out.print(digitstable[n%base]);
    }
    public static void main(String args[])
    {
        baseconverter ob=new baseconverter();
        ob.printbase(14,2);
 
    }
}
