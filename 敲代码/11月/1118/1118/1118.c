//#define _CRT_SECURE_NO_WARNINGS
//#include<stdio.h>//��������Ϸ
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
//			printf("������Ҫ�µ���");
//			scanf("%d", &a);
//		if (a > number)
//		{
//			printf("���ִ���\n");
//			continue;
//		}
//		else if (a < number){
//		printf("����С��\n");	
//		continue;
//		}
//		else{
//			printf("�¶���\n");
//			break;
//		}
//	}
// system("pause");
// return 0;
//}
//#define _CRT_SECURE_NO_WARNINGS
//#include<stdio.h>
//#include<stdlib.h>//���ַ����±�
//int main()
//{
//	int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//	int num  ;
//	printf("������һ�������е���");
//	scanf("%d", &num);
//	int left = 0;
//	int right = sizeof(arr) / sizeof(int)-1;
//	//[left,right]����������
//	//������������䲻Ϊ��,������
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
//			printf("�±�Ϊ%d\n", mid);
//			break;
//		}
//	
//	}
// system("pause");
// return 0;
//}
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>/*�����Сд�ַ��������Ӧ�Ĵ�д�ַ���
������յ��Ǵ�д�ַ����������Ӧ��Сд�ַ���
��������ֲ������*/
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