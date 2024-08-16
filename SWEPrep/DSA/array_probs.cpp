// #include<bits/stdc++.h>
#include<iostream>
#include<vector>
#include<algorithm>
#include<ctime>
#include <cstdlib>
using namespace std;

int main(){
    // smallest and largest element
    vector<int> arr = {1,2,3,4,5,6,7,8,9,10};
    int smallest = 0, largest=0;
    for(int i=1;i<10;i++){
        if(arr[i]>arr[largest]){
            largest = i;
        }
        else if(arr[i]<arr[smallest]){
            smallest = i;
        }
    }
    cout<<arr[smallest]<<endl<<arr[largest]<<endl;
    //second smallest and largest element
    int sec_smallest, sec_largest;
    int diff_smallest, diff_largest;
    for(int i=0;i<10;i++){
        if(i!=smallest && i!=largest){
            if(i==0){
                diff_smallest = arr[i]-arr[smallest];
                diff_largest = arr[largest]-arr[i];
                sec_smallest = i;
                sec_largest = i;
            }
            else{
                if(abs(arr[i]-arr[smallest]) < diff_smallest){
                    diff_smallest = arr[i]-arr[smallest];
                    sec_smallest = i;
                }
                if(abs(arr[i]-arr[largest]) < diff_largest){
                    diff_largest = arr[largest]-arr[i];
                    sec_largest = i;
                }
            }
        }
    }
    cout<<arr[sec_smallest]<<endl<<arr[sec_largest];
    return 0;
}