import java.util.Scanner;
class String_example {
   public static void main(String args[])
   {
    Scanner sc = new Scanner(System.in);
    char arr[]={'G','E','U'};
    String str1= new String();
    String str2= new String(arr);
    String str3= new String(str2);
    String str4;
    String str5= "Hello";
    
    System.out.println(str1);
    System.out.println(str2);
    System.out.println(str3);
    System.out.println("Enter the string : ");
    str4=sc.nextLine();
    System.out.println((str4));
    System.out.println(str5);
    sc.close();
   }    
}
