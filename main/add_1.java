// write a Java program to add two number using class and object.

import java.util.Scanner;

class add_1
{
    int a,b;

    void getdata()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("enter the first number : ");
        a=sc.nextInt();
        System.out.println("enter the second number : ");
        b=sc.nextInt();
        sc.close();
    }
    void putdata()
    {
        System.out.println("Addition = "+(a+b));
    }

    public static void main(String a[])
    {
        add_1 aa=new add_1();
        aa.getdata();
        aa.putdata();
        
    }
    
}