#define _CRT_SECURE_NO_WARNINGS
#pragma warning(disable: 4996)
#include <stdio.h>
#include <string.h>

char a[100], b[100];
int main()
{
    printf("ù ��° �ܾ� �Է�: ");
    scanf("%s", &a);
    printf("ù ��° �ܾ� �Է�: ");
    scanf("%s", &b);
    int sum = strlen(a) + strlen(b);
    for (int i = 0; i < strlen(a); i++)
    {
        for (int j = 0; j < strlen(b); j++)
        {
            if (a[i] == b[j])
            {
                a[i] = -1;   b[j] = -2;
                sum -= 2;
            }
        }
    }
    if (sum == 0)
    {
        printf("�ֳ��׷�!");
    }
    else
    {
        printf("�ƴϾ�!");
    }
}