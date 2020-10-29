class Solution {
    public String reverseVowels(String s) {

        if(s.length() == 0)
            return "";

        Set<Character> vowels = new HashSet<Character>();
        vowels.add('a'); vowels.add('e'); vowels.add('i'); vowels.add('o'); vowels.add('u');
        vowels.add('A'); vowels.add('E'); vowels.add('I'); vowels.add('O'); vowels.add('U');

        Stack<Character> stack = new Stack<Character>();

        for(int i=0; i<s.length(); i++){

            if(vowels.contains(s.charAt(i)))
                stack.push(s.charAt(i));
        }

        StringBuilder str = new StringBuilder();

        for(int i=0; i < s.length(); i++){

            if(!vowels.contains(s.charAt(i))){
                str = str.append(s.charAt(i));

            } else if(vowels.contains(s.charAt(i))){

                str = str.append(stack.pop());
            }
        }

        return str.toString();
    }
}
