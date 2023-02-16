#include<iostream>
#include<vector>

using namespace std;

class searching
{
public:
    vector<int> v = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    vector<vector<int>> matrix = {
        {1,3,5,7},
        {10,11,16,20},
        {23,30,34,60}
    };
    int size = v.size();
    int l=0;
    int r=size-1;
    searching(int option, int value){
        switch(option){
            case 1:
                LinearSearch(v,l,value);
                break;
            case 2:
                BinarySearch(v,l,r,value);
                break;
            case 3:
                cout<<MatrixSearch(matrix, value)<<endl;
                break;
        }
    }

    int LinearSearch(vector<int> &v, int index, int value){
        if(v[index]==value){
            cout<<index<<endl;
            return 0;
        }
        LinearSearch(v,index+1, value);
        return 0;
    }

    int BinarySearch(vector<int> &v, int l, int r, int value){
        if(l<r){
            int mid = (l+r)/2;
            if(v[mid]==value){
                cout<<mid<<endl;
                return 0;
            }
            else if(v[mid]<value){
                BinarySearch(v,mid+1,r,value);
            }
            else if(v[mid]>value){
                BinarySearch(v,l,mid-1,value);
            }
        }
        return 0;
    }

    int MatrixSearch(vector<vector<int>> &matrix, int target){
        int row=matrix.size(), column=matrix[0].size();
        int start = 0, end=(row*column)-1, mid;
        while(start<=end){
            mid = (start+end)/2;
            cout<<start<<" "<<end<<" "<<matrix[mid/column][mid%column]<<endl;
            if(matrix[mid/column][mid%column]==target){
                return 1;
            }
            else if(matrix[mid/column][mid%column]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
};

int main()
{
    searching s(3,16);
}