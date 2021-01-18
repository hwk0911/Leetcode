public class Reverse_Integer {
    public int reverse(int x) {
        StringBuilder sb = new StringBuilder();

        if (x < 0) {
            sb.append('-');
            x *= -1;
        }

        do {
            sb.append(x % 10);
            x /= 10;
        } while (x != 0);

        int answer;

        try {
            answer = Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            answer = 0;
        }

        return answer;
    }
}
