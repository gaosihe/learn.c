//#define _CRT_SECURE_NO_WARNINGS
//#include<stdio.h>
//int main() {
//	int a[10] = {0,1,2,3,4,5,6,7,8,9};
//	int* p;			//定义整形指针变量
//	//对指针变量赋值
//	int i;
//	for (i = 0; i < 10; i++) {
//		p = &a[i];
//	}
//	for (p = &a; p < (a + 10); p++) {
//		printf("%d\n", *p);
//	}
//	system("pause");
//	return 0;
//}
//#include <stdio.h>
//int main()
//{
//	int a = 0x11223344;
//	char *pc = (char*)&a;
//	*pc = 0;
//	printf("%x\n", a);
//	system("pause");
//	return 0;
//}
//#include <stdio.h>
//int main()
//{
//	int arr[] = { 1, 2, 3, 4, 5 };
//	short *p = (short*)arr;
//	int i = 0;
//	for (i = 0; i < 4; i++)
//	{
//		*(p + i) = 0;
//	}
//	for (i = 0; i < 5; i++)
//	{
//		printf("%d ", arr[i]);
//	}
//	system("pause");
//	return 0;
//}
#include <stdio.h>
int main()
{
	int a, b, c;
	a = 5;
	c = ++a;
	b = ++c, c++, ++a, a++;
	b += a++ + c;
	printf("a = %d b = %d c = %d\n:", a, b, c);
	system("pause");
	return 0;
}