import java.util.Scanner;
class Average_of_array {
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int arr[]=new int [5];
       float average=0;
       int sum=0;
       System.out.println("Enter the Elements : ");
       for(int i=0;i<arr.length;i++)
       {
        arr[i]=sc.nextInt();
       }
       for(int i=0;i<arr.length;i++)
       {
        sum=sum+arr[i];
        average = sum/5;
       }
       System.out.println("Average: "+average);
       sc.close();
    }  
}
