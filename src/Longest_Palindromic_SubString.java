import java.util.ArrayList;
import java.util.List;

public class Longest_Palindromic_SubString {
    public String longestPalindrome(String s) {
        List<String> palindromic = new ArrayList<>();
        int retIndex = 0;
        int maxSize = 0;

        for (int index = 0, size = s.length(); index < size; ++index) {
            String sub;
            char charAt = s.charAt(index);

            for (int index_2 = size - 1; index_2 >= index; --index_2) {
                if (charAt != s.charAt(index_2)) continue;

                sub = s.substring(index, index_2 + 1);

                if (checkEquals(sub)) {
                    palindromic.add(sub);
                    break;
                }
            }
        }

        for (int index = 0, size = palindromic.size() ; index < size ; ++index) {
            if (palindromic.get(index).length() > maxSize) {
                retIndex = index;
                maxSize = palindromic.get(index).length();
            }
        }

        return palindromic.get(retIndex);
    }

    public boolean checkEquals(String sub) {
        for (int index = 0, end = sub.length() - 1; index < end; ++index, --end) {
            if (sub.charAt(index) != sub.charAt(end)) return false;
        }

        return true;
    }
}