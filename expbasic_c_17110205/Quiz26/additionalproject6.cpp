#include <stdio.h>
int main()
{
    int a;
    printf("���ڸ� �Է��ϼ��� : \n");
    scanf_s("%d", &a);
    
    int arr[10] = { 0 };
    while (a != 0)
    {
        arr[a % 10] += 1;
        a /= 10;
    }
    printf("���ڸ� ������ ���� ��� : \n");
    for (int i = 9; i >= 0; i--)
    {
        if (arr[i] != 0)
        {
            printf("%d%d", i, arr[i]);
        }
    }
    return 0;
}