#include <stdio.h>
int main(void)
{
	int n;
	printf("정수를 입력하세요.(0~99) : ");
	scanf_s("%d", &n);
	if(n>99)
		printf("입력 값이 범위를 초과했습니다.");
	else
	{
		printf("%d", n);
		if (n == 11 || 12 || 13)
			printf("th");
		else if (n % 10 == 1)
			printf("st");
		else if (n % 10 == 2)
			printf("nd");
		else if (n % 10 == 3)
			printf("rd");
		else
			printf("th");
	}
}