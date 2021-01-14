import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Median_of_Two_Sorted_ArraysTest {

    Median_of_Two_Sorted_Arrays main = new Median_of_Two_Sorted_Arrays();

    @Test
    void findMedianSortedArrays() {
        int[] nums1_1 = {1, 3};
        int[] nums2_1 = {2};
        double answer_1 = 2f;

        int[] nums1_2 = {1, 2};
        int[] nums2_2 = {3, 4};
        double answer_2 = 2.5f;

        int[] nums1_3 = {2};
        int[] nums2_3 = {};
        double answer_3 = 2f;

        int[] nums1_4 = {};
        int[] nums2_4 = {1};
        double answer_4 = 1f;

        int[] nums1_5 = {1, 3, 5, 7};
        int[] nums2_5 = {2, 4, 6, 8};
        double answer_5 = 4.5f;

        assertEquals(main.findMedianSortedArrays(nums1_1, nums2_1), answer_1);
        assertEquals(main.findMedianSortedArrays(nums1_2, nums2_2), answer_2);
        assertEquals(main.findMedianSortedArrays(nums1_3, nums2_3), answer_3);
        assertEquals(main.findMedianSortedArrays(nums1_4, nums2_4), answer_4);
        assertEquals(main.findMedianSortedArrays(nums1_5, nums2_5), answer_5);
    }
}