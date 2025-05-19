public class search_element {
    public static void main(String[] args) {

        int arr[] = { 1, 5, 3 };
        int x = 5;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("Element found at index: " + i);
            } else {
                System.out.println(-1);
            }
        }
    }

}
// done