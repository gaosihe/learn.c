//#define _CRT_SECURE_NO_WARNINGS
//#include<stdio.h>//斐波那契数
//#include<stdlib.h>
//int main()
//{
//	int n;
//	scanf("%d", &n);
//	int a = 1, b = 1, c;
//	while (n > 2)
//	{
//		n -= 1;
//		c = b;
//		b = a;
//		a = b + c;
//	}
//	printf("%d", a);
// system("pause");
// return 0;
//}
//#define _CRT_SECURE_NO_WARNINGS//汉诺塔
//#include<stdio.h>
//void mov(int n, char a, char b, char c){
//	if (n == 1){
//		printf("%c%c\n", a, c);
//
//	}
//	else{
//		mov(n - 1, a, c, b);
//		printf("%c%c\n", a, c);
//		mov(n - 1, b, a, c);
//	}
//}
//int main(){
//	int n;
//	scanf("%d", &n);
//	mov(n, '1', '2', '3');
//	system("pause");
//	return 0;
//}
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int main()
{
	int n = 0;
	printf("请输入要跳的台阶数:");
	scanf("%d", &n);
	int su=gsh(n);
	int sum=gshh(n);
	printf("%d\n%d", su,sum);
 system("pause");
 return 0;
}
int gsh(int x){
	if (x <= 2){
		return x;
	}
	else{
		return gsh(x - 1) + gsh(x - 2);
	}
}
int gshh(int x){
	int a = 1, b = 2, c=a;
	while (x > 2)
	{
		x -= 1;
		a = b + c;
		c = b;
		b = a;
	}
	return a;
}