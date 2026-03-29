class TimeMap {

    Map<String, List<List<Object>>> cache;
    public TimeMap() {
        cache = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!cache.containsKey(key)){
            cache.put(key, new ArrayList<>());
        }

       cache.get(key).add(List.of(value, timestamp)); 
    }
    
    public String get(String key, int timestamp) {
        String result = "";

        if(!cache.containsKey(key)) return result;
        List<List<Object>> currentList = cache.get(key);

        int left = 0;
        int right = currentList.size() - 1;

        while(left <= right){
            int middle = (left + right) / 2;

            int currentTimestamp = (int)currentList.get(middle).get(1);

            if(currentTimestamp <= timestamp){
                result = currentList.get(middle).get(0).toString();
                left = middle + 1;
            }else {
                right = middle - 1;
            }
        }

        return result; 
    }
}
