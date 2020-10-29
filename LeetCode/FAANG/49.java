class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<String, List<String>>();

        for(int i=0; i < strs.length; i++){

            char temp[] = strs[i].toCharArray();
            Arrays.sort(temp);
            String sortedStr = new String(temp);

            if(!map.containsKey(sortedStr)){

                List<String> innerList = new ArrayList<String>();
                innerList.add(strs[i]);
                map.put(sortedStr, innerList);

            } else {

                map.get(sortedStr).add(strs[i]);
            }

        }

        List<List<String>> list = new ArrayList<List<String>>(map.values());

        return list;
    }
}
