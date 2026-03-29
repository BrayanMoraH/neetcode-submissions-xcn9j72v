class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> current = new ArrayList<>();
        backtrack(s, 0, current, result);
        return result;
    }

    public void backtrack(String s, int i, List<String> current, List<List<String>> result){
        if(i >= s.length()){
            result.add(new ArrayList<>(current));
            return;
        }

        for(int j = i; j < s.length(); j++){
            if(isPalindrome(s.substring(i, j + 1))){
                current.add(s.substring(i , j + 1));
                backtrack(s, j + 1, current, result);
                current.remove(current.size() - 1);
            }
        }
    }

    public boolean isPalindrome(String word){
        int left = 0;
        int right = word.length() -1;

        while(left < right){
            if(word.charAt(left) != word.charAt(right)){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
