
#include <stdio.h>
void main()
{
    int Car_sp = 0, per = 0, a_sp = 100, charge = 0;
    printf("차량속도 입력.\n");
    scanf_s("%d", &Car_sp);
    per = (Car_sp - a_sp);
    if (per >= 30)
    {
        charge += 7;
    }
    else if (per >= 20)
    {
        charge += 5;
    }
    else if (per >= 10)
    {
        charge += 3;
    }

    printf("도로를 달리는 모든 차의 벌금은 총 %d만원입니다.\n", charge);
}
