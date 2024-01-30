package prj.coreyduffy.kata;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return false;
        }
        if (s.length() == 1) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        return s.equals(sb.append(s).reverse().toString());
    }

    public static boolean isPalindrome(int num) {
        return isPalindrome(String.valueOf(num));
    }
}
