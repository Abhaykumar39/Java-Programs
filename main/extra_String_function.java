import java.util.Scanner;
class extra_String_function
{
    public static void main(String args[])
    {
        String s1,s2,s3;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String ");
        s1=sc.nextLine();
        System.out.println("String from 2nd Index: "+s1.substring(2));
        System.out.println("String from Nth Index to M Index: "+s1.substring(2,4));
        System.out.println("enter the String ");
        s2=sc.nextLine();
        s3=s1.concat(s2);
        System.out.println("Concatinate String : "+ s3);
        System.out.println("character Index: "+s1.indexOf('a'));
        System.out.println("character Index: "+s1.indexOf('a',1));
        sc.close();

    }
}
