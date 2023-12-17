//Leetcode
class MissingRanges {
    public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();

        if (nums.length == 0) {
            ArrayList<Integer> tempList = new ArrayList<Integer>();
            tempList.add(lower);
            tempList.add(upper);
            results.add(tempList);
            return results;
        }

    
        if (nums[0] > lower) {
            ArrayList<Integer> tempList = new ArrayList<Integer>();
            tempList.add(lower);
            tempList.add(nums[0] - 1);
            results.add(tempList);
        }

        for (int i = 1; i < nums.length; i++) {
           if (nums[i] - nums[i - 1] > 1){
            ArrayList<Integer> tempList = new ArrayList<Integer>();
            tempList.add(nums[i - 1] + 1);
            tempList.add(nums[i] - 1);
            results.add(tempList);
           }   
        }

      
        if (nums[nums.length - 1] < upper) {
            ArrayList<Integer> tempList = new ArrayList<Integer>();
            tempList.add(nums[nums.length - 1] + 1);
            tempList.add(upper);
            results.add(tempList);
        }

        return results;
    }
}

/* Time Complexity: We iterate over all the elements of nums and check whether an element differs by 1 or greater from its succeeding element, which takes O(n)O(n)O(n) time.
All of the ranges are also added to the missing_ranges list. In the worst-case scenario, n+1n + 1n+1 elements could be added to the list again, which would take O(n)O(n)O(n) time. 
This would occur if we did not begin with lower as the first element of the array, if each subsequent element in 'nums' differed by more than 1, and if we did not end with upper as the last element of the array.
*/

/*  Space complexity: O(1). Except for a few integer variables like n and i that use constant space, 
we do not consume any space (if we ignore the space consumed by the input and output). */
