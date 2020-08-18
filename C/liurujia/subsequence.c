#include <stdio.h>
int main()
{
	int m,n,count = 0;
	while(scanf("%d %d", &n, &m) != EOF && (m || n))
	{
		double s = 0.000000000;
		while(n<=m)
		{
			s += 1.000000000/n/n;
			n++;
		}
		printf("Case %d: %.5f\n", ++count, s);
	}
	return 0;
}