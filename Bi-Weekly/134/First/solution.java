class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int count = 0;
        for (int i = 0; i < colors.length; i++) {
            if (colors[i] == 0) {
                if (colors[(i + 1) % colors.length] == 1 && colors[(i + 2) % colors.length] == 0)
                    count++;
            } else if (colors[i] == 1) {
                if (colors[(i + 1) % colors.length] == 0 && colors[(i + 2) % colors.length] == 1)
                    count++;
            }
        }

        return count;
    }
}