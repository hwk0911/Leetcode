public class ZigZag_Conversion {
    public String convert(String s, int numRows) {
        StringBuilder sb = new StringBuilder();

        StringBuilder[] sbArr = new StringBuilder[numRows];
        boolean flag = false;
        int row = 0;

        if (numRows == 1) return s;

        for (int index = 0; index < numRows; ++index) {
            sbArr[index] = new StringBuilder();
        }

        for (int index = 0, size = s.length(); index < size; ++index) {
            sbArr[row].append(s.charAt(index));

            if (!flag) {
                ++row;
            } else {
                --row;
            }

            if (row % (numRows - 1) == 0) {
                flag = !flag;
            }
        }

        for (int index = 0; index < numRows; ++index) {
            sb.append(sbArr[index]);
        }

        return sb.toString();
    }
}
