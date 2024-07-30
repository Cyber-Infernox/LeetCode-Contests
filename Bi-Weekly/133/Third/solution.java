// TLE
// class Solution {
//     public int minOperations(int[] nums) {
//         int len = nums.length;
//         int ans = 0;

//         for(int i = 0; i < len; i++) {
//             if(nums[i] == 0) {
//                 ans++;
//                 for(int k = i; k < len; k++) {
//                     nums[k] = nums[k] == 0 ? 1 : 0;
//                 }
//             }
//         }

//         return ans;
//     }
// }

// Optimised
class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int i = 0, flips = 0;

        while (i < n) {
            nums[i] = (flips % 2 == 1) ? (nums[i] == 0 ? 1 : 0) : nums[i];

            if (nums[i] == 0) {
                flips++;
            }

            i++;
        }

        return flips;
    }
}