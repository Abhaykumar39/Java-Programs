import java.util.Scanner;
class Searching {
    int arr[] = new int[5];
    int key;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search:");
        key = sc.nextInt();
                sc.close(); 
    }

    void display() {
        int i, j, mid, flag, position = -1; // 
        i = 0;
        j = arr.length - 1; 
        flag = 0;
        while (i <= j) {
            mid = (i + j) / 2;
            if (arr[mid] == key) {
                flag = 1;
                position = mid;
                break; 
            }
            if (arr[mid] > key) {
                j = mid - 1;
            }
            if (arr[mid] < key) {
                i = mid + 1;
            }
        }
        if (flag == 1) {
            System.out.println("Element found at position: " + position);
        } else {
            System.out.println("Not Found!!");
        }
    }
}

public class Binary_Searching {
    public static void main(String args[]) {
        Searching obj = new Searching();
        obj.getdata();
        obj.display();
    }
}