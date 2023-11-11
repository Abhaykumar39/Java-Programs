import java.util.Scanner;

class aw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int n, i, primeCount = 0;
        System.out.println("Enter the number of elements in the array:");
        n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements:");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (i = 0; i < arr.length; i++) {
            int count = 0; 
            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(arr[i] + " is a prime number.");
                primeCount++; 
            }
        }

        System.out.println("The total count of prime numbers in the array is: " + primeCount);
        
    }
}
