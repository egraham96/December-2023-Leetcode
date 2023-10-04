//Approach: Using Hashmap
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<matrix.length;i++){
            int min = Integer.MAX_VALUE;
            for(int j=0;j<matrix[i].length;j++){
                min = Math.min(min,matrix[i][j]);
            }
            map.put(min,i);
        }
        int n = matrix.length;
        int m = matrix[0].length;
        int[] arr = new int[m];
        for(int i=0;i<m;i++){
            int max = Integer.MIN_VALUE;
            for(int j=m-(m-n)-1;j>=0;j--){
                max = Math.max(max,matrix[j][i]);
                arr[i] = max;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                list.add(arr[i]);
                break;
            }
        }
        return list;
    }
}

// Time Complexity:

// Space Complexity: