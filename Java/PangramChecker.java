import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();

        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // to track each letter (a to z).
        boolean[] alphabetPresent = new boolean[26];

        // convert input to lowercase.
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                // marking letters present.
                alphabetPresent[ch - 'a'] = true;
            }
        }

        // check if all letters from 'a' to 'z' are present or not.
        for (boolean letterPresent : alphabetPresent) {
            if (!letterPresent) {
                return false;
            }
        }

        return true;
    }
}
