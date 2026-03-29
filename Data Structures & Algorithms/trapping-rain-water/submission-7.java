class Solution {
    public int trap(int[] height) {
        // [0,2,0,3,1,0,1,3,2,1]
        
        // [0,2,2,3,3,3,3,3,3,3]
        // [3,3,3,3,3,3,3,3,2,1]
        // [0,0,2,0,2,3,2,0,0,0] = 9
        int n = height.length;
        int [] left = new int[n];
        int [] right = new int [n];
        int result = 0;

        left[0] = height[0];
        right[n -1] = height[n-1];
       

        for(int i = 1; i < height.length; i++){
            left[i] = Math.max(height[i], left[i - 1]);
        }

        for(int i = height.length -2; i >=0; i--){
            right[i] = Math.max(height[i], right[i + 1]);
        }

        for(int i = 0; i < n; i++){
            System.out.println("[" + left[i] + "]" + "[" + right[i] + "]");
            result += Math.min(left[i], right[i]) - height[i];
        }

        return result;
    }
}
