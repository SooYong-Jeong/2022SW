#include <stdio.h>
int main(void)
{
	int i, j, t;
	int kid[3];
	printf("몸무게 입력\n");
	scanf_s("%d %d %d", &kid[0], &kid[1], &kid[2]);
	printf("줄을 세우는 순서\n");
	for (i = 0; i < 3; i++)
	{
		for (j = 0; j < 3 - 1; j++)
		{
			if (kid[j] > kid[j + 1])
			{
				t = kid[j];
				kid[j] = kid[j + 1];
				kid[j + 1] = t;
			}
		}
	}
	for (i = 0; i < 3; i++)
		printf("%d ", kid[i]);
}