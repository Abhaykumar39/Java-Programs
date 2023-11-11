import java.util.Scanner;
class equal_Ignore_case_function_string
{
    public static void main(String args[])
    {
        String s1,s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String ");
        s1=sc.nextLine();
        System.out.println("enter the String ");
        s2=sc.nextLine();
        if(s1.equalsIgnoreCase(s2))
        {
            System.out.println("Both String are equal ");
        }
        else
        {
            System.out.println("String are not equal");
        }
        sc.close(); 
        
    }
}
