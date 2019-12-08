//#define _CRT_SECURE_NO_WARNINGS
//#include<stdio.h>
//#include<stdlib.h>
//#include<windows.h>
//int Short_division(int a){
//	int count=0;
//	while (a){
//		if (a % 2 == 1)
//		{
//			count++;		
//		}
//		a /= 2;
//	}
//	
//	printf("%d", count);
//	return count;
//}
//int main()
//{
//	int a=0;
//	scanf("%d", &a);
//	Short_division(a);
//	system("pause");
//	return 0;
//}
//int func2(int m, int n)//两个int（32位）整数m和n的二进制表达中，有多少个位(bit)不同
//{
//	int tmp = m^n;
//	int count = 0;
//	while (tmp != 0)
//	{
//		count++;
//		tmp = tmp&(tmp - 1);
//	}
//	return count;
//}
//int main()
//{
//	printf("%d\n", func2(1999, 2299));
//system("pause");
//	return 0;
//}

//#define _CRT_SECURE_NO_WARNINGS
//#include <stdio.h>  
//int main()
//{
//	int num = 0, i = 0;
//	scanf("%d", &num);
//	printf("奇数序列为：");
//	for (i = 31; i >= 0; i -= 2)  //也是控制32次（每个整型数按32位来算），只是从31位开始移动  
//	{
//		printf("%d ", (num >> i) & 1);  //第一次向右移动31位和1与得到第一位情况，每次变化2位，即可得到奇数位情况  
//	}
//	printf("\n");
//	printf("偶数序列为：");
//	for (i = 30; i >= 0; i -= 2)  //向右移动30位，再与1所得结果是原来数字的第二位，再移28位...  
//	{
//		printf("%d ", (num >> i) & 1);  //  
//	}
//	printf("\n");
//	system("pause");
//	return 0;
//}
//#include <stdio.h>
//int i;
//int main()
//{
//	i--;
//	if (i > sizeof(i))
//	{
//		printf(">\n");
//	}
//	else
//	{
//		printf("<\n");
//	}
//	system("pause");
//	return 0;
//}