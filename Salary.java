import java.util.*;
class Employee
{
    int empNo;
    String empName,empDesig;
    Employee()
    {
        empNo=1234;
        empName="Rohit";
        empDesig="MCM";
    }
    Employee(int a,String b,String c)
    {
        empNo=a;
        empName=b;
        empDesig=c;
    }
    void display()
    {
        System.out.println(empNo);
        System.out.println(empName);
        System.out.println(empDesig);
    }
}
class Salary extends Employee
{
    float basic;
    Salary(float a)
    {
        basic=a;
    }
    void calculate()
    {
        float DA,HRA,SAL,PF,NS;
        DA=(10/100)*basic;
        HRA=(15/100)*basic;
        SAL=basic+DA+HRA;
        PF=(8/100)*SAL;
        NS=SAL-PF;
        super.display();
        System.out.println("Salary="+NS);
    }
    public static void main(String args[])
    {
        Salary ob=new Salary(50000);
        ob.calculate();
    }
}
