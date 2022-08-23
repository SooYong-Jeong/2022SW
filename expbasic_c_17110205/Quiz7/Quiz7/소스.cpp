#include <stdio.h>
int main(void)
{
	int n = 0;
	int i;
	int y[4];
	printf("윳놀이 시작 수자 4개를 공백으로 구분하여 입력하세요 : ");
	scanf_s("%d %d %d %d", &y[0], &y[1], &y[2], &y[3]);
	for (i = 0; i < 4; i++)
	{
		if (y[i] == 1)
			n++;
	}
	if (n == 0)
		printf("모");
	else if (n == 1)
		printf("도");
	else if (n == 2)
		printf("개");
	else if (n == 3)
		printf("걸");
	else if (n == 4)
		printf("윷");
}