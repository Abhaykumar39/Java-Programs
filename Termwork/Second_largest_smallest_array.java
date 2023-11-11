import java .util.Scanner;
public class Second_largest_smallest_array {
    public static void main(String args[])
    {  Scanner sc = new Scanner(System.in);
      int n;
      System.out.println("enter the size of array");
      n=sc.nextInt();
      int arr[] = new int[n];
     
      int i,j;
      System.out.println("enter the array element ");
      for(i=0; i<arr.length; i++)
      {
        arr[i] = sc.nextInt();
        sc.close();
      }
      for( i=0; i<arr.length; i++)
      {
        for(j=i+1; j<arr.length; j++)
        {
            if(arr[i]>arr[j])
            {
              int temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
            }   
        }  
      }
      
          System.out.print("The Second Largest Element : "+arr[arr.length-2]);
          System.out.print("The Second Smallest Element : "+arr[1]);
    
      sc.close();
    }
    
}
