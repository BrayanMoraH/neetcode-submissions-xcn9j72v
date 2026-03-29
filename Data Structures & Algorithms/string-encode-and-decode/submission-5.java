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
        List<String> result = new ArrayList<>();
        char [] strArray = str.toCharArray();

        for(int i = 0; i < strArray.length; i++){
            StringBuilder charactersLength = new StringBuilder();
            while(strArray[i] != '#'){
                charactersLength.append(strArray[i++]);
            }

            i++;
            int number = Integer.valueOf(charactersLength.toString());
            int end = number + i;
            StringBuilder word = new StringBuilder();

            while(i < end){
                word.append(strArray[i++]);
            }

            i--;
            result.add(word.toString());
        }

        return result;
    }
}
