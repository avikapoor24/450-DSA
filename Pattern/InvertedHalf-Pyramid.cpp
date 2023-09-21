#include<iostream>
using namespace std;

int main(){
    // AIM,
    cout<<"Printing a Pyramid\n";
    
    // Inputs
    int n;
    
    cout<<"Enter Size\n";
    cin>>n;
    
    // Process + Output
    for(int i=n; i>=1; i--){
        for(int j=1; j<=i; j++){
            cout<<"*";
        }
        cout<<endl;
    }

    return 0;
}
