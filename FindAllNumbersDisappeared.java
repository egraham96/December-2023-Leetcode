//Leetcode
class FindAllNumbersDisappeared  {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> results = new ArrayList<Integer>();
        int[] output = new int[nums.length + 1];
        

        for (int i = 0; i < nums.length; i++) {
            output[nums[i]] = nums[i];
        }

        for (int i = 1; i < output.length; i++) {
            if (output[i] == 0) {
                results.add(i);
            }
        }
        return results;
    }
}