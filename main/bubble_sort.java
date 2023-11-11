import java.util.Scanner;
class bubble_sort {
    public static void main(String args[])
    {  int n; 
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of array : ");
        n=sc.nextInt();
        int arr[]=new int [n];
         System.out.println("Enter the array elements : ");
         for(int i=0; i<arr.length; i++)
         {
           arr[i]=sc.nextInt();
         }
         for(int i=0; i<arr.length-1; i++)
         {
            for(int j=0; j<arr.length-1-i; j++)
            {
                if(arr[j]>arr[j+1])
                {
                int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    sc.close();
                }
            }
         }
         System.out.println(" The sorted elements : ");
         for(int i=0; i<arr.length; i++)
         {
            System.out.print(arr[i]+" ");
         }
    }
    
}
