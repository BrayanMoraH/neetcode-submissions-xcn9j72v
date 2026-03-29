class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for(int pile: piles){
            maxValue = Math.max(pile, maxValue);
        }


        int left = 1;
        int right = maxValue;

        while(left <= right){
            int middle = (left + right) / 2;
            int sum = 0;
            for(int pile: piles){
                sum += (int)Math.ceil((double) pile / middle);
            }
            
            System.out.println(sum);
            if(sum > h){
                left = middle + 1;
            }else if(sum <= h){
                minValue = Math.min(middle, minValue);
                right = middle - 1;
            }
        }

        return minValue;
    }
}
