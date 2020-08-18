#include <stdio.h>
int main()
{
	int a,b,c,kase = 0;
	while(scanf("%d %d %d",&a,&b,&c) != EOF && (a||b||c))
	{
		printf("Case %d: %d.",++kase, a/b);
		a %= b;
		while(c>1)
		{
			printf("%d", a*10/b);
			a = a*10%b;
			c--;
		}
		int temp = a*10%b;
		a = a*10/b;
		if(temp*10/b >= 5)
			printf("%d\n", a+1);
		else 
			printf("%d\n", a);
	}
	return 0;
}