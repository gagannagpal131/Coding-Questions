#include <iostream>
#include <string.h>

using namespace std;

void print_string(string, int, int);

int main(){

    string name;
    cout<<"Enter your full name\n";
    getline(cin,name);

    int position = name.length() - 1;

    cout<<"\n"<<"Output is:-\n";

    for(int i = name.length() - 1; i>= 0 ; i--){

        if(name[i] == ' '){

            print_string(name, i+1, position);
            position = i - 1;

        } else if(i == 0){

            print_string(name,i,position);

        }
    }

    cout<<"\n\n";

    return 0;

}

void print_string(string name, int beg, int end){

    for(int i = beg ; i <= end; i++){

        cout<<name[i];
    }
 cout<<" ";

}
