#include <stdio.h>
#define MONEY 300
int main(){
	int remain = 0, month = 1, budget, store, store_sum = 0, remain_after_strore, judge = 1; 
	while(month <= 12){
		scanf("%d", &budget);
		remain += (MONEY - budget);
		if(remain < 0){
			printf("-%d", month);
			judge = 0;
			break;
		}
		store = 100*(remain/100);
		remain_after_strore = remain - store;
		store_sum += store;
		remain -= store;
		month++;
	}
	if(judge) printf("%d", store_sum * 12 / 10 + remain);
	return 0;
}