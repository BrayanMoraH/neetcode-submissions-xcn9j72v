class Solution {

    public String encode(List<String> strs) {
       StringBuilder sb = new StringBuilder();
       for(String current: strs){
        sb.append(current.length()).append("#").append(current);
       } 
       return sb.toString();
    }

    public List<String> decode(String str) {
       List<String> result = new ArrayList<>();
        
        for(int i = 0; i < str.length(); i++){
            StringBuilder number = new StringBuilder();
            int indexNum = i;

            while(str.charAt(indexNum) != '#'){
                number.append(str.charAt(indexNum));
                indexNum++;
            }

            int sizeOfWord = Integer.parseInt(number.toString());

            StringBuilder currentWord = new StringBuilder();
            int indexWord = indexNum + 1;

            while(currentWord.length() < sizeOfWord){
                currentWord.append(str.charAt(indexWord));
                indexWord++;
            }

            System.out.print(currentWord.toString());
            result.add(currentWord.toString());
            i = indexWord - 1;
        }

        return result;
    }
}
