public class String_to_Integer_atoi {
    public int myAtoi(String s) {
        String target = "";

        for (String str : s.split(" ")) {
            if (str.length() != 0) {
                target = str;
                break;
            }
        }

        StringBuilder sb = new StringBuilder();

        if (target.length() == 0) return 0;
        else if((target.charAt(0) > '0' || target.charAt(0) < '9') && target.charAt(0) != '-') return 0;
        else {
            sb.append(target.charAt(0));

            for (int index = 1, size = target.length() ; index < size ; ++index) {
                if (target.charAt(index) < '0' || target.charAt(index) > '9') break;

                sb.append(target.charAt(index));
            }
        }

        int answer;

        try {
            answer = Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            if (sb.charAt(1) < '0' || sb.charAt(1) > '9') answer = 0;
            else if (sb.charAt(0) == '-') answer = Integer.MIN_VALUE;
            else answer = Integer.MAX_VALUE;
        }

        return answer;
    }
}
