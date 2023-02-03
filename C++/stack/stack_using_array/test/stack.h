#ifndef STACK_H
#define STACK_H

template<class T>

class Stack{
    int index=-1;
    int max_amount=0;
    T* stack_data;
public:
    Stack(int maximum){
        max_amount= maximum;
        stack_data = new T;
    }
    void push(T data);
    void pop();
    void printStack();
};

#include "stack.tpp"
#endif
