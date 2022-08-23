#include <stdio.h>
int main(void)
{
	int i;
	char pw[100] = {};
	printf("원문 입력 : ");
	gets_s(pw);
	for (i = 0; i < sizeof(pw); i++)
	{
		if (pw[i] == 0)
			break;
		else if (pw[i] == ' ')
			printf(" ");
		else if (pw[i] >= 'x')
			printf("%c", pw[i] - 23);
		else
			printf("%c", pw[i] + 3);

	}

}