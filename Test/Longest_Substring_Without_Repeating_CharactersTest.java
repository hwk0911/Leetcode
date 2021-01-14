import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Longest_Substring_Without_Repeating_CharactersTest {

    Longest_Substring_Without_Repeating_Characters main = new Longest_Substring_Without_Repeating_Characters();

    @Test
    void lengthOfLongestSubstring() {
        String s_1 = "abcabcbb";
        int answer_1 = 3;

        String s_2 = "bbbbb";
        int answer_2 = 1;

        String s_3 = "pwwkew";
        int answer_3 = 3;

        String s_4 = "";
        int answer_4 = 0;

        String s_5 = "   abc    1875432 a+b c d e f g h";
        int answer_5 = 11;

        assertEquals(main.lengthOfLongestSubstring(s_1), answer_1);
        assertEquals(main.lengthOfLongestSubstring(s_2), answer_2);
        assertEquals(main.lengthOfLongestSubstring(s_3), answer_3);
        assertEquals(main.lengthOfLongestSubstring(s_4), answer_4);
        assertEquals(main.lengthOfLongestSubstring(s_5), answer_5);
    }
}