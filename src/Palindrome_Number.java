public class Palindrome_Number {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        else {
            String xStr = "" + x;

            int start = 0;
            int end = xStr.length() - 1;

            while (start < end) {
                if(xStr.charAt(start) != xStr.charAt(end)) {
                    return false;
                }

                ++start;
                --end;
            }

            return true;
        }
    }
}
