#include<iostream>
using namespace std;

int main(){
    int row, col;
    cout<<"Enter the number of row : ";
    cin>>row;
    cout<<"Enter the number of column : ";
    cin>>col;
    for(int i=1; i<=row; i++){
        for(int j=1; j<=col;j++){
            cout<<"*";
        }
        cout<<"\n";
    }
    return 0;
}