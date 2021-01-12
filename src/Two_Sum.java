import java.util.ArrayList;
import java.util.List;

public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];

        for (int index = 0, size = nums.length - 1; index < size; ++index) {
            for (int index_2 = index + 1, size_2 = nums.length ; index_2 < size_2 ; ++index_2) {
                if (nums[index] + nums[index_2] == target) {
                    answer[0] = index;
                    answer[1] = index_2;

                    return answer;
                }
            }
        }

        return answer;
    }
}
