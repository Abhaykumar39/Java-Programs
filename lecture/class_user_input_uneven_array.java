 import java.util.Scanner;
 class class_user_input_uneven_array {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[][]=new int [3][];
         arr[0]=new int[3];
         arr[1]=new int[1];
         arr[2]=new int[5];

         for(int i=0;i<arr.length;i++)
         {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=sc.nextInt();

            }
         }
         for(int a []: arr)
         {
            for(int b : a)
            {
                System.out.print(b);

            }
            System.out.println();
         }
         sc.close();

    }
}
