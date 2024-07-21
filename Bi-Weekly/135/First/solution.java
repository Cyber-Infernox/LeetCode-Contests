class Solution {
    public String losingPlayer(int x, int y) {
        String ans = "Bob";

        while (x >= 1 && y >= 4) {
            x -= 1;
            y -= 4;

            if (ans == "Alice")
                ans = "Bob";
            else
                ans = "Alice";
        }

        return ans;
    }
}