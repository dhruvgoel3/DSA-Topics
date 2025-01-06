public class array_intro {
    public static void main(String[] args) {
        // These are the four methods to declare an array
        int A[] = new int[10];
        int B[] = { 1, 2, 3, 4, 5 };
        int C[];
        C = new int[10];
        int[] D = new int[5];

        // System.out.println(B[1]);
        // System.out.println(B.length);
        // System.out.println(C.length);
        // System.out.println(D);

        // So for displaying all the elements of array we can use the for loop

        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i]);
        }

        // we can also use the for each loop to display the elements of the array

        for (int x : B) {
            System.out.print(x);
        }

        // Let us see some more demonstration of the array

        System.out.println(B);
        // so by using this we can not print all the elements of the array , we have to
        // use the for loop or for each loop to print all the elements of the array

        int E[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int i = 0; i < E.length; i++) {
            System.out.print(E[i]);
        }

    }

}
