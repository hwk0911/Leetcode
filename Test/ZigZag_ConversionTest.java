import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZigZag_ConversionTest {

    ZigZag_Conversion main = new ZigZag_Conversion();

    @Test
    void convert() {
        String s_1 = "PAYPALISHIRING";
        int numRows_1 = 3;
        String answer_1 = "PAHNAPLSIIGYIR";

        String s_2 = "PAYPALISHIRING";
        int numRows_2 = 4;
        String answer_2 = "PINALSIGYAHRPI";

        String s_3 = "A";
        int numRows_3 = 1;
        String answer_3 = "A";

        String s_4 = "A";
        int numRows_4 = 10;
        String answer_4 = "A";

        assertEquals(main.convert(s_1, numRows_1), answer_1);
        assertEquals(main.convert(s_2, numRows_2), answer_2);
        assertEquals(main.convert(s_3, numRows_3), answer_3);
        assertEquals(main.convert(s_4, numRows_4), answer_4);
    }
}