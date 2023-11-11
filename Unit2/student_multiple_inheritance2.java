import java.util.Scanner;
class Students
{ Scanner sc = new Scanner(System.in);
    int id;
    String name;
    void input()
    {
        System.out.println("Enter the Id : ");
        id=sc.nextInt();
        System.out.println("Enter the Name : ");
        name=sc.next();
    }
}
interface Marks
{void getdata();
    void show();
}
class Results extends Students implements Marks
{
     Scanner sc = new Scanner (System.in);
       int marks1,marks2,marks3;
     public void getdata()
    {
    System.out.println("enter marks1 :");
    marks1=sc.nextInt();
    System.out.println("enter marks2 :");
    marks2=sc.nextInt();
    System.out.println("enter marks3 :");
    marks3=sc.nextInt();
}
public void show()
   {
       System.out.println("Marks1:"+marks1+" Marks2: "+marks2+" Marks3: "+marks3);
   }
   void display()
   {
       int total,average;
       total=marks1+marks2+marks3;
       average=(total/3);
       System.out.println("Total : "+total);
       System.out.println("Average: "+average);
   }
}
class student_multiple_inheritance2
{
    public static void main(String args[])
    {
        Results aa = new Results();
        aa.input();
        aa.getdata();
        aa.show();
        aa.display();
    }
}