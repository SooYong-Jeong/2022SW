#include <stdio.h>

int main(void)
{
	long int n;
	printf("정수를 입력하세요 : ");
	scanf_s("%ld", &n);
	if (n < 0)
		printf("음수\n");
	else printf("양수\n");

	if (n % 2 == 0)
		printf("짝수\n");
	else printf("홀수\n");
	return 0;
}