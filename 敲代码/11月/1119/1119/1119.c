// #define _CRT_SECURE_NO_WARNINGS
//#include<stdio.h>//乘法表
//#include<stdli b.h>
//int main()
//{
//	int i=1, j=1,k;
//	scanf("%d", &k);
//	for (i = 1; i <= k; i++){
//		for (j = 1; j <= i; j++)
//		{
//			printf("%d*%d=%d  ", i, j, i*j);
//		}
//		printf("\n");
//	}
//	
// system("pause");
// return 0;
//}
//#define _CRT_SECURE_NO_WARNINGS
//#include<stdio.h>//使用函数交换两个变量
//#include<stdlib.h>
//int main()
//{
//	int a, b;
//	scanf("%d%d",&a,&b);
//	cha(&a, &b);
//	printf("%d,%d",a,b );
// system("pause");
// return 0;
//}
//int cha(int* x,int *y)
//{
//	int tmp = *x;
//	*x = *y;
//	*y = tmp;
//}
//#define _CRT_SECURE_NO_WARNINGS
//#include<stdio.h>//判断闰年
//#include<stdlib.h>
//int main()
//{
//	int a;
//	scanf("%d", &a);
//	leap(a);
//	if (leap(a) == 1)
//		printf("是闰年");
//	else
//		printf("不是闰年");
// system("pause");
// return 0;
//}
//int leap(int x)
//{
//	if (x % 4 == 0 && x % 100 != 0 || x % 400 == 0)
//		return 1;
//	else
//		return 0;
//}
//#define _CRT_SECURE_NO_WARNINGS
//#include<stdio.h>//判断素数
//#include<stdlib.h>
//#include<math.h>
//int main()
//{
//	int c;
//    int b,a;
//	scanf("%d", &b);
//	c = sqrt(b);
//	for (a = 2; a <= c + 1; a++){
//		if (b%a == 0){
//			printf("%d不是素数", b);
//			break;
//		}
//		else{
//		}
//	}
//	if (a>c)
//	printf("%d是素数", b);
// system("pause");
// return 0;
//}
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int main()
{
	int a[5] = { 0 };
	int se = sizeof(a) / sizeof(a[0]);
	for (int i = 0; i < 5; i++){
		scanf("%d", &a[i]);
	}
	reverse(a, se);
	print(a, se);
	init(a, se);
	print(a, se);
	empty(a, se);
	print(a, se);
 system("pause");
 return 0;
}
int init(int x[],int se){
	for (int i = 0; i <se; i++)
	{
		x[i] = 6;
	}//初始化数组

}
int empty(int y[],int se){
	for (int i = 0; i < se; i++)
	y[i] = 0;
}//清空数组
int reverse(int x[],int se){
	int left = 0,tmp;
	int right = se-1;
	while (left < right){
		tmp = x[left];
		x[left] = x[right];
		x[right] = tmp;
		left++;
		right--;
	}
		
}//逆置数组
int print(int x[],int se){
	for (int i = 0; i < se; i++)
		printf("%d ", x[i]);
	printf("\n");
}//打印数组