// Ques 2: Searching an element in an array

import java.util.Scanner;

public class arr_problem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int A[] = { 2, 4, 5, 6, 7, 8 };

        for (int i = 0; i < A.length; i++) {
            if (key == A[i]) {
                System.out.println("Element found at index: " + i);
                System.exit(0);

            }
        }
        System.out.println("Element not found");

    }

}
