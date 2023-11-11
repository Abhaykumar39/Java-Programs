 import java.util.Scanner;
 class Selection_sort {
   
   public static void main(String args[])
    {  int n,i,j,min=0,pos=0; 
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of array : ");
        n=sc.nextInt();
        int arr[]=new int [n];
         System.out.println("Enter the array elements : ");
         for(i=0; i<arr.length; i++)
          { arr[i]=sc.nextInt();
           sc.close();}// remove close function to run the program.
         for(i=0 ; i<(n-1); i++)
         {
            min=arr[i];
            pos=i;
         
         for(j=i+1; j<n; j++)
         {
            if(min>arr[j])
            {
                min=arr[j];
                pos=j;
            }
         }
         if(pos!=i)
         {
            arr[pos]=arr[i];
            arr[i]=min;
         }
        }
         System.out.println(" The sorted elements : ");
         for(i=0; i<arr.length; i++)
         {
            System.out.print(arr[i]+" ");
         }
    }
    
}
