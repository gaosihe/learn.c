//#define _CRT_SECURE_NO_WARNINGS
//#include<stdio.h>//求合数
//#include<stdlib.h>
//#define N 1000
//int main()
//{
//	int i, j, k, n, sum;
//	int a[256];
//	for (i = 2; i <= N;i++)
//	{
//		sum = a[0] = 1;
//		k = 0;
//		for (j = 2;j<=(i/2);j++)
//		{
//			if (i%j==0)
//			{
//				sum += j;//sum是求因数之和
//				a[++k] = j;//将各个因数存入数组中
//			}
//		}
//		if (i == sum)
//		{
//			printf("%d=%d", i , a[0]);
//			for (n = 1; n <= k;n++)
//				printf("+%d", a[n]);
//			printf("\n");
//		}
//	}
// system("pause");
// return 0;
//}
//#define _CRT_SECURE_NO_WARNINGS
//#include<stdio.h>//小球落地
//#include<stdlib.h>
//int main()
//{
//	float i, j = 100, sum = 100;
//	j = j / 2;
//	for (i = 2; i <= 10;i++)
//	{
//		sum = sum +2* j;
//		j = j / 2;
//	}
//	printf("共经过%f米\n", sum);
//	printf("第十次%f米\n", j);
// system("pause");
// return 0;
//}
//#define _CRT_SECURE_NO_WARNINGS
//#include<stdio.h>//猴子每天吃一半加一个桃子,第十天剩一个,第一天多少
//#include<stdlib.h>
//int main()
//{
//	int sum = 1,i;
//	for (i = 0; i < 9;i++)
//	{
//		sum = (sum + 1) * 2;
//	}
//	printf("吃了%d的桃子\n", sum);
// system("pause");
// return 0;
//}
//#define _CRT_SECURE_NO_WARNINGS
//#include<stdio.h>//抽签a不和x,c不和x,z
//#include<stdlib.h>
//int main()
//{
//	char i, j, k;
//	for (i = 'x'; i <= 'z';i++)
//	{
//		for (j = 'x'; j <= 'z'; j++)
//		{
//			if (i != j)
//			{
//				for (k = 'x'; k <= 'z'; k++)
//				{
//					if (i != k&&j != k){
//						if (i != 'x'&&k != 'x'&&k != 'z')
//						{
//							printf("顺序为:a--%c\tb--%c\tc--%c\n", i, j, k);
//						}
//					}				
//				}
//			}
//		}
//	}
// system("pause");
// return 0;
//}
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>//分数数列之和
#include<stdlib.h>
int main()
{
	float a[20], b[20];
	float sum=3.5;
	int i;
	a[0] = 2, a[1] = 3;
	b[0] = 1, b[1] = 2;
	for (i = 2; i < 20; i=i+1)
	{
		a[i] = a[i - 1] + a[i - 2];
		b[i] = a[i - 1];
		sum += a[i] / b[i];
	}
	printf("%9.6f", sum);
 system("pause");
 return 0;
}