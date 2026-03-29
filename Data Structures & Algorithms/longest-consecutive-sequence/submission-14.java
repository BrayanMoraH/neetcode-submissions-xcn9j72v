class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> mySet = new HashSet<>();
        int maxValue = 0;

        for(int num: nums){
            mySet.add(num);
        }

        for(int num: mySet){
            int sum = 1;

            if(!mySet.contains(num - 1)){
                int number = num + 1;

                while(mySet.contains(number)){
                    sum++;
                    number++;
                }
            }

            maxValue = Math.max(maxValue, sum);
        }


        return maxValue;

    }
}
