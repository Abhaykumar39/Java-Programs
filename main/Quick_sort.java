import java.util.Scanner;
class Quick_sort {

    static void quicksort(int a[], int lb, int ub) {
        int i = lb, j = ub, key = a[lb], temp = 0;
        if (lb >= ub)
            return;
        while (i < j) {
            while (key >= a[i] && i < j)
                i++;
            while (key < a[j])
                j--;
            if (i < j) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        a[lb] = a[j];
        a[j] = key;
        quicksort(a, lb, j - 1);
        quicksort(a, j + 1, ub);
    }

    public static void main(String args[]) {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements : ");
        for (i = 0; i <arr.length; i++) {
            arr[i] = sc.nextInt();
            sc.close();
        }
        quicksort(arr, 0, n-1);
        System.out.println(" The sorted elements : ");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
