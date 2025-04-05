package BackTracking;

public class backtracking_1 {
    public static void printPermutations(String str, String perm, int index) {
        if (str.length() == 0) {
            System.out.println(perm);
            return;

        }
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String newStr = str.substring(0, 1) + str.substring(i + 1);
            printPermutations(newStr, perm + currentChar, index + 1);

        }

    }

    public static void main(String[] args) {
        String str = "ABC";
        printPermutations(str, "", 0);

    }

}
