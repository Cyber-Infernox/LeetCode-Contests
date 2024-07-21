class Solution {
    public boolean doesAliceWin(String s) {
        boolean ans = false;
        String turn = "Alice";

        while (s.length() > 0) {
            int vowels = 0;
            int odd = -1;
            int even = -1;

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;

                    if (vowels % 2 != 0)
                        odd = i;
                    else
                        even = i;
                }
            }

            if (odd == -1 && even == -1)
                return ans;

            if (turn == "Alice") {
                if (odd == -1)
                    return ans;
                s = s.substring(odd + 1);
                turn = "Bob";
                ans = !ans;
            } else {
                if (even == -1)
                    return ans;
                s = s.substring(even + 1);
                turn = "Alice";
                ans = !ans;
            }
        }

        return ans;
    }
}