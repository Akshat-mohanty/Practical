public class Darium {
    public static void main(String[] args) {
        int number = 9474; // Example number to check
        boolean Darium = isDariumNumber(number);
        if (isDariumNumber(number)) {
            System.out.println(number + " is a Darium number.");
        } else {
            System.out.println(number + " is not a Darium number.");
        }
    }

    public static boolean isDariumNumber(int num) {
        int originalNumber = num;
        int numDigits = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
            numDigits--;
        }

        return originalNumber == sum;
    }
}
