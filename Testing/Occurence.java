import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        scanner.close();
        
        // Find the occurrence of character 'a' in the name
        int count = countOccurrences(name, 'a');
        
        // Print the result
        System.out.println("The occurrence of 'a' in the name \"" + name + "\" is: " + count);
    }
    
    // Method to count occurrences of a character in a string
    public static int countOccurrences(String str, char target) {
        int count = 0;
        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // If the character matches the target, increment count
            if (str.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }
}
