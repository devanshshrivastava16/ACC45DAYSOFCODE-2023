import java.util.*;
class Record
{
    int i,rnk[];
    String name[];
    Record()
    {
        name=new String[50];
        rnk=new int[50];
    }
    void readvalues()
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name with their rank");
        for (i=0;i<50;i++)
        {
            name[i]=sc.nextLine();
            rnk[i]=sc.nextInt();
        }
    }
    void display()
    {
         for (i=0;i<50;i++)
        {
            System.out.println(name[i]);
            System.out.println(rnk[i]);
        }
    }
}
class Rank extends Record
{
    int index;
    Rank()
    {
        index=0;
    }
    void highest()
    {
         for (i=0;i<50;i++)
        {
            if (rnk[i]>rnk[index])
            {
                index=i;
            }
        }
    }
    void display()
    {
        super.display();
        System.out.println("highest="+name[index]+rnk[index]);
    }
    public static void main(String args[])
    {
        Rank ob =new Rank();
        ob.highest();
        ob.display();
    }
}
