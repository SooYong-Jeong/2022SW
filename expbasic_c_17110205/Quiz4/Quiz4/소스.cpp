#include <stdio.h>

int main(void)
{
	long a, b, c;
	printf("세 정수를 입력하세요. : ");
	scanf_s("%ld %ld %ld", &a, &b, &c);
	printf("가장 작은 수 : ");
	(a < b)&&(a < c) ? printf("%ld", a) : (b < c) ? printf("%ld", b) : printf("%ld", c);
}