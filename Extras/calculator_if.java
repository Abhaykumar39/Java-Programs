import java.util.Scanner;

class calculator_if {
    public static void main(String[] args)
    {
        int a,b,ch;
        Scanner sc= new Scanner (System.in);

        System.out.println("enter  the first number");
        a=sc.nextInt();
        System.out.println("enter  the second number");
        b=sc.nextInt();

        System.out.println("1->Add\n 2->Subtract\n 3->Multiply\n 4->Divide\n Enter your Choice");
        ch=sc.nextInt();

        if(ch==1)
        System.out.println("Addition= "+(a+b));
        else if(ch==2)
        System.out.println("Subtractio= "+(a-b));
        else if(ch==3)
        System.out.println("Multipliction = "+(a*b));
        else if(ch==4)
        System.out.println("Division = "+(a/b));
        else 
        System.out.println("Invalid choice");

        sc.close();

    }
    
}
