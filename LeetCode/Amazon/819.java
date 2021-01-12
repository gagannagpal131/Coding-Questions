class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        Set<String> set = new HashSet<String>();
        Map<String, Integer> map = new HashMap<String, Integer>();

        for(String str: banned)
            set.add(str);

        paragraph = paragraph.replaceAll("[^a-zA-Z]"," ").replaceAll("  ", " ").toLowerCase();
        String words[] = paragraph.split(" ");

        for(String word: words){

            if(!set.contains(word))
                map.put(word, map.getOrDefault(word,0)+1);
        }

        String maxKey = "";
        int maxValue = Integer.MIN_VALUE;

        for(String key: map.keySet()){

            if(map.get(key) > maxValue){

                maxKey = key;
                maxValue = map.get(key);
            }
        }

        return maxKey;

    }
}
