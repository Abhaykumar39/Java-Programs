// add two number using Buffered Reader input statements.

import java.io.*;

class add_buffered
{
    public static void main(String args[]) throws IOException 
    {
        int a ,b,sum;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the first number : ");
        a=Integer.parseInt(br.readLine());

        System.out.println("Enter the second number : ");
        b=Integer.parseInt(br.readLine());

        sum=a+b;

        System.out.println("Addition ="+sum);
    }
}

