class Solution {
    public String reverseVowels(String s) {
        char[] word = s.toCharArray();
        String vowels ="aAeEiIoOuU";
        int start=0;
        int end= s.length()-1;
        while(start<end){
            while(start< end && vowels.indexOf(word[start])==-1){
                start++;
            } 
             while(start< end &&  vowels.indexOf(word[end])==-1){
                end--;
            } 
            char temp = word[start];
            word[start]= word[end];
            word[end]= temp;
            start++;
            end--;
        } 
    String ans = new String(word);
        return ans;
        
    }
}