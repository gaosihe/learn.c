#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#define N 30
int main()
{
	int a[N];
	int count, i;
	count = 0;
	for (i = 0; i < N; i++)
	{
		a[i] = 1;
	}
	while (num(a)>1)
	{
		for (i = 0; i < N; i++){
			if (a[i])
			{
				count++;
			}
			if (count == 7)
			{
				count = 0;
				a[i] = 0;
			}
		}
	}


	for (i = 0; i < N; i++){

		if (a[i] != 0)
		{
			printf("最后一个人的编号为%d\n", i + 1);
			system("pause");
		}
	}
	return 0;
}
int num(int a[])
{
	int num, i;
	num = 0;
	for (i = 0; i < N; i++)
	{
		if (a[i] != 0)
		{
			num++;
		}
	}
	return num;
}
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#define N 10
int main()
{
	int a[N] = {};
 return 0;
}