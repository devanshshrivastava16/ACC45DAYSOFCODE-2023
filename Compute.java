import java.util.*;
class Library
{
    String name,author;
    double p;
    public Library(String a,String b,double c)
    {
        name=a;
        author=b;
        p=c;
    }
    void show()
    {
        System.out.println(name);
        System.out.println(author);
        System.out.println(p);
    }
}
class Compute extends Library
{
    int d;
    double f;
    public Compute(String a, String b, double c, int e)
    {
        super(a,b,c);
        d=e;
        
    }
    void fine()
    {
        int m;
        if (d>7)
        {
            m=d-7;
            if (m<=5)
            {
                f=m*2;
            }
            else if (m>5&&m<=10)
            {
                f=(m-5)*3+5*2;
            }
            else
            {
                f=(m-10) *5+5*2+5*3;
            }
        }
    }
    void display()
    {
        double a;
        super.show();
        System.out.println(d);
        System.out.println(f);
        a=((2/100)*p)*d+f;
        System.out.println(a);
    }
    public static void main(String args[])
    {
        
        Compute ob= new Compute("tofirE","jack",10,10);
        ob.fine();
        
        ob.display();
    }
}
