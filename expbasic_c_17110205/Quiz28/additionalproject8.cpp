
#include <stdio.h>
void main()
{
    int Car_sp = 0, per = 0, a_sp = 100, charge = 0;
    printf("�����ӵ� �Է�.\n");
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

    printf("���θ� �޸��� ��� ���� ������ �� %d�����Դϴ�.\n", charge);
}
