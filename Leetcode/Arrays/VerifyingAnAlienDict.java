class Solution {
    Map<Character, Integer> orderAlph;    

    public boolean isAlienSorted(String[] words, String order) {
        // Create a HashMap char : order;
        orderAlph = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            orderAlph.put(order.charAt(i), i);
        }

        // Check the position of each of the words based on
        // our hashmap
        for (int i = 0; i < words.length - 1; i++) {
            String w1 = words[i];
            String w2 = words[i+1];

            for (int j = 0; j < w1.length(); j++) {
                if (j == w2.length()) return false;

                if (w1.charAt(j) != w2.charAt(j)) {
                    if (orderAlph.get(w1.charAt(j)) > orderAlph.get(w2.charAt(j))) {
                        return false;
                    }
                    break;
                }

            }

        }

        return true;

    }
}