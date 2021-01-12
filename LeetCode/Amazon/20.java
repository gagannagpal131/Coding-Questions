class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < s.length(); i++){

            char chr = s.charAt(i);

            if(chr == '(' || chr == '{' || chr == '['){

                stack.push(chr);

            } else if (!stack.isEmpty() && stack.peek() == '(' && chr == ')'){

                stack.pop();

            } else if(!stack.isEmpty() && stack.peek() == '{' && chr == '}'){

                stack.pop();

            } else if(!stack.isEmpty() && stack.peek() == '[' && chr == ']'){

                stack.pop();

            } else {

                return false;
            }
        }

        if(stack.size() > 0)
            return false;

        return true;
    }
}
