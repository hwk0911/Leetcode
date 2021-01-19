import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class String_to_Integer_atoiTest {

    String_to_Integer_atoi main = new String_to_Integer_atoi();

    @Test
    void myAtoi() {
        String str_1 = "42";
        int answer_1 = 42;

        String str_2 = "   -42";
        int answer_2 = -42;

        String str_3 = "4193 with words";
        int answer_3 = 4193;

        String str_4 = "words and 987";
        int answer_4 = 0;

        String str_5 = "-91283472332";
        int answer_5 = -2147483648;

        assertEquals(main.myAtoi(str_1), answer_1);
        assertEquals(main.myAtoi(str_2), answer_2);
        assertEquals(main.myAtoi(str_3), answer_3);
        assertEquals(main.myAtoi(str_4), answer_4);
        assertEquals(main.myAtoi(str_5), answer_5);
    }
}