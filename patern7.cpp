#include<iostream>
using namespace std;

int main(){
    int n;
    int count=1;
    cout<<"Enter the number of n : ";
    cin>>n;
    
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n+1-i;j++){
            cout<<j<<" ";
            count++;
    
        }
        cout<<"\n";
    }
   
    return 0;
}