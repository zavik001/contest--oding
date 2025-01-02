// https://leetcode.com/problems/contiguous-array/

class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                nums[i] = -1;
            }
        }

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int maxLength = 0;
        int prefixSum = 0;

        for (int i = 0; i < n; i++) {
            prefixSum += nums[i];

            if (map.containsKey(prefixSum)) {
                maxLength = Math.max(maxLength, i - map.get(prefixSum));
            } else {
                map.put(prefixSum, i);
            }
        }

        return maxLength;
    }
}
