class Solution {

    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();
        for(String current: strs){
            result.append(current.length()).append("#").append(current);
        }

        return result.toString();
    }

    public List<String> decode(String str) {

        System.out.println(str);
        List<String> result = new ArrayList<>();

        for(int i = 0; i < str.length(); i++){
            
            int b = i;
            StringBuilder numberBuilder = new StringBuilder();

            while(str.charAt(b) != '#'){
                numberBuilder.append(str.charAt(b));
                b++;
            }

            int number = Integer.parseInt(numberBuilder.toString());

            StringBuilder st = new StringBuilder();
            int c = b + 1;

            while(st.length() < number){
                st.append(str.charAt(c));
                c++;
            }

            result.add(st.toString());
            i = c - 1;

        }


        return result;
    }
}
