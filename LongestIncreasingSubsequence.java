class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }

        int length = 1; 
        int longestSubsequence = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                length += 1;
            } else {
                longestSubsequence = Math.max(longestSubsequence, length);
                length = 1;
            }
        }
        return Math.max(length, longestSubsequence);
    }
}

// Time Complexity: O(n), where n is the length of nums. We perform one loop through nums.

// Space Complexity: O(1)