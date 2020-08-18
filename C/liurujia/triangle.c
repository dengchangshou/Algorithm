#include <stdio.h>
int main()
{
	int n, i, j, x, y;
	while(scanf("%d", &n) != EOF)
	{
		for(i = 2*n-1, j = 0; i>0 && j<n; i -= 2, j++)
		{
			x = i;
			y = j;
			while(y>0)
			{
				printf(" ");
				y--;
			}
			while(x>0)
			{
				printf("#");
				x--;
			}
			printf("\n");
		}
	}
	return 0;
}