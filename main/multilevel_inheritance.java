import java.util.Scanner;
class Student 
{
    int id;
    String name;
    Scanner sc = new Scanner(System.in);
 void input()
 {  
     System.out.println("enter the Id ");
     id=sc.nextInt();
     System.out.println("enter the Name ");
     name=sc.next();
 }
}
class Marks extends Student
{
    int m1,m2,m3;
    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks 1 ");
        m1=sc.nextInt();
        System.out.println("enter the marks 2 ");
        m2=sc.nextInt();
        System.out.println("enter the marks 3 ");
        m3=sc.nextInt();
        sc.close();
        
    }
}
class Result extends Marks
{
    int total;
    float average;
    void calculate()
    {
        total=m1+m2+m3;
        average=(total/3);
        System.out.println("Total : "+total);
        System.out.println("Average : "+average);
    }
}
class multilevel_inheritance
{
     public static void main(String args[])
    {
        Result aa = new Result();
        aa.input();
        aa.getdata();
        aa.calculate();
    }
}