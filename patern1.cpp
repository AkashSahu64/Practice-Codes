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
             if(i==1 || i==row){
                printf("*");
            }
            else if (j==1 || j==col)
            {
                cout<<"*";
            }
            else{
                cout<<" ";
            }
    
        }
        cout<<"\n";
    }
    //cout<<endl;
    return 0;
}