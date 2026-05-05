1class Solution  {
2    public int[] twoSum(int[] nums, int target) {
3        int n = nums.length;
4
5        for (int i = 0; i < n - 1; i++) {
6            for (int j = i + 1; j < n; j++) {
7
8                if (nums[i] + nums[j] == target) {
9                    return new int[]{i, j};
10                }
11
12            }
13        }
14        return new int[]{}; // No solution found
15    }
16}