package prj.coreyduffy.kata;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static prj.coreyduffy.kata.Palindrome.isPalindrome;

public class PalindromeTest {

    @Test
    public void testStringIsPalindrome() {
        assertTrue(isPalindrome("tennet"));
        assertTrue(isPalindrome("TenneT"));
        assertTrue(isPalindrome("a"));
        assertTrue(isPalindrome("step on no pets"));
        assertFalse(isPalindrome("not a palindrome"));
        assertFalse(isPalindrome("notAPalindrome"));
        assertFalse(isPalindrome(""));
        assertFalse(isPalindrome(null));
        assertFalse(isPalindrome(" tennet"));
    }

    @Test
    public void testIntIsPalindrome() {
        assertTrue(isPalindrome(1));
        assertTrue(isPalindrome(121));
        assertTrue(isPalindrome(0));
        assertTrue(isPalindrome(123454321));
        assertFalse(isPalindrome(12));
        assertFalse(isPalindrome(-1));
        assertFalse(isPalindrome(-121));
    }
}
