#include <stdio.h>
int main()
{
	int a, b, c, result, count = 0;
	while (scanf("%d %d %d", &a, &b, &c) != EOF)
	{
		result = (70 * a + 21 * b + 15 * c) % 105;
		if (result < 10 || result > 100)
			printf("Case %d: No answer\n", ++count);
		else
			printf("Case %d: %d\n", ++count, result);
	}
	return 0;
}
