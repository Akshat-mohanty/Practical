public class Test6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9, 10}; // Example array with one missing element
        int missingElement = findMissingElement(arr);
        System.out.println("The missing element is: " + missingElement);
    }

    public static int findMissingElement(int[] arr) {
        int n = arr.length + 1; // Expected length including the missing element
        int expectedXor = 0;
        int actualXor = 0;

        // XOR all elements from 1 to n
        for (int i = 1; i <= n; i++) {
            expectedXor ^= i;
        }

        // XOR all elements in the array
        for (int num : arr) {
            actualXor ^= num;
        }

        // XOR of the expected and actual XORs will give the missing element
        return expectedXor ^ actualXor;
    }
}
