/* Given an array of  integers, find and print its number of
negative subarrays on a new line. */


#include <iostream>

using namespace std;

bool check_array(int arr[], int i, int j){

  int sum  = 0;
  for( int k = i ; k <= j ; k++){

    sum = sum + arr[k];

  }

  if (sum < 0 ){

    return true;
  } else{

    return false;
  }

}

int main(){

 int arr[] = {1, -2, 4, -5, 1},count = 0,n = 5;

 for(int i = 0 ; i < n; i++){

   for(int j = i ; j < n; j++){

     if(check_array(arr, i , j)){
       cout<<i<<" : "<<j<<"\n";
       count++;

      }
   }

 }

  cout<<"total negative subarrays are "<<count<<"\n";
  return 0;
}
