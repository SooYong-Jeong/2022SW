#include<stdio.h>

int main()
{
	int sum = 0, n = 0, m = 0;
	printf("�ĺ��ڼ� �Է�.");
	scanf_s("%d", &n);

	printf("��ǥ�ڼ� �Է�.");
	scanf_s("%d", &m);

	int col[255] = { 0 };
	int count[255] = { 0 };
	for (int i = 0; i < m; i++)
	{
		printf("%d��° ��ǥ �Է�.", i + 1);
		scanf_s("%d", &col[i]);
		count[col[i] - 1]++;
	}
	for (int i = 0; i < n; i++)
	{
		if (m / 2 < count[i])
			printf("%d�� �ĺ��� ���ݼ� ��ǥ�� �Դϴ�.", i + 1);
	}
}