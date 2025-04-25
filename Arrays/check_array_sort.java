import java.util.Scanner;

public class check_array_sort {
    static boolean isSorted(int[] arr) {
        boolean check = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                check = true;
                break;
            }
        }
        return check;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Is sorted: " + isSorted(arr));
    }

}
// done