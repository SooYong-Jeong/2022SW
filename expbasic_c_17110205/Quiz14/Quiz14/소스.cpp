#include <stdio.h>
int main(void)
{
	int i, c = 0, cc = 0;
	char pw[100] = {};
	printf("발견한 암호문 : \n");
	gets_s(pw);
	for (i = 0; i < sizeof(pw); i++)
	{
		if (pw[i] == 'c' || pw[i] == 'C')
		{
			c++;
			if (pw[i + 1] == 'c' || pw[i + 1] == 'C')
				cc++;
		}
	}
	printf("문자 C : %d개\n문자 CC : %d개", c, cc);
}