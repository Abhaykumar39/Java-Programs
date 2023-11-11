
import java.util.Scanner;
class H
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
sc.close();
String s1= new String();
String s2="";
System.out.println("enter the string ");
s1=sc.nextLine();
String arr[]=s1.split(" ");
for(String a: arr)
{
         s2= s2 + (a.charAt(0) + "").toUpperCase();

for(int i =0;i<s1.length();i++)
{
         s2=s2+a.charAt(i);
}
s2= s2 + (a.charAt(a.length()-1) + "").toUpperCase();
}
System.out.println("string is : "+s2);
}
}