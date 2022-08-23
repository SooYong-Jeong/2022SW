#include <stdio.h>

int main(void)
{
	int vac = 0;
	int i, j, vi1, vi2, vi3;
	printf("세 정수를 오름차순으로 입력 : ");
	scanf_s("%d %d %d", &vi1, &vi2, &vi3);

	for(i = 2;i < vi3;i++)
	{
		if ((vi1 % i == 0) && (vi2 % i == 0) && (vi3 % i == 0))
			vac = i;
		else continue;
	}
	if (vac == 0)
		printf("백신이 없다.");
	else printf("%d",vac);
}