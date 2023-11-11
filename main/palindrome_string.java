import java.util.Scanner;
class palindrome_string
{
    public static void main(String args[])
    {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String ");
        s=sc.nextLine();
        int i=0;
        int j=s.length()-1;
        int flag=0;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                flag=1;
            }
            i++;
            j--;
        }
        if(flag==0)
        {
            System.out.println("palindrome String ");
        }
        else
        {
            System.out.println("Not palindrome");
        }
        sc.close();
    }
}
