class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodeString = new StringBuilder();

        for(String current: strs){
            encodeString.append(current.length()).append("#").append(current);
        }

        return encodeString.toString();
    }

    public List<String> decode(String str) {
        System.out.println(str);
        List<String> result = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){
         StringBuilder number = new StringBuilder();

         while(str.charAt(i) != '#'){
            number.append(str.charAt(i));
            i++;
         }
            
         int lenWord = Integer.parseInt(number.toString());
         int index = i + 1;

         StringBuilder current = new StringBuilder();

         while(lenWord > 0 && index < str.length()){
            current.append(str.charAt(index));
            lenWord -= 1;
            index++;
         }
         result.add(current.toString());
         i = index - 1;   
        }

        return result;
    }
}
