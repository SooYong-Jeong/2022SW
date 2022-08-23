#include <stdio.h>
void main()
{
    int money, a = 0;
    printf("거스름돈 입력.\n");
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
    printf("거스름돈(%d원)의 동전과 지폐의 개수 최소 합 : %d",mon, a);
}