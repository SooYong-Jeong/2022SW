#include <stdio.h>
int main()
{
    int a;
    printf("숫자를 입력하세요 : \n");
    scanf_s("%d", &a);
    
    int arr[10] = { 0 };
    while (a != 0)
    {
        arr[a % 10] += 1;
        a /= 10;
    }
    printf("숫자를 개수로 읽은 결과 : \n");
    for (int i = 9; i >= 0; i--)
    {
        if (arr[i] != 0)
        {
            printf("%d%d", i, arr[i]);
        }
    }
    return 0;
}