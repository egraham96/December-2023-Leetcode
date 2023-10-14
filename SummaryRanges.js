var summaryRanges = function (nums) {
    let result = [];
    for (let i = 0; i < nums.length; i++) {
        let start = nums[i];
        while (i < nums.length - 1 && nums[i + 1] - nums[i] == 1) {
            i++;
        }
        if (start != nums[i])
		    result.push(`${start}->${nums[i]}`);
        else 
		    result.push(start.toString());
    }
    return result;
};

// Time Complexity: O(n), where n is the length of nums. We perform one loop through nums.

// Space Complexity: O(1), where output array does not count.