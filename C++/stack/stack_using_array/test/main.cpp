#include <iostream>
#include "stack.h"

int main()
{
    Stack<char> a(5);
    a.push('a');
    a.push('b');
    a.push('a');
    a.push('b');
    a.push('a');
    a.push('b');

    a.pop();
    a.printStack();
}
