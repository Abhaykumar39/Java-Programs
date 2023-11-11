import java.util.Scanner;
class Searching
{ int n,i,key;
int arr[]= new int[5];
Scanner sc =new Scanner(System.in);
    void display()
    {
        System.out.println("Enter the elements ");
        for(i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the key you want to search : ");
        key=sc.nextInt();
    }
        
    void show()
        { int flag=0,position=0;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                flag=1;
                position=i;

            }
        }
        if(flag==1)
        {
    System.out.println(" element found at position : "+ position);
        }
        else
        {
            System.out.println("elements not found ");
        }
    }
}
class linear_Search
{
    public static void main(String args[])
    {
        Searching obj = new Searching();
        obj.display();
        obj.show();
        
    }
}
