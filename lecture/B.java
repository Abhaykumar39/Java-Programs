import java.util.Scanner;

class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int n, i, sum = 0, count = 0;
        System.out.println("Enter the number of elements in the array:");
        n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements:");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        for (i = 1; i <= sum; i++) {
            if (sum % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("The sum of the array elements is a prime number.");
        } else {
            System.out.println("The sum of the array elements is not a prime number.");
        }
    }
}
