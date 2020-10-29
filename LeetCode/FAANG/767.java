class Solution {
    public String reorganizeString(String S) {

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for(int i=0; i<S.length();i++)
            map.put(S.charAt(i), map.getOrDefault(S.charAt(i),0)+1);

//         Comparator<Character> myComp = new Comparator<Character>(){

//             public int compare(Character a, Character b){
//                 return map.get(b)-map.get(a);
//             }
//         };

        Queue<Character> maxHeap = new PriorityQueue<Character>((a,b) -> map.get(b)-map.get(a));

        for(char key: map.keySet())
            maxHeap.add(key);

        StringBuilder str = new StringBuilder();

        while(maxHeap.size() > 1){

            char char1 = maxHeap.poll();
            char char2= maxHeap.poll();

            str.append(char1);
            str.append(char2);

            map.put(char1, map.get(char1)-1);
            map.put(char2, map.get(char2)-1);

            if(map.get(char1) > 0)
                maxHeap.add(char1);

            if(map.get(char2) > 0)
                maxHeap.add(char2);
        }

        if(maxHeap.size() == 1){

            char lastChar = maxHeap.poll();
            map.put(lastChar, map.get(lastChar)-1);

            if(map.get(lastChar) > 0)
                return "";

            str.append(lastChar);
        }

        return str.toString();
    }
}
