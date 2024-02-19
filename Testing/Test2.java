public class Test2 {
    public static void main(String[] args) {
        int rowCount = 4; // Number of rows in the pattern
        printPattern(rowCount);
    }

    public static void printPattern(int rows) {
        for (int i = 0; i < rows; i++) {
            // Print spaces
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            // Print characters
            char ch = 'A';
            for (int j = 0; j <= i * 2; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
