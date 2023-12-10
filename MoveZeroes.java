// Approach: Most Optimal, fill in Zeroes
class moveZeroes {
public static void moveZeroes(int[] nums) {
    if (nums == null || nums.length == 0) return;        

    int insertPos = 0;
    for (int num: nums) {
            if (num != 0) nums[insertPos++] = num;
        }        

    while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }
}  

// Time Complexity: O(n). However, the total number of operations are optimal. The total operations (array writes) 
// that code does is Number of non-0 elements. This gives us a much better best-case 
// (when most of the elements are 0) complexity than last solution. However, the worst-case (when all elements are non-0) 
// complexity for both the algorithms is same.

// Space Complexity: O(1). Only constant space is used.