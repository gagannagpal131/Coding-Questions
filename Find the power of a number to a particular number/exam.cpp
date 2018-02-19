#include <iostream>
//#include <math.h>
using namespace std;

int test_function(int, int);
int pow_test(int,int);

int main(){
    int m, n;
    cout<<"enter the number and answer\n";
    cin>>n>>m;
    cout<<test_function(n,m)<<"\n";
    //pow_test(n,m);
    return 0;
}

int test_function(int n, int m){
    int x ;
    for(int i = 1; i <= m; i++){
        if(pow_test(n,i) == m){
            return i;
        }
    }
 return -1;
}
int pow_test(int x , int y){

    int sum = x;
    for(int i = 0; i < y-1 ; i++){

        sum = sum * x ;

    }
    return sum;

}
