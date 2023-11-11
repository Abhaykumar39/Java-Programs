import java.util.Scanner;
class string_input {
    public static void main(String[] args)
{
    String  name=new String();
    String  address=new String() ;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name: ");
    name = sc.next();
    System.out.println("Enter Address: ");
    address = sc.next();

    System.out.println("Name: "+name+" Address: "+address);
    sc.close();
}
    
}
