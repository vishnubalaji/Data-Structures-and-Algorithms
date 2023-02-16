#include<bits/stdc++.h>
#include<iostream>
#include<vector>

using namespace std;

void MapUnion(vector<int> &v1, vector<int> &v2){
    vector<int> un;
    map<int, int> mp;

    for(int i=0; i<v1.size(); i++){
        mp[v1[i]]++;
    }
    for(int i=0; i<v2.size(); i++){
        mp[v2[i]]++;
    }
    for(auto i:mp){
        un.push_back(i.first);
    }
    for(int i=0; i<un.size(); i++){
        cout<<un[i]<<endl;
    }
}

void MapSet(vector<int> &v1, vector<int> &v2){
    set<int> st;

    for(int i=0; i<v1.size(); i++){
        st.insert(v1[i]);
    }
    for(int i=0; i<v2.size(); i++){
        st.insert(v2[i]);
    }
    for(auto i:st){
        cout<<i<<endl;
    }
}

void justNothingUnion(vector<int> &v1, vector<int> &v2){
    vector<int> op;
    int i=0, j=0;
    int n = v1.size();
    int m = v2.size();
    while(i<n && j<m){
        if(v1[i]==v2[j]){
            op.push_back(v1[i]);
            i++;j++;
        }
        if(v1[i]<v2[j]){
            op.push_back(v1[i]);
            i++;
        }
        if(v1[i]>v2[j]){
            op.push_back(v2[j]);
            j++;
        }
    }
    while(i<n){
        op.push_back(v1[i]);
        i++;
    }
    while(j<n){
        op.push_back(v2[j]);
        j++;
    }
    for(int ele:op){
        cout<<ele<<endl;
    }
}

void justNothingIntersection(vector<int> &v1, vector<int> &v2){
    vector<int> op;
    int i=0, j=0;
    int n = v1.size();
    int m = v2.size();
    while(i<n && j<m){
        if(v1[i]==v2[j]){
            op.push_back(v1[i]);
            i++;j++;
        }
        if(v1[i]<v2[j]){
            i++;
        }
        if(v1[i]>v2[j]){
            j++;
        }
    }
    for(int ele:op){
        cout<<ele<<endl;
    }
}

int main() {
    vector<int> arr1 = {1,2,3,3,4,5,6};
    vector<int> arr2 = {3,3,5};
    // MapUnion(arr1, arr2);
    // MapSet(arr1, arr2);
    // justNothingUnion(arr1, arr2);
    justNothingIntersection(arr1, arr2);
    return 0;
}