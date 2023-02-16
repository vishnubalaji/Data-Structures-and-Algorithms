#include<iostream>
#include<vector>
#include<bits/stdc++.h>
using namespace std;

//works only for positive numbers
int subarrayMaxSize(vector<int> &arr, int k){
    int maxSize = 0, start = 0, end = -1, sum = 0,  n=arr.size();
    while(start<n){
        while((end+1)<n && (sum+arr[end+1])<=k)
        {
            sum+=arr[++end];
        }

        if(sum==k){
            maxSize = max(maxSize, end-start+1);
        }

        sum-=arr[start];
        start++;
        
    }
    return maxSize;
}

int subarraySumMap(vector<int> &arr, int k){
    int count=0, sum=0, size=arr.size();
    map<int,int> mp;
    mp[0]=1;
    for(int i=0;i<size;i++){
        sum+=arr[i];
        if(mp.find(sum-k)!=mp.end()){
            count+=mp[sum-k];
        }
        if(mp.find(sum)==mp.end()){
            mp[sum]=1;
        }
        else{
            mp[sum]+=1;
        }
    }return count;
}

int subarraySumNoSpace(vector<int> &arr, int k){
    int count = 0;
    int size = arr.size();
    for(int start = 0; start < size; start++){
        int sum=0;
        for(int end = start; end<size; end++){
            sum+=arr[end];
            if(sum==k){
                count++;
            }
        }
    }return count;
}

int subarraySumCumulative(vector<int> &arr, int k){
    int count = 0;
    int size = arr.size();
    vector<int> sum;
    sum.push_back(0);
    for(int i = 0; i < size;i++){
        sum.push_back(sum[i]+arr[i]);
    }
    for(int start = 0; start <= size; start++){
        for(int end = start+1; end < size; end++){
            if((sum[end]-sum[start])==k){
                count++;
            }
        }
    }
    return count;
}

int subarraySumBruteForce(vector<int> &arr, int k) {
    int count = 0;
    int size = arr.size();
    for(int start=0;start<size;start++){
        for(int end=start+1;end<=size;end++){
            int sum=0;
            for(int i=start;i<end;i++){
                sum+=arr[i];
            }
            if(sum==k){
                ++count;
            }
        }
    }
    return count;
}

int main(){
    vector<int> arr = {1,2,3,4,5,6};
    // cout << "Count of 9 is " << subarraySumBruteForce(arr, 9)<<endl;
    // cout << "Count of 9 is " << subarraySumCumulative(arr, 9)<<endl;
    // cout << "Count of 9 is " << subarraySumNoSpace(arr, 9)<<endl;
    // cout << "Count of 9 is " << subarraySumMap(arr, 9)<<endl;
    cout << "Max size for 9 is " << subarrayMaxSize(arr, 9)<<endl;
    return 0;
}