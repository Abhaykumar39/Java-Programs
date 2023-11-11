// Write a prograam to find the area and perimeter of rectangle.

import java.util.Scanner;

class rectangle 
{
    public static void main(String[] args)
    {
        int length,breadth,area,perimeter;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the length : ");
        length = sc.nextInt();

         System.out.println("enter the breadth : ");
         breadth = sc.nextInt();

         area = length * breadth;
         perimeter = 2 * (length + breadth );

         System.out.println("Area of rectangle : "+ area);
         System.out.println("Perimeter of rectangle : "+perimeter);

         sc.close();

    }
}
