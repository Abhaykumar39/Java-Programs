import java.util.Scanner;
class array
{
    int arr[][]=new int[3][3];
    //int b[][]=new int[3][3];
    int i,j;
    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array elements ");
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr.length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }
    void putdata()
    {
         System.out.println(" array elements ");
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr.length;j++)
            {
           System.out.print(arr[i][j]+" ");
            }
            System.out.println();
            }
    }
    /*void transpose()
    {
        System.out.println("Transpose is : ");
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr.length;j++)
            {
           System.out.print(arr[j][i]+" ");
            }
            System.out.println();
            }
    }*/
    /*void transpose()
    {
        System.out.println("Transpose is : ");
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr.length;j++)
            {
                b[i][j]=arr[j][i];
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
           System.out.print(b[i][j]+" ");
            }
            System.out.println();
            }
    }*/
    void transpose()
    {
        int t=0;
         System.out.println("Transpose is : ");
           for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(i<j)
                {
                    t=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=t;
                }
            }
        }
         for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
        System.out.print(arr[i][j]+" "); 
        }
        System.out.println();
        }
}
}
class transpose_matrix
{
    public static void main(String args[])
    {
        array aa = new array();
        aa.getdata();
        aa.putdata();
        aa.transpose();
    }
}