import java.util.Scanner;
class variable_length_argument {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int a,b,c,d;
        System.out.println("enter the value: " );
        a=sc.nextInt();
        System.out.println("enter the value: " );
        b=sc.nextInt();
        System.out.println("enter the value: " );
        c=sc.nextInt();
        System.out.println("enter the value: " );
        d=sc.nextInt();
        B obj = new B();
        System.out.println(obj.sum(a,b,c,d,100,200));
        sc.close();
    }
    
}
class B 
{
    int sum=0;
    int sum(int ...x)
    {
        for(int i:x)
        {
            sum=sum+i;
        }
        return sum;
    }

}