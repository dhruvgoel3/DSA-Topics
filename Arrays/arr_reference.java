public class arr_reference {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 6, 7 };

        System.out.println("Original array");
        printArray(arr);

        int[] arr_2 = arr;
        System.out.println("Copied arr_2");
        printArray(arr_2);
    }

}
