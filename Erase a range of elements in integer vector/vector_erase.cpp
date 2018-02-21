#include <iostream>
#include <vector>

using namespace std;

int main(){

  vector<int> v;
  vector<int>:: iterator it;
  int n,range[2];
  char ch = 'y';

  while(ch == 'y'){

    cin>>n;
    v.push_back(n);
    cout<<"enter more elements? y or no?\n";
    cin>>ch;
  }

  cout<<"enter the range of elements to be deleted\n";
  cin>>range[0];
  cin>>range[1];

  v.erase(v.begin() + range[0], v.begin() + range[1] + 1) ;


  cout<<"new vector is \n";
  for(it = v.begin(); it != v.end(); it++){

    cout<<*it<<" ";
  }

 return 0;

 }
