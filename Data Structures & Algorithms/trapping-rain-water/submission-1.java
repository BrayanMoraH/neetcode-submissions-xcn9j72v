class Solution {
    public int trap(int[] height) {
        int [] left = new int [height.length];
        int [] right = new int [height.length];
        int result = 0;

        int maxValue = 0;

        for(int i = 0; i < height.length; i++){
            left[i] = maxValue;
            maxValue = Math.max(maxValue, height[i]);
        }
        maxValue = 0;

        for(int i = height.length -1; i >= 0; i--){
            right[i] = maxValue;
            maxValue = Math.max(maxValue, height[i]);
        }

        for(int i = 0; i < left.length; i++){
            int currentMin = Math.min(left[i], right[i]);
            int currentSubs =  currentMin - height[i];

            if(currentSubs > 0){
                result += currentSubs; 
            }
        }

        return result;
    }
}
