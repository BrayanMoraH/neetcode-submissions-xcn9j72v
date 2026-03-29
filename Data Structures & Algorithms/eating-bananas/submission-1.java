class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxValue = Integer.MIN_VALUE;
        int sol = Integer.MAX_VALUE;
        for(int pile: piles){
            maxValue = Math.max(maxValue, pile);
        }

        int left = 1;
        int right = maxValue;

        while(left <= right){
            int middle = (left + right) / 2;
            int sum = 0;
            for(int pile: piles){
               int result = pile % middle != 0 ? (pile / middle) + 1 : (pile / middle);
               sum += result;  
            }

            if(sum <= h){
                sol = Math.min(sol, middle);
                right = middle - 1;
            }else {
                left = middle + 1;
            }
        }

        return sol;
    }
}
