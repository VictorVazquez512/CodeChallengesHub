class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) return false;

        int left_pointer = 0 ;
        int right_pointer = s.length() - 1;

        while (left_pointer < right_pointer) {
            char l_char = Character.toLowerCase(s.charAt(left_pointer));
            char r_char = Character.toLowerCase(s.charAt(right_pointer));

            while (!(Character.isDigit(l_char) || Character.isLetter(l_char)) && left_pointer < right_pointer) {
                left_pointer++;
                l_char = Character.toLowerCase(s.charAt(left_pointer));
            }

            while (!(Character.isDigit(r_char) || Character.isLetter(r_char)) && right_pointer > left_pointer) {
                right_pointer--;
                r_char = Character.toLowerCase(s.charAt(right_pointer));
            }

            if (l_char != r_char) {
                return false;
            }

            left_pointer++;
            right_pointer--;

        }

        return true;
        
    }
}