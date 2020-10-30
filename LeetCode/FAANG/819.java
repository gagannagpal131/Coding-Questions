class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        Set<String> bannedWords = new HashSet<String>();
        Map<String, Integer> myWords = new HashMap<String, Integer>();
        int maxCount = Integer.MIN_VALUE;
        String maxWord = "";

        for (String str: banned){
            bannedWords.add(str);
        }

        String words[] = paragraph.replaceAll("[^a-zA-Z]"," ").replaceAll("  ", " ").toLowerCase().split(" ");

        for(String word: words){

            if(bannedWords.contains(word))
                continue;

            if(!myWords.containsKey(word)){

                myWords.put(word,1);

                if(maxCount < myWords.get(word)){

                    maxCount = myWords.get(word);
                    maxWord = word;
                }

            } else{

                myWords.put(word, myWords.get(word)+1);

                if(maxCount < myWords.get(word)){

                    maxCount = myWords.get(word);
                    maxWord = word;
                }
            }
        }

        return maxWord;
    }
}


    
