class Perimeter
{
   double a,b;
   Perimeter(double x,double y)
   {
       a=x;
       b=y;
   }
   double Calculate()
   {
       double x;
       x=2*(a+b);
       return(x);
   }
   void show()
   {
       System.out.println("length="+a);
       System.out.println("Breadth="+b);
       System.out.println("Perimeter="+Calculate());
   }
}
class Area extends Perimeter
{
    double h,area;
    Area(double p,double q,double r,double s)
    {
       super(p,q);
       h=r;
    }
    void doarea()
    {
        area=b*h;
    }
    void show()
    {
        super.show();
        System.out.println("Height="+h);
        System.out.println("Area="+area);
    }
    public static void main(String args[])
    {
        Area ob=new Area (12,7,4);
        ob.doarea();
        ob.show();
    }

}
