class Solution {

    public String encode(List<String> strs) {
        if(strs.size() == 0) return "";
        List<Integer> size = new ArrayList<>();
        StringBuilder myString = new StringBuilder();

        for(String current: strs){
            size.add(current.length());
        }

        for(Integer current : size){
            myString.append(current).append(",");
        }

        myString.append("#");

        for(String str: strs){
            myString.append(str);
        }

        return myString.toString();
    }

    public List<String> decode(String str) {
        if(str.length() == 0) return new ArrayList<>();

        int i = 0;
        List<Integer> sizes = new ArrayList<>();
        List<String> result = new ArrayList<>();
        while(str.charAt(i) != '#'){
            StringBuilder current = new StringBuilder();
            while(str.charAt(i) != ','){
                current.append(str.charAt(i));
                i++;
            }

            sizes.add(Integer.parseInt(current.toString()));
            i++;
        }

        i++;

        for(Integer size: sizes){
            result.add(str.substring(i, i + size));
            i = i + size;
        }

        return result;

    }
}
