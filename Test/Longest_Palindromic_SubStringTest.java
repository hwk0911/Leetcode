import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Longest_Palindromic_SubStringTest {

    Longest_Palindromic_SubString main = new Longest_Palindromic_SubString();

    @Test
    void longestPalindrome() {
        String s_1 = "babad";
        String answer_1 = "bab";

        String s_2 = "cbbd";
        String answer_2 = "bb";

        String s_3 = "a";
        String answer_3 = "a";

        String s_4 = "ac";
        String answer_4 = "a";

        assertEquals(main.longestPalindrome(s_1), answer_1);
        assertEquals(main.longestPalindrome(s_2), answer_2);
        assertEquals(main.longestPalindrome(s_3), answer_3);
        assertEquals(main.longestPalindrome(s_4), answer_4);
    }
}