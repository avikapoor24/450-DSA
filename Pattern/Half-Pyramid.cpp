#include<iostream>
using namespace std;

int main(){
    // AIM,
    cout<<"Printing a Half pyramid\n";
    
    // Inputs
    int n;
    
    cout<<"Enter Size\n";
    cin>>n;
    
    // Process + Output
    for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            cout<<"*";
        }
        cout<<endl;
    }

    return 0;
}
