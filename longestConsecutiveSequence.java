//Approach: HashSet and Intelligent Sequence Building
class longestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
      int max = 0;
  
      Set<Integer> set = new HashSet<Integer>();
      for (int i = 0; i < nums.length; i++) {
        set.add(nums[i]);
      }
  
      for (int i = 0; i < nums.length; i++) {
        int count = 1;
    
        // look left
        int num = nums[i];
        while (set.contains(--num)) {
          count++;
          set.remove(num);
        }
    
        // look right
        num = nums[i];
        while (set.contains(++num)) {
          count++;
          set.remove(num);
        }
    
        max = Math.max(max, count);
      }
      return max;
    }
}

//Let n be the length of list A and m be the length of list B

// Time Complexity: O(n). Although the time complexity appears to be quadratic due to the while
// loop nested within the for loop, closer inspection reveals it to be
// linear. Because the while loop is reached only when currentNum marks
// the beginning of a sequence (i.e. currentNum-1 is not present in
// nums), the while loop can only run for n iterations throughout the
// entire runtime of the algorithm. This means that despite looking like
// O(n⋅n) complexity, the nested loops actually run in O(n+n)=O(n)
// time. All other computations occur in constant time, so the overall
// runtime is linear.

//Space Complexity :In order to set up O(1) containment lookups, we allocate linear space
//for a hash table to store the O(n) numbers in nums. Other than that,
//the space complexity is identical to that of the brute force solution.
