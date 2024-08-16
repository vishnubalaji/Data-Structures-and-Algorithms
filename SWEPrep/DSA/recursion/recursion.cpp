// #include<bits/stdc++.h>
#include<iostream>
#include<vector>
#include<algorithm>
#include<string>
using namespace std;

/*
Print N natural numbers using recursion.
*/

class PrintNWithoutLoop{
    public:
        int n,i=1;
        PrintNWithoutLoop(int n){
            this->n=n;
        }
        void Calculate(){
            if(this->i!=this->n){
                cout<<this->i<<endl;
                ++this->i;
                this->Calculate();
            }
            else{
                cout<<this->i<<endl;
                return;
            }
        }
};

/*
Reverse an array recursively. Logic applies to Palindrome string check too.
*/

class ReverseArrayRecursive{
    public:
        vector<int> array;
        int length, middle, front_index=0, back_index;
        ReverseArrayRecursive(vector<int> &array){
            this->array = array;
            this->length = array.size();
            this->back_index = this->length - 1;
            this->middle = this->length/2;
        };

        void ReverseArray(){
            if(this->front_index!=this->middle){
                swap(this->array[this->front_index], this->array[this->back_index]);
                this->front_index++;this->back_index--;
                this->ReverseArray();
            }
            else{
                cout<<"Array after recursive reverse"<<endl;
                for(int i:array){
                    cout<<i<<endl;
                }
                return;
            }
        }
};

/*
Reverse an array using STL vector representation
*/

class ReverseArraySTL{
    public:
        vector<int> array;
        ReverseArraySTL(vector<int> &array){
            this->array = array;
        }
        void ReverseArray(){
            reverse(this->array.begin(), this->array.end());
            cout<<"Array after STL reverse"<<endl;
            for(int i:this->array){
                cout<<i<<endl;
            }
            return;
        }
};

/*
character hashing
*/

class CharacterHashing{
    private:
        string query;
        int queries;
        int arr[26] = {0};
    public:
        CharacterHashing(){
            int count;
            cout<<"please enter the string to be hashed"<<endl;
            cin>> this->query;
            cout<<"Query count?"<<endl;
            cin>>count;
            for(char c:query){
                arr[c-'a']++;
            }
            cout<<"Please enter the queries one by one"<<endl;
            char c;
            while(count--){
                cin>>c;
                cout<<"Count of "<<c<<" is "<<arr[c-'a']<<endl;
            }
        }
};

/*
frequency counting
*/

class FrequencyCounting{
    private:
        vector<int> array;
        int size;
    public:
        FrequencyCounting(){
            cout<<"Size of the array?"<<endl;
            cin>>this->size;
            int count = this->size;
            cout<<"Please enter the elements of the array"<<endl;
            while(count--){
                int ele;
                cin>>ele;
                this->array.push_back(ele);
            }
            this->ArrayFreqCounting();
        }
        void ArrayFreqCounting(){
            bool visited[this->size] = {false};
            for(int i=0;i<this->size;i++){
                if(visited[i]==false){
                    int count=1;
                    visited[i]==true;
                    for(int j=i+1;j<this->size;j++){
                        if(this->array[j]==this->array[i]){
                            ++count;
                            visited[j]=true;
                        }
                    }
                    cout<<this->array[i]<<" occured "<<count<<" times "<<endl;
                }
            }
            return;
        }
};

class FrequencyCountingHashMap{
    private:
        vector<int> array;
        int size;
    public:
        FrequencyCountingHashMap(){
            cout<<"Size of the array?"<<endl;
            cin>>this->size;
            int count = this->size;
            cout<<"Please enter the elements of the array"<<endl;
            while(count--){
                int ele;
                cin>>ele;
                this->array.push_back(ele);
            }
            this->ArrayFreqCounting();
        }
        void ArrayFreqCounting(){
            unordered_map<int,int> umap;
            for(int ele:this->array){
                if(umap.find(ele)==umap.end()){
                    umap[ele] = 1;
                }
                else{
                    umap[ele]+=1;
                }
            }
            for(auto map :umap){
                cout<<"Element : "<<map.first<<" Count : "<<map.second<<endl;
            }
            return;
        }
};

int main(){
    // PrintNWithoutLoop pr(10);
    // pr.Calculate();

    // vector<int> array = {1,2,3,4,5};
    // cout<<"Array before reversing" <<endl;
    // for(int i:array){
    //     cout<<i<<endl;
    // }
    
    // ReverseArrayRecursive rar(array);
    // rar.ReverseArray();

    // ReverseArraySTL ras(array);
    // ras.ReverseArray();
    // CharacterHashing ch;
    
    // FrequencyCounting fc;
    
    FrequencyCountingHashMap fch;
    return 0;
}