import java.util.Scanner;
class length_charAt
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("enter the name: ");
        name=sc.nextLine();
        System.out.println("Name: "+name);
        System.out.println("length of String: "+name.length());
        for(int i=0;i<name.length();i++)
        {
            System.out.println("Index of String: "+name.charAt(i));
        }
        System.out.println("4th Index String: "+name.charAt(3));
        sc.close();
    }
}