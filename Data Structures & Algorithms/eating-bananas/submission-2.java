class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxValue = Integer.MIN_VALUE;
        int result = Integer.MAX_VALUE;

        for(int pile: piles){
            maxValue = Math.max(pile, maxValue);
        }

        int left = 1;
        int right = maxValue;


        while(left <= right){
            int middle = (left + right) / 2;
            int sum = 0;

            for(int pile: piles){
                int resultInneer = (pile % middle) != 0 ? (pile / middle) + 1: (pile / middle); 
                sum += resultInneer;
            }

            if(sum <= h){
                result = Math.min(middle, result);
                right = middle - 1;
            }else {
                left = middle + 1;
            }
        }

        return result;
    }
}
