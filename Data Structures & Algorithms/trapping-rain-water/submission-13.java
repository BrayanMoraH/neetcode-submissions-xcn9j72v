class Solution {
    public int trap(int[] height) {
        int [] left = new int [height.length];
        int [] right = new int [height.length];

        int maxValue = height[0];

        for(int i = 0; i < height.length; i++){
            maxValue = Math.max(maxValue, height[i]);
            left[i] = maxValue;
        }

        
        maxValue = height[height.length - 1];
        right[height.length - 1] = maxValue;

        for(int i = height.length -1; i >= 0; i--){
            maxValue = Math.max(maxValue, height[i]);
            right[i] = maxValue;
        }

        int sum = 0;

        for(int i = 0; i < height.length; i++){
            int current = Math.min(left[i], right[i]) - height[i];
            System.out.println(current);
            sum += current;
        }

        return sum;
    }
}
