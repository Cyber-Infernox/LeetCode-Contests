class Solution {
    public int minOperations(int[] nums) {
        int len = nums.length;

        int i = 0;
        int j = 2;
        int ans = 0;

        while (j < len) {
            if (nums[i] == 0) {
                ans++;
                for (int k = i; k <= j; k++) {
                    nums[k] = nums[k] == 0 ? 1 : 0;
                }
            }
            i++;
            j++;
        }

        for (int k = 0; k < len; k++) {
            if (nums[k] == 0)
                return -1;
        }

        return ans;
    }
}