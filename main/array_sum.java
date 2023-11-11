import java.util.Scanner;
class Array_print
{
     void display()
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array ");
        n=sc.nextInt();
        int arr[]= new int[n];
        int sum=0;
        System.out.println("enter the element ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println("Sum : "+ sum);
        sc.close();
    }
}
class array_sum
{
    public static void main(String args[])
    {
        Array_print obj = new Array_print();
        obj.display();
    }
}
