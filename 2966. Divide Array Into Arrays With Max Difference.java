class Solution {
    public int[][] divideArray(int[] nums, int k) {
        List<int[]> res = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i+=3){
            int a = nums[i];
            int b = nums[i+1];
            int c = nums[i+2];

            if(c-a > k) return new int[0][0];

            res.add(new int[]{a,b,c});
        }

        return res.toArray(new int[res.size()][]);
    }
}