import java.util.Scanner;

public class Palindrome {
    /** Checks if the given string is a Palindrome, returns true if yes, false if no. */
    public static boolean isPalindrome(String s) {
        int n = s.length();
        s = s.toLowerCase();
        // Allow return of even and odd amount of letters
        if (n == 0 || n == 1)
            return true;
        // Check if first letter of string matches last letter of string
        if (s.charAt(0) == s.charAt(n - 1))
            return isPalindrome(s.substring(1, n - 1));
        else
            return false;
    }

    public static void main(String[] args) {
        /* Examples of Palindromes:
        * racecar
        * gohangasalamiimalasagnahog
        * civic
        * radar
        * level */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string ('exit' to quit): ");
        String s = input.nextLine();
        while (!s.equals("exit"))
        {
            System.out.println("Is " + s + " a Palindrome?: " + isPalindrome(s));
            System.out.print("Enter a string ('exit' to quit): ");
            s = input.nextLine();
        }
    }
}
