class Solution {

    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();

        for(String current: strs){
            result.append(current.length()).append("#").append(current);
        }

        return result.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();

        if(str.length() == 0){
            return result;
        }

        for(int i = 0; i < str.length(); i++){
            int j = i;
            String numStr = "";

            while(j < str.length() && str.charAt(j) != '#'){
                numStr += str.charAt(j);
                j++;
            }

            
            int num = Integer.valueOf(numStr);
            
            i = j + 1;
            j = i + num;

            System.out.print(str.substring(i, j));

            result.add(str.substring(i, j));

            i = j - 1;

        }

        return result;
    }
}
