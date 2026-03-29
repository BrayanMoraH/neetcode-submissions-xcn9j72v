class TimeMap {
    Map<String, List<List<Object>>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)){
            map.put(key, new ArrayList<>());
        }

        map.get(key).add(List.of(value, timestamp));
    }
    
    public String get(String key, int timestamp) {
        List<List<Object>> current = map.get(key);
        String result = "";

        if(current == null || current.size() == 0){
            return result;
        }

        int left = 0;
        int right = current.size() -1;

        while(left <= right){
            int middle = (left + right) / 2;
            List<Object> values = current.get(middle);
            int currentTimestamp = (int)values.get(1);

            if(currentTimestamp > timestamp){
                right = middle - 1;
            }else if(currentTimestamp <= timestamp){
                result = (String) values.get(0);
                left = middle + 1;
            }
        }

        return result;
    }
}
