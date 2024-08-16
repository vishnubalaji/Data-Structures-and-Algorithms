#include<iostream>
#include<vector>

using namespace std;

int main(){
    vector<int> ip={1,1,2,3,3,4,4};
    int size=ip.size();
    int op=0;
    for(auto ele:ip){
        op^=ele;
    }
    cout<<op<<endl;
    return 0;
}