#include <stdio.h>
int main(void)
{
	int go[361] = {};
	int wd, x, y, i, j;
	printf("흰 돌을 놓을 갯수 입력 : ");
	scanf_s("%d", &wd);
	printf("흰 돌을 놓을 좌표(x, y)를 공백으로 구분하여 입력\n");
	for (i = 0; i < wd; i++)
	{
		scanf_s("%d %d", &x, &y);
		go[(x - 1) * 19 + y - 1] = 1;
	}
	for (i = 0; i < 361; i++)
	{
		printf("%d ", go[i]);
		if ((i + 1) % 19 == 0)
			printf("\n");
	}

}