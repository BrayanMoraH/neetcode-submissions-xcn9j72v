class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            int current = nums[i];
            if(i > 0 && current == nums[i -1]) continue;

            int left = i + 1;
            int right = nums.length -1;


            while(left < right){
                int currentSum = current + nums[left] + nums[right];

                if(currentSum > 0){
                    right--;
                }else if(currentSum < 0){
                    left++;
                }else {
                    result.add(List.of(current, nums[left], nums[right]));
                    left++;
                    right--;

                    while(left < right && nums[left] == nums[left -1]){
                        left++;
                    }
                }
            }
        } 

        return result;
    }
}
