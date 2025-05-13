public class array_sum {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        System.out.println(sum);
        int sumofarray = arr[0] + arr[1] + arr[2] + arr[3] + arr[4] + arr[5];
        System.out.println("Sum of the array is: " + sum);
    }

}
// done
