/* Write a Function to find the Increasing Subsequence whose
whose sum is highest in which each number is greater than previous
by one in the given array. If the difference is less than or greater
than one then it is not considered as subsequence. Print the subsequence
array and sum of the subsequence array */

#include <iostream>

using namespace std;

int main(){

  int arr[7]= {1,2,3,7,10,11,12}, result[3] = {0} , sum = 0, start = 0;

  for(int i = 0 ; i < 7 ; i++){

    if((arr[i+1] - arr[i] == 1) || (arr[i+1] - arr[i] == -1 )) {

      sum = sum + arr[i];

    } else{

          sum = sum + arr[i];

          if(result[0] < sum){

            result[0] = sum;
            result[1] = start;
            result[2] = i;
          }
        sum = 0;
        start = i + 1;
    }


  }

  for(int i = result[1]; i <= result[2]; i++){

    cout<<arr[i]<<" ";
  }

  cout<<"\nsum is: "<<result[0]<<"\n";

  return 0;
}
