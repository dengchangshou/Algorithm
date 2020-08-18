#include<stdio.h>
int main()
{
    int i,a,b,c,s;
    for(i = 100; i<1000;i++)
    {
	a = i/100;
	b = i%100/10;
	c = i%10;
	s = a*a*a+b*b*b+c*c*c;
	if(s == i) printf("%d\n",i);
    }  
    return 0;
}

