import java.util.Scanner;
class String_Buffer_function {
    public static void main(String args[])
    {
        StringBuffer s1= new StringBuffer();
        StringBuffer s2= new StringBuffer();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        s1.append(sc.nextLine());
        System.out.println("Enter the string: ");
        s2.append(sc.nextLine());
        s1.setCharAt(2,'i');
        System.out.println("String after setcharAt(): "+s1);
        s1.insert(3,s2);
         System.out.println("String after insert(): "+s1);
         s1.setLength(20);
        s1.append(s2);
         System.out.println("String after append(): "+s1);
         sc.close();
    }
}
