class Worker
{
    String name;
    double basic;
    Worker(String a,double b)
    {
        name=a;
        basic=b;
    }
    void display()
    {
        System.out.println(name);
        System.out.println(basic);
    }
}
class Wages extends Worker
{
    int hrs;
    double rate,wage;
    Wages(String a,double b,int c,double d)
    {
        super(a,b);
        hrs=c;
        rate=d;
    }
    double overtime()
    {
        return(hrs*rate);
    }
    void display()
    {
        
        wage=overtime()+basic;
        super.display();
        System.out.println(wage);
    }
    public static void main(String args[])
    {
        Wages ob=new Wages("shivu",50000,40,50);
        ob.display();
    }
}
