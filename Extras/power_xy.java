// Write a Java program to find x^y.
import java.util.Scanner;

class power_xy {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x,y,product=1;

        System.out.println(" Enter the value of x " );
        x=sc.nextInt();
        System.out.println(" Enter the value of y " );
        y=sc.nextInt();

        while(y>0)
        {
            product=product*x;
            y--;
        }
        System.out.println("Product = " + product);
        sc.close();
    }

    
}
