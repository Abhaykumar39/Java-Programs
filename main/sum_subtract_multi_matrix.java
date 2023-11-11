import java.util.Scanner;
class array
{
    Scanner sc = new Scanner(System.in);
    int a[][]= new int[3][3];
    int b[][]= new int[3][3];
    int c[][]= new int[3][3];
    void getdata()
    {
        System.out.println("Enter array elements");
        for(int i =0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
              a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter B array elements");
        for(int i =0;i<b.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
              b[i][j]=sc.nextInt();
            }
        }
    }
    void add()
    {
        for(int i =0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
    }
    void display()
    {
        System.out.println("Array elements ");
          for(int i =0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
            System.out.print(c[i][j]);
            }
             System.out.println();
        }
    }
}
class sum_subtract_multi_matrix
{ public static void main(String args[])
{
    array aa = new array();
    aa.getdata();
    aa.add();
    aa.display();
}
}