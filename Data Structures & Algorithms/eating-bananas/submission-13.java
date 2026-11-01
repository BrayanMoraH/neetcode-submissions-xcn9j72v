class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxValue = 0;

        for(int pile: piles){
            maxValue = Math.max(pile, maxValue);
        }

        int left = 1;
        int right = maxValue;

        while(left < right){
            int middle = (left + right) / 2;

            int sum = 0;
            for(int pile: piles){
                int currentResult = (int)Math.ceil(((double)pile / middle));
                // System.out.println("This is the current middle " + middle + " and this is the current result " + currentResult);
                // // System.out.println("and this is the current result " + currentResult);
                sum += currentResult;
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
