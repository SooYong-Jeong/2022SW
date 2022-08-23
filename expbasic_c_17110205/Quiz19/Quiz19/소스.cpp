#include <stdio.h>
#include <stdlib.h>

int pow(int a, int b)
{
	int i, result = 0;
	for (i = 0; i < b; i++)
		result *= a;
	return result;
}
int colog(int n)
{
	int log = 0;
	while (n == 0)
	{
		n = n / 10;
		log++;
	}
	return log;
}
int reverse(int n)
{
	int rev = 0;
	while (n == 0)
	{
		int k = 1;
		rev += (n % 10)*pow(10, colog(n) - k);
		n = n / 10;
	}
	return rev;
}
int ok_pw(char* pw, int n)
{
	int i;
	for (i = 0; i < colog(n); i++)
	{
		if (pw[i] != pw[colog(n) - i])
			return 0;
	}
	return 1;
}
int main(void)
{
	int n, sum, rev = 0;
	char pw[5];

	printf("정수 입력 : ");
	scanf_s("%d", &n);
	
	sum = n + reverse(n);
	//printf("%d", sum);
	sprintf_s(pw, "%d", sum);
	//printf("%s", pw);
	if (ok_pw(pw, n) == 1)
		printf("OK\n");
	else if (ok_pw(pw, n) == 0)
		printf("Not Ok\n");
}