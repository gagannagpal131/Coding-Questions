#include <iostream>
#include <vector>

using namespace std;

int main(){

vector<int> v;
vector<int>:: iterator it;
int n;
char ch = 'y';

cout<<"enter the elements in the vector\n";

while(ch == 'y'){

  cin>>n;
  v.push_back(n);
  cout<<"press 'y' to enter more elements else 'n'";
  cin>>ch;

}

sort(v.begin(),v.end());

cout<<"sorted vector is\n";

for(it = v.begin(); it != v.end(); it++){

  cout<< *it<<" ";
}

cout<<"\n";

return 0;
}
