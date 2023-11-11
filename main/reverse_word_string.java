import java.util.Scanner;
class reverse_word_string {
       public static void main(String[] args)
       {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
       s=sc.nextLine();
       int i=s.length()-1;
       while(i>=0)
       {
        int j=i;
        while(s.charAt(j)!=' '&&j>=0)
        j--;
        sc.close(); 
       }
       }
}
