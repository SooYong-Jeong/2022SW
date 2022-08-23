#include<stdio.h>

int main()
{
	int sum = 0, n = 0, m = 0;
	printf("후보자수 입력.");
	scanf_s("%d", &n);

	printf("투표자수 입력.");
	scanf_s("%d", &m);

	int col[255] = { 0 };
	int count[255] = { 0 };
	for (int i = 0; i < m; i++)
	{
		printf("%d번째 투표 입력.", i + 1);
		scanf_s("%d", &col[i]);
		count[col[i] - 1]++;
	}
	for (int i = 0; i < n; i++)
	{
		if (m / 2 < count[i])
			printf("%d번 후보가 과반수 득표자 입니다.", i + 1);
	}
}