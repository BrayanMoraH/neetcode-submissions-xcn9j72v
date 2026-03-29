class Solution {
    public int carFleet(int target, int[] position, int[] speed) {;
        int n = position.length;
        double [][] values = new double [n][2];

        for(int i = 0; i < n; i++){
            values[i][0] = position[i];
            values[i][1] = speed[i];
        }

        Arrays.sort(values, (a, b) -> Double.compare(b[0], a[0]));

        int counter = 0;
        double [] timeToReach = new double [n];
        for(int i = 0; i < n; i++){
            timeToReach[i] = (target -  values[i][0]) / values[i][1];
            if(i >= 1 && timeToReach[i] <= timeToReach[i - 1]){
                timeToReach[i] = timeToReach[i - 1];
            }else {
                counter++;
            }
        }

        return counter;
    }
}
