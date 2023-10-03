class Plane
{
   int x1,y1;
   Plane(int nx,int ny)
   {
       x1=nx;
       y1=ny;
   }
   void show()
   {
       System.out.println("Points="+x1+","+y1);
   }
}
class Circle extends Plane
{
    int x2,y2;
    double radius,area;
    Circle(int a,int b,int c,int d,double e,double f)
    {
        super(a,b);
        x2=c;
        y2=d;
    }
    void findRadius()
    {
        double p=Math.pow((x2-x1),2);
        double q=Math.pow((y2-y1),2);
        radius =((double)Math.sqrt(p+q))/2;
    }
    void findArea()
    {
        area=3.14*(radius*radius);
    }
    void show()
    {
        super.show();
        System.out.println("Points="+x2+","+y2);
        System.out.println("Area="+area);
        System.out.println("Radius="+radius);
    }
    public static void main(String args[])
    {
        Circle ob=new Circle(7,8,5,6);
        ob.findRadius();
        ob.findArea();
        ob.show();
    }
}
