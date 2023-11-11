import java.util.Scanner;
class vowel_consonent_string
{    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str;
        int vowel=0,consonent=0;
        System.out.println("enter the String: ");
        str=sc.nextLine();
 
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch!=' ')
            {
                if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                {
                    vowel++;
                }
                else
                {
                    consonent++;
                }
            }
        }
        System.out.println("Vowels: "+ vowel);
        System.out.println("Consonent: "+consonent);
        sc.close();
    }
}