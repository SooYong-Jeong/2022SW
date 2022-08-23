#include <stdio.h>

int main(void)
{

	const char* name = "신나라";

	int age = 20;

	char sex = 'F';

	float sleep_time = 6.25;

	const char* mental = "최고 보다는 최선을";

	printf("=*=*=*=*=*=*[ 학생 정보 ]*=*=*=*=*=*=\n");
	printf("  이    름 :\t%s\n", name);
	printf("  나    이 :\t%d\n", age);
	printf("  성    별 :\t%c\n", sex);
	printf("  수면시간 :\t%.2f시간\n", sleep_time);
	printf("  마음가짐 :\t%s\n", mental);
	printf("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

	return 0;
}