//#define _CRT_SECURE_NO_WARNINGS
//#include<stdio.h>
//#include<stdlib.h>//字符转换
//
//void reverse(char* s){
//	int  len = 0;
//	char*p = s;
//	while (*p != 0){
//		len++;
//		p++;
//	}
//	int i = 0;
//	char c;
//	while (i<=len/2-1)
//	{
//		c = *(s + i);
//		*(s + i) = *(s + len - 1 - i);
//		*(s + len - 1 - i) = c;
//		i++;
//	}
//}
//int main()
//{
//	char s[] = "www.aabbcc.com";
//	printf("%s=>\n", s);
//	reverse(&s);
//	printf("%s\n",s);
// system("pause");
// return 0;
//}
//#define _CRT_SECURE_NO_WARNINGS
//#include<stdio.h>//排序
//#include<stdlib.h>
//#define N 10
//int main()
//{
//	int i, j, a[N], temp;
//	printf("请输入 10 个数字：\n");
//	for (i = 0; i < N; i++)
//		scanf("%d", &a[i]);
//	for (i = 0; i < N - 1; i++)
//	{
//		int min = i;
//		for (j = i + 1; j<N; j++)
//		if (a[min]>a[j]) min = j;
//		if (min != i)
//		{
//			temp = a[min];
//			a[min] = a[i];
//			a[i] = temp;
//		}
//	}
//	printf("排序结果是:\n");
//	for (i = 0; i < N; i++)
//		printf("%d ", a[i]);
//	printf("\n");
//	system("pause");
//	return 0;
//}
//#include<stdio.h>//逆置字符
//int main()
//{
//	int i = 5;
//	void palin(int n);
//	printf("请输入5个字符:");
//	palin(i);
//	printf("\n");
//	system("pause");
//}
//void palin(n)
//int n;
//{
//	char next;
//	if (n <= 1){
//		next = getchar();
//		printf("相反输出结果:");
//		putchar(next);
//	}
//	else{
//		next = getchar();
//		palin(n - 1);
//		putchar(next);
//	}
//}
//#define _CRT_SECURE_NO_WARNINGS
//#include<stdio.h>//定义头文件
//#include<stdlib.h>
//#include"hest.h"
//int main()
//{
//	printf("%d", aa);
// system("pause");
// return 0;
//}
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
void gsh(int i,int a[],int n){
	int tmp1,tmp2;
		if (9<i){
			tmp1 = a[i];
			a[i] = n;
			a[i + 1] = tmp1;
		}else
			gsh(i + 1, a, n);
	}		
int main()
{
	int a[11] = {1,5,33,36,46,56,76,77,90,100};
	int i,n;
	scanf("%d", &n);
	for (i = 0; i < 10; i++){
		//printf("%d\t", a[i]);
		if (n>a[i]){
			gsh(i, a, n);
	
		}
	}
	int j=0;
	for (j = 0; j < 11;j++)
	{
		printf("%d\t", a[j]);
	}

 system("pause");
 return 0;
}
//#define _CRT_SECURE_NO_WARNINGS
//#include<stdio.h>//数组插入
//#include<stdlib.h>
//
//int main()
//{
//	int a[11] = { 1, 5, 33, 36, 46, 56, 76, 77, 90, 100 };
//	int i, j,n,tmp1, tmp2,end;
//	scanf("%d", &n);
//	end = a[9];
//	if(n>end){
//		a[10] = n;
//	}
//	else{
//		for (i = 0; i < 10; i++){
//			if (a[i]>n){
//				tmp1 = a[i];
//				a[i] = n;
//				for (j = i + 1; j < 11; j++){
//					tmp2 = a[j];
//					a[j] = tmp1;
//					tmp1 = tmp2;
//				}
//				break;
//			}
//		}
//	}
//	for (j = 0; j < 11; j++)
//	{
//		printf("%d\t", a[j]);
//	}
//	system("pause");
//	return 0;
//}