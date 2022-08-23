#include<stdio.h>

void main()
{
	int year, month;
	scanf_s("%d %d", &year, &month);
	if (month == 1|| month == 3|| month == 5|| month == 7||month == 8|| month == 10|| month == 12)
		printf("31");
	else if (month == 2)
		if ((year % 4 == 0) && (year % 100 != 0))
			printf("29");
		else if(year % 400 == 0)
			printf("29");
		else printf("28");
	else printf("30");

}