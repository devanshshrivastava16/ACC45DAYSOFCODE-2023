class Stock
{
    int qty;
    String item;
    double rate,amt;
    Stock(String a,int b,double c,double d)
    {
        item=a;
        qty=b;
        rate=c;
        amt=d;
    }
    void display()
    {
        System.out.println(item+" "+qty+" "+rate+" "+amt);
        
    }
    
}
class Purchase extends Stock 
{
    int pqty;
    double prate;
    Purchase(String a,int b,double c,double d,int e,double f)
    {
        super(a,b,c,d);
        pqty=e;
        prate=f;
    }
    void update()
    {
        qty+=pqty;
        if(rate!=prate)
        {
            rate=prate;
        }
        amt=qty*rate;
    }
    void display()
    {
        super.display();
        System.out.println(item+" "+qty+" "+rate+" "+amt);
    }
    public static void main(String args[])
    {
        Purchase ob=new Purchase("milk",17,56,0,17,54);
        ob.update();
        ob.display();
    }
}
