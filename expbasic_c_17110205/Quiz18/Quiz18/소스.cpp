#include <stdio.h>
void prime(int n)
{
	int i;
	for (i = 2; i < n; i++)
	{
		if (n % i == 0)
		{
			printf("Composite_Number");
			break;
		}
		if (i == n - 1)
			printf("Prime_Number");
	}
	
}
int main(void)
{
	int n;
	printf("1보다 큰 자연수 입력 : ");
	scanf_s("%d", &n);
	prime(n);
}