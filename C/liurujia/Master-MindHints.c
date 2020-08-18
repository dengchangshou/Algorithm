#include <stdio.h>
#define maxn 1010
int main()
{
	int i, n, a[maxn], b[maxn];
	int kase = 0;
	while (scanf("%d", &n) == 1 && n)
	{
		printf("Game %d:\n", ++kase);
		for (i = 0; i < n; i++)
			scanf("%d", &a[i]);
		for (;;)
		{
			int d, A = 0, B = 0;
			for (i = 0; i < n; i++)
			{
				scanf("%d", &b[i]);
				if (a[i] == b[i]) A++;
			}
			if (b[0] == 0) break; //正常猜测序列不会有0，所以只判断第一个数是否为0即可
			for (d = 1; d <= 9; d++)
			{
				int c1 = 0, c2 = 0; //统计数字d在答案序列和猜测序列中各出现多少次
				for (i = 0; i < n; i++)
				{
					if (a[i] == d) c1++;
					if (b[i] == d) c2++;
				}
				if (c1 < c2) B += c1;
				else B += c2;
			}
			printf("    (%d,%d)\n", A, B - A);
		}
	}
	return 0;
}