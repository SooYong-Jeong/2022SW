#include <stdio.h>

int main(void)
{
    int i, k;

    for (i = 0; i < 5; i++)
    {
        for (k = 0; k < 4 - i; k++)
        {
            printf(" ");
        }
        for (k = 0; k < 2 * i + 1; k++)
        {
            printf("*");
        }
        for (k = 0; k < 4 - i; k++)
        {
            printf(" ");
        }
        printf("\n");
    }
    return 0;
}
