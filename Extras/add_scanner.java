// Add two number using scanner class input statements. 


import java.util.Scanner;

class add_scanner {
    public static void main(String args[]) {
        int a, b, sum;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        a = sc.nextInt();

        System.out.println("Enter the Second number : ");
        b = sc.nextInt();

        sum = a + b;

        System.out.println("Addition = " + sum);
        sc.close();
    }
}
