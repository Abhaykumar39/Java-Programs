import java.util.Scanner;
class A 
{
    Scanner sc = new Scanner(System.in);
    int arr[]=new int[5];
    int key;
    void getdata()
    {
        
        int i;
        System.out.println("Enter the array : ");
        for(i=0;i<arr.length;i++)
        {
           arr[i]=sc.nextInt();
        }
         System.out.println("enter the element you know the frequency");
         key=sc.nextInt();
         sc.close();
    }
    
    void display()
    {
        int i,count=0;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                count++;
            }
        }
        System.out.println("Frequency : "+ count);
    }
}
class Frequency_element 
{
    public static void main(String args[])
    {
        A obj = new A();
        obj.getdata();
        obj.display();
    }
}
