//Approach: Hash Table
class containsDuplicates{
    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 1) {
            return false;
        }
        HashSet <Integer> integerMap = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (integerMap.contains(nums[i])){
                return true;
            } else {
                integerMap.add(nums[i]);
            }
        }
        return false;
    }
}

// Time Complexity: O(n), we do search() and insert() for n times and each operation takes constant time.

// Space complexity: O(n), The space used by a hash table is linear with the number of elements in it