//#define _CRT_SECURE_NO_WARNINGS
//#include<stdio.h>//猜数字游戏
//#include<stdlib.h>
//#include<time.h>
//int main()
//{
//	int a,b=0;
//	srand((unsigned)(time(0)));
//	int number = rand()%100+1;
//	
//		while (1)
//		{
//			printf("输入你要猜的数");
//			scanf("%d", &a);
//		if (a > number)
//		{
//			printf("数字大了\n");
//			continue;
//		}
//		else if (a < number){
//		printf("数字小了\n");	
//		continue;
//		}
//		else{
//			printf("猜对了\n");
//			break;
//		}
//	}
// system("pause");
// return 0;
//}
//#define _CRT_SECURE_NO_WARNINGS
//#include<stdio.h>
//#include<stdlib.h>//二分法找下标
//int main()
//{
//	int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//	int num  ;
//	printf("请输入一个数组中的数");
//	scanf("%d", &num);
//	int left = 0;
//	int right = sizeof(arr) / sizeof(int)-1;
//	//[left,right]待查找区间
//	//如果待查找区间不为空,继续找
//	while (left <= right){
//		int mid = (left + right) / 2;
//		if (arr[mid] < num)
//		{
//			left = mid + 1;
//		}
//		else if (arr[mid] > num){
//			right = mid - 1;
//		}
//		else{
//			printf("下标为%d\n", mid);
//			break;
//		}
//	
//	}
// system("pause");
// return 0;
//}
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>/*如果是小写字符就输出对应的大写字符，
如果接收的是大写字符，就输出对应的小写字符，
如果是数字不输出。*/
#include<stdlib.h>
int main()
{
	while (1)
	{
		char str;
		//scanf("%c", &str);
		str = getchar();
		if (str>='a'&&str<='z')
		{
			int a = str - 32;
			printf("%c", a);
			continue;
		}
		else if (str>64 && str < 91)
		{
			int a = str + 32;
			printf("%c", a);
			continue;
		}
		else
			continue;
			return 0;
	}
 system("pause");
 return 0;
}