//#define _CRT_SECURE_NO_WARNINGS
//#include<stdio.h>//�����
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
//				sum += j;//sum��������֮��
//				a[++k] = j;//��������������������
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
//#include<stdio.h>//С�����
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
//	printf("������%f��\n", sum);
//	printf("��ʮ��%f��\n", j);
// system("pause");
// return 0;
//}
//#define _CRT_SECURE_NO_WARNINGS
//#include<stdio.h>//����ÿ���һ���һ������,��ʮ��ʣһ��,��һ�����
//#include<stdlib.h>
//int main()
//{
//	int sum = 1,i;
//	for (i = 0; i < 9;i++)
//	{
//		sum = (sum + 1) * 2;
//	}
//	printf("����%d������\n", sum);
// system("pause");
// return 0;
//}
//#define _CRT_SECURE_NO_WARNINGS
//#include<stdio.h>//��ǩa����x,c����x,z
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
//							printf("˳��Ϊ:a--%c\tb--%c\tc--%c\n", i, j, k);
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
#include<stdio.h>//��������֮��
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