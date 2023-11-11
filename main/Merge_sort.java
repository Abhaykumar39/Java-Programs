import java.util.Scanner;
class Merge_sort {
    static void merge_sort(int a[], int t[], int lb, int ub) {
        int mid = 0;
        if (lb < ub) {
            mid = (lb + ub) / 2;

            merge_sort(a, t, lb, mid);

            merge_sort(a, t, mid + 1, ub);

            merge(a, t, lb, mid, ub);
        }
    }

    static void merge(int a[], int t[], int lb, int mid, int ub) {
        int k = lb, le = mid, i;

        while (lb <= le && mid + 1 <= ub) {
            if (a[lb] < a[mid + 1]) {
                t[k] = a[lb];
                lb++;
                k++;
            } else {
                t[k] = a[mid + 1];
                mid++;
                k++;
            }
        }
        while (lb <= le) {
            t[k] = a[lb];
            lb++;
            k++;
        }
        while (mid + 1 <= ub) {
            t[k] = a[mid + 1];
            mid++;
            k++;
        }
        for (i = 0; i <= ub; i++) {
            a[i] = t[i];
        }
    }

    public static void main(String args[]) {
        int n, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        n = sc.nextInt();
        int arr[] = new int[n];
        int tr[] = new int[n];
        System.out.println("Enter the array elements : ");
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sc.close(); //remove close to run the program.
    
        }
        merge_sort(arr, tr, 0, n - 1);
        System.out.println(" The sorted elements : ");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
