import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        boolean isPalindrome = checkPalindrome(number);
        System.out.println("Is the number " + number + " a palindrome? " + isPalindrome);
        scanner.close();
    }

    public static boolean checkPalindrome(int num) {
        int originalNumber = num;
        int reversedNumber = 0;
        
        while (num > 0) {
            int remainder = num % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            num /= 10;
        }
        
        return originalNumber == reversedNumber;
    }
}

