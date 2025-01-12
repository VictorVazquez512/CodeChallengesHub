class Solution {

    public boolean validPalindrome(String s) {
        String clean_string = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int opportunities = 1;
        int left_pointer = 0;
        int right_pointer = clean_string.length() - 1;
        boolean left_valid = true;

        while (left_pointer < right_pointer) {
            if (clean_string.charAt(left_pointer) != clean_string.charAt(right_pointer)) {
                if (opportunities > 0) {
                    right_pointer--;
                    opportunities--;

                    if (clean_string.charAt(left_pointer) != clean_string.charAt(right_pointer)) {
                        left_valid = false;
                        break;
                    }

                } else {
                    left_valid = false;
                    break;
                }
            }

            left_pointer++;
            right_pointer--;

        }

        if (left_valid) return true;

        opportunities = 1;
        left_pointer = 0;
        right_pointer = clean_string.length() - 1;
        while (left_pointer < right_pointer) {
            if (clean_string.charAt(left_pointer) != clean_string.charAt(right_pointer)) {
                if (opportunities > 0) {
                    left_pointer++;
                    opportunities--;

                    if (clean_string.charAt(left_pointer) != clean_string.charAt(right_pointer)) {
                        return false;
                    }

                } else {
                    return false;
                }
            }

            left_pointer++;
            right_pointer--;

        }

        return true;
    }

}