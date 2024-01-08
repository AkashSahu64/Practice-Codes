#include<iostream>
using namespace std;

int main(){
    int n;
    int count=1;
    cout<<"Enter the number of n : ";
    cin>>n;
    // cout<<"Enter the number of column : ";
    // cin>>col;
    for(int i=1; i<=n; i++){
        for(int j=1; j<=i;j++){
            cout<<count<<" ";
            count++;
    
        }
        cout<<"\n";
    }
    //cout<<endl;
    return 0;
}