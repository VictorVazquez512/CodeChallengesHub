class Solution {
    public boolean isValid(String s) {
        Stack<Character> parentheses = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            switch (s.charAt(i)) {
                case '(':
                    // Will add it the stack
                    parentheses.push('(');
                    break;
                case')':
                    // Will pop its open version of the stack
                    if (parentheses.isEmpty() || parentheses.peek() != '(') return false;
                    parentheses.pop();
                    break;
                case'{':
                    parentheses.push('{');
                    break;
                case'}':
                    if (parentheses.isEmpty() || parentheses.peek() != '{') return false;
                    parentheses.pop();
                    break;
                case'[':
                    parentheses.push('[');
                    break;
                case']':
                    if (parentheses.isEmpty() || parentheses.peek() != '[') return false;
                    parentheses.pop();
                    break;
            }

        }

        return parentheses.isEmpty();

    }
}