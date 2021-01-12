class Solution {
    public String[] reorderLogFiles(String[] logs) {


        // MinHeap -> a-b -> -1
        // MaxHeap -> b-a -> 1
        Comparator<String> myComp = new Comparator<String>(){

            public int compare(String log1, String log2){

                String split1[] = log1.split(" ",2);
                String split2[] = log2.split(" ",2);

                boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
                boolean isDigit2 = Character.isDigit(split2[1].charAt(0));

                if(isDigit1 == false && isDigit2 == false){

                    int val = split1[1].compareTo(split2[1]);

                    if(val == 0)
                        return split1[0].compareTo(split2[0]);

                    return val;

                } else if(isDigit1 == false && isDigit2 == true){

                    return -1;

                } else if(isDigit1 == true && isDigit2 == false){

                    return 1;

                } else {

                    return 0;
                }
            }
        };

        Arrays.sort(logs, myComp);
        return logs;
    }
}
