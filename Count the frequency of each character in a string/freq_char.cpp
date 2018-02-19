#include <iostream>
#include <map>

using namespace std;

int main(){

  map<char,int> my_map;
  map<char,int>:: iterator it;

  string str;
  cout<<"enter the string\n";
  getline(cin,str);
  cout<<"string is\n"<<str<<"\n";

  for (int i = 0 ; i < str.length(); i++){

   my_map[str[i]] = my_map[str[i]] + 1;

  }

  for ( it = my_map.begin(); it != my_map.end(); it++) {
        cout << it->first << " : " << it->second << '\n';

    }

    return 0;

}
