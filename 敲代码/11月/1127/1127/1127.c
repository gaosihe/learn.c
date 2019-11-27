#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
//递归方式：
//int fib(int n)
//{
//	if (n <= 2)
//		return  1;
//	else
//		return fib(n - 1) + fib(n - 2);
//}
//循环方式：
int fib(int n)//1 1 2 3 5 8 13 21......
{
	int a = 1;
	int b = 1;
	int c = a;
	while (n > 2)
	{
		c = a + b;
		a = b;
		b = c;
		n--;
	}
	return c;
}
int main()
{
	int n = 0;
	int ret = 0;
	scanf("%d", &n);
	ret = fib(n);
	printf("%d\n", ret);
	system("pause");
	return 0;
}
