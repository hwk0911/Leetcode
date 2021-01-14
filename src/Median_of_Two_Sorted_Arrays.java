import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Median_of_Two_Sorted_Arrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Double> mergeArray = new ArrayList<>();

        for (int num : nums1) {
            mergeArray.add((double) num);
        }

        for (int num : nums2) {
            mergeArray.add((double) num);
        }

        Collections.sort(mergeArray);

        if (mergeArray.size() % 2 == 0) {
            int median = mergeArray.size() / 2;

            return (mergeArray.get(median) + mergeArray.get(median - 1)) / 2;
        } else {
            return mergeArray.get(mergeArray.size() / 2);
        }
    }
}
