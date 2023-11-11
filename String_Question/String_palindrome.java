package String_Question;
import java.util.Scanner;
class String_palindrome 
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String s1;
    String s3="";
    System.out.println("enter the string");
    s1=sc.nextLine();
    String s2 = new String(s1);
    for(int i=s1.length()-1; i>=0; i--)
    {
       s3=s3+s1.charAt(i);
    }
    if(s3.equals(s2))
    {
        System.out.println("palindrome");
    }
    else
    {
        System.out.println(" not palindrome");
    }
    sc.close();
  }    
}    
