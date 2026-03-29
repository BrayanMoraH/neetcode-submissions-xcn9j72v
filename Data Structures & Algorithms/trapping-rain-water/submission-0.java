class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int [] leftMax = new int[n];
        int [] rightMax = new int [n];
        int sum = 0;

        int current = 0;

        for(int i = 0; i < n; i++){
            leftMax[i] = current;
            current = Math.max(current, height[i]);
        }

        current = 0;

        for(int i = n - 1; i >= 0; i--){
            rightMax[i] = current;
            current = Math.max(current, height[i]);
        } 


        for(int i = 0; i < n; i++){
            int minValue = Math.min(leftMax[i], rightMax[i]);
            int result = minValue - height[i];
            if(result > 0){
                sum += result;
            }
        }

        return sum;
    }
}
