class Solution {
    public String reverseWords(String s) {
        String[] strings = s.split(" +");
        
        for (int i = 0; i < strings.length; i++) {
            strings[i] = reverseWord(strings[i]);
        }
        
        return String.join(" ", strings);
        
    }
    
    private String reverseWord(String s) {
        char[] charArray = s.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        char temp;
        
        while (left < right) {
            temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        
        return String.valueOf(charArray);
        
    }
    
}