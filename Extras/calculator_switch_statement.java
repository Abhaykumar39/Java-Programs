// write a program to create a calculator using switch statement

import java.util.Scanner;

class calculator_switch_statement {

    
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
        switch(ch)
        {
             case 1:
        System.out.println("Addition= "+(a+b));
        break;
          case 2:
        System.out.println("Subtractio= "+(a-b));
        break;
         case 3:
        System.out.println("Multipliction = "+(a*b));
        break;
       case 4:
        System.out.println("Division = "+(a/b));
        break;
        default:
        System.out.println("Invalid choice");
        break;
        
        }
        sc.close();

    }
    
}
