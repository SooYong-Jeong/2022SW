#include <stdio.h>
void main()
{
    int money, a = 0;
    printf("�Ž����� �Է�.\n");
    scanf_s("%d", &money);
    int mon = money;
    while (true)
    {
        if (money >= 50000)
        {
            money = money - 50000;
            a++;
        }
        else if (money >= 10000)
        {
            money = money - 10000;
            a++;
        }
        else if (money >= 5000)
        {
            money = money - 5000;
            a++;
        }
        else if (money >= 1000)
        {
            money = money - 1000;
            a++;
        }
        else if (money >= 500)
        {
            money = money - 500;
            a++;
        }
        else if (money >= 100)
        {
            money = money - 100;
            a++;
        }
        else if (money >= 50)
        {
            money = money - 50;
            a++;
        }
        else if (money >= 10)
        {
            money = money - 10;
            a++;
        }
        else if (money == 0)
        {
            break;
        }
    }
    printf("�Ž�����(%d��)�� ������ ������ ���� �ּ� �� : %d",mon, a);
}