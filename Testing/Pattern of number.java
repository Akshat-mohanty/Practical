public class Test4 {
    public static void main(String[] args) {
        int rows = 4; // Number of rows in the pattern
        printPattern(rows);
    }

    public static void printPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = 0; j < rows - i; j++) {
                System.out.print("   ");
            }

            // Print numbers
            for (int j = 1; j <= i; j++) {
                // Print the number
                System.out.print(j);
                
                // Print additional spaces between numbers
                if (j < i) {
                    System.out.print("     ");
                }
            }
            
            // Print numbers in reverse order
            for (int j = i - 1; j >= 1; j--) {
                // Print the number
                System.out.print("     " + j);
            }

            // Move to the next line
            System.out.println();
        }
    }
}
