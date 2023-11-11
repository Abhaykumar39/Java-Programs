import java.util.Scanner;
class  compare_function_string
{
    public static void main(String args[])
    {
        String s1,s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String ");
        s1=sc.nextLine();
        System.out.println("enter the String ");
        s2=sc.nextLine();
        if(s1.compareTo(s2)==0)
        {
            System.out.println("Equal String ");
        }
        else if (s1.compareTo(s2)>=0)
        {
            System.out.println("String1 greater than String2 ");
        }
        else
        {
            System.out.println("String1 less than String2 ");
        }
        sc.close(); 
        
    }
}
