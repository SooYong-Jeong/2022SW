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
	printf("수업을 진행하기 위한 조교 수는 %d명입니다.", count);
	return 0;



}