#include<stdio.h>

int main()
{
	int count = 0;
	int stdents[] = { 80,45,33,20 };
	for (int i = 0; i < 4; i++)
	{
		if (std[i] % 30 != 0)
		{
			count += std[i] / 30 + 1;
		}
		else
		{
			count += std[i] / 30;
		}
	}
	printf("������ �����ϱ� ���� ���� ���� %d���Դϴ�.", count);
	return 0;



}