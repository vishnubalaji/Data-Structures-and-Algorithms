#include <iostream>
#include <stack>
using namespace std;
// Operations in stack are
// 1. push
// 2. pop
// 3. peek
// 4. isEmpty

int main(){
    int option, element;
    stack<int> st;
    while(1){
        cout << "\n1.Pop 2.Peek 3.Push 4.isEmpty 5.Exit\n";
        cin >> option;
        switch(option){
            case 1:
                cout << st.top();
                st.pop();
                break;
            case 2:
                cout << st.top();
                break;
            case 3:
                cout << "Enter the element : ";
                cin >> element;
                st.push(element);
                break;
            case 4:
                st.empty() ? cout << "True" : cout << "False";
                break;
            case 5:
                exit(0);
                break;
            default:
                cout << "\nNahh! Wrong input\n";
        }
    }
    return 0;
}