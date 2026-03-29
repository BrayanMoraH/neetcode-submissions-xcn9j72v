class TimeMap {

    Map<String, List<Pair>> keyStore;

    public TimeMap() {
        keyStore = new HashMap<>();    
    }
    
    public void set(String key, String value, int timestamp) {

        if(!keyStore.containsKey(key)){
            keyStore.put(key, new ArrayList<>());
        }

        keyStore.get(key).add(new Pair(timestamp, value));
        //keyStore.computeIfAbsent(key, key -> new ArrayList<>()).add(new Pair(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
        List<Pair> current = keyStore.getOrDefault(key, new ArrayList<>());
        int left = 0;
        int right = current.size() -1;
        String result = "";

        while(left <= right){
            int middle = (left + right) / 2;

            if(current.get(middle).getTimestamp() <= timestamp){
                result = current.get(middle).getValue();
                left = middle + 1;
            }else {
                right = middle -1;
            }
        }

        return result;
    }
}

class Pair {
    int timestamp;
    String value;

    public Pair(int timestamp, String value){
        this.timestamp = timestamp;
        this.value = value;
    }


    public int getTimestamp(){
        return this.timestamp;
    }

    public String getValue(){
        return this.value;
    }
}
