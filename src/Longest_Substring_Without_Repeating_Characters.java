import java.util.LinkedList;
import java.util.List;

public class Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        boolean[] visited;

        int max = 0;

        for (int index = 0, size = s.length() ; index < size ; ++index) {
            int repeat = 0;
            visited = new boolean[255];

            for (int index_2 = index ; index_2 < size ; ++index_2) {
                if (visited[s.charAt(index_2)]) break;

                visited[s.charAt(index_2)] = true;
                ++repeat;
            }

            max = (max < repeat) ? repeat : max;
            visited = null;
        }

        return max;
    }
}
