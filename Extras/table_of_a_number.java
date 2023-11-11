// Write a program to print table of a given number.

import java.util.Scanner;

class table_of_a_number {
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int i,j=1;
        System.out.println(" enter number of table ");
        i=sc.nextInt();

        while(j<=10)
        {
            System.out.println(i+"*"+j+"="+(i*j));
            j++;
        }
        sc.close();
    }

    
}
