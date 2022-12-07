class Solution {
    public String longestCommonPrefix(String[] strs) {

        int lengthOfSmallestString = Integer.MAX_VALUE;
        String commonPrefix = "";

        if(strs.length < 1){
            return "";
        }

        // find the length of smallest string in the given array
        for(int i = 0; i < strs.length; i++){
            if(strs[i].length() < lengthOfSmallestString){
                lengthOfSmallestString = strs[i].length();
            }
        }

        boolean valid = true;
        for(int i = 0; i < lengthOfSmallestString; i++){

            
            char currentCharacter = strs[0].charAt(i);
            for(int j = 0; j < strs.length; j++){
                if(strs[j].charAt(i)!=currentCharacter){
                    valid = !valid;
                    break;
                }
            }
            if(valid != true){
                break;
            }
            commonPrefix += currentCharacter;


        }
        return commonPrefix;
    }
}
