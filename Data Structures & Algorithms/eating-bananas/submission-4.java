class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int maxValue = 0;
        int result = Integer.MAX_VALUE;

        for(int pile: piles){
            maxValue = Math.max(pile, maxValue);
        }

        int left = 1;
        int right = maxValue;

        while(left < right){
            int middle = (left + right) / 2;
            int sum = 0;
            for(int pile: piles){
                sum += (int) Math.ceil((double)pile / middle);
            }

            if(sum <= h){
                right = middle;
            }else {
                left = middle + 1;
            }
        }

        return left;
    }
}
