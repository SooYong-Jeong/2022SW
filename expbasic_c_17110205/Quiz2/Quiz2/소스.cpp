#include <stdio.h>

int main(void)
{
	int k, e, m;
	printf("세 과목의 점수를 입력하세요...\n");
	printf("국어 점수 : ");
	scanf_s("%d", &k);
	printf("영어 점수 : ");
	scanf_s("%d", &e);
	printf("수학 점수 : ");
	scanf_s("%d", &m);
	int total = k + e + m;
	printf("합계 : %d점, 평균 : %.1f",total, (double)total/3);
}

