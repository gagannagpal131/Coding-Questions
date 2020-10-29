class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(strs.length == 0)
            return "";

        if(strs.length == 1)
            return strs[0];

        return getPrefix(strs, strs[0], 1);
    }

    private String getPrefix(String strs[], String prefix, int index){

        if(prefix == "")
            return "";

        if(index == strs.length)
            return prefix;

        if(prefix.length() > strs[index].length())
            prefix = prefix.substring(0, strs[index].length());

        for(int i = 0; i < prefix.length(); i++){

            if(prefix.charAt(i) != strs[index].charAt(i))
                prefix = prefix.substring(0, i);
        }

        return getPrefix(strs, prefix, index+1);
    }
}
