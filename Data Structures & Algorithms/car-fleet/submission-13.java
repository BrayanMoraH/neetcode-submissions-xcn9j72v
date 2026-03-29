class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
                PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getKey() - a.getKey());
        Map<Integer, Integer> mp = new HashMap<>();
        Stack<Double> stack = new Stack<>();

        for(int i = 0; i < position.length; i++){
            mp.put(position[i], speed[i]);
        }

        pq.addAll(mp.entrySet());

        while(!pq.isEmpty()){
            Map.Entry<Integer, Integer> current = pq.poll();
            double result = (double) (target - current.getKey()) / current.getValue();

            if(stack.isEmpty()){
                stack.push(result);
                continue;
            }


            if(result > stack.peek()){
                stack.push(result);
            }
        }

        return stack.size();
    }
}
