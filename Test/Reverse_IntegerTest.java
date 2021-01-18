import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Reverse_IntegerTest {

    Reverse_Integer main = new Reverse_Integer();

    @Test
    void reverse() {
        int x_1 = 123;
        int answer_1 = 321;

        int x_2 = -123;
        int answer_2 = -321;

        int x_3 = 120;
        int answer_3 = 21;

        int x_4 = 0;
        int answer_4 = 0;

        int x_5 = 12;
        int answer_5 = 21;

        assertEquals(main.reverse(x_1), answer_1);
        assertEquals(main.reverse(x_2), answer_2);
        assertEquals(main.reverse(x_3), answer_3);
        assertEquals(main.reverse(x_4), answer_4);
        assertEquals(main.reverse(x_5), answer_5);
    }
}