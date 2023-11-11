import java.util.Scanner;
class user_input_2d_array
{
    public static void main(String[] args)
    {
        int arr[][]=  new int [2][3];
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("the array elements are : " );
     for(int a[]: arr)
     {
        for(int b : a)
        {
            System.out.print(b);
        }
        System.out.println();
        sc.close();
     }
    }
}
