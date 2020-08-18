#include <stdio.h>
int main(){
	int limit, speed, overspeed;
	printf("Enter the speed limit: ");
	scanf("%d", &limit);
	printf("Enter the recorded speed of the car: ");
	scanf("%d", &speed);
	overspeed = speed - limit;
	if(overspeed >= 31) 
		printf("You are speeding and your fine is $ 500\n");
	else if(overspeed >= 21) 
		printf("You are speeding and your fine is $ 270\n");
	else if(overspeed >= 1) 
		printf("You are speeding and your fine is $ 100\n");
	else 
		printf("Congratulations, you are within the speed limit\n");
	return 0;
}