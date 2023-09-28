class Detail
{
   String name,address;
   long telno;
   double rent;
   Detail(String a,String b,long c,double d)
   {
       name=a;
       address=b;
       telno=c;
       rent=d;
   }
   void show()
   {
       System.out.println(name+","+address+","+telno+","+rent);
       
   }
}
class Bill extends Detail
{
    int n;
    double amt;
    Bill(String a,String b,long c,double d,int e)
    {
        super(a,b,c,d);
        n=e;
        amt=0;
    }
    void cal()
    {
        if(n<=100)
        {
            amt=rent;
        }
        else if(n>100&&n<=200)
        {
            amt=0.60*(n-100)+rent;
        }
        else if(n>200&&n<=300)
        {
            amt=100*60+0.80*(n-200)+rent;
        }
        else
        {
            amt=100*0.60+100*0.80+1*(n-300)+rent;
        }
    }
    void show()
    {
        super.show();
        System.out.println("total amount="+amt);
    }
    public static void main(String args[])
    {
        Bill ob=new Bill("Hrithik","Mumbai",1234567890,500,279);
        ob.cal();
        ob.show();
    }
}
