class Solution {

    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();
        for(String str: strs){
            result.append(str.length());
            result.append("#");
            result.append(str);
        }

        return result.toString();
    }

    public List<String> decode(String str) {
        char [] current = str.toCharArray();
        List<String> result = new ArrayList<>();

        for(int i = 0; i < current.length; i++){
            StringBuilder lengthWord = new StringBuilder();

            while(current[i] != '#'){
                lengthWord.append(current[i++]);
            }

            i++;

            int lengthInt = Integer.valueOf(lengthWord.toString());
            int end = i + lengthInt;
            StringBuilder word = new StringBuilder();
            while(i < end){
                word.append(current[i++]);
            }

            i--;

            result.add(word.toString());

        }

        return result;
    }
}
