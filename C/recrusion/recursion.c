// this covers the basic of recursion in depth

#include <stdio.h>
#include <stdlib.h>

void recursiveNo(int n)
{
    if (n == 5)
    {
        printf("%d \n", n);
        return;
    }
    printf("%d", n);
    recursiveNo(n + 1);
}
int main()
{
    recursiveNo(1);
    return 0;
}
