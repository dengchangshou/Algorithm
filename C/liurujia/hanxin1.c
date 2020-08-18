#include <stdio.h>
int main()
{
	int i,a,b,c,count = 0;
	while(scanf("%d %d %d", &a, &b, &c) != EOF)
	{
		int k = 1;
		for(i = 10; i <= 100; i++)
		{
			if(i%3 == a && i%5 == b && i%7 == c)
			{
				k = 0;
				printf("Case %d: %d\n", ++count, i);
				break;
			}
		}
		if(k)
			printf("Case %d: No answer\n",++count);
	}
	return 0;
}
