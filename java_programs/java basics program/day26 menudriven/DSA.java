import java.util.Arrays;
import java.util.Scanner;

class DSA {
    Scanner sc = new Scanner(System.in);
    int[] arr = null;
    boolean isSorted = true;
    public static void main(String[] args) {
        DSA dsa = new DSA();
        int choice;

        do {
            System.out.println("\n1. Accept array elements");
            System.out.println("2. Display array");
            System.out.println("3. Sort array");
            System.out.println("4. Search element");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = dsa.sc.nextInt();

            switch (choice) {
                case 1:
                    dsa.acceptElements(); 
                    break;
                case 2:
                    dsa.displayArrays(); 
                    break;
                case 3:
                    dsa.sortArrayMenu();
                    break;
                case 4:
                    dsa.searchElements(); 
                    break;
                case 5:
                    System.out.println("Thank you");
                    break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }

    // 1. Accept elements
    public void acceptElements() {
        System.out.print("Enter the length of array: ");
        int len = sc.nextInt();
        arr = new int[len];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // 2. Display array
    public void displayArrays() {
        if (arr == null) {
            System.out.println("Array not initialized.");
            return;
        }

        System.out.println("Array elements:");
       for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // 3. Sort menu
    public void sortArrayMenu() {
        if (arr == null) {
            System.out.println("Please accept array first!");
            return;
        }

        System.out.println("\nChoose Sorting Method:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Merge Sort");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                recursiveBubbleSort(arr, arr.length);
                System.out.println("Sorted using Recursive Bubble Sort.");
                break;

            case 2:
                arr = divide(arr);
                System.out.println("Sorted using Merge Sort.");
                break;

            default:
                System.out.println("Invalid choice!");
                return;
        }
        print();
    }

    // Recursive Bubble Sort
    void recursiveBubbleSort(int[] arr, int n) {
        if (n == 1) return;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int t = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = t;
            }
        }

        recursiveBubbleSort(arr, n - 1);
    }

    // Merge Sort divide
    public int[] divide(int[] a) {
        if (a.length == 1) return a;

        int mid = a.length / 2;

        int[] left = divide(Arrays.copyOfRange(a, 0, mid));
        int[] right = divide(Arrays.copyOfRange(a, mid, a.length));

        return merge(left, right);
    }

    // Merge arrays
    public int[] merge(int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        int[] result = new int[left.length + right.length];

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[k] = left[i];
				i++;
				k++;
            } else {
                result[k] = right[j];
				j++;
				k++;
            }
        }

        while (i < left.length) {
			result[k] = left[i];
			i++;
			k++;
		}
        while (j < right.length){
			result[k] = right[j];
			j++;
			k++;
		}

        return result;
    }

    // Print sorted array
    void print() {
        System.out.println("Array elements after sorting:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // 4. Search menu
    void searchElements() {
        if (arr == null) {
            System.out.println("Please enter array first!");
            return;
        }

        System.out.println("\nChoose Searching Method:");
        System.out.println("1. Linear Search");
        System.out.println("2. Binary Search");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        switch (ch) {
            case 1:
                linearSearch(key);
                break;

            case 2:
                if (!isSorted) {
                    System.out.println("Binary Search requires sorted array! Please sort first.");
                    return;
                }
                binarySearch(key);
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }

    // Linear Search
    void linearSearch(int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println(key + " found at position " + (i + 1));
                return;
            }
        }
        System.out.println(key + " not found!");
    }

    // Binary Search
    void binarySearch(int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println(key + " found at position " + (mid + 1));
                return;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(key + " not found!");
    }
}
