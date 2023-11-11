import java.util.Scanner;
class array_print
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[5];
        System.out.println("enter the element ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(" Array elements are : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
            sc.close();
        }
    }
}