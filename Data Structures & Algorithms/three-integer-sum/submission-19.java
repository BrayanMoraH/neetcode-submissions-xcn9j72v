class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //[-1, 0, 1, 2, -1, -4]

        //[-4, -1, -1, 0, 1, 2]

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);


        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1;
            int right = nums.length - 1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0){
                    result.add(List.of(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    while(left < nums.length - 1 && nums[left] == nums[left - 1]){
                        left++;
                    }

                }else if(sum < 0){
                    left++;
                }else {
                    right--;
                }
            }
        }

        return result;
    }
}
