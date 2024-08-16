#include<bits/stdc++.h>
#include<iostream>
#include<vector>
#include<algorithm>
#include<ctime>

using namespace std;

class MergeSortAlgo{
    private:
        int size;
    public:
        MergeSortAlgo(){
            vector<int> arr;
            cout<<"size of array?"<<endl;
            cin>>this->size;
            int count=this->size;
            cout<<"Enter the elements one by one"<<endl;
            while(count--){
                int ele;
                cin>>ele;
                arr.push_back(ele);
            }
            this->MergeSort(arr, 0, this->size);
            this->displayArray(arr);
        }
        void displayArray(vector<int> &arr){
            cout<<"Sorted array :"<<endl;
            for(int ele:arr){
                cout<<ele<<endl;
            }
            return;
        }
        void MergeSort(vector<int> &arr, int lb, int ub){
            if(lb<ub){
                int mid = (lb+ub)/2;
                this->MergeSort(arr, lb, mid);
                this->MergeSort(arr, mid+1, ub);
                this->Merge(arr, lb, mid, ub);
            }
        }
        
        void Merge(vector<int> &arr, int lb, int mid, int ub){
            int i=lb;
            int j=ub;
            int k=0;
            vector<int> temp;
            while (i<=mid && j<=ub)
            {
                if(arr[i]<arr[j]){
                    // temp[k] = arr[i];
                    temp.push_back(arr[i]);
                    i++;k++;
                }
                else{
                    // temp[k] = arr[j];
                    temp.push_back(arr[j]);
                    j++;k++;
                }
            }
            while(i<=mid){
                // temp[k] = arr[i];
                temp.push_back(arr[i]);
                i++;k++;
            }
            while(j<=ub){
                // temp[k] = arr[j];
                temp.push_back(arr[j]);
                j++;k++;
            }
            for(int m=lb; m<=ub; m++){
                // this->arr[m] = temp[m];
                arr.push_back(temp[m]);
            }
        }
};

class InsertionSort{
    private:
        vector<int> arr;
        int size;
    public:
        InsertionSort(){
            cout<<"size of array?"<<endl;
            cin>>this->size;
            int count=this->size;
            cout<<"Enter the elements one by one"<<endl;
            while(count--){
                int ele;
                cin>>ele;
                arr.push_back(ele);
            }
            this->sort();
        }
        void displayArray(){
            cout<<"Sorted array :"<<endl;
            for(int ele:this->arr){
                cout<<ele<<endl;
            }
            return;
        }
        void sort(){
            for(int i=1;i<this->size;i++){
                int temp = this->arr[i];
                int j = i-1;
                while(j>=0 && this->arr[j]>temp){
                    this->arr[j+1] = this->arr[j];
                    j--;
                }
                this->arr[j+1] = temp;
            }
            this->displayArray();
            return;
        }
};

class BubbleSort{
    private:
        vector<int> arr;
        int size;
    public:
        BubbleSort(){
            cout<<"size of array?"<<endl;
            cin>>this->size;
            int count=this->size;
            cout<<"Enter the elements one by one"<<endl;
            while(count--){
                int ele;
                cin>>ele;
                arr.push_back(ele);
            }
            this->sort();
        }
        void displayArray(){
            cout<<"Sorted array :"<<endl;
            for(int ele:this->arr){
                cout<<ele<<endl;
            }
            return;
        }
        void sort(){
            int flag=0;
            for(int i=0;i<this->size-1;i++){
                for(int j=0;j<this->size-1-i;j++){
                    if(this->arr[j] > this->arr[j+1]){
                        swap(this->arr[j], this->arr[j+1]);
                        flag=1;
                    }
                }
                if(flag==0)break;
            }
            this->displayArray();
            return;
        }
};

class SelectionSort{
    private:
        vector<int> arr;
        int size;
    public:
        SelectionSort(){
            cout<<"size of array?"<<endl;
            cin>>this->size;
            int count=this->size;
            cout<<"Enter the elements one by one"<<endl;
            while(count--){
                int ele;
                cin>>ele;
                arr.push_back(ele);
            }
            this->sort();
        }
        void displayArray(){
            cout<<"Sorted array :"<<endl;
            for(int ele:this->arr){
                cout<<ele<<endl;
            }
            return;
        }
        void sort(){
            int min;
            for(int i=0;i<this->size-1;i++){
                min=i;
                for(int j=i+1;j<this->size;j++){
                    if(this->arr[j] < this->arr[min])
                    {
                        min=j;
                    }
                }
                swap(this->arr[min], this->arr[i]);
            }
            this->displayArray();
            return;
        }
};

int main(){
    // SelectionSort ss;
    // BubbleSort bs;
    // InsertionSort is;
    MergeSortAlgo msa;
    return 0;
}