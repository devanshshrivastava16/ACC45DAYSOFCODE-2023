import java.util.*;
public class convert
{
    int n,d,m,y;
    convert()
    {
        n=64;
        y=2020;
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Day no. & year");
        n=sc.nextInt();
        y=sc.nextInt();
    }
    void day_to_day()
    {
        int i,s;
        s=0;
        int A[]={31,28,31,30,31,30,31,31,30,31,30,31};
        for(i=0;i<12;i++)
        {
            s=s+A[i];
            if(s>n)
            {
                m=i;
                break;
            }
        }
        d=A[m]-(s-n);
    }
    void display()
    {
        String []a={"January","februray","March","April","May","June","July","August","September","November","December"};
        System.out.println(d+" "+a[m]+" "+y);
    }
    public static void main(String args[])
    {
        convert ob=new convert();
        ob.accept();
        ob.day_to_day();
        ob.display();
    }
}
