#include <stdio.h>
void result(int num, int *add, int *mul)
{
	int x, y, z;
	x = num / 100;
	y = num % 100 / 10;
	z = num % 10;
	*add += x + y + z;
	*mul *= x * y * z;
}

int main() {
	int a, b, c;
	for (a = 123; a <= 329; a++)
	{
		b = 2 * a;
		c = 3 * a;
		int add = 0, mul = 1;
		result(a, &add, &mul);
		result(b, &add, &mul);
		result(c, &add, &mul);
		if (add == 45 && mul == 362880) 
			printf("%d %d %d\n", a, b, c);
	}
	return 0;
}