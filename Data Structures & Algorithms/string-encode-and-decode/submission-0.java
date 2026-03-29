class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String word: strs){
            sb.append(word.length());
            sb.append("#");
            sb.append(word);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        char [] current = str.toCharArray();

        for(int i = 0; i < current.length; i++){
            StringBuilder numberOfChar = new StringBuilder();
            while(current[i] != '#'){
                numberOfChar.append(current[i++]);
            }

            i++;

            int numberChar = Integer.valueOf(numberOfChar.toString());
            int end = i + numberChar;

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
