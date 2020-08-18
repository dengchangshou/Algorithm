#include<stdio.h>
int main() {
	int K, n = 0;
	double Sn = 0.0;
	scanf("%d", &K);
	while (Sn <= K) {
		n++;
		Sn += 1.0 / n;	
	}
	printf("%d\n", n);
	return 0;
}
