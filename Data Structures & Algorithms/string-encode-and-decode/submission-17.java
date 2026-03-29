class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str: strs){
            sb.append(str.length()).append("#").append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){

            StringBuilder lengthS = new StringBuilder();

            while(i < str.length() && str.charAt(i) != '#' && Character.isDigit(str.charAt(i))){
                lengthS.append(str.charAt(i));
                i++;
            }


            int number = Integer.parseInt(lengthS.toString());

            //System.out.print(i);

            if(str.charAt(i) == '#'){
                int index = i + 1;
                StringBuilder current = new StringBuilder();
                while(current.length() < number){
                    current.append(str.charAt(index));
                    index++;
                }

                result.add(current.toString());

                i = index - 1;
            }
        }


        return result;
    }
}
