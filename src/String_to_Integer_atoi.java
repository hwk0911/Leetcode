public class String_to_Integer_atoi {
    public int myAtoi(String s) {
        int answer;
        boolean flag = false;
        StringBuilder sb = new StringBuilder();

        if (s.length() == 0) return 0;

        String[] strArr = s.split(" ");

        for (String str : strArr) {
            if (str.length() == 0) continue;

            for (char c : str.toCharArray()) {
                if (!flag) {
                    if (c == '-') {
                        sb.append(c);
                        flag = true;
                    }
                    else if(c == '+') {
                        flag = true;
                    }
                    else if(c >= '0' && c <= '9') {
                        sb.append(c);
                        flag = true;
                    }
                    else return 0;
                }
                else if (c >= '0' && c <= '9') {
                    sb.append(c);
                }
                else break;
            }

            break;
        }

        try {
            answer = Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            if (sb.length() == 1) answer = 0;
            else if (sb.length() == 0) answer = 0;
            else if (sb.charAt(0) == '-') answer = Integer.MIN_VALUE;
            else if (sb.charAt(0) >= '0' && sb.charAt(0) <= '9') answer = Integer.MAX_VALUE;
            else answer = 0;
        }

        return answer;
    }
}
