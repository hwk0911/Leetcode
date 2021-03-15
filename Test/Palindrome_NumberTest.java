import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Palindrome_NumberTest {

    public Palindrome_Number main = new Palindrome_Number();

    @Test
    void isPalindrome() {
        int x_1 = -1234;
        boolean answer_1 = false;

        int x_2 = 121;
        boolean answer_2 = true;

        int x_3 = 111111;
        boolean answer_3 = true;

        assertEquals(answer_1, main.isPalindrome(x_1));
        assertEquals(answer_2, main.isPalindrome(x_2));
        assertEquals(answer_3, main.isPalindrome(x_3));
    }
}