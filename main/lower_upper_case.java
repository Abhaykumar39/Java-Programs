import java.util.Scanner;
class lower_upper_case
{
    public static void main(String args[])
    {
        String s1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String ");
        s1=sc.nextLine();
        System.out.print("Upper Case String : "+s1.toUpperCase());
        System.out.print("Lower Case String : "+s1.toLowerCase());
        sc.close();
        
    }
}
