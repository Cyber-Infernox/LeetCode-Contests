class Solution {
    public int minimumOperations(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i] % 3;

            if (value == 1) {
                nums[i] = nums[i] - 1;
                count++;
            }

            else if (value == 2) {
                nums[i] = nums[i] + 1;
                count++;
            }
        }

        return count;
    }
}