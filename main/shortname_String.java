import java.util.Scanner;
class shortname_String {
   public static void main(String[] args)
   {
    String s;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String: ");
   s=sc.nextLine();
   
    int i=0;
    int j=s.length()-1;
    while(s.charAt(j)!=(' '))
    j--;
    int x=j;
    while(i<j)
    {
        if(i==0)
        {
            System.out.print(s.charAt(i)+".");
        }
        else{
            char c=s.charAt(i);
            char d=s.charAt(i+1);
            if((c==' ')&&(d!=' '))
            {
                System.out.print(d+".");
            }
        }
        i++;
    }
 System.out.print(s.substring(x));
sc.close();
   }
    
}
