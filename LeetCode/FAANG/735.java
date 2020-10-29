class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<Integer>();

        for(int i: asteroids){

            if(i > 0){
                stack.push(i);

            } else {

                //keep destroying positive stones until greater stone found
                while(!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -i)
                    stack.pop();

                //value negative stone is less than the positive stone
                if(!stack.isEmpty() && stack.peek() > 0 && stack.peek() > -i )
                    continue;

                //negative stone has destroyed all stones or is the first stone
                if(stack.isEmpty() || stack.peek() < 0)
                    stack.push(i);
                
                //if negative and positive stones have same magnitude
                if(!stack.isEmpty() && stack.peek() > 0 && stack.peek() == -i)
                    stack.pop();
            }
        }

        int arr[] = new int[stack.size()];
        int count = stack.size()-1;

        while(!stack.isEmpty()){

            arr[count] = stack.pop();
            count--;
        }

        return arr;
    }
}
