import java.util.Scanner;
class equals_string_function
{
    public static void main(String args[])
    {
        String s1,s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String ");
        s1=sc.nextLine();
        System.out.println("enter the String ");
        s2=sc.nextLine();
        if(s1.equals(s2))
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
