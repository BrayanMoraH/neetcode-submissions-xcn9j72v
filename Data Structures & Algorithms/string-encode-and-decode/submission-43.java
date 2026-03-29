class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String current: strs){
            sb.append(current.length()).append("#").append(current);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        System.out.println(str);
        List<String> result = new ArrayList<>();

        for(int i = 0; i < str.length(); i++){
            StringBuilder number = new StringBuilder();
            int index = i;

            while(str.charAt(index) != '#'){
                number.append(str.charAt(index));
                index++;
            }

            System.out.println(number.toString());

            int lengthOfWord = Integer.valueOf(number.toString());

            StringBuilder word = new StringBuilder();
            int start = index + 1;

            while(lengthOfWord > 0){
                word.append(str.charAt(start));
                start++;
                lengthOfWord--;
            }

            i = start -1;

            result.add(word.toString());
        }

        return result;
    }
}
