#include <stdio.h>
int main(){
	int price;
	float discount;
	scanf("%d %f", &price, &discount);
	price *= (discount/10);
	if(price % 10 >= 5) price += 10;
	printf("%d", price-price%10);
	return 0;
}