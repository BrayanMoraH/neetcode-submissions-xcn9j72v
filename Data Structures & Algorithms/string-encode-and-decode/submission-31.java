class Solution {

    public String encode(List<String> strs) {
        StringBuilder st = new StringBuilder();
        for(String str: strs){
            st.append(str.length()).append("#").append(str);
        }

        return st.toString();
    }

    public List<String> decode(String str) {

        List<String> result = new ArrayList<>();

        for(int i = 0; i < str.length(); i++){
            StringBuilder tempNum = new StringBuilder();
            int indexNum = i;

            while(str.charAt(indexNum) != '#'){
                tempNum.append(str.charAt(indexNum));
                indexNum++;
            }

            int charLength = Integer.parseInt(tempNum.toString());

            int currentIndex = indexNum + 1;

            StringBuilder current = new StringBuilder();

            while(current.length() < charLength){
                current.append(str.charAt(currentIndex));
                currentIndex++;
            }

            System.out.println(current.toString());

            i = currentIndex - 1;

            result.add(current.toString());

        }

        return result;
    }
}
