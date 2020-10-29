class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> list = new ArrayList<String>();

        if(digits.length() == 0)
            return list;

        Map<Character, String> map = new HashMap<Character, String>();

        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        findCombinations(map, list, "", 0, digits);

        return list;
    }

    private void findCombinations(Map<Character, String> map, List<String> list, String str, int index, String digits){

        if(index == digits.length() ){

            list.add(str);
            return;
        }

        String myChars = map.get(digits.charAt(index));
        //System.out.println(myChars);

        for(int i = 0; i < myChars.length(); i++){

            str = str + myChars.charAt(i);

            findCombinations(map, list, str, index+1, digits);

            str = str.substring(0,str.length()-1);
        }
    }
}
