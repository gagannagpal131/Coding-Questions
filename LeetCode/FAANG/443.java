class Solution {
    public int compress(char[] chars) {

        int i = 0, index = 0;

        while(i < chars.length){

            int count = 0;
            int j = i;

            while(j < chars.length){

                if(chars[j] == chars[i])
                    count++;

                if(chars[j] != chars[i])
                    break;

                j++;
            }

            chars[index++] = chars[i];

            if(count > 1){

                String cnt = count+"";
                char chr[] = cnt.toCharArray();

                for(char c: chr)
                    chars[index++] = c;
            }

            i = j;
        }

        return index;
    }
}
