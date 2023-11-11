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
        int product=1;
        System.out.println("enter the element ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            product*=arr[i];
        }
        System.out.println("Product : "+ product);
        sc.close();
    }
}
class array_product
{
    public static void main(String args[])
    {
        Array_print obj = new Array_print();
        obj.display();
    }
}
