#include <iostream>
//custom header file
#include "myheader.h"

using namespace std;

int main(){

//extern is used to access the variables declared in the header file.
extern int a, b, c;
cout<<"a = "<<a<<" b = "<<b<<" c = "<<c<<"\n";
display();
return 0;

}
