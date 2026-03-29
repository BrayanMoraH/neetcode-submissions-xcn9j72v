class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        createPartition(0, s, result, new ArrayList<>());
        return result;
    }

    public void createPartition(int i, String s, List<List<String>> result, List<String> current){
        if(i >= s.length()){
            result.add(new ArrayList<>(current));
            return;
        }

        for(int j = i; j < s.length(); j++){
            if(isPalindrome(i, j, s)){
                current.add(s.substring(i, j + 1));
                createPartition(j + 1, s, result, current);
                current.remove(current.size() - 1);
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
