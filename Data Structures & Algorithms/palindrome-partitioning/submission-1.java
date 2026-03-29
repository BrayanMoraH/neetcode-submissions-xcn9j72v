class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        createPartition(0, s, new ArrayList<>(), result);
        return result;
    }

    public void createPartition(int index, String s, List<String> current, List<List<String>> result){
        if(index >= s.length()){
            result.add(new ArrayList<>(current));
            return;
        }

        for(int i = index; i < s.length(); i++){
            if(isPalindrome(index, i, s)){
                current.add(s.substring(index, i + 1));
                createPartition(i + 1, s, current, result);
                current.remove(current.size() -1);
            }
        }
    }

    public boolean isPalindrome(int i, int j, String s){
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
