#include<iostream>
#include<vector>

using namespace std;

void vc_iterate(vector<int> vc){
    for(auto begin = vc.begin(); begin!=vc.end(); begin++) {
        cout << *begin << endl;
    }
}

void ele_insert(int start, int end, vector<int> &vc){
    for(int i = start; i <= end; i++) {
        vc.push_back(i);
    }
}

int main()
{
    vector<int> vc;

    ele_insert(1, 10, vc);
    vc_iterate(vc);
    cout << "first element : " << vc.front() << endl;
    cout << "last element : " << vc.back() << endl;
    return 0;
}