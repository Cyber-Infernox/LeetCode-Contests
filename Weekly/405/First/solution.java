class Solution {
    public String swap(String s, int index, char ch2) {
        StringBuilder str = new StringBuilder(s);

        str.setCharAt(index, ch2);

        return str.toString();
    }

    public String getEncryptedString(String s, int k) {
        String copy = s;
        int len = copy.length();

        for (int i = 0; i < len; i++) {
            int index = (i + k) % len;

            char ch = copy.charAt(index);

            s = swap(s, i, ch);
        }

        return s;
    }
}