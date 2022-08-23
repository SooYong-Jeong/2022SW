#include <stdio.h>

int main(void)
{
	int n, length;
	printf("향나무의 길이 : ");
	scanf_s("%d", &n);
	printf("어떤 길이로 자를까요? ");
	scanf_s("%d", &length);
	int pice = n / length + 1;
	if (n % length == 0)
		pice -= 1;
	printf("조각 수는 %d입니다.", pice);
}