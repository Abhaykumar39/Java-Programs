
import java.util.Scanner;
class  Students
{
    String name;
    int age;
    int rollno;
    Scanner sc = new Scanner(System.in);

    void getdata()
    {
        System.out.println("Enter the name of students: ");
        name =sc.next();
        System.out.println("Enter the age of students: ");
        age =sc.nextInt();
        System.out.println("Enter the Roll no. of students: ");
        rollno =sc.nextInt();
        sc.close();
    }
    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Rollno : "+rollno);

    }
}
class Students_details_scanner {
    public static void main(String[] args)
    {
    Students aa =new Students();
    aa.getdata();
    aa.display();
    }
}
