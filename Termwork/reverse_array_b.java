 import java.util.Scanner;
 class reverse_array_b {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int b[] = new int[5];
        int k=0;
        System.out.println("Enter the array Elements: ");
        for(int i=0; i<arr.length; i++)
        {
          arr[i]= sc.nextInt();
        }
        System.out.println(" Array in Reverse : ");
        for(int i=arr.length-1; i>=0; i--)
        {
            b[k]=arr[i]; 
             System.out.println(arr[i]+" ");
            k++;
            sc.close();
        }
    }
}

