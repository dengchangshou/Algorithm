#include <stdio.h>
int main(){
	int klass, credits;
	float grade, sum1 = 0.0, sum2 = 0.0;
	scanf("%d", &klass);
	while(klass > 0){
		klass--;
		scanf("%d %f", &credits, &grade);
		sum1 += credits * grade;
		sum2 += credits;
	}
	printf("%.2f", sum1/sum2);
	return 0;
}