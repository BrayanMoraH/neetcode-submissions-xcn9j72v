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

        if(str.length() == 0){
            return result;
        }

        for(int i = 0; i < str.length(); i++){
            StringBuilder currentLength = new StringBuilder();
            int j = i;

            while(str.charAt(j) != '#'){
               currentLength.append(str.charAt(j));
               j++; 
            }

            int lengthC = Integer.valueOf(currentLength.toString());

            i = j + 1;
            j = i + lengthC;

            result.add(str.substring(i, j));

            i = j - 1;

        }

        return result;
    }
}
