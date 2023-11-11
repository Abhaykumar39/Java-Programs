import java.util.Scanner;
class prime_number  {
     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, i = 1, count = 0;
        System.out.println(" enter the number ");
        n = sc.nextInt();

        while (i <= n) {
            if (n % i == 0) {
                count++;
            }
            i++;
        }
        if (count == 2) {
            System.out.println(" Prime number ");
        } else {
            System.out.println(" Not a Prime number ");
        }
        sc.close();
    }
    
}
