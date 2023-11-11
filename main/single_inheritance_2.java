import java.util.Scanner;
class Addition{
    int a,b;
    Scanner sc = new Scanner(System.in);
    void getdata()
    {
       System.out.println("enter the first number");
        a=sc.nextInt();
        System.out.println("enter the second number");
        b=sc.nextInt();
    }
    void add()
    {
        System.out.println("Add:"+(a+b));
    }
}
class calculate extends Addition
{
    int c;
    void input()
    {
        Scanner sc = new Scanner ( System.in ); 
        System.out.println("enter the number ");
        c=sc.nextInt();
        sc.close();
    }
    void cal()
    {
        System.out.println("Calculate:"+(a+b+c));
    }
}
class single_inheritance_2 {
    public static void main(String[] args)
    {
        calculate aa = new calculate();
        aa.getdata();
        aa.add();
        aa.input();
        aa.cal();
    }
    
}
