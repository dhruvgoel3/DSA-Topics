public class arr_problem_3 {
    public static void main(String[] args) {
        int A[] = { 2, 4, 5, 6, 7, 8, 2, 3, 5, 7, 8, 9 };
        int max = A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        System.out.println("The maximum element in the array is: " + max);
    }

}
