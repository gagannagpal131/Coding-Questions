#include <iostream>

using namespace std;

void print_token(string str, int start, int end){

 if(start <= end){
  for(int i = start; i <= end; i++){
    cout<<str[i];
  }
  cout<<"\n";
  }
}

int main(){

 string str;
 int pos,i;
 cout<<"Enter the string\n";
 getline(cin,str);

 if(str[0] == ' ') i = pos = 1; else i = pos = 0;
 cout<<"Tokens are:\n";

 for(i ; i < str.length(); i++){

   if(str[i] == ' ' || !isalpha(str[i])){

     print_token(str,pos,i-1);
     pos = i + 1;

   } else if((i == str.length() - 1) && (isalpha(str[i])))
            print_token(str,pos,i);

 }

return 0;
}
