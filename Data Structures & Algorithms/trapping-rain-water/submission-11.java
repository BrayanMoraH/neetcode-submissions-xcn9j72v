class Solution {
    public int trap(int[] height) {
        int [] left = new int [height.length];
        int [] right = new int [height.length];

        int maxValue = Integer.MIN_VALUE;

        for(int i = 0; i < height.length; i++){
            maxValue = Math.max(height[i], maxValue);
            left[i] = maxValue;
        }

        maxValue = Integer.MIN_VALUE;

        for(int i = height.length - 1; i >= 0; i--){

            maxValue = Math.max(height[i], maxValue);
            System.out.println(maxValue);
            right[i] = maxValue;
        }

        int result = 0;

        for(int i = 0; i < height.length; i++){
            result += (Math.min(left[i], right[i])) - height[i];
        }

        return result;
    }
}
