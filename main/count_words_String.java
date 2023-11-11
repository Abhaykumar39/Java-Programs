import java.util.Scanner;
class count_words_String
{
    public static void main(String args[])
    {
        String s;
        int count=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String ");
        s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' '))
            {
                count++;
            }
        }
        System.out.println("Words in String : "+count);
        sc.close();
    }
}