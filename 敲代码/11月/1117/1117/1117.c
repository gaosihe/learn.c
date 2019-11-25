#define _CRT_SECURE_NO_WARNINGS
//#include<stdio.h>
//#include<stdlib.h>//判断素数
//#include<windows.h>
//#include<math.h>
//int gsh1()
//{
//	int i,n,x;
//	scanf("%d", &n);
// x = sqrt(n);
// for (i = 2; i <= x; i++)
// if (n%i == 0)
//	 break;
//
//	 if (i>x-1)
//		 printf("%d是素数", n);
//	 else
//		 printf("%d不是素数", n);
//system("pause");
//return 0;
//}
//int Factor(int n){
//	if (n == 1){
//		return 1;
//	}
//	return n*Factor(n - 1);
//}
//int main(){
//	int  a;
//	int Factor(a);
//	scanf("%d", &a);
//
//	printf("%d", Factor(a));
//
//	system("pause");
//}
//#include<stdio.h>
//#include<stdlib.h>
//
//int  main()
//{
//	int i = 0,a;
//	int j = 0;
//	scanf("%d",&a);
//	for (i = 0; i < a; i++){
//		for (j = 0; j < i; j++)
//		{
//			printf("*");
//		}
//		printf("\n");
//	}
//	int gsh1();
//	{
//		for (i = a; i >=1; i--){
//			for (j =0; j < i; j++)
//			{
//				printf("*");
//			}
//			printf("\n");
//		}
//	}
//	
//	system("pause");
//	return 0;
////}
//#define _CRT_SECURE_NO_WARNINGS//水仙花数
//#include<stdio.h>//水仙花数
//#include<stdlib.h>
//#include<math.h>
//int main()
//{
//	int i = 0;
//	for (i = 0; i < 1000; i++){
//		if (i == (pow(i / 100 ,3) + pow(i / 10 % 10,3)+ pow(i % 10,3)))
//			printf("%d\n", i);
//	}
//	
// system("pause");
// return 0;
//}
//#define _CRT_SECURE_NO_WARNINGS
//#include<stdio.h>//
//#include<stdlib.h>
//#include<math.h>
//int gsh(int a, int j){
//	int c=0,he=0;
//	for (c = 1; c <= j; c++){
//		he = he * 10 + a;
//	}
//		return a, he;
//	
//}
//int main()
//{
//	int a;
//	int i=0,sum=0;
//	scanf("%d", &a);
//
//	for (i = 1; i < 6; i++){
//		sum += gsh(a,i);
//		continue;
//	}
//	printf("%d", sum);
// system("pause");
// return 0;
//}