#include <stdio.h>

int main(void)
{
	long a, b, c;
	printf("�� ������ �Է��ϼ���. : ");
	scanf_s("%ld %ld %ld", &a, &b, &c);
	printf("���� ���� �� : ");
	(a < b)&&(a < c) ? printf("%ld", a) : (b < c) ? printf("%ld", b) : printf("%ld", c);
}