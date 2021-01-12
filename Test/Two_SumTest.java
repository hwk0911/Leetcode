import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Two_SumTest {

    public Two_Sum twoSum = new Two_Sum();

    @Test
    void TwoSum() {
        int[] testArray_1 = {2, 7, 11, 15};
        int testTarget_1 = 9;
        int[] answer_1 = {0, 1};

        int[] testArray_2 = {3, 2, 4};
        int testTarget_2 = 6;
        int[] answer_2 = {1, 2};

        int[] testArray_3 = {3, 3};
        int testTarget_3 = 6;
        int[] answer_3 = {0, 1};

        int[] testArray_4 = {0,4,3,0};
        int testTarget_4 = 0;
        int[] answer_4 = {0, 3};

        int[] testArray_5 = {-3,4,3,90};
        int testTarget_5 = 0;
        int[] answer_5 = {0, 2};

        assertArrayEquals(this.twoSum.twoSum(testArray_1, testTarget_1), answer_1);
        assertArrayEquals(this.twoSum.twoSum(testArray_2, testTarget_2), answer_2);
        assertArrayEquals(this.twoSum.twoSum(testArray_3, testTarget_3), answer_3);
        assertArrayEquals(this.twoSum.twoSum(testArray_4, testTarget_4), answer_4);
        assertArrayEquals(this.twoSum.twoSum(testArray_5, testTarget_5), answer_5);
    }
}