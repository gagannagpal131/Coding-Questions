/*You are given integers, Then you are given queries.
In each query you will be given an integer and you have to tell whether that
integer is present in the array, if so you have to tell at which index it is
present and if it is not present you have to tell the index at which the
smallest integer that is just greater than the given number is present.

For each query you have to print "Yes"(without the quotes)if the number is
present and at which index(1-based) it is present separated by a space.
If the number is not present you have to print "No"(without the quotes)
followed by the index of the next smallest number just greater than that number.

*/

#include <iostream>
#include<vector>
#include<algorithm>

using namespace std;

int main(){

  std::vector<int> v;
  std::vector<int> :: iterator it;
  int n;

  cout<<"enter elements\n";

  for(int i = 0 ; i < 8 ;i++){

    cin>>n;
    v.push_back(n);

  }

  sort(v.begin(),v.end());

  while(1){

      cout<<"\nenter the number to be searched\n";
      cin>>n;
      /* Returns an iterator pointing to the first element in the range [first,last)
          which does not compare less than val(n).*/
      it = lower_bound(v.begin(), v.end(),n);
      //cout<<it-v.begin()<<"\n";

      if(*it == n){
        cout<<"YES, element present at "<<(it-v.begin() + 1)<<" position\n";
      } else  if(*it == 0){

              cout<<"NO, element is not present and no number is greater than"<<n<<" in the vector\n";
        }else{

                cout<<"NO, element is not present. Index of the next smallest number just greater than "<<n;
                cout <<"is "<<(it-v.begin() + 1)<<" position\n";
         }


      }



}
