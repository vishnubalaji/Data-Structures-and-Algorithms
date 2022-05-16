#include <iostream>
using namespace std;
// Operations in stack are
// 1. push
// 2. pop
// 3. peek
// 4. isEmpty
const int MAX_SIZE = 5;
int top = -1;
int stack[MAX_SIZE]={};

void push(int element){
    if(top!=(MAX_SIZE-1)){
        stack[++top] = element;
        cout << "Pushed in";
    }
    else{
        cout << "Stack Overflow";
    }
}
int pop(){
    if(top!=-1){
        return stack[top--];
    }
    cout << "Stack Underflow : ";
    return -1;
}
int peek(){
    return stack[top];
}
bool isEmpty(){
    if(top==-1){
        return true;
    }
    return false;
}
int main(){
    int option, element;
    while(1){
        cout << "\n1.Pop 2.Peek 3.Push 4.isEmpty 5.Exit\n";
        cin >> option;
        switch(option){
            case 1:
                cout << pop();
                break;
            case 2:
                cout << peek();
                break;
            case 3:
                cout << "Enter the element : ";
                cin >> element;
                push(element);
                break;
            case 4:
                isEmpty()==1 ? cout << "True" : cout << "False";
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