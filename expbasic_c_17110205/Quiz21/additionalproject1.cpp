#include <stdio.h>
#include <time.h>
#include <stdlib.h>

int permutation(int m, int n);
int combination(int m, int n);
int factorial(int seed);
int main() {
	int m, n;

	printf("n과 r의 값을 입력하세요: ");
	scanf_s("%d %d", &m, &n);
	

	printf("%dC%d = %d\n", m, n, combination(m, n));
	printf("%dP%d = %d\n", m, n, permutation(m, n));
	return 0;
}
int combination(int m, int n) {
	return permutation(m, n) / factorial(n);
}
int permutation(int m, int n) {
	if (n == 1) return m;
	else return m * permutation(m - 1, n - 1);
}
int factorial(int n) {
	if (n == 1) return 1;
	else return n * factorial(n - 1);
}