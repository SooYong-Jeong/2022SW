#include <stdio.h>

int main(void)
{
	long long a, b;
	printf("계산할 두 정수 입력 : ");
	scanf_s("%lld %lld", &a, &b);
	long long c = a + b;
	printf("두 수의 합계 : %lld\n두 수의 평균 : %.1f",c, (double)c/2);
}