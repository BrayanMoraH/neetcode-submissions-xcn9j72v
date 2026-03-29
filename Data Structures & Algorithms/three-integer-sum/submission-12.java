class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        

        for(int i = 0; i < nums.length; i++){
            int currentNumber = nums[i];
            //if(i > 0 && currentNumber == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right){
                int sum = currentNumber + nums[left] + nums[right];

                if(sum == 0){
                    result.add(List.of(currentNumber, nums[left], nums[right]));
                    left++;
                    right--;
                }

                if(sum > 0){
                    right--;
                }else if(sum < 0) {
                    left++;
                }
            }
        }

        List<List<Integer>> resultList = new ArrayList<>(result);
        return resultList;
    }
}
