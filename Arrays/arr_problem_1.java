public class arr_problem_1 {
    // ques 1 : Find sum of all the elements of the array
    // Reading all the elements of an array is called scanning or this is called
    // versing the array or visiting the array
    public static void main(String[] args) {
        int A[] = { 2, 4, 5, 6, 7, 8, 2, 3, 5, 7, 8, 9 };
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum = sum + A[i];
        }
        System.err.print(sum);

        for (int x : A) {
            sum = sum + x;
        }

    }

}
