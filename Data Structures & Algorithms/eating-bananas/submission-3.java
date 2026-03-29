class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // piles = [1,4,3,2], h = 9
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
            System.out.println("Middle: " + middle);
            int sum = 0;
            for(int pile: piles){
                sum += (pile % middle) == 0 ? (pile / middle) : (pile / middle) + 1; 
            }

            System.out.println("Sum:" + sum);

            if(sum <= h){
                right = middle;
            }else {
                left = middle + 1;
            }
        }

        return left;
    }
}
