// https://leetcode.com/problems/array-partition/description/

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i += 2) {
            sum += Math.min(nums[i], nums[i + 1]);
        }

        return sum;
    }
}
