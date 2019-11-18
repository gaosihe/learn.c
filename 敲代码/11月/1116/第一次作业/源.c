//#include <stdio.h>//100到200之间素数
//int main()
//{
//	int a = 100;
//		for (int a = 100; a < 201; a++)
//		{
//			if (a % 2 == 0 || a % 3 == 0 || a % 5 == 0 || a % 7 == 0 || a % 11 == 0 || a %13 == 0)
//				printf("");
//			else
//			printf("%d\n",a);
//	}
//	return 0;
//}
//#include <stdio.h>//99乘法表
//int main()
//{
//	int a, b,k;
//	for (a=1; a < 10; a++)
//	{
//		for (b = 1; b <= a; b++)
//		{
//			k = a*b;
//			printf("%d*%d=%d", a, b, k);
//		}
//		printf("\n");
//	}
//return 0;
//}
//#include<stdio.h>//1000到2000的闰年
//int main()
//{
//	int a;
//	for (a = 1000; a < 2001; a++)
//	{
//		if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
//			printf("%d\n", a);
//	}
//	return 0;
//}
//#include<stdio.h>
//int main()//给定两个整形变量的值，将两个值的内容进行交换。
//{
//	int a, b;
//	{
//		scanf_s("%d%d", &a, &b);
//		int c = a;
//		a = b;
//		b = c;
//		printf("%d%d\n", a, b);
//	}
//	return 0;
//}
//#include<stdio.h>
//int main()//不创建临时变量，交换两个数的内容
//{
//	int a, b;
//	{
//		printf("输入a的值");
//		scanf_s("%d", &a);
//		b = a;
//		printf("b=%d\n", b);
//		printf("输入b的值");
//		scanf_s("%d", &b);
//		a=b;
//		printf("a=%d\n", a);
//	}
//return 0;
//}
//#include<stdio.h>//十个数中找最大值
//#include<stdlib.h>
//int main()
//{
//	int i = 0; 
//	int a[10], max;
//	{
//		for (i = 0; i < 10; i++)
//			scanf_s("%d", &a[i]);
//
//		for (i = 0; i < 9;i++)
//		if (a[i] < a[i + 1])
//			max = a[i + 1];
//		else
//			max = a[i];
//	}
//	printf("%d", max);
//	return 0;
//}
//#include<stdio.h>//三个数由大到小排序
//int main()
//{
//	int a, b, c,max;
//	scanf_s("%d%d%d", &a,&b,&c);
//	if (a > b&&a > c)
//	{
//		printf("排序如下%d\n", a);
//		if (b>c)
//			printf("%d\n%d\n", b,c);
//		else
//			printf("%d\n%d\n",c,b);
//	}
//	if (b > a&&b > c)
//	{
//		printf("排序如下%d\n",b);
//		if (a>c)
//			printf("%d\n%d\n", a, c);
//		else
//			printf("%d\n%d\n", c, a);
//	}
//	if (c > b&&c > a)
//	{
//		printf("排序如下%d\n", c);
//		if (b>a)
//			printf("%d\n%d\n", b, a);
//		else
//			printf("%d\n%d\n", a, b);
//	}
//}
//#include<stdio.h>//两个数最大公约数 最小公倍数
//int main()
//{
//	int a, b, c, d;
//	scanf_s("%d%d", &a, &b);
//	if (a > b)
//	{
//		d = a; a = b; b = d;
//	}
//	for (c = a; c >= 2; c--)
//	{
//		if (a%c == 0 && b%c == 0)
//		{
//			printf("%d\n", c);
//printf("%d", (a / c)*(b / c)*c);
//			break;
//		}
//	}
//		if (c == 1)
//			printf("1\n");
//		printf("%d", (a / c)*(b / c)*c);
//		return 0;
//}  
//# define _CRT_SECURE_NO_WARNINGS
//#include  <stdio.h>
//int nxts()
//{
//	int tmp, max = 0x80000000;
//	int nxt = 0x80000000;
//		int i;
//		for (i = 0; i < 10; i++)
//		{
//			scanf_s("%d", &tmp);
//			if (tmp>max)
//			{
//				nxt = max;
//				max = tmp;
//			}
//			else if (tmp > nxt)
//			{
//				nxt = tmp;
//			}
//		}
//		printf("%d", nxt);
//	
//	return 0;
//}
//int a1a1()//最大公约数
//{
//	int a, b;
//	int max = 1;
//	scanf_s("%d%d", &a, &b);
//	int c = a%b;
//	while (c){
//		a = b;
//		b = c;
//		c = a%b;
//	}
//	printf("%d", b);
//}
//#include<stdio.h>//1加1/2减1/3加1/4......
//int main()
//{
//	int i;
//	int k = 1;
//	double j = 1;
//	double sum = 0;
//	for (i = 1; i <= 100; i++)
//	{
//		j *= k * 1.0 / i;
//		k *= -1;
//		sum += j;
//	}
//	printf("%lf", sum);
//	return 0;
//}