class Solution {
    public String swap(char ch1, char ch2, String s, int index) {
        s = s.substring(0, index) + ch2 + ch1 + s.substring(index + 2);

        return s;
    }

    public String getSmallestString(String s) {
        for (int i = 0; i < (s.length() - 1); i++) {
            int digit1 = s.charAt(i) - '0';
            int digit2 = s.charAt(i + 1) - '0';

            if ((digit1 % 2 == 0 && digit2 % 2 == 0) || (digit1 % 2 != 0 && digit2 % 2 != 0)) {
                if (digit1 > digit2) {
                    s = swap(s.charAt(i), s.charAt(i + 1), s, i);
                    break;
                }
            }
        }

        return s;
    }
}