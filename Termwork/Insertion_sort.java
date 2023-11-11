import java.util.Scanner;

class Insertion_sort {
   public static void main(String args[]) {
      int n, i, j, t;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of array : ");
      n = sc.nextInt();
      int arr[] = new int[n];
      System.out.println("Enter the array elements : ");
      for (i = 0; i < arr.length; i++) {
         arr[i] = sc.nextInt();
         sc.close();// remove close function to run.
      }

      for (i = 1; i < arr.length; i++) {
         t = arr[i];
         j = i - 1;
         while (j >= 0 && t < arr[j]) {
            arr[j + 1] = arr[j];
            j--;
         }
         arr[j + 1] = t;
      }
      System.out.println(" The sorted elements : ");
      for (i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
      }
   }

}
